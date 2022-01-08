package by.SergeyNavok.constant;

public class ControllerConstant {
    private static final String SLASH = GlobalConstant.SLASH;
    private static final String WEB_APP_LABEL = SLASH + GlobalConstant.NAME_WEB_APP;

    //Folders and Names in APP
    private static final String JSP = ".jsp";
    private static final String PAGES_FOLDER = SLASH + "pages";
    private static final String PAGES_ELEMENTS_FOLDER = SLASH + "pages_elements";
    private static final String CONTACTS_LABEL = "contacts";
    private static final String PRODUCT_LABEL = "product";
    private static final String BANNER_LABEL = "banner";
    private static final String DROPDOWN_LABEL = "dropdown";
    private static final String FOOTER_LABEL = "footer";
    private static final String HEADER_LABEL = "header";

    //Label and attributes
    public static final String ID_LABEL = "id";
    public static final String CATALOG_ATTR = "catalog";
    public static final String PRODUCT_LIST_ATTR = "products";
    public static final String PRODUCT_SORT_ATTR = "sort";
    public static final String PRODUCT_ATTR = "product";
    public static final String SORTING_FORM_ATTR = "sort";
    public static final String SORTING_CONT = SLASH + SORTING_FORM_ATTR;

    //Controllers
    public static final String CATALOG_CONT = SLASH + CATALOG_ATTR;
    public static final String PRODUCT_CONT = SLASH + PRODUCT_ATTR;

    //JSP Pages
    public static final String CONTACTS_JSP = PAGES_FOLDER + SLASH + CONTACTS_LABEL + JSP;
    public static final String PRODUCT_JSP = PAGES_FOLDER + SLASH + PRODUCT_LABEL + JSP;
    public static final String CATALOG_JSP = PAGES_FOLDER +SLASH + CATALOG_ATTR + JSP;

    public static final String BANNER_ELEMENT_JSP = PAGES_ELEMENTS_FOLDER + SLASH + BANNER_LABEL + JSP;
    public static final String DROPDOWN_ELEMENT_JSP = PAGES_ELEMENTS_FOLDER + SLASH + DROPDOWN_LABEL + JSP;
    public static final String FOOTER_ELEMENT_JSP = PAGES_ELEMENTS_FOLDER + SLASH + FOOTER_LABEL + JSP;
    public static final String HEADER_ELEMENT_JSP = PAGES_ELEMENTS_FOLDER + SLASH + HEADER_LABEL + JSP;

    //Link
    public static final String LINK_APP_HOME = WEB_APP_LABEL;
    public static final String LINK_APP_CATALOG = WEB_APP_LABEL + CATALOG_CONT;
    public static final String LINK_APP_CONTACTS = WEB_APP_LABEL + CONTACTS_JSP;

    //Form Action
    public static final String SORTING_ACTION = WEB_APP_LABEL + SLASH + SORTING_FORM_ATTR;
}