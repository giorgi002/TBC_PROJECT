package ge.tbc.testautomation.steps;

import com.codeborne.selenide.Condition;
import ge.tbc.testautomation.pages.MortgageLoanPage;

public class MortgageLoanSteps {
    MortgageLoanPage mortgageLoanPage =new MortgageLoanPage();

    public MortgageLoanSteps changeLanguage(){
        mortgageLoanPage.languageElement.click();
        return this;
    }

    public MortgageLoanSteps navigateToMortgageLink() {
        mortgageLoanPage.megaMenu.click();
        mortgageLoanPage.mortgageLoanLink.click();
        return this;
    }
    public MortgageLoanSteps verifyPageTitle() {
        mortgageLoanPage.titleText.shouldBe(Condition.visible);
        return this;
    }
    public String getPageTitle() {
        return mortgageLoanPage.titleText.getText();
    }
    public void verifyRequiredElements() {
        mortgageLoanPage.descriptionText.shouldBe(Condition.visible);
    }
}
