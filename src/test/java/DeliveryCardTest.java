
import com.codeborne.selenide.logevents.SelenideLogger;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.*;

public class DeliveryCardTest {

    @BeforeAll
    static void SetUpAll() {
        SelenideLogger.addListener("allure", new AllureSelenide());
    }

    @AfterAll
    static void tearDownAll() {
        SelenideLogger.removeListener("allure");
    }

    @Test
    @DisplayName("Should show success message about rescheduled date")
    public void positiveRescheduledDateRequest() {
        open("http://localhost:9999");
        LoginPage.getCity();
        LoginPage.cleanDateEntryField();
        LoginPage.getFirstDate();
        LoginPage.correctiveClick();
        LoginPage.getName();
        LoginPage.getPhone();
        LoginPage.agreementChekboxClick();
        LoginPage.plannigDateButtonClick();
        LoginPage.cleanDateEntryField();
        LoginPage.getSecondDate();
        LoginPage.plannigDateButtonClick();
        LoginPage.replannigDateButtonClick();
        LoginPage.checkSuccessRescheduledDateRequest();
    }
}
