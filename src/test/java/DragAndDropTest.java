import com.codeborne.selenide.Condition;
import org.junit.jupiter.api.Test;
//комментарий для третьего коммита
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class DragAndDropTest {
    @Test
    void dragAndDrop() {
        open("https://the-internet.herokuapp.com/drag_and_drop");
        $("#column-a").dragAndDropTo("#column-b");
        $("#column-a").should(Condition.text("B"));
        $("#column-b").should(Condition.text("A"));
    }
}
