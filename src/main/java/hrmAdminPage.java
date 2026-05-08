import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class hrmAdminPage {
    public static void main(String[] args) {
        ChromeOptions options = new ChromeOptions();
        options.setExperimentalOption("excludeSwitches", new String[]{"enable-automation"});
        options.setExperimentalOption("useAutomationExtension", false);

        WebDriver driver = new ChromeDriver(options);
        try {
            driver.get("https://opensource-demo.orangehrmlive.com/");
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

            // ================= Login =================
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("username"))).sendKeys("Admin");
            driver.findElement(By.name("password")).sendKeys("admin123");
            driver.findElement(By.xpath("//button[@type='submit']")).click();

            // ==== Locator 1: Menu link Admin
            By by1_linkAdmin = By.xpath("//span[normalize-space()='Admin']");
            WebElement el1_navItemAdmin = wait.until(ExpectedConditions.elementToBeClickable(by1_linkAdmin));
            el1_navItemAdmin.click();

            // ==== Locator 2: Menu link PIM
            By by2_linkPIM = By.xpath("//span[normalize-space()='PIM']");
            WebElement el2_navItemPIM = wait.until(ExpectedConditions.elementToBeClickable(by2_linkPIM));
//            el2_navItemPIM.click();

            // ==== Locator 3: Menu link Leave
            By by3_linkLeave = By.xpath("//span[normalize-space()='Leave']");
            WebElement el3_navItemLeave = wait.until(ExpectedConditions.elementToBeClickable(by3_linkLeave));
//            el3_navItemLeave.click();

            // ================= Back to page Admin =================
//            el1_navItemAdmin = wait.until(ExpectedConditions.elementToBeClickable(by1_linkAdmin));
//            el1_navItemAdmin.click();

            // ==== Locator 4: Input Username
            By by4_username = By.xpath("//label[text()='Username']/following::input[1]");
            WebElement el4_inputUsername = wait.until(ExpectedConditions.elementToBeClickable(by4_username));
            el4_inputUsername.sendKeys("ja");

            // ==== Locator 5: Select User Role
            By by5_userrole = By.xpath("//label[text()='User Role']/following::div[contains(@class,'oxd-select-text')][1]");
            WebElement el5_selectUserRole = wait.until(ExpectedConditions.elementToBeClickable(by5_userrole));
            el5_selectUserRole.click();

            // ==== Locator 6: Option Admin inside User Role
            By by6_optAdmin = By.xpath("//div[@role='listbox']//span[text()='Admin']");
            WebElement el6_optionRoleAdmin = wait.until(ExpectedConditions.visibilityOfElementLocated(by6_optAdmin));
            el6_optionRoleAdmin.click();

            // ==== Locator 7: Option ESS inside User Role
            By by7_optESS = By.xpath("//div[@role='listbox']//span[text()='ESS']");

            // ==== Locator 8: Input Employee Name
            By by8_employeeName = By.xpath("//input[@placeholder='Type for hints...']");
            WebElement el8_inputEmployeeName = wait.until(ExpectedConditions.elementToBeClickable(by8_employeeName));
//            el8_inputEmployeeName.sendKeys("pri");


            // ================= Open User Role & choose ESS instead of Admin =================
            wait.until(ExpectedConditions.textToBePresentInElement(el5_selectUserRole, "Admin"));
            el5_selectUserRole = wait.until(ExpectedConditions.elementToBeClickable(by5_userrole));
            el5_selectUserRole.click();
            WebElement el7_optionRoleESS = wait.until(ExpectedConditions.elementToBeClickable(by7_optESS));
            el7_optionRoleESS.click();

            // ==== Locator 9: Button Reset
            By by9_reset = By.xpath("//button[normalize-space()='Reset']");
            WebElement el9_btnReset = wait.until(ExpectedConditions.elementToBeClickable(by9_reset));

            // ==== Locator 10: Button Search
            By by10_search = By.xpath("//button[normalize-space()='Search']");
            WebElement el10_btnSearch = wait.until(ExpectedConditions.elementToBeClickable(by10_search));

            // ==== Locator 11: Nav Item User Management
            By by11_userManagement = By.xpath("//span[normalize-space()='User Management']");
            WebElement el11_navItemUserManagement = wait.until(ExpectedConditions.elementToBeClickable(by11_userManagement));

            // ==== Locator 12: Cell1 Username
            By by12 = By.xpath("(//div[@class='oxd-table-card'])[2]//div[@role='cell'][2]");
            WebElement el12 = wait.until(ExpectedConditions.elementToBeClickable(by12));

            By by13 = By.xpath("(//div[@class='oxd-table-card'])[2]//div[@role='cell'][3]");
            WebElement el13 = wait.until(ExpectedConditions.elementToBeClickable(by13));

            By by14 = By.xpath("//button[.//i[contains(@class,'bi-trash')]]");
            WebElement el14 = wait.until(ExpectedConditions.elementToBeClickable(by14));

            By by15 = By.xpath("//button[.//i[contains(@class,'bi-pencil-fill')]]");
            WebElement el15 = wait.until(ExpectedConditions.elementToBeClickable(by15));

            By by16 = By.xpath("//div[@role='columnheader'][contains(.,'User Role')]");
            WebElement el16 = wait.until(ExpectedConditions.elementToBeClickable(by16));

//            By by17 = By.xpath("(//div[@class='oxd-table-header-cell'])//span[normalize-space()='Employee Name']");
//            WebElement el17 = wait.until(ExpectedConditions.elementToBeClickable(by17));

            System.out.printf("el12: %s\n", el12.getText());
            System.out.printf("el13: %s\n", el13.getText());
            System.out.printf("el14: %s\n", el14.getTagName());
            System.out.printf("el15: %s\n", el15.getTagName());
            System.out.printf("el16: %s\n", el16.getText());
//            System.out.printf("el17: %s\n", el17.getText());
            //
            Thread.sleep(5000);
            driver.quit();
        } catch (InterruptedException e) {
            driver.quit();
        }
    }
}
