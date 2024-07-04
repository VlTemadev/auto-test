package pages;

import com.codeborne.selenide.logevents.SelenideLogger;
import helpers.Attach;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;

public class TestBase {

    @BeforeEach
    void testBase() {
        SelenideLogger.addListener("allure", new AllureSelenide());
    }

    @AfterEach
    void Attach() {
        Attach.screenshotAs("Last ScreenShot");
        Attach.browserConsoleLogs();
//        Attach.addVideo();
        Attach.pageSource();
    }
}
