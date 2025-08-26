package ge.tbc.testautomation.steps;

import com.codeborne.selenide.SelenideElement;
import ge.tbc.testautomation.pages.PersonalMenuPage;

import static com.codeborne.selenide.Condition.cssValue;
import static ge.tbc.testautomation.constants.Constants.*;
import static org.junit.Assert.assertEquals;

public class PersonalMenuSteps {
    PersonalMenuPage personalMenuPage = new PersonalMenuPage();

    public PersonalMenuSteps changeLanguage() {
        personalMenuPage.languageElement.click();
        return this;
    }

    public PersonalMenuSteps navigateToDigitalServices() {
        personalMenuPage.MegaMenu.click();
        personalMenuPage.digitalServicesButton.click();
        return this;
    }

    public PersonalMenuSteps checkBreadCrumb() {
        String breadcrumbHomeText = personalMenuPage.homeBreadcrumb.getText();
        String breadcrumbDigitalText = personalMenuPage.digitalServicesBreadcrumb.getText();

        String breadcrumbPath = breadcrumbHomeText + " -> " + breadcrumbDigitalText;
        assertEquals(BREADCRUMB_TEXT, breadcrumbPath);
        return this;
    }
    public void checkLastBreadcrumbItem() {
        // Locate the last breadcrumb item ("Digital Services")
        SelenideElement lastBreadcrumb = personalMenuPage.digitalServicesLiTag;

        lastBreadcrumb.shouldHave(cssValue("color", COLOR_TEXT));

        lastBreadcrumb.shouldHave(cssValue("pointer-events", POINTER_CURSOR));

    }
}
