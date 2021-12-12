package by.SergeyNavok.controller;

import by.SergeyNavok.constant.ControllerConstant;
import by.SergeyNavok.model.bean.Product;
import by.SergeyNavok.model.exception.DAOException;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "ShowProductController", urlPatterns = ControllerConstant.SHOW_CONT)
public class ShowProductController extends AbstractController {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        try {
            List<Product> productList = productService.getProductsList();
            request.setAttribute(ControllerConstant.PRODUCT_LIST_ATTR, productList);
            jumpToPage(request, response, ControllerConstant.CATALOG_JSP);
        } catch (DAOException e) {
            e.printStackTrace();
        }

    }
}
