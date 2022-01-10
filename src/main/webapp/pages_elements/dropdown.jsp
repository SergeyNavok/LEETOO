<%@ page import="by.SergeyNavok.leetoo.constant.WebAppConstant" %>
<%@ page import="by.SergeyNavok.leetoo.constant.ControllerConstant" %>
<%@ page import="by.SergeyNavok.leetoo.constant.SortCategoryConstant" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>

<div class="dropdown">
    <span><%=WebAppConstant.SORT_DROPDOWN%></span>

    <form method="post" action="<%=ControllerConstant.SORTING_ACTION%>">
        <select onchange="this.form.submit();" class="select-wrapper" name="<%=ControllerConstant.SORTING_FORM_ATTR%>">
            <option <c:if test="${sort == 'все товары'}">selected="selected"</c:if>
            value="<%=SortCategoryConstant.DEFAULT%>">
                <%=SortCategoryConstant.DEFAULT%>
            </option>

            <option <c:if test="${sort == 'сначала подешевле'}">selected="selected"</c:if>
            value="<%=SortCategoryConstant.LOW_PRICE%>">
                <%=SortCategoryConstant.LOW_PRICE%>
            </option>

            <option <c:if test="${sort == 'сначала подороже'}">selected="selected"</c:if>
            value="<%=SortCategoryConstant.HIGH_PRICE%>">
                <%=SortCategoryConstant.HIGH_PRICE%>
            </option>
        </select>
    </form>
</div>