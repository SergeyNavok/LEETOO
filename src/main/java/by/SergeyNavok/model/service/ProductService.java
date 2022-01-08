package by.SergeyNavok.model.service;

import by.SergeyNavok.model.bean.Product;
import by.SergeyNavok.model.dao.ProductDAO;
import by.SergeyNavok.model.exception.DAOException;

import java.util.List;

public class ProductService {
    public ProductDAO productDAO;

    public ProductService() {
        this.productDAO = new ProductDAO();
    }

    public List<Product> getProductsList() throws DAOException {
        return productDAO.getProductList();
    }

    public List<Product> getProductsListSortByPrice(int value) throws DAOException {
        switch (value) {
            case (2):
                return productDAO.getProductListSortByHighPrice();

            case (3):
                return productDAO.getProductListSortByLowPrice();

            default:
                return productDAO.getProductList();
        }
    }
}
