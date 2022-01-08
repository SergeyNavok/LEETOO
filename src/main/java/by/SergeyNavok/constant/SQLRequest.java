package by.SergeyNavok.constant;

public class SQLRequest {
    public static final String SELECT_PRODUCT = "select * from products";
    public static final String SELECT_PRODUCT_BY_HIGH_PRICE = "SELECT * FROM `products` ORDER BY `products`.`price` ASC";
    public static final String SELECT_PRODUCT_BY_LOW_PRICE = "SELECT * FROM `products` ORDER BY `products`.`price` DESC";

    public static final String ID_COLUMN = "id";
    public static final String CATEGORY_COLUMN = "category";
    public static final String NAME_COLUMN = "name";
    public static final String DESCRIPTION_COLUMN = "description";
    public static final String PRICE_COLUMN = "price";

}
