import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class airbnbHomePage {
    public static void main(String[] args) {
        ChromeOptions options = new ChromeOptions();
        options.setExperimentalOption("excludeSwitches", new String[]{"enable-automation"});
        options.setExperimentalOption("useAutomationExtension", false);

        WebDriver driver = new ChromeDriver(options);
        try {
            driver.get("https://demo5.cybersoft.edu.vn/");
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

            By by1 = By.xpath("//nav[contains(@class,'nav-menu')]/div/a");
            WebElement el1 = wait.until(ExpectedConditions.elementToBeClickable(by1));

            By by2 = By.xpath("//ul[contains(@class,'menu-phone')]/li[1]/a");
            WebElement el2 = wait.until(ExpectedConditions.elementToBeClickable(by2));

            By by3 = By.xpath("//ul[contains(@class,'menu-phone')]/li[2]/a");
            WebElement el3 = wait.until(ExpectedConditions.elementToBeClickable(by3));

            By by4 = By.xpath("//nav[contains(@class,'nav-menu')]/div/div[1]/button[1]");
            WebElement el4 = wait.until(ExpectedConditions.elementToBeClickable(by4));

            By by5 = By.xpath("//p[text()='Địa điểm']//parent::div");
            WebElement el5 = wait.until(ExpectedConditions.elementToBeClickable(by5));

            By by6 = By.xpath("//div[p[text()='Địa điểm']]/following-sibling::div[2]");
            WebElement el6 = wait.until(ExpectedConditions.elementToBeClickable(by6));

            By by7 = By.xpath("//div[p[text()='Địa điểm']]/following-sibling::div[4]");
            WebElement el7 = wait.until(ExpectedConditions.elementToBeClickable(by7));

            By by8 = By.xpath("//p[contains(text(),'Thêm khách')]" +
                    "/ancestor::div[contains(@class,'cursor-pointer')]" +
                    "/following-sibling::div//button[last()]");
            WebElement el8 = wait.until(ExpectedConditions.elementToBeClickable(by8));
//
//            By by20 = By.xpath("//div[@class='oxd-table-filter-header']//i");
//            WebElement el20 = wait.until(ExpectedConditions.visibilityOfElementLocated(by20));
//
//            By by21 = By.xpath("//div[@class='orangehrm-header-container']//button");
//            WebElement el21 = wait.until(ExpectedConditions.visibilityOfElementLocated(by21));

            System.out.printf("el1: %s\n", el1.getText());
            System.out.printf("el2: %s\n", el2.getText());
            System.out.printf("el3: %s\n", el3.getText());
            el4.click();
            System.out.println("el4: clicked");
            el5.click();
            System.out.println("el5: clicked");
            el6.click();
            System.out.println("el6: clicked");
            el7.click();
            System.out.println("el7: clicked");
            el8.click();
            System.out.println("el8: clicked");

            Thread.sleep(2000);
            driver.quit();
        } catch (InterruptedException e) {
            driver.quit();
        }
    }
}
