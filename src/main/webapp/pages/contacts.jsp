<%@ page import="by.SergeyNavok.constant.ControllerConstant" %>
<%@ page import="by.SergeyNavok.constant.WebAppConstant" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>

<!DOCTYPE html>
<html lang="ru">

<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>
        <%=WebAppConstant.PAGE_TITLE_HOME%>
    </title>

    <link rel="stylesheet" href="../css/styles.css">
</head>

<body>
<div class="wrapper">
    <c:import url="<%=ControllerConstant.HEADER_ELEMENT_JSP%>" />
    <c:import url="<%=ControllerConstant.BANNER_ELEMENT_JSP%>" />

    <div class="container">
        <span class="text"><%=WebAppConstant.HOME_PAGE_ABOUT%></span>
    </div>

    <c:import url="<%=ControllerConstant.FOOTER_ELEMENT_JSP%>" />
</div>
</body>

</html>