package browser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class ChromeTest {
    public static void main(String[] args) {

        String baseurl = " http://the-internet.herokuapp.com/login";  // storimg base url
        System.setProperty("webdriver.chrome.driver", "src/driver/chromedriver.exe"); // setting chrome webdriver
        WebDriver driver = new ChromeDriver(); // create object of chrome webdriver
        driver.get(baseurl); // method to invoke url
        driver.manage().window().maximize(); // maximising window
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));  // timeout session

        String title = driver.getTitle();
        System.out.println("Title of the page"+ title); // printing title
        String url = driver.getCurrentUrl();
        System.out.println("Current url"+ url); // printing url
        String source = driver.getPageSource();
        System.out.println("PAge source"+ source); // printing page source
        WebElement username = driver.findElement(By.name("username")); //storing email/username
        username.sendKeys("tomsmith"); // sending key to email/username
        WebElement password = driver.findElement(By.id("password")); // storing password
        password.sendKeys("SuperSecretPassword!"); // sending key to password
        driver.findElement(By.className("radius")).click(); // clicking on login button


    }
}
