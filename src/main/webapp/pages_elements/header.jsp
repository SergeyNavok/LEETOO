<%@ page import="by.SergeyNavok.leetoo.constant.WebAppConstant" %>
<%@ page import="by.SergeyNavok.leetoo.constant.ControllerConstant" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>

<div class="header">
    <div class="header__menu">
        <input type="checkbox" id="hmt" class="hidden-menu-ticker">

        <label class="btn-menu" for="hmt">
            <span class="first"></span>
            <span class="second"></span>
            <span class="third"></span>
        </label>

        <ul class="hidden-menu">
            <li class="hidden-menu__link">
                <a class="text-link" href="<%=ControllerConstant.LINK_APP_HOME%>"><%=WebAppConstant.HEADER_LINK_1%></a>
            </li>

            <li class="hidden-menu__link">
                <a class="text-link" href="<%=ControllerConstant.LINK_APP_CATALOG%>"><%=WebAppConstant.HEADER_LINK_2%></a>
            </li>

            <li class="hidden-menu__link">
                <a class="text-link" href="<%=ControllerConstant.LINK_APP_CONTACTS%>"><%=WebAppConstant.HEADER_LINK_3%></a>
            </li>
        </ul>
    </div>

    <a class="header__logo" href="<%=ControllerConstant.LINK_APP_CATALOG%>"><%=WebAppConstant.NAME_APP%></a>
    <a href="tel:<%=WebAppConstant.HEADER_PHONE%>" class="header__phone"><%=WebAppConstant.HEADER_PHONE%></a>
</div>