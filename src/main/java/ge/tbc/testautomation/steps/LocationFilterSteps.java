package ge.tbc.testautomation.steps;

import com.codeborne.selenide.CollectionCondition;
import com.codeborne.selenide.Condition;
import ge.tbc.testautomation.pages.LocationFilterPage;

import static com.codeborne.selenide.Condition.visible;
import static ge.tbc.testautomation.constants.Constants.MAP_PIN_COLOR;


public class LocationFilterSteps {
    LocationFilterPage locationFilterPage=new LocationFilterPage();

    public LocationFilterSteps changeLanguage(){
        locationFilterPage.languageElement.click();
        return this;
    }

    public LocationFilterSteps navigateToLocations() {
        locationFilterPage.MegaMenu.click();
        locationFilterPage.locationsItem.click();
        return this;
    }
    public LocationFilterSteps enterLocationKeyword(String keyword) {
        locationFilterPage.locationFilterInput.setValue(keyword);
        return this;
    }
    public LocationFilterSteps verifyMapPinsUpdate() {
        locationFilterPage.mapPin.shouldBe(visible);
        return this;
    }
    public LocationFilterSteps verifyListUpdate(String keyword){
        locationFilterPage.listItems.shouldHave(CollectionCondition.allMatch(
                "Each item contains the keyword",
                element -> element.getText().contains(keyword)
        ));
        locationFilterPage.acceptCookiesButton.shouldBe(Condition.visible).click();
        return this;
    }
    public LocationFilterSteps clickPin(){

        locationFilterPage.mapPin.shouldBe(Condition.clickable).click();

        locationFilterPage.PinsCollection.get(3).click();

        locationFilterPage.firstPath.shouldHave(Condition.cssValue("fill", MAP_PIN_COLOR));
        return this;

    }
    public void verifyDescription(){
        locationFilterPage.addressAndHoursDetails.shouldBe(visible);
    }
}
