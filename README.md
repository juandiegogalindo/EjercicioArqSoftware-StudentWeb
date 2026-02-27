# Taller JSP – Aplicación Web con JavaServer Pages y JavaBeans

## 1. Información General

**Nombre del Proyecto:** StudentWebApp-JSP  
**Tecnologías utilizadas:**  
- Java  
- JavaServer Pages (JSP)  
- JavaBeans  
- JSTL  
- Apache Tomcat 9  
- NetBeans IDE  
- HTML5  
- CSS3  

---

## 2. Objetivo del Taller

Comprender el enfoque de desarrollo de aplicaciones web basado en JavaServer Pages (JSP), implementando una aplicación que permita capturar información de un estudiante, almacenarla en sesión y generar una respuesta dinámica.

---

## 3. Descripción del Sistema

La aplicación permite:

- Capturar el nombre del estudiante.
- Capturar la fecha de nacimiento.
- Calcular automáticamente la edad.
- Mostrar un saludo dinámico según la hora actual.
- Validar campos obligatorios.
- Mantener la información durante la sesión HTTP.
- Presentar una interfaz visual mejorada mediante CSS.

---

## 4. Arquitectura Implementada

Se implementa el patrón **Modelo-Vista-Controlador (MVC)** básico:

### Modelo
`StudentHandler.java`
- Clase JavaBean.
- Almacena nombre y fecha de nacimiento.
- Calcula edad dinámicamente.
- Mantiene estado en sesión.

### Vista
- `index.jsp`
- `response.jsp`

### Control
La lógica de flujo se gestiona mediante JSP y JSTL.

---

## 5. Estructura del Proyecto

```
Web Pages
│
├── css
│     └── styles.css
│
├── index.jsp
├── response.jsp
│
└── WEB-INF
      └── web.xml
```

```
Source Packages
│
└── org.mypackage.student
      └── StudentHandler.java
```

---

## 6. Funcionalidades Implementadas

### 6.1 Captura de Datos
Formulario HTML que envía:
- name
- birthDate

### 6.2 Persistencia en Sesión

Uso de:

```jsp
<jsp:useBean id="student" scope="session" />
```

---

### 6.3 Cálculo de Edad

Implementado en el JavaBean:

```java
public int getAge() {
    if (birthDate == null || birthDate.isEmpty()) return 0;

    LocalDate date = LocalDate.parse(birthDate);
    return Period.between(date, LocalDate.now()).getYears();
}
```

---

### 6.4 Saludo Dinámico

Uso de JSTL:

```jsp
<c:choose>
    <c:when test="${hour < 12}">
        Buenos días
    </c:when>
    <c:when test="${hour < 18}">
        Buenas tardes
    </c:when>
    <c:otherwise>
        Buenas noches
    </c:otherwise>
</c:choose>
```

---

### 6.5 Validación de Campos

```jsp
<c:when test="${empty param.name or empty param.birthDate}">
```

Valida que ningún campo esté vacío antes de procesar.

---

### 6.6 Estilización

Se implementó CSS externo:

```
css/styles.css
```

Enlazado mediante:

```jsp
<link rel="stylesheet"
href="${pageContext.request.contextPath}/css/styles.css">
```

---

## 7. Flujo de Ejecución

1. El navegador envía una solicitud HTTP.
2. Apache Tomcat detecta el archivo `.jsp`.
3. El motor JSP convierte el archivo en un Servlet.
4. El Servlet se compila y ejecuta.
5. Se genera HTML dinámico.
6. El servidor envía la respuesta al navegador.

---

## 8. Requisitos para Ejecutar

- JDK 8 o superior
- Apache Tomcat 9.x
- NetBeans IDE con soporte Java Web
- Librería JSTL agregada al proyecto

---

## 9. Ejecución

1. Abrir el proyecto en NetBeans.
2. Clean and Build.
3. Run.
4. Acceder desde navegador:

```
http://localhost:8080/StudentWebApp-JSP/
```

---

## 10. Conceptos Aplicados

- JavaServer Pages
- JavaBeans
- JSTL
- Manejo de sesión HTTP
- Arquitectura MVC
- Conversión dinámica JSP → Servlet
- Separación de presentación (CSS)

---

## 11. Conclusión

El desarrollo permitió comprender el funcionamiento interno de JSP, la conversión automática a Servlets dentro de Apache Tomcat y la integración de JavaBeans para el manejo de datos persistentes en sesión.

Se logró implementar una aplicación web dinámica con validación, lógica de negocio, control de flujo y presentación estructurada.

---

## 12. Referencias

- Oracle. *Introduction to Developing Web Applications*.  
- Documentación oficial de Apache Tomcat.  
- Java EE Tutorial – JSP & JSTL.
