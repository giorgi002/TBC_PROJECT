package ge.tbc.testautomation.steps;

import com.codeborne.selenide.Condition;
import ge.tbc.testautomation.pages.OffersPage;

import static com.codeborne.selenide.CollectionCondition.size;
import static com.codeborne.selenide.CollectionCondition.sizeGreaterThan;
import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.executeJavaScript;
import static ge.tbc.testautomation.constants.Constants.TRANSPORT_TEXT;
import static ge.tbc.testautomation.constants.Constants.transport_text;

public class OffersSteps {
    OffersPage offersPage = new OffersPage();

    public OffersSteps changeLanguage() {
        offersPage.languageElement.click();
        return this;
    }

    public OffersSteps navigateToOffers() {
        offersPage.MegaMenu.click();
        offersPage.offersLink.click();
        return this;
    }

    public OffersSteps navigateToForYouthSection() {
        offersPage.forYouthSection.click();
        return this;
    }

    public void scrollToBottom() {
        executeJavaScript("window.scrollTo(0, document.body.scrollHeight)");
    }
    public OffersSteps applyShoppingFilter() {
        offersPage.transportCheckbox.click();

        offersPage.transportCheckbox.shouldBe(checked);

        offersPage.offerListDescription.shouldHave(sizeGreaterThan(0));
        System.out.println("Offers count before assertion: " + offersPage.offerListDescription.size());
        offersPage.offerListDescription.forEach(offer -> {
            offer.shouldHave(text(TRANSPORT_TEXT).or(text(transport_text)));
        });
        System.out.println("size " + offersPage.offerListDescription.size());
        return this;
    }

    public void clearFilter() {

        int filteredOffersSize = offersPage.offerListDescription.size();
        System.out.println("Offers count after filtering: " + filteredOffersSize);

        offersPage.clearButton.click();

        offersPage.clearButton.shouldNotBe(Condition.visible);

        offersPage.offerListDescription.shouldHave(size(filteredOffersSize));

        scrollToBottom();

        offersPage.offerListDescription.shouldHave(sizeGreaterThan(filteredOffersSize));
        System.out.println("Offers count after clearing filter: " + offersPage.offerListDescription.size());

        offersPage.transportCheckbox.shouldNotBe(Condition.checked);

    }


}
