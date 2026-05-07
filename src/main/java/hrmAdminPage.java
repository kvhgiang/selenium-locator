import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class hrmAdminPage {
    public static void main(String[] args) {
        ChromeOptions options = new ChromeOptions();
        options.setExperimentalOption("excludeSwitches", new String[]{"enable-automation"});
        options.setExperimentalOption("useAutomationExtension", false);

        WebDriver driver = new ChromeDriver(options);
        try {
            driver.get("https://opensource-demo.orangehrmlive.com/");
            Thread.sleep(2000);

            /* Login */
            driver.findElement(By.name("username")).sendKeys("Admin");
            Thread.sleep(1000);
            driver.findElement(By.name("password")).sendKeys("admin123");
            Thread.sleep(1000);
            driver.findElement(By.xpath("//button[@type='submit']")).click();
            Thread.sleep(2000);

            // Element 1
            By by1_linkAdmin = By.linkText(("Admin"));
            WebElement el1_menuItemAdmin = driver.findElement(by1_linkAdmin);
            el1_menuItemAdmin.click();
            Thread.sleep(3000);

            // Element 2
            By by2_username = By.xpath(("ta"));
            WebElement el2_inputUsername = driver.findElement(by2_username);
//            el2_inputUsername();
            Thread.sleep(3000);


            //            WebElement el_2 = driver.findElement(By.cssSelector("oxd-main-menu-item-wrapper:nth-child(2)"));
            //            WebElement el_3 = driver.findElement(By.cssSelector("oxd-main-menu-item-wrapper:nth-child(3)"));
            //            WebElement el_4 = driver.findElement(By.cssSelector("oxd-main-menu-item-wrapper:nth-child(3)"));
            //
            Thread.sleep(5000);
            driver.quit();
        } catch (InterruptedException e) {
            driver.quit();
        }
    }
}
