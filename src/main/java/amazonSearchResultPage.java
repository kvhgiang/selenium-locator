import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class amazonSearchResultPage {
    public static void main(String[] args) {
        ChromeOptions options = new ChromeOptions();
        options.setExperimentalOption("excludeSwitches", new String[]{"enable-automation"});
        options.setExperimentalOption("useAutomationExtension", false);

        WebDriver driver = new ChromeDriver(options);
        try {
            driver.get("https://www.amazon.com/");
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

            By bySearch = By.id("twotabsearchtextbox");
            WebElement searchBox = wait.until(ExpectedConditions.visibilityOfElementLocated(bySearch));
            searchBox.sendKeys("adidas");

            By bySearchBtn = By.id("nav-search-submit-button");
            WebElement searchBtn = wait.until(ExpectedConditions.elementToBeClickable(bySearchBtn));
            searchBtn.click();

//            By by1 = By.xpath("//nav[contains(@class,'nav-menu')]/div/a");
//            WebElement el1 = wait.until(ExpectedConditions.elementToBeClickable(by1));
//            System.out.printf("el1: %s\n", el1.getText());

//            By by2 = By.xpath("//ul[contains(@class,'menu-phone')]/li[1]/a");
//            WebElement el2 = wait.until(ExpectedConditions.elementToBeClickable(by2));
//            System.out.printf("el2: %s\n", el2.getText());
//
//            By by3 = By.xpath("//ul[contains(@class,'menu-phone')]/li[2]/a");
//            WebElement el3 = wait.until(ExpectedConditions.elementToBeClickable(by3));
//            System.out.printf("el3: %s\n", el3.getText());
//
//            By by4 = By.xpath("//nav[contains(@class,'nav-menu')]/div/div[1]/button[1]");
//            WebElement el4 = wait.until(ExpectedConditions.elementToBeClickable(by4));
//            el4.click();
//            System.out.println("el4: clicked");
//
//            By by5 = By.xpath("//p[text()='Địa điểm']//parent::div");
//            WebElement el5 = wait.until(ExpectedConditions.elementToBeClickable(by5));
//            el5.click();
//            System.out.println("el5: clicked");
//
//            By by6 = By.xpath("//div[p[text()='Địa điểm']]/following-sibling::div[2]");
//            WebElement el6 = wait.until(ExpectedConditions.elementToBeClickable(by6));
//            el6.click();
//            System.out.println("el6: clicked");
//
//            By by7 = By.xpath("//div[p[text()='Địa điểm']]/following-sibling::div[4]");
//            WebElement el7 = wait.until(ExpectedConditions.elementToBeClickable(by7));
//            el7.click();
//            System.out.println("el7: clicked");
//
//            By by8 = By.xpath("//div[p[text()='Địa điểm']]/following-sibling::div[4]" +
//                    "//div[2]//button[last()]");
//            WebElement el8 = wait.until(ExpectedConditions.elementToBeClickable(by8));
//            for (int i = 0; i < 20; i++) {el8.click();}
//            System.out.println("el8: clicked");
//
//            By by9 = By.xpath("//div[p[text()='Địa điểm']]/following-sibling::div[4]" +
//                    "//div[2]//button[1]");
//            WebElement el9 = wait.until(ExpectedConditions.elementToBeClickable(by9));
//            for (int i = 0; i < 15; i++) {el9.click();}
//            System.out.println("el9: clicked");
//
//            By by10 = By.xpath("//button[text()='Loại nơi ở']");
//            WebElement el10 = wait.until(ExpectedConditions.elementToBeClickable(by10));
//            el10.click();
//            System.out.println("el10: clicked");
//
//            By by11 = By.xpath("//button[text()='Giá']");
//            WebElement el11 = wait.until(ExpectedConditions.elementToBeClickable(by11));
//            el11.click();
//            System.out.println("el11: clicked");
//
//            By by12 = By.xpath("//a[contains(@href, '/rooms/')][1]");
//            WebElement el12 = wait.until(ExpectedConditions.visibilityOfElementLocated(by12));
//            System.out.printf("el12: %s\n", el12.getAttribute("href"));
//
//            By by13 = By.xpath("//a[contains(@href, '/rooms/')][2]//h2");
//            WebElement el13 = wait.until(ExpectedConditions.visibilityOfElementLocated(by13));
//            System.out.printf("el13: %s\n", el13.getText());
//
//            By by14 = By.xpath("//a[contains(@href, '/rooms/')][3]//p");
//            WebElement el14 = wait.until(ExpectedConditions.visibilityOfElementLocated(by14));
//            System.out.printf("el13: %s\n", el14.getText());

            Thread.sleep(2000);
            driver.quit();
        } catch (InterruptedException e) {
            driver.quit();
        }
    }
}
