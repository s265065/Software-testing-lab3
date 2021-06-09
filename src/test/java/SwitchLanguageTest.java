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

public class SwitchLanguageTest {
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
    public void switchLanguage() {
        driver.get("https://dfiles.eu/");
        driver.manage().window().setSize(new Dimension(960, 1053));


        {
            WebElement element = driver.findElement(By.xpath("//a[contains(@class, \'flag_en\')]"));
            JavascriptExecutor jse = (JavascriptExecutor)driver;
            jse.executeScript("arguments[0].scrollIntoView()", element);
        }
        driver.findElement(By.xpath("//a[contains(@class, \'flag_en\')]")).click();
        {
            WebDriverWait wait = new WebDriverWait(driver, 30);
            wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//a[contains(@class, \'active\') and contains(@class, \'flag_en\')]")));
        }
        assertThat(driver.findElement(By.xpath("//div[@id=\'main\']/div[3]/div[3]/div/h2")).getText(), is("Why to use DepositFiles?"));



        {
            WebElement element = driver.findElement(By.xpath("//a[contains(@class, \'flag_de\')]"));
            JavascriptExecutor jse = (JavascriptExecutor)driver;
            jse.executeScript("arguments[0].scrollIntoView()", element);
        }
        driver.findElement(By.xpath("//a[contains(@class, \'flag_de\')]")).click();
        {
            WebDriverWait wait = new WebDriverWait(driver, 30);
            wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//a[contains(@class, \'active\') and contains(@class, \'flag_de\')]")));
        }

        assertThat(driver.findElement(By.xpath("//div[@id=\'main\']/div[3]/div[3]/div/h2")).getText(), is("Warum benutzt man DepositFiles?"));



        {
            WebElement element = driver.findElement(By.xpath("//a[contains(@class, \'flag_es\')]"));
            JavascriptExecutor jse = (JavascriptExecutor)driver;
            jse.executeScript("arguments[0].scrollIntoView()", element);
        }
        driver.findElement(By.xpath("//a[contains(@class, \'flag_es\')]")).click();
        {
            WebDriverWait wait = new WebDriverWait(driver, 30);
            wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//a[contains(@class, \'active\') and contains(@class, \'flag_es\')]")));
        }
        assertThat(driver.findElement(By.xpath("//div[@id=\'main\']/div[3]/div[3]/div/h2")).getText(), is("¿Por qué utilizar DepositFiles?"));



        {
            WebElement element = driver.findElement(By.xpath("//a[contains(@class, \'flag_pt\')]"));
            JavascriptExecutor jse = (JavascriptExecutor)driver;
            jse.executeScript("arguments[0].scrollIntoView()", element);
        }
        driver.findElement(By.xpath("//a[contains(@class, \'flag_pt\')]")).click();
        {
            WebDriverWait wait = new WebDriverWait(driver, 30);
            wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//a[contains(@class, \'active\') and contains(@class, \'flag_pt\')]")));
        }
        assertThat(driver.findElement(By.xpath("//div[@id=\'main\']/div[3]/div[3]/div/h2")).getText(), is("Por que usar DepositFiles?"));



        {
            WebElement element = driver.findElement(By.xpath("//a[contains(@class, \'flag_fr\')]"));
            JavascriptExecutor jse = (JavascriptExecutor)driver;
            jse.executeScript("arguments[0].scrollIntoView()", element);
        }
        driver.findElement(By.xpath("//a[contains(@class, \'flag_fr\')]")).click();
        {
            WebDriverWait wait = new WebDriverWait(driver, 30);
            wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//a[contains(@class, \'active\') and contains(@class, \'flag_fr\')]")));
        }
        assertThat(driver.findElement(By.xpath("//div[@id=\'main\']/div[3]/div[3]/div/h2")).getText(), is("Pourquoi utiliser DepositFiles?"));


        {
            WebElement element = driver.findElement(By.xpath("//a[contains(@class, \'flag_ja\')]"));
            JavascriptExecutor jse = (JavascriptExecutor)driver;
            jse.executeScript("arguments[0].scrollIntoView()", element);
        }
        driver.findElement(By.xpath("//a[contains(@class, \'flag_ja\')]")).click();
        {
            WebDriverWait wait = new WebDriverWait(driver, 30);
            wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//a[contains(@class, \'active\') and contains(@class, \'flag_ja\')]")));
        }
        assertThat(driver.findElement(By.xpath("//div[@id=\'main\']/div[3]/div[3]/div/h2")).getText(), is("DepositFilesを使うの理由は？"));



        {
            WebElement element = driver.findElement(By.xpath("//a[contains(@class, \'flag_nl\')]"));
            JavascriptExecutor jse = (JavascriptExecutor)driver;
            jse.executeScript("arguments[0].scrollIntoView()", element);
        }
        driver.findElement(By.xpath("//a[contains(@class, \'flag_nl\')]")).click();
        {
            WebDriverWait wait = new WebDriverWait(driver, 30);
            wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//a[contains(@class, \'active\') and contains(@class, \'flag_nl\')]")));
        }
        assertThat(driver.findElement(By.xpath("//div[@id=\'main\']/div[3]/div[3]/div/h2")).getText(), is("Waarom gebruikt men DepositFiles?"));



        {
            WebElement element = driver.findElement(By.xpath("//a[contains(@class, \'flag_it\')]"));
            JavascriptExecutor jse = (JavascriptExecutor)driver;
            jse.executeScript("arguments[0].scrollIntoView()", element);
        }
        driver.findElement(By.xpath("//a[contains(@class, \'flag_it\')]")).click();
        {
            WebDriverWait wait = new WebDriverWait(driver, 30);
            wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//a[contains(@class, \'active\') and contains(@class, \'flag_it\')]")));
        }
        assertThat(driver.findElement(By.xpath("//div[@id=\'main\']/div[3]/div[3]/div/h2")).getText(), is("Perché usare DepositFiles?"));



        {
            WebElement element = driver.findElement(By.xpath("//a[contains(@class, \'flag_sv\')]"));
            JavascriptExecutor jse = (JavascriptExecutor)driver;
            jse.executeScript("arguments[0].scrollIntoView()", element);
        }
        driver.findElement(By.xpath("//a[contains(@class, \'flag_sv\')]")).click();
        {
            WebDriverWait wait = new WebDriverWait(driver, 30);
            wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//a[contains(@class, \'active\') and contains(@class, \'flag_sv\')]")));
        }
        assertThat(driver.findElement(By.xpath("//div[@id=\'main\']/div[3]/div[3]/div/h2")).getText(), is("Varför använder man DepositFiles?"));



        {
            WebElement element = driver.findElement(By.xpath("//a[contains(@class, \'flag_tr\')]"));
            JavascriptExecutor jse = (JavascriptExecutor)driver;
            jse.executeScript("arguments[0].scrollIntoView()", element);
        }
        driver.findElement(By.xpath("//a[contains(@class, \'flag_tr\')]")).click();
        {
            WebDriverWait wait = new WebDriverWait(driver, 30);
            wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//a[contains(@class, \'active\') and contains(@class, \'flag_tr\')]")));
        }
        assertThat(driver.findElement(By.xpath("//div[@id=\'main\']/div[3]/div[3]/div/h2")).getText(), is("DepositFiles'ı neden kullanıyorsanız?"));


        {
            WebElement element = driver.findElement(By.xpath("//a[contains(@class, \'flag_da\')]"));
            JavascriptExecutor jse = (JavascriptExecutor)driver;
            jse.executeScript("arguments[0].scrollIntoView()", element);
        }
        driver.findElement(By.xpath("//a[contains(@class, \'flag_da\')]")).click();
        {
            WebDriverWait wait = new WebDriverWait(driver, 30);
            wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//a[contains(@class, \'active\') and contains(@class, \'flag_da\')]")));
        }
        assertThat(driver.findElement(By.xpath("//div[@id=\'main\']/div[3]/div[3]/div/h2")).getText(), is("Why to use DepositFiles?"));

    }
}