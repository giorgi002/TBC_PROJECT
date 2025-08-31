package ge.tbc.testautomation.tests;

import ge.tbc.testautomation.runners.BaseTest;
import ge.tbc.testautomation.steps.ConsumerLoanSteps;
import ge.tbc.testautomation.steps.MortgageLoanSteps;
import org.testng.annotations.Test;

import static org.testng.Assert.assertNotEquals;

public class LoanPageTest extends BaseTest {

    private final MortgageLoanSteps mortgageLoanSteps = new MortgageLoanSteps();
    private final ConsumerLoanSteps consumerLoanSteps = new ConsumerLoanSteps();
    private String consumerTitle;

    @Test(description = "Verify Consumer Loan Page Title", priority = 1)
    public void verifyConsumerLoanTitle() {
        consumerLoanSteps
                .changeLanguage()
                .navigateToLoanPage()
                .verifyPageTitle()
                .verifyRequiredElements();

        consumerTitle = consumerLoanSteps.getPageTitle();
    }

    @Test(description = "Verify Mortgage Loan Page Title", priority = 2)
    public void verifyMortgageLoanTitle() {
        mortgageLoanSteps
                .changeLanguage()
                .navigateToMortgageLink()
                .verifyPageTitle()
                .verifyRequiredElements();

        String mortgageTitle = mortgageLoanSteps.getPageTitle();
        assertNotEquals(consumerTitle, mortgageTitle, "Titles should be unique.");
    }
}
