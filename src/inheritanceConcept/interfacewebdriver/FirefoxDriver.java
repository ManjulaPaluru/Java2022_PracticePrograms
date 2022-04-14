package inheritanceConcept.interfacewebdriver;

public class FirefoxDriver implements WebDriver {

    public FirefoxDriver (){
        System.out.println("launching firefox driver browser");
    }

    @Override
    public void findElements(String element) {

    }

    @Override
    public void findElement(String element) {

    }

    @Override
    public String getUrl() {
        return null;
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
        return null;
    }
}
