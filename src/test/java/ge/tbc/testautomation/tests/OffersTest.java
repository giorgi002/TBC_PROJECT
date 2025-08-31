package ge.tbc.testautomation.tests;

import ge.tbc.testautomation.steps.OffersSteps;
import org.testng.annotations.Test;
import ge.tbc.testautomation.runners.BaseTest;

public class OffersTest extends BaseTest {

    private final OffersSteps offersSteps = new OffersSteps();

    @Test(description = "Apply and Reset Filters on For Youth Offers page")
    public void testOffersFilters() {
        offersSteps
                .changeLanguage()
                .navigateToOffers()
                .navigateToForYouthSection()
                .applyShoppingFilter()
                .clearFilter();
    }
}
