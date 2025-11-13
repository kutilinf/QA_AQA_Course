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

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)

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
    @Order(1)
    @DisplayName("1. Проверка названия блока 'Онлайн пополнение без комиссии'")
    void testPaymentBlock() {
        WebElement paySection = driver.findElement(By.xpath("//section/div/h2"));
        assertEquals("Онлайн пополнение\nбез комиссии", paySection.getText());
    }

    @ParameterizedTest
    @Order(2)
    @DisplayName("2. Проверка наличия логотипов платежной системы")
    @ValueSource(strings = {"Visa", "Verified By Visa", "MasterCard", "MasterCard Secure Code", "Белкарт"})
    void testPaymentLogo(String nameIconPayment) {
        WebElement icon = driver.findElement(By.xpath("//img[@alt='" + nameIconPayment + "']"));
        assertTrue(icon.isDisplayed());
    }

    @Test
    @Order(3)
    @DisplayName("3. Проверка работы ссылки 'Подробнее о сервисе'")
    void testLink() {
        WebElement link = driver.findElement(By.xpath("//a[text()='Подробнее о сервисе']"));
        link.click();
        String expected = "https://www.mts.by/help/poryadok-oplaty-i-bezopasnost-internet-platezhey/";
        String actual = driver.getCurrentUrl();
        assertEquals(expected, actual, driver.getCurrentUrl());
    }

    @Test
    @Order(4)
    @DisplayName("4. Проверка работы кнопки 'Продолжить'")
    void testButton() {
        WebElement phoneNumber = driver.findElement(By.id("connection-phone"));
        phoneNumber.click();
        phoneNumber.sendKeys("297777777");
        WebElement sum = driver.findElement(By.id("connection-sum"));
        sum.click();
        sum.sendKeys("100");
        WebElement email = driver.findElement(By.id("connection-email"));
        email.click();
        email.sendKeys("test@mail.ru");
        WebElement button = driver.findElement(By.xpath("//form[@id='pay-connection']/button[text()='Продолжить']"));
        button.click();
        //Я понимаю, что ожидание 10 секунд это плохой вариант, но пока не нашел другого решения как дождаться загрузки iframe,
        //так как иногда он еще не прогрузился, а проверка 'Оплата: Услуги связи Номер:375297777777' уже провелась и получаю ошибку.
        //Не пойму как найти свой фрейм если нет его id "WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[9]/div/iframe")));"
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
        WebElement iframe = driver.findElement(By.xpath("/html/body/div[9]/div/iframe"));
        driver.switchTo().frame(iframe);
        WebElement actualFrame = driver.findElement(By.xpath("//span[contains(text(),'Оплата: Услуги связи') and contains(text(), 'Номер:375297777777')]"));
        assertTrue(actualFrame.isDisplayed());
    }

    @AfterEach
    void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}