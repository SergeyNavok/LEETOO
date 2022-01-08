package by.SergeyNavok.constant;

public class ControllerConstant {
    private static final String WEB_AAP_LABEL = "/" + GlobalConstant.NAME_WEB_APP;

    public static final String CATALOG_CONT = "/catalog";

    public static final String LINK_APP_HOME = WEB_AAP_LABEL;
    public static final String LINK_APP_CATALOG = WEB_AAP_LABEL + CATALOG_CONT;

    public static final String PRODUCT_LIST_ATTR = "products";

    public static final String PAGES_FOLDER = "/pages";
    public static final String PAGES_ELEMENTS_FOLDER = "/pages_elements";

    public static final String CATALOG_JSP = PAGES_FOLDER + "/catalog.jsp";
    public static final String HEADER_ELEMENT_JSP = PAGES_ELEMENTS_FOLDER + "/header.jsp";
    public static final String BANNER_ELEMENT_JSP = PAGES_ELEMENTS_FOLDER + "/banner.jsp";
    public static final String DROPDOWN_ELEMENT_JSP = PAGES_ELEMENTS_FOLDER + "/dropdown.jsp";
    public static final String FOOTER_ELEMENT_JSP = PAGES_ELEMENTS_FOLDER + "/footer.jsp";
}
