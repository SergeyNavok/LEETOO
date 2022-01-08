package by.SergeyNavok.controller;

import by.SergeyNavok.constant.ControllerConstant;
import by.SergeyNavok.model.bean.Product;
import by.SergeyNavok.model.exception.DAOException;
import by.SergeyNavok.model.exception.ServiceException;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "ProductSortController", value = ControllerConstant.SORTING_CONT)
public class ProductSortController extends AbstractController {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        try {
            String value = request.getParameter(ControllerConstant.SORTING_FORM_ATTR);
            List<Product> products = productService.getProductsListSortByPrice(value);
            request.setAttribute(ControllerConstant.PRODUCT_LIST_ATTR, products);
            request.setAttribute(ControllerConstant.PRODUCT_SORT_ATTR, value);
            jumpToPage(request, response, ControllerConstant.CATALOG_JSP);
        } catch (ServiceException e) {
            e.printStackTrace();
        }
    }
}