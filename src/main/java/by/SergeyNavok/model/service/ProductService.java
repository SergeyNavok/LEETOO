package by.SergeyNavok.model.service;

import by.SergeyNavok.constant.ControllerConstant;
import by.SergeyNavok.model.bean.Product;
import by.SergeyNavok.model.dao.ProductDAO;
import by.SergeyNavok.model.exception.DAOException;
import by.SergeyNavok.model.exception.ServiceException;

import java.util.List;

public class ProductService {
    public ProductDAO productDAO;

    public ProductService() {
        this.productDAO = new ProductDAO();
    }

    public List<Product> getProductsList() throws DAOException {
        return productDAO.getProductList();
    }

    public List<Product> getProductsListSortByPrice(String value) throws ServiceException {
        try {
            int id = Integer.parseInt(value);
            switch (id) {
                case (2):
                    return productDAO.getProductListSortByHighPrice();

                case (3):
                    return productDAO.getProductListSortByLowPrice();

                default:
                    return productDAO.getProductList();
            }
        } catch (NumberFormatException | IndexOutOfBoundsException | DAOException e) {
            throw new ServiceException(e);
        }
    }

    public Product getProductByID(String value) throws ServiceException {
        Product product = null;
        try {
            int id = Integer.parseInt(value);
            product = productDAO.getProductByID(id);
        } catch (NumberFormatException | IndexOutOfBoundsException | DAOException e) {
            throw new ServiceException(e);
        }
        return product;
    }
}