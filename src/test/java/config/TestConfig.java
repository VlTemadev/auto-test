package config;

import org.aeonbits.owner.Config;
import org.aeonbits.owner.Config.Sources;

@Sources({"file:src/test/resources/test.properties"})
public interface TestConfig extends Config {
    /**
     * URLs
     */

    @Key("demoqa.url")
    String demoqa_url();
}
