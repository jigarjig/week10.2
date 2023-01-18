package browser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import java.time.Duration;
public class EdgeTest {
    public static void main(String[] args) {

        String baseurl = " http://the-internet.herokuapp.com/login"; // storing base url
        System.setProperty("webdriver.edge.driver", "src/driver/msedgedriver.exe"); // setting edge webdriver
        WebDriver driver = new EdgeDriver(); // create object of edge webdriver
        driver.get(baseurl); // method to invoke url
        driver.manage().window().maximize(); // maximising window
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20)); // timeout session


        String title = driver.getTitle();
        System.out.println("Title of the page"+ title);  //print title
        String url = driver.getCurrentUrl();
        System.out.println("Current url"+ url);  // print url
        String source = driver.getPageSource();
        System.out.println("PAge source"+ source); // print page source

        WebElement username = driver.findElement(By.name("username")); //storing email/username
        username.sendKeys("tomsmith"); // sending key to email/username
        WebElement password = driver.findElement(By.id("password")); // storing password
        password.sendKeys("SuperSecretPassword!"); // sending key to password
        driver.findElement(By.className("radius")).click(); // clicking on login button

    }
}

