/**
 * Created by atsushi-fukuda on 2015/12/31.
 */

import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.page;

public class GooglePage {
    public SearchResultsPage searchFor(String text) {
        $(By.name("q")).val(text).pressEnter();
        return page(SearchResultsPage.class);
    }
}
