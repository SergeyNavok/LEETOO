package by.SergeyNavok.controller;

import by.SergeyNavok.constant.ControllerConstant;
import by.SergeyNavok.model.bean.Product;
import by.SergeyNavok.model.exception.ServiceException;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.OutputStream;

@WebServlet(name = "ProductShowController", value = ControllerConstant.PRODUCT_CONT)
public class ProductShowController extends AbstractController {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        try {
            String id = request.getParameter(ControllerConstant.ID_LABEL);
            Product product = productService.getProductByID(id);

            //byte[] image = product.getImg();
            //response.setContentType("image/gif");
            /*OutputStream o = response.getOutputStream();
            o.write(imgData);
            o.flush();
            o.close();*/

            //request.setAttribute("username", userName);
            //response.setContentType(getServletContext().getMimeType("non"));
            //response.setContentLength(image.length);
            //response.getOutputStream().write(image);


            request.setAttribute(ControllerConstant.PRODUCT_ATTR, product);
            jumpToPage(request, response, ControllerConstant.PRODUCT_JSP);
        } catch (ServiceException e) {
            e.printStackTrace();
        }
    }
}