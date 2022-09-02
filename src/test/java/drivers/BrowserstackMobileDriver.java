package drivers;

import com.codeborne.selenide.WebDriverProvider;
import config.BrowserstackKeys;
import org.aeonbits.owner.ConfigFactory;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.MutableCapabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;


public class BrowserstackMobileDriver implements WebDriverProvider {

    static BrowserstackKeys browserStackConfig = ConfigFactory.create(BrowserstackKeys.class, System.getProperties());

//    login = paulkotov_ACqJW2
//            password = ytzCxhTphq68p62GHfSo
//    project = QA.GURU lesson 12/21
//    build = browserstack-build-1
//    name = selenide android test
//            app = bs://f62ec5c9084b084ff93b32af74d249ce113b52b0
//    device = Google Pixel 3a xl
//    osVersion = v9.0
//    baseUrl = http://hub.browserstack.com/wd/hub

    @Override
    public WebDriver createDriver(Capabilities capabilities) {
        MutableCapabilities mutableCapabilities = new MutableCapabilities();
        mutableCapabilities.merge(capabilities);

        mutableCapabilities.merge(capabilities);
        mutableCapabilities.setCapability("browserstack.user", browserStackConfig.login());
        mutableCapabilities.setCapability("browserstack.key", browserStackConfig.password());
        mutableCapabilities.setCapability("app", browserStackConfig.app());
        mutableCapabilities.setCapability("device", browserStackConfig.device());
        mutableCapabilities.setCapability("os_version", browserStackConfig.osVersion());
        mutableCapabilities.setCapability("project", browserStackConfig.project());
        mutableCapabilities.setCapability("build", browserStackConfig.build());
        mutableCapabilities.setCapability("name", browserStackConfig.name());

        return new RemoteWebDriver(getBrowserstackUrl(), mutableCapabilities);
    }

    public static URL getBrowserstackUrl() {
        try {
            return new URL(browserStackConfig.baseUrl());
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        }
    }
}
