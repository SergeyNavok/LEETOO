package by.SergeyNavok.leetoo.model.dao;

import by.SergeyNavok.leetoo.constant.SQLRequest;
import by.SergeyNavok.leetoo.model.bean.Product;
import by.SergeyNavok.leetoo.model.connection.MySQLConnectionManager;
import by.SergeyNavok.leetoo.model.exception.DAOException;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ProductDAO {
    public List<Product> getProductList() throws DAOException {
        List<Product> products = new ArrayList<>();
        Connection connection = null;
        Statement statement = null;
        ResultSet resultSet = null;

        try {
            connection = MySQLConnectionManager.getConnection();
            statement = connection.createStatement();
            resultSet = statement.executeQuery(SQLRequest.SELECT_PRODUCT);

            while (resultSet.next()) {
                int id = resultSet.getInt(SQLRequest.ID_COLUMN);
                String category = resultSet.getString(SQLRequest.CATEGORY_COLUMN);
                String name = resultSet.getString(SQLRequest.NAME_COLUMN);
                String description = resultSet.getString(SQLRequest.DESCRIPTION_COLUMN);
                int price = resultSet.getInt(SQLRequest.PRICE_COLUMN);

                products.add(new Product(id, category, name, description, price));
            }
        } catch (SQLException e) {
            throw new DAOException();
        } finally {
            MySQLConnectionManager.closeResultSet(resultSet);
            MySQLConnectionManager.closeStatement(statement);
            MySQLConnectionManager.closeConnection();
        }
        return products;
    }


    public List<Product> getProductListSortByHighPrice() throws DAOException {
        List<Product> products = new ArrayList<>();
        Connection connection = null;
        Statement statement = null;
        ResultSet resultSet = null;

        try {
            connection = MySQLConnectionManager.getConnection();
            statement = connection.createStatement();
            resultSet = statement.executeQuery(SQLRequest.SELECT_PRODUCT_BY_HIGH_PRICE);

            while (resultSet.next()) {
                int id = resultSet.getInt(SQLRequest.ID_COLUMN);
                String category = resultSet.getString(SQLRequest.CATEGORY_COLUMN);
                String name = resultSet.getString(SQLRequest.NAME_COLUMN);
                String description = resultSet.getString(SQLRequest.DESCRIPTION_COLUMN);
                int price = resultSet.getInt(SQLRequest.PRICE_COLUMN);

                products.add(new Product(id, category, name, description, price));
            }
        } catch (SQLException e) {
            throw new DAOException();
        } finally {
            MySQLConnectionManager.closeResultSet(resultSet);
            MySQLConnectionManager.closeStatement(statement);
            MySQLConnectionManager.closeConnection();
        }
        return products;
    }


    public List<Product> getProductListSortByLowPrice() throws DAOException {
        List<Product> products = new ArrayList<>();
        Connection connection = null;
        Statement statement = null;
        ResultSet resultSet = null;

        try {
            connection = MySQLConnectionManager.getConnection();
            statement = connection.createStatement();
            resultSet = statement.executeQuery(SQLRequest.SELECT_PRODUCT_BY_LOW_PRICE);

            while (resultSet.next()) {
                int id = resultSet.getInt(SQLRequest.ID_COLUMN);
                String category = resultSet.getString(SQLRequest.CATEGORY_COLUMN);
                String name = resultSet.getString(SQLRequest.NAME_COLUMN);
                String description = resultSet.getString(SQLRequest.DESCRIPTION_COLUMN);
                int price = resultSet.getInt(SQLRequest.PRICE_COLUMN);

                products.add(new Product(id, category, name, description, price));
            }
        } catch (SQLException e) {
            throw new DAOException();
        } finally {
            MySQLConnectionManager.closeResultSet(resultSet);
            MySQLConnectionManager.closeStatement(statement);
            MySQLConnectionManager.closeConnection();
        }
        return products;
    }


    public List<Product> getProductListSortByCategory(String value) throws DAOException {
        List<Product> products = new ArrayList<>();
        Connection connection = null;
        Statement statement = null;
        ResultSet resultSet = null;

        try {
            connection = MySQLConnectionManager.getConnection();
            statement = connection.createStatement();
            resultSet = statement.executeQuery(SQLRequest.SELECT_PRODUCT);

            while (resultSet.next()) {
                int id = resultSet.getInt(SQLRequest.ID_COLUMN);
                String category = resultSet.getString(SQLRequest.CATEGORY_COLUMN);
                String name = resultSet.getString(SQLRequest.NAME_COLUMN);
                String description = resultSet.getString(SQLRequest.DESCRIPTION_COLUMN);
                int price = resultSet.getInt(SQLRequest.PRICE_COLUMN);

                if(value.equals(category)) {
                    products.add(new Product(id, category, name, description, price));
                }
            }
        } catch (SQLException e) {
            throw new DAOException();
        } finally {
            MySQLConnectionManager.closeResultSet(resultSet);
            MySQLConnectionManager.closeStatement(statement);
            MySQLConnectionManager.closeConnection();
        }
        return products;
    }


    public Product getProductByID(int product_id) throws DAOException {
        Product product = null;
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;

        try {
            connection = MySQLConnectionManager.getConnection();
            preparedStatement = connection.prepareStatement(SQLRequest.SELECT_PRODUCT_BY_ID);
            preparedStatement.setInt(1, product_id);
            resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {
                int id = resultSet.getInt(SQLRequest.ID_COLUMN);
                String category = resultSet.getString(SQLRequest.CATEGORY_COLUMN);
                String name = resultSet.getString(SQLRequest.NAME_COLUMN);
                String description = resultSet.getString(SQLRequest.DESCRIPTION_COLUMN);
                int price = resultSet.getInt(SQLRequest.PRICE_COLUMN);

                product = new Product(id, category, name, description, price);
            }
        } catch (SQLException e) {
            throw new DAOException();
        } finally {
            MySQLConnectionManager.closeResultSet(resultSet);
            MySQLConnectionManager.closeStatement(preparedStatement);
            MySQLConnectionManager.closeConnection();
        }
        return product;
    }
}