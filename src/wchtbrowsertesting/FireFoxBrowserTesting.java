package wchtbrowsertesting;
/*
Opening the WCHT website with the Firefox browser
 */

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FireFoxBrowserTesting {
    public static void main(String[] args) {
        String baseUrl = "https://www.wcht.org.uk/";

        //Setting the driver path
        System.setProperty("webdriver.gecko.driver", "drivers/geckodriver.exe");

        //Creating an object of the web driver
        WebDriver driver = new FirefoxDriver();

        //Selenium method used to launch the driver
        driver.get(baseUrl);

        //maximising the browser window
        driver.manage().window().maximize();

        //printing the browser title in the console
        String name = driver.getTitle();
        System.out.println(name);

        //closing the browser window
        driver.close();
    }


}
