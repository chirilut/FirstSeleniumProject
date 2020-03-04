import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTest {

    public static void main(String[] args) {
        login();
    }



    public static void login(){
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
        WebDriver logindriver = new ChromeDriver();

        logindriver.get("http://testfasttrackit.info/selenium-test/");
        logindriver.findElement(By.cssSelector(".skip-account > span:nth-child(2)")).click();
        logindriver.findElement(By.cssSelector("div.links:nth-child(1) > ul:nth-child(1) > li:nth-child(6) > a:nth-child(1)")).click();
        logindriver.findElement(By.cssSelector("#email")).sendKeys("testadresa@yahoo.com");
        logindriver.findElement(By.cssSelector("#pass")).sendKeys("Special123456");
        logindriver.findElement(By.cssSelector("#send2")).click();
        logindriver.quit();


    }









}
