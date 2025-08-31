package ge.tbc.testautomation.steps;

import com.codeborne.selenide.*;
import ge.tbc.testautomation.constants.Constants;
import ge.tbc.testautomation.pages.LocationsPage;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.*;

public class LocationsSteps {
    LocationsPage locationPage = new LocationsPage();

    public LocationsSteps changeLanguage(){
        locationPage.languageElement.click();
        return this;
    }

    public LocationsSteps navigateToLocations() {
        locationPage.MegaMenu.click();
        locationPage.locationsItem.click();
        return this;
    }

    public LocationsSteps selectBranchesTab() {
        locationPage.branchesTab.click();
        locationPage.branchesTab.shouldHave(cssClass("active"));
        return this;
    }

    public void verifyMapCenter(){
        locationPage.mapCenterMarker.first().shouldBe(Condition.visible);

        String position = executeJavaScript(
                "return document.querySelector('gmp-advanced-marker').getAttribute('position');"
        );

        System.out.println("Map center position: " + position);

        if (position.startsWith(Constants.TBILISI_LATITUDE)) {
            System.out.println("Map centers on Tbilisi (location blocked)");
        } else {
            System.out.println("Map centers on user location: " + position);
        }
    }
}
