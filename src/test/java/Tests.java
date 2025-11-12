
import org.junit.jupiter.api.*;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.time.Duration;

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
        wait = new WebDriverWait(driver, Duration.ofSeconds(15));
        driver.manage().window().maximize();
    }

    @Test
    @DisplayName("Проверка названия блока 'Онлайн пополнение без комиссии'")
    void testPaymentBlock() {
        // Переход на сайт
        driver.get("https://www.mts.by");
        // Поиск блока pay-section
        WebElement paySection = wait.until(ExpectedConditions.presenceOfElementLocated(By.id("pay-section")));
        // Поиск заголовка внутри блока
        WebElement titleElement = paySection.findElement(
                By.xpath(".//*[contains(text(), 'Онлайн пополнение ')]")
        );
        // Проверка заголовка
        String actualTitle = titleElement.getText().trim();
        String expectedTitle = "Онлайн пополнение\n" +
                "без комиссии";
        assertEquals(expectedTitle, actualTitle,
                "Название блока в секции pay-section не соответствует ожидаемому");
        System.out.println(actualTitle);
        // Дополнительная проверка видимости
        assertTrue(titleElement.isDisplayed(), "Заголовок должен быть видимым");
    }

    @AfterEach
    void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}