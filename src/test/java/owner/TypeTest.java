package owner;

import org.aeonbits.owner.ConfigFactory;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.remote.Browser;

import static org.assertj.core.api.Assertions.assertThat;

public class TypeTest {

    @Test
    public void getBrowser() {
        System.setProperty("getBrowser", "CHROME");

        TypeConfig config = ConfigFactory.create(TypeConfig.class, System.getProperties());
        assertThat(config.getBrowser()).isEqualTo(Browser.CHROME);
    }

    @Test
    public void testVersion() {
        System.setProperty("testVersion", "100.0");

        TypeConfig config = ConfigFactory.create(TypeConfig.class, System.getProperties());
        assertThat(config.testVersion()).isEqualTo(100.0);
    }
}

