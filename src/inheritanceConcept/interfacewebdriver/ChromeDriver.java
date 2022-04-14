package inheritanceConcept.interfacewebdriver;

public class ChromeDriver implements WebDriver{

    public ChromeDriver(){
        System.out.println("launching chrome driver browser");
    }


    //overriden methods from parent webdriver interface and grand parent searchcontext interface
    @Override
    public void findElements(String element) {

    }

    @Override
    public void findElement(String element) {

    }

    @Override
    public String  getUrl() {
    return  "http://www.anc.com";
    }

    @Override
    public void click() {
        System.out.println("click on element");
    }

    @Override
    public void sendKeys(String value) {
        System.out.println("enter the value" +value);
    }

    @Override
    public void quit() {
        System.out.println("quit the browser");
    }

    @Override
    public String getTitle() {
        return "title";
    }
}
