# Taller JSP – Aplicación Web con JavaServer Pages y JavaBeans

## 1. Información General 
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

## 5. Flujo de Ejecución

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
http://localhost:8080/StudentWebApp-JSP/](http://localhost:8080/EjercicioArqSoftware-StudentWeb/index.jsp
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
