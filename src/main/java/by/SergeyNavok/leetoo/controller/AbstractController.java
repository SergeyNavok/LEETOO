package by.SergeyNavok.leetoo.controller;

import by.SergeyNavok.leetoo.model.service.ProductService;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "AbstractController", value = "/AbstractController")
public class AbstractController extends HttpServlet {
    protected ProductService productService;

    public AbstractController() {
        productService = new ProductService();
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
    }

    protected void jumpToPage(
            HttpServletRequest request,
            HttpServletResponse response,
            String url) throws ServletException, IOException {
        RequestDispatcher requestDispatcher = request.getRequestDispatcher(url);
        requestDispatcher.forward(request, response);
    }
}