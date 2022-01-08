<%@ page import="by.SergeyNavok.constant.WebAppConstant" %>
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
                <a class="text-link" href="#"><%=WebAppConstant.HEADER_LINK_1%></a>
            </li>

            <li class="hidden-menu__link">
                <a class="text-link" href="#"><%=WebAppConstant.HEADER_LINK_2%></a>
            </li>

            <li class="hidden-menu__link">
                <a class="text-link" href="#"><%=WebAppConstant.HEADER_LINK_3%></a>
            </li>
        </ul>
    </div>

    <div class="header__logo"><%=WebAppConstant.NAME_APP%></div>
    <a href="tel:<%=WebAppConstant.HEADER_PHONE%>" class="header__phone"><%=WebAppConstant.HEADER_PHONE%></a>
</div>