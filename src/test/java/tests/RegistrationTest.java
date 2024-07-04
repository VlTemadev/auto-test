package tests;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import pages.RegistrationPage;

import static com.codeborne.selenide.logevents.SelenideLogger.step;
import static pages.testData.TestData.*;

@Tag("basic")
//@Disabled("stop")

public class RegistrationTest extends RegistrationPage {

    @Test
    void successfulRegistrationForm() {
        step("Открытие страницы", this::openPage);
        step("Заполнение username и lastname", () -> setFirstName(userName).setLastName(lastName));
        step("Заполнение адреса и номера", () -> setEmail(email).setGender().setNumber(userNumber));
        step("Заполнение календаря", () -> setCalendar(day, month, year));
        step("Заполненеи subject and hobbies", () -> setSubjectsInput(subject).setHobbies(hobbies));
        step("Заполнение изображения и адреса", () -> setUploadPicture().setAddress(currentAddress));
        step("Заполнение штата и города", () -> setState(state).setCity(city).setSubmit());
        step("Проверка результата", () -> resultVerify(verifyText, currentAddress));

    }


}
