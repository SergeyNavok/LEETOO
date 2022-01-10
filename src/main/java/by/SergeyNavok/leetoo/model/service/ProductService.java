package by.SergeyNavok.leetoo.model.service;

import by.SergeyNavok.leetoo.constant.SortCategoryConstant;
import by.SergeyNavok.leetoo.model.bean.Product;
import by.SergeyNavok.leetoo.model.dao.ProductDAO;
import by.SergeyNavok.leetoo.model.exception.DAOException;
import by.SergeyNavok.leetoo.model.exception.ServiceException;

import java.util.List;

public class ProductService {
    public ProductDAO productDAO;

    public ProductService() {
        this.productDAO = new ProductDAO();
    }

    public List<Product> getProductsList() throws DAOException {
        return productDAO.getProductList();
    }

    public List<Product> getProductsListSortBy(String value) throws ServiceException {
        try {
            switch (value) {
                case (SortCategoryConstant.HIGH_PRICE):
                    return productDAO.getProductListSortByHighPrice();

                case (SortCategoryConstant.LOW_PRICE):
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

            //Formatting output text for HTML
            String description = product.getDescription();
            String regex = "\n";
            String replace = "<br>";
            product.setDescription(description.replaceAll(regex, replace));

        } catch (NumberFormatException | IndexOutOfBoundsException | DAOException e) {
            throw new ServiceException(e);
        }
        return product;
    }
}