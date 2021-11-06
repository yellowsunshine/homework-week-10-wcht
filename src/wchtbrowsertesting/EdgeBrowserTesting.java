package wchtbrowsertesting;
/*
Opening WCHT website using Edge Browser
 */

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class EdgeBrowserTesting {


    public static void main(String[] args) {


        String baseUrl = "https://www.wcht.org.uk/";

        //Setting the driver path
        System.setProperty("webdriver.edge.driver", "drivers/msedgedriver.exe");

        //creating an object of webdriver
        WebDriver driver = new EdgeDriver();

        //Selenium method to launch the browser
        driver.get(baseUrl);

        //maximising the browser window
        driver.manage().window().maximize();

        //printing in the console
        String title = driver.getTitle();
        System.out.println(title);

        //closing the driver
        driver.close();
    }

}
