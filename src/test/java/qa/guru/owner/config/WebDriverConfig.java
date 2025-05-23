package qa.guru.owner.config;

import org.aeonbits.owner.Config;

import java.net.URL;

@Config.Sources({
        "classpath:${env}.properties"
})
public interface WebDriverConfig extends Config {

    @Key("browser")
    @DefaultValue("CHROME")
    Browser browser();

    @Key("version")
    @DefaultValue("122.0")
    String browserVersion();

    @Key("remoteUrl")
    @DefaultValue("http://localhost:4444/wd/hub")
    URL remoteUrl();

    @Key("isRemote")
    @DefaultValue("false")
    boolean isRemote();
}
