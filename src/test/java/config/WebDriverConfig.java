package config;
import org.aeonbits.owner.Config;

@Config.Sources({
        "classpath:${environment}.properties"
})

public interface WebDriverConfig extends Config {

    @Key("baseUrl")
    @DefaultValue("https://www.amazon.com")
    String getBaseUrl();

    @Key("browser")
    @DefaultValue("chrome")
    String getBrowser();

    @Key("browserVersion")
    @DefaultValue("100.0")
    String getBrowserVersion();

    @Key("browserSize")
    @DefaultValue("1920x1080")
    String getBrowserSize();

    @Key("remoteUrl")
    @DefaultValue("https://user1:1234@selenoid.autotests.cloud/wd/hub")
    String getRemoteURL();

}

