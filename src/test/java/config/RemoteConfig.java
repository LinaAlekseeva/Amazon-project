package config;

import org.aeonbits.owner.Config;
@Config.Sources({"classpath:selenoid.properties"})

public interface RemoteConfig extends Config{

    @Config.Key("selenoid.url")
    @DefaultValue("selenoid.autotests.cloud")
    String url();

    @Config.Key("selenoid.login")
    @DefaultValue("user1")
    String login();

    @Config.Key("selenoid.password")
    @DefaultValue("user1")
    String password();
}