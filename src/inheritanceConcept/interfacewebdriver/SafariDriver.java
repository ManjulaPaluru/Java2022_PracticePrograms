package inheritanceConcept.interfacewebdriver;

public class SafariDriver implements WebDriver{

    public SafariDriver(){
        System.out.println("launching safari driver browser");
    }


    @Override
    public void findElements(String element) {

    }

    @Override
    public void findElement(String element) {

    }

    @Override
    public String getUrl() {

        return "http://www.gmail.com";
    }

    @Override
    public void click() {

    }

    @Override
    public void sendKeys(String value) {

    }

    @Override
    public void quit() {

    }

    @Override
    public String getTitle() {
        return " QA automation scripts";
    }
}
