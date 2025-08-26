package ge.tbc.testautomation.steps;

import com.codeborne.selenide.Condition;
import ge.tbc.testautomation.pages.ConsumerLoanPage;

import java.time.Duration;

public class ConsumerLoanSteps {
    ConsumerLoanPage consumerLoanPage =new ConsumerLoanPage();

    public ConsumerLoanSteps changeLanguage(){
        consumerLoanPage.languageElement.click();
        return this;
    }

    public ConsumerLoanSteps navigateToLoanPage() {
        consumerLoanPage.megaMenu.click();
        consumerLoanPage.consumerLoanLink.click();
        return this;
    }
    public String getPageTitle() {
        return consumerLoanPage.titleText.getText();
    }
    public ConsumerLoanSteps verifyPageTitle() {
        consumerLoanPage.titleText.shouldBe(Condition.visible);
        return this;
    }

    public void verifyRequiredElements() {
        consumerLoanPage.descriptionText.shouldBe(Condition.visible, Duration.ofSeconds(10));
    }
}
