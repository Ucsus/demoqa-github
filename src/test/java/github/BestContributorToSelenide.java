package github;

import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class BestContributorToSelenide {
    @Test
    void andreiSolntsevShouldBeTheFirstContributor() {
        // открыть страницу репозитория селенида
        open("https://github.com/selenide/selenide");
        // проверка: во всплывающем окне есть текст Andrei Solntsev
        $("div.Layout-sidebar").$(byText("Contributors"))
                .closest(".BorderGrid-cell").$$("ul li").first().hover();
                //.closest("h2").sibling(0).$$("li").first().hover();
        $$(".Popover").findBy(visible).shouldHave(text("Andrei Solntsev"));
        sleep(5000);
    }
}
