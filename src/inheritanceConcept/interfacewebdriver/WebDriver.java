package inheritanceConcept.interfacewebdriver;

public interface WebDriver extends SearchContext{

    //Abstract methods in the webdriver interface
    public String  getUrl();
    public void click();
    public void sendKeys(String value);
    public void quit();
    public String getTitle();

    @Override
    public void findElements(String element);
    @Override
    public void findElement(String element);

}
