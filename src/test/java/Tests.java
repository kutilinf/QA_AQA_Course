import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class Tests {

    private WebDriver driver;
    private WebDriverWait wait;
    private final String BASE_URL = "https://www.mts.by";

    @BeforeEach
    void setUp() {
        // Инициализация ChromeDriver
        driver = new ChromeDriver();
        //wait = new WebDriverWait(driver, Duration.ofSeconds(15));
        driver.manage().window().maximize();
        driver.get("https://www.mts.by");
        WebElement cookieButton = driver.findElement(By.xpath("//button[contains(text(), 'Принять')]"));
        cookieButton.click();
    }

    @Test
    @DisplayName("Проверка названия блока 'Онлайн пополнение без комиссии'")
    void testPaymentBlock() {
        WebElement paySection = driver.findElement(By.xpath("//section/div/h2"));
        assertEquals("Онлайн пополнение\nбез комиссии", paySection.getText());
    }

    @ParameterizedTest
    @DisplayName("Проверка наличия логотипа платежной системы")
    @ValueSource(strings = {"Visa", "Verified By Visa", "MasterCard", "MasterCard Secure Code", "Белкарт"})
    void testPaymentLogo(String nameIconPayment) {
        WebElement icon = driver.findElement(By.xpath("//img[@alt='" + nameIconPayment + "']"));
        assertTrue(icon.isDisplayed());
    }

    @Test
    @DisplayName("Проверка работы ссылки «Подробнее о сервисе»")
    void testLink() {
        WebElement link = driver.findElement(By.xpath("//a[text()='Подробнее о сервисе']"));
        link.click();
        String expected = "https://www.mts.by/help/poryadok-oplaty-i-bezopasnost-internet-platezhey/";
        String actual = driver.getCurrentUrl();
        assertEquals(expected, actual, driver.getCurrentUrl());
    }

    @AfterEach
    void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}