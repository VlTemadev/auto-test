package tests;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import pages.TestBase;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

@Disabled("Test")
@Tag("basic")
public class GitHubTests extends TestBase {
    String BASE_URL = "https://github.com/";
    String SELENIDE_URL = "https://github.com/selenide/selenide";
    String VALUE = "selenide";
    String SEARCH_TEXT = "selenide/selenide";
    String AUTHOR_NAME = "Andrei Solntsev";

    @Test
    void ShouldSelenideTextInTheTop() {
        open(BASE_URL);
        $(".search-input").click();
        $("#query-builder-test").setValue(VALUE).pressEnter();
        $(".search-match").shouldHave(text(SEARCH_TEXT)).click();
        $("[data-turbo-frame='repo-content-turbo-frame']").shouldHave(text(VALUE));

    }

    @Test
    void ShouldHaveTextInFirstAuthorBlock() {
        open(SELENIDE_URL);
        $("div.Layout-sidebar").$(byText("Contributors")).closest(".BorderGrid-cell")
                .$("ul li:first-child")
                .hover();
        $(".Popover-message").shouldHave(text(AUTHOR_NAME));
    }
}
