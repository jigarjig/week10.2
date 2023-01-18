package browser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
;import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;
public class FireFox {
    public static void main(String[] args) {

        String baseurl = "http://the-internet.herokuapp.com/login"; // storing base url
        System.setProperty("webdriver.Firefox.driver", "src/browser/FireFox.java"); //setting webdriver
        WebDriver driver = new FirefoxDriver(); // creatin object of firefox webdriver
        driver.get(baseurl); // method to invoke url
        driver.manage().window().maximize(); // maximising window
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20)); // timeout session

        String title = driver.getTitle();
        System.out.println("Title of the page" + title); // print title
        String url = driver.getCurrentUrl();
        System.out.println("Current url" + url); // print url
        String source = driver.getPageSource();
        System.out.println("PAge source" + source); // print page source

        WebElement username = driver.findElement(By.name("username")); //storing username/email
        username.sendKeys("tomsmith"); // sending key to username / emal
        WebElement password = driver.findElement(By.id("password")); // storing password
        password.sendKeys("SuperSecretPassword!"); // sending key to password
        driver.findElement(By.className("radius")).click(); // clicking on login button
    }
}


