/**
 * Created by atsushi-fukuda on 2015/12/29.
 */

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class SearchResultsPage {

    public ElementsCollection getResults() {
        return $$("#ires .g");
    }
    public SelenideElement getResult(int index) {
        return $("#ires .g", index);
    }

}
