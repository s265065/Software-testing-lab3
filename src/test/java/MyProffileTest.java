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

public class MyProffileTest {
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
    public void myProffile() {
        driver.get("https://dfiles.eu/");
        vars.put("window_handle", driver.getWindowHandle());
        driver.manage().window().setSize(new Dimension(1920, 1053));
        driver.findElement(By.xpath("//div[@id=\'main\']/div/div/a")).click();
        driver.findElement(By.xpath("//input[@name=\'login\']")).click();
        driver.findElement(By.xpath("//input[@name=\'login\']")).sendKeys("gardemarrina");
        driver.findElement(By.xpath("//form[@id=\'login_frm\']/table/tbody/tr[4]/td")).click();
        driver.findElement(By.xpath("//input[@name=\'password\']")).click();
        driver.findElement(By.xpath("//input[@name=\'password\']")).sendKeys("123456");
        driver.findElement(By.xpath("//form[@id=\'login_frm\']/table/tbody/tr[7]/td")).click();
        driver.findElement(By.xpath("//input[@id=\'login_btn\']")).click();
        driver.switchTo().window(vars.get("window_handle").toString());
        {
            WebDriverWait wait = new WebDriverWait(driver, 300);
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[contains(@href, \'/gold/files_list.php\')]")));
        }
        driver.findElement(By.xpath("//div[@id=\'main\']/div/div[2]/a[2]")).click();
        driver.findElement(By.xpath("//a[contains(text(),\'???????????? ????????????????????\')]")).click();
        driver.findElement(By.xpath("//input[@name=\'icq\']")).click();
        driver.findElement(By.xpath("//input[@name=\'icq\']")).sendKeys("ololo");
        driver.findElement(By.xpath("//input[@name=\'homepage\']")).click();
        driver.findElement(By.xpath("//input[@name=\'homepage\']")).sendKeys("ololo");
        driver.findElement(By.xpath("//form[@action=\'\']")).click();
        driver.findElement(By.xpath("//input[@name=\'password_old\']")).click();
        driver.findElement(By.xpath("//input[@name=\'password_old\']")).sendKeys("12345");
        driver.findElement(By.xpath("//form[@action=\'\']")).click();
        driver.findElement(By.xpath("//input[@value=\'????????????????\']")).click();
        driver.findElement(By.xpath("//input[@name=\'icq\']")).click();
        driver.findElement(By.xpath("//input[@name=\'icq\']")).sendKeys("qwe");
        driver.findElement(By.xpath("//input[@name=\'homepage\']")).click();
        driver.findElement(By.xpath("//input[@name=\'homepage\']")).sendKeys("qwe");
        driver.findElement(By.xpath("//div[@id=\'main\']/div[4]/div/form/table/tbody/tr[6]/td[2]")).click();
        driver.findElement(By.xpath("//input[@name=\'password_old\']")).click();
        driver.findElement(By.xpath("//input[@name=\'password_old\']")).sendKeys("123456");
        driver.findElement(By.xpath("//div[@id=\'main\']/div[4]/div/form/table/tbody/tr[7]/td[2]/div")).click();
        driver.findElement(By.xpath("//input[@value=\'????????????????\']")).click();
        driver.findElement(By.xpath("//div[@id=\'main\']/div/div[2]/a[2]/strong")).click();
        driver.findElement(By.xpath("//a[contains(text(),\'??????????\')]")).click();
    }
}