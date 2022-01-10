<%@ page import="by.SergeyNavok.leetoo.constant.ControllerConstant" %>
<%@ page import="by.SergeyNavok.leetoo.constant.WebAppConstant" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>

<!DOCTYPE html>
<html lang="ru">

<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>
        <%=WebAppConstant.PAGE_TITLE_PRODUCT%>
    </title>

    <link rel="stylesheet" href="./css/styles.css">
</head>

<body>
<div class="wrapper">
    <c:import url="<%=ControllerConstant.HEADER_ELEMENT_JSP%>" />
    <c:import url="<%=ControllerConstant.BANNER_ELEMENT_JSP%>" />

    <div class="container">

        <img class="img" src="./img/product/${product.id}/product.jpg">
        <span class="name">${product.name}</span>
        <p class="text">${product.description}</p>
        <span class="price">${product.price} BYN</span>
        <a class="BTN" href="<%=ControllerConstant.LINK_APP_CATALOG%>"><%=WebAppConstant.CATALOG_PAGE_LINK_ALT%></a>
    </div>

    <c:import url="<%=ControllerConstant.FOOTER_ELEMENT_JSP%>" />
</div>
</body>

</html>