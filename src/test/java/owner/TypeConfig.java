package owner;

import com.codeborne.selenide.Browser;
import org.aeonbits.owner.Config;

public interface TypeConfig extends Config {
    @Key("getBrowser")
    Browser getBrowser();

    @Key("testVersion")
    Integer testVersion();



}
