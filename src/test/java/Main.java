/**
 * Created by atsushi-fukuda on 2015/12/28.
 */
import org.junit.Test;
import static com.codeborne.selenide.CollectionCondition.size;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.open;


public class Main {

    @Test
    public void userCanSearch() {
        GooglePage page = open("http://google.com/ncr", GooglePage.class);
        SearchResultsPage results = page.searchFor("selenide");
        results.getResults().shouldHave(size(10));
        results.getResult(0).shouldHave(text("Selenide: concise UI tests in Java"));
    }

}
