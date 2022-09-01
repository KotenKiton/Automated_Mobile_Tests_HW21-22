package drivers;

import com.codeborne.selenide.WebDriverProvider;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.WebDriver;

import javax.annotation.Nonnull;

public class BrowserstackMobileDriver implements WebDriverProvider {


    @Override
    public WebDriver createDriver(Capabilities capabilities) {
        return null;
    }
}
