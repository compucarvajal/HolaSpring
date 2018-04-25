<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %> 
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>SpringApp | programacionj2ee.com</title>
    </head>
    <body>

        <h1>¡Hola Mundo!</h1>

        <div>
            <p>Autor: ${author} @ ${website}</p>
        </div>
        <br/>
    <p1>Pruebas hijos de puta ${prueba}</p1>


    <ul>
        <c:forEach items="${listaPersonas}" var="persona">
            <li>${persona.nombre}, ${persona.apellidos}</li>
         </c:forEach>
    </ul>


</body>
</html>