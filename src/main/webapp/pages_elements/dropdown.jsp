<%@ page import="by.SergeyNavok.constant.WebAppConstant" %>
<%@ page import="by.SergeyNavok.constant.ControllerConstant" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>

<div class="dropdown">
    <span><%=WebAppConstant.SORT_DROPDOWN%></span>

    <form method="post" action="<%=ControllerConstant.SORTING_ACTION%>">
        <select onchange="this.form.submit();" class="select-wrapper" name="<%=ControllerConstant.SORTING_FORM%>">
            <option <c:if test="${sort == 1}">selected="selected"</c:if> value="1">
                <%=ControllerConstant.SORT_DROPDOWN_VALUE_1%>
            </option>

            <option <c:if test="${sort == 2}">selected="selected"</c:if> value="2">
                <%=ControllerConstant.SORT_DROPDOWN_VALUE_2%>
            </option>

            <option <c:if test="${sort == 3}">selected="selected"</c:if> value="3">
                <%=ControllerConstant.SORT_DROPDOWN_VALUE_3%>
            </option>
        </select>
    </form>
</div>