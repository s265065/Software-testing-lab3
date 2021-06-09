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

public class PasswordRecoveryTest {
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
    public void passwordRecovery() {
        driver.get("https://dfiles.eu/");
        driver.manage().window().setSize(new Dimension(960, 1053));
        driver.findElement(By.xpath("//div[@id=\'main\']/div/div/a/span")).click();
        driver.findElement(By.xpath("//form[@id=\'login_frm\']/table/tbody/tr[8]/td/a")).click();
        driver.findElement(By.xpath("//input[@name=\'login\']")).click();
        driver.findElement(By.xpath("//input[@name=\'login\']")).sendKeys("marinad");
        driver.findElement(By.xpath("//input[@name=\'login\']")).sendKeys(Keys.ENTER);
    }
}