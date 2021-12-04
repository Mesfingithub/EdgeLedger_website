package libs;

public class Locators {

    public static String HomePage = "//*[@id=\"navbar-brand-centered\"]/ul[1]/li[1]";
    public static String SingleInputForm = "//*[@id=\"navbar-brand-centered\"]/ul[1]/li[1]/ul/li[1]/a";
    public static String SingleField = "//input[@id=\"user-message\"]";
    public static String SingleFieldButton = "//form[@id=\"get-input\"]/button";
    public static String SingleTextValue ="//span[@id=\"display\"]";


    public static String TwoFieldsSumOne = "//input[@id=\"sum1\"]";
    public static String TwoFieldSumTwo = "//input[@id=\"sum2\"]";
    public static String TwoFieldsButton="//form[@id=\"gettotal\"]/button";
    public static String TwoFieldText = "//span[@id=\"displayvalue\"]";


    public  static String CheckboxDemo = "//*[@id=\"navbar-brand-centered\"]/ul[1]/li[1]/ul/li[2]/a";
    public static String  SingleCheckbox="//*[@id=\"isAgeSelected\"]";
    public static String  multipleCheckBox="//div[@class='checkbox']/label";
    public static String  FirstCheckboxMessage="//div[@id='txtAge']";
    public static String  UncheckAllCheckbox = "//*[@id=\"check1\"]";
}
