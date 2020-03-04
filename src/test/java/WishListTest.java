import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WishListTest {

    public static void main(String[] args) {

 //       addWishlistfirefox();
        addWishlist();

    }


    // NU REUSESC SA DESCHID CU FIREFOX. NU-i BUNA SINTAXA        ???

    public static void addWishlistfirefox() {
        System.setProperty("webdriver.firefox.driver", "resources/geckodriver.exe");
        WebDriver driverfirefox = new FirefoxDriver();

        driverfirefox.get("http://testfasttrackit.info/selenium-test/");

    }

    public static void addWishlist() {
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
        WebDriver driverchrome = new ChromeDriver();

        driverchrome.get("http://testfasttrackit.info/selenium-test/");
        driverchrome.findElement(By.cssSelector("li.level0:nth-child(5) > a:nth-child(1)")).click();
        driverchrome.findElement(By.cssSelector("li.item:nth-child(1) > div:nth-child(2) > h2:nth-child(1) > a:nth-child(1)")).click();
        driverchrome.findElement(By.cssSelector(".link-wishlist")).click();
        driverchrome.quit();


    }









}
