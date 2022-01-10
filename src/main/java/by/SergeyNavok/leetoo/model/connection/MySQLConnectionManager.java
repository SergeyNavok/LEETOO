package by.SergeyNavok.leetoo.model.connection;

import by.SergeyNavok.leetoo.constant.ConnectionConstant;

import java.io.IOException;
import java.io.InputStream;
import java.sql.*;
import java.util.Objects;
import java.util.Properties;

public class MySQLConnectionManager {
    private static Connection connection;
    private static Properties properties;

    static {
        ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
        InputStream inputStream = classLoader.getResourceAsStream(ConnectionConstant.DB_PROPERTIES);
        properties = new Properties();

        try {
            properties.load(inputStream);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    static {
        try {
            Class.forName(properties.getProperty(ConnectionConstant.DB_DRIVER));
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static Connection getConnection() throws SQLException {
        if (Objects.isNull(connection) || connection.isClosed()) {
            connection = DriverManager.getConnection(
                    properties.getProperty(ConnectionConstant.DB_URL),
                    properties.getProperty(ConnectionConstant.DB_USER),
                    properties.getProperty(ConnectionConstant.DB_PASSWORD));
        }
        return connection;
    }

    public static void closeConnection() {
        if (Objects.nonNull(connection)) {
            try {
                connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    public static void closeStatement(Statement statement) {
        if (Objects.nonNull(statement)) {
            try {
                statement.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    public static void closeResultSet(ResultSet resultSet) {
        if (Objects.nonNull(resultSet)) {
            try {
                resultSet.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}