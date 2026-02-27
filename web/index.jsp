<%-- 
    Document   : index
    Created on : 27 feb 2026, 5:11:08 p. m.
    Author     : jdgal
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <title>Formulario Estudiante</title>
</head>
<body>

<h1>Ingreso de Datos</h1>

<form action="response.jsp" method="GET">

    Nombre:
    <input type="text" name="name" required />
    <br><br>

    Fecha de Nacimiento:
    <input type="date" name="birthDate" required />
    <br><br>

    <input type="submit" value="Enviar" />

</form>

</body>
</html>