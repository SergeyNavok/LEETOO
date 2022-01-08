<%@ page import="by.SergeyNavok.constant.WebAppConstant" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>

<div class="dropdown">
    <span><%=WebAppConstant.SORT_DROPDOWN%></span>
    <select class="select-wrapper" name="sort-category">
        <option value="1"><%=WebAppConstant.SORT_DROPDOWN_VALUE_1%></option>
        <option value="2"><%=WebAppConstant.SORT_DROPDOWN_VALUE_2%></option>
        <option value="3"><%=WebAppConstant.SORT_DROPDOWN_VALUE_3%></option>
    </select>
</div>