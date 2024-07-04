package tests;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import pages.TestBase;

import static com.codeborne.selenide.Condition.hidden;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selectors.withText;
import static com.codeborne.selenide.Selenide.*;


@Disabled("Test")
@Tag("simple")
public class CookiesTests extends TestBase {

    String BASE_URL = "https://www.otpbank.ru/";
    String LOREM_TEXT = "Продолжая просмотр сайта, вы даете согласие на обработку";

    @Test
    void closePopapModalCookiesTest() {
        open(BASE_URL);
        $(withText(LOREM_TEXT)).shouldBe(visible);
        $(".cookies-notification").$(byText("Закрыть")).click();
        $(withText(LOREM_TEXT)).shouldBe(hidden);
        sleep(3000);

    }
}

