package egg;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.AfterEach;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
// import org.openqa.selenium.firefox.FirefoxDriver;
// import org.openqa.selenium.opera.OperaDriver;

class WebTest {

    // private static WebDriver driver = null;

    @Test
    void shouldAnswerWithTrue() {
        assertTrue(true);
    }

    // @AfterEach
    // public void tearDown() {
    //     // Cerrar el navegador después de cada prueba
    //     driver.quit();
    // }

    @Test
    void driverManagerChrome() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.google.com");

        WebElement elInputDeGugle = driver.findElement(By.id("APjFqb"));
        driver.manage().window().maximize();
        elInputDeGugle.sendKeys("QA automation\n");
        driver.navigate().back();
        driver.navigate().forward();
        elInputDeGugle = driver.findElement(By.id("APjFqb"));
        elInputDeGugle.clear();
        elInputDeGugle.sendKeys("Chat GPT\n");
        
        // Esperar 3 segundos antes de cerrar el navegador
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        driver.close();
    }

// Boton 1:
// /html/body/div[1]/div/div[2]/div[1]/div[2]/section/div/div/div[1]/div/button[1]
// //*[@id="root"]/div/div[2]/div[1]/div[2]/section/div/div/div[1]/div/button[1]
// Boton 2:
// /html/body/div[1]/div/div[2]/div[1]/div[2]/section/div/div/div[1]/div/button[2]
// //*[@id="root"]/div/div[2]/div[1]/div[2]/section/div/div/div[1]/div/button[2]


    // @Test
    // void driverManagerFirefox() {
    //     WebDriverManager.firefoxdriver().setup();
    //     WebDriver driver = new FirefoxDriver();
    //     driver.get("https://www.google.com");
    // }

    // @Test
    // void driverManagerOpera() {
    //     WebDriverManager.operadriver().setup();
    //     WebDriver driver = new OperaDriver();
    //     driver.get("https://www.google.com");
    // }
}