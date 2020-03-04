import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class RegisterTest {

    public static void main(String[] args) {
        register();
    }


    public static void register(){

        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
        WebDriver chrome = new ChromeDriver();

        chrome.get("http://testfasttrackit.info/selenium-test/");
        chrome.findElement(By.cssSelector(".skip-account > span:nth-child(2)")).click();
        chrome.findElement(By.cssSelector("div.links:nth-child(1) > ul:nth-child(1) > li:nth-child(5) > a:nth-child(1)")).click();
        chrome.findElement(By.cssSelector("#firstname")).sendKeys("firstname");
        chrome.findElement(By.cssSelector("#lastname")).sendKeys("lastname");
        chrome.findElement(By.cssSelector("#email_address")).sendKeys("doaruntest@yahoo.com");
        chrome.findElement(By.cssSelector("#password")).sendKeys("123456");
        chrome.findElement(By.cssSelector("#confirmation")).sendKeys("123456");
        chrome.findElement(By.cssSelector("#is_subscribed")).click();
        chrome.quit();
    }



}
