package inheritanceConcept.interfacewebdriver;

public class AmazionAppTest {

    static WebDriver driver;
    //default value of all the interface variable are null, here driver is interface variable

    public static void main(String[] args) {

        /*ChromeDriver driver=new ChromeDriver();
        System.out.println(driver.getTitle());
        driver.getUrl();
        driver.click();
        driver.findElement("email id");
        driver.sendKeys("test");
        System.out.println("---------------------------");
        SafariDriver driver1=new SafariDriver();
        System.out.println(driver1.getTitle());*/

        //In above browser object creation will take lot off  effort and  repeat work ,
        // fo that we can use top casting feature in cross browser launching
        String browser="ie";
        if (browser.equalsIgnoreCase("chrome")) {
            driver = new ChromeDriver();
        }
       else if(browser.equalsIgnoreCase("safari")){
           driver=new SafariDriver();
            }
       else if(browser.equalsIgnoreCase("firefox")){
           driver=new FirefoxDriver();
        } else{
            System.out.println("pls pass the correct browser:  " +browser);
        }






    }
}
