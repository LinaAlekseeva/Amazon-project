package owner;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.function.Supplier;

public class WebDriverProvider implements Supplier<WebDriver> {
    @Override
    public WebDriver get() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://github.com");
        return driver;
    }


}