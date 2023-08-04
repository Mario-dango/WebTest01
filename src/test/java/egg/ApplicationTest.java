package egg;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

class ApplicationTest {

    // private WebDriver driver;

    // @BeforeEach
    // public void setUp() {
    //     // Configurar y descargar automáticamente el ChromeDriver
    //     WebDriverManager.chromedriver().setup();

    //     // Crear una instancia del driver de Chrome
    //     driver = new ChromeDriver();
    // }

    // @AfterEach
    // public void tearDown() {
    //     // Cerrar el navegador después de cada prueba
    //     driver.quit();
    // }

    // @Test
    // public void testButtonClick() {
    //     // Obtener la URL desde la propiedad definida en el pom.xml
    //     // String url = System.getProperty("app.url");
    //     String url = "https://www.google.com/";
    //     // Abrir la página web
    //     driver.get(url);

    //     // // Encontrar el botón por su selector CSS, nombre, id u otro atributo único
    //     // WebElement button = driver.findElement(By.cssSelector("button"));


    //     // Encontrar el botón por su selector CSS, nombre, id u otro atributo único
    //     // WebElement boton = driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[3]/div/header/div/div[2]/div[1]/nav/ul/li[1]/div[1]/div/a"));
    //     WebElement boton = driver.findElement(By.cssSelector("gN089b"));
    //     // Hacer clic en el botón
    //     boton.click();
    // }


    // @Test
    // void shouldAnswerWithTrue() {
    //     assertTrue(true);
    // }

}