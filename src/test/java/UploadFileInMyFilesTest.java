// Generated by Selenium IDE

import org.junit.Test;
import org.junit.Before;
import org.junit.After;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.core.IsNot.not;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Alert;
import org.openqa.selenium.Keys;

import java.util.*;
import java.net.MalformedURLException;
import java.net.URL;

public class UploadFileInMyFilesTest {
    private WebDriver driver;
    private Map<String, Object> vars;
    JavascriptExecutor js;

    @Before
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
        System.setProperty("webdriver.gecko.driver", "drivers/geckodriver");
        String driverType = System.getenv("BROWSER");
        if(driverType.equals("/usr/bin/google-chrome-stable")) {
            driver = new ChromeDriver();
        }else if(driverType.equals("/usr/bin/firefox")){
            driver = new FirefoxDriver();
        }
        js = (JavascriptExecutor) driver;
        vars = new HashMap<String, Object>();
    }

    @After
    public void tearDown() {
        driver.quit();
    }

    @Test
    public void uploadFileInMyFiles() {
        driver.get("https://dfiles.eu/");
        driver.manage().window().setSize(new Dimension(1920, 1053));
        driver.findElement(By.xpath("//div[@id=\'main\']/div/div/a/strong")).click();
        vars.put("window_handle", driver.getWindowHandle());
        driver.findElement(By.xpath("//div[@id=\'main\']/div/div/a/span")).click();
        driver.findElement(By.xpath("//input[@name=\'login\']")).click();
        driver.findElement(By.xpath("//input[@name=\'login\']")).sendKeys("gardemarrina");
        driver.findElement(By.xpath("//input[@name=\'password\']")).click();
        driver.findElement(By.xpath("//input[@name=\'password\']")).sendKeys("123456");
        driver.findElement(By.xpath("//form[@id=\'login_frm\']/table/tbody/tr[7]/td")).click();
        driver.findElement(By.xpath("//input[@id=\'login_btn\']")).click();
        driver.switchTo().window(vars.get("window_handle").toString());
        {
            WebDriverWait wait = new WebDriverWait(driver, 300);
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[contains(@href, \'/gold/files_list.php\')]")));
        }
        driver.findElement(By.xpath("//div[@id=\'main\']/div/ul/li[2]/a")).click();
        driver.findElement(By.xpath("(//input[@type=\'file\'])[2]")).sendKeys("/home/lesti/Downloads/FourthYearOfItmo-master/7sem/testing/lab3/test.oao");
        {
            WebDriverWait wait = new WebDriverWait(driver, 30);
            wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//a[contains(text(),\'OK\')]")));
        }
        {
            WebElement element = driver.findElement((By.xpath("//a[contains(text(),\'?????????????????? ????????????????\')]")));
            JavascriptExecutor jse = (JavascriptExecutor) driver;
            jse.executeScript("arguments[0].click()", element);
        }

        driver.findElement(By.xpath("//input[@name=\'remote_download_url\']")).sendKeys("https://sun9-3.userapi.com/yCWcnZAlhf743PbGTsxLVufFhe8l-1sd_btDyw/o0KHJJxyZCQ.jpg");
        {
            WebDriverWait wait = new WebDriverWait(driver, 30);
            wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@id=\'container_upload\']/div[3]/div/div[2]")));
        }
        {
            WebElement element = driver.findElement(By.xpath("//div[@id=\'container_upload\']/div[3]/div/div[2]"));
            JavascriptExecutor jse = (JavascriptExecutor) driver;
            jse.executeScript("arguments[0].click()", element);
        }
//        driver.findElement(By.xpath("//div[@id=\'container_upload\']/div[3]/div/div[2]")).click();
        driver.findElement(By.xpath("//input[@name=\'remote_download_login\']")).sendKeys("gardemarrina");
        driver.findElement(By.xpath("//input[@name=\'remote_download_password\']")).sendKeys("123456");
        {
            WebElement element = driver.findElement((By.xpath("//input[@name=\'upload\']")));
            JavascriptExecutor jse = (JavascriptExecutor) driver;
            jse.executeScript("arguments[0].click()", element);
        }
        {
            WebDriverWait wait = new WebDriverWait(driver, 30);
            wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//input[@value=\'OK\']")));
        }
        {
            WebElement element = driver.findElement((By.xpath("//input[@value=\'OK\']")));
            JavascriptExecutor jse = (JavascriptExecutor) driver;
            jse.executeScript("arguments[0].click()", element);
        }
    }
}