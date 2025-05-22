package qa.guru.owner;

import qa.guru.owner.config.WebDriverProvider;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;

public class SimpleWebTest {

    private final WebDriver driver = new WebDriverProvider().get();

    @Test
    void checkTitle() {
        driver.get("https://github.com");
        System.out.println(driver.getTitle());
    }

    @AfterEach
    void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}
