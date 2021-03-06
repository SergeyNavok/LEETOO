package by.SergeyNavok.leetoo.controller;

import by.SergeyNavok.leetoo.constant.ControllerConstant;
import by.SergeyNavok.leetoo.model.bean.Product;
import by.SergeyNavok.leetoo.model.exception.DAOException;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "ProductCatalogController", urlPatterns = ControllerConstant.CATALOG_CONT)
public class ProductCatalogController extends AbstractController {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        try {
            List<Product> products = productService.getProductsList();
            request.setAttribute(ControllerConstant.PRODUCT_LIST_ATTR, products);
            jumpToPage(request, response, ControllerConstant.CATALOG_JSP);
        } catch (DAOException e) {
            e.printStackTrace();
        }
    }
}