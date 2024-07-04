package tests;

import core.SelenoidExtension;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import pages.TestBase;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

@Disabled("Test")
@Tag("basic")
@ExtendWith(SelenoidExtension.class)
public class TextBoxFormTest extends TestBase {

    @Test
    void fillFormTest() {
        open("https://demoqa.com/text-box");
        $("#userName").setValue("UserName");
        $("#userEmail").setValue("UserEmail@email.com");
        $("#currentAddress").setValue("CurrentAddress");
        $("#permanentAddress").setValue("PermanentAddress");
        $("#submit").click();

    }

}
