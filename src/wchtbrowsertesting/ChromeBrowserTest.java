package wchtbrowsertesting;
/*
Opening wcht website using Chrome Browser
 */

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeBrowserTest {

    public static void main(String[] args) {

        String baseUrl = "https://www.wcht.org.uk/";

        //Setting the driver path
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");

        //Creating an object of webdriver
        WebDriver driver = new ChromeDriver();

        //Selenium method to launch the browser
        driver.get(baseUrl);

        //Selenium method to maximise the window
        driver.manage().window().maximize();

        //printing webpage name in the console
        String name = driver.getTitle();
        System.out.println(name);

        //driver closing
        driver.close();
    }
}
