import com.codeborne.selenide.Condition;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class GitHubTest {
    @Test
    void gitHubTest() {
        open("https://github.com/selenide");
        $(byTitle("selenide")).click();
        $("#wiki-tab").click();
        $(byText("Soft assertions")).should(Condition.visible).click();
        $(".application-main ").shouldHave(text("Using JUnit5 extend test class:"));
    }
}
