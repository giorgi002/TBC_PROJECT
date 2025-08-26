package ge.tbc.testautomation.tests;

import ge.tbc.testautomation.steps.LocationsSteps;
import org.testng.annotations.Test;
import ge.tbc.testautomation.runners.BaseTest;

public class LocationsTest extends BaseTest {

    private final LocationsSteps locationsSteps = new LocationsSteps();

    @Test(description = "User Accesses Locations and Observes Default Map Layout")
    public void testBranchesMapFlow() {
        locationsSteps
                .changeLanguage()
                .navigateToLocations()
                .selectBranchesTab()
                .verifyMapCenter();
    }
}
