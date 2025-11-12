
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class Tests {

    private static WebDriver driver = new ChromeDriver();

    @BeforeAll
    public static void setUp() {
        System.setProperty("webdriver.chrome.driver", "C:/Users/Фёдор");
    }

    @AfterAll
    public static void tearDown(){
        if (driver != null){
            driver.quit();
        }
    }

    @Test
    public void testOpenPage(){
        //Открыть страницу
        driver.get("https://www.mts.by/");
        //Проверить заголовок страницы
        String  expectedTitle = "МТС – мобильный оператор в Беларуси";
        String actualTitle = driver.getTitle();
        assertEquals(expectedTitle, actualTitle);
        System.out.println(actualTitle);
    }
}