package ge.tbc.testautomation.tests;

import ge.tbc.testautomation.steps.LocationFilterSteps;
import org.testng.annotations.Test;
import ge.tbc.testautomation.runners.BaseTest;

import static ge.tbc.testautomation.constants.Constants.SEARCH_KEYWORD;

public class LocationFilterTest extends BaseTest {

    private final LocationFilterSteps locationFilterSteps = new LocationFilterSteps();

    @Test(description = "User Filters Locations by Keyword and Sees Updated Map and List")
    public void testBranchesMapFlow() {
        locationFilterSteps
                .changeLanguage()
                .navigateToLocations()
                .enterLocationKeyword(SEARCH_KEYWORD)
                .verifyMapPinsUpdate()
                .verifyListUpdate(SEARCH_KEYWORD)
                .clickPin()
                .verifyDescription();
    }
}
