package config;

import org.aeonbits.owner.Config;

@Config.LoadPolicy(Config.LoadType.MERGE)
@Config.Sources({
        "system:properties",
        "classpath:config/browserstack.properties"
})
public interface BrowserstackConfig extends Config {

    String login();

    String password();

    String project();

    String build();

    String name();

    String app();

    String device();

    String osVersion();

    String baseUrl();
}