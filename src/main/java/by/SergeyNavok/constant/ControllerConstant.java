package by.SergeyNavok.constant;

public class ControllerConstant {
    private static final String SLASH = "/";
    private static final String WEB_APP_LABEL = SLASH + GlobalConstant.NAME_WEB_APP;
    public static final String ID_LABEL = "id";

    public static final String CATALOG_CONT = "/catalog";
    public static final String DETAILS_CONT = "/details";

    public static final String LINK_APP_HOME = WEB_APP_LABEL;
    public static final String LINK_APP_CATALOG = WEB_APP_LABEL + CATALOG_CONT;

    public static final String PRODUCT_LIST_ATTR = "products";
    public static final String PRODUCT_SORT_ATTR = "sort";
    public static final String DETAILS_ATTR = "product";

    public static final String PAGES_FOLDER = "/pages";
    public static final String PAGES_ELEMENTS_FOLDER = "/pages_elements";

    public static final String CONTACTS_JSP = PAGES_FOLDER + "/contacts.jsp";
    public static final String PRODUCT_JSP = PAGES_FOLDER + "/product.jsp";
    public static final String LINK_APP_CONTACTS = WEB_APP_LABEL + CONTACTS_JSP;

    public static final String CATALOG_JSP = PAGES_FOLDER + "/catalog.jsp";
    public static final String HEADER_ELEMENT_JSP = PAGES_ELEMENTS_FOLDER + "/header.jsp";
    public static final String BANNER_ELEMENT_JSP = PAGES_ELEMENTS_FOLDER + "/banner.jsp";
    public static final String DROPDOWN_ELEMENT_JSP = PAGES_ELEMENTS_FOLDER + "/dropdown.jsp";
    public static final String FOOTER_ELEMENT_JSP = PAGES_ELEMENTS_FOLDER + "/footer.jsp";

    public static final String SORTING_FORM = "sort";
    public static final String SORTING_CONT = SLASH + SORTING_FORM;
    public static final String SORTING_ACTION = WEB_APP_LABEL + SLASH + SORTING_FORM;
    public static final String SORT_DROPDOWN_VALUE_1 = "по умолчанию";
    public static final String SORT_DROPDOWN_VALUE_2 = "цена по возрастанию";
    public static final String SORT_DROPDOWN_VALUE_3 = "цена по убыванию";
}
