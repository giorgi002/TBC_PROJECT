package ge.tbc.testautomation.pages;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.Selectors;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.*;

public class LocationFilterPage {
    public SelenideElement headerRow = $x("//div[contains(@class,'tbcx-pw-header__actions__row--first')]");
    public SelenideElement languageElement = headerRow.$x(".//div[contains(@class,'tbcx-language-select__selected') and normalize-space(text())='EN']");
    public SelenideElement MegaMenu = $x("//div[contains(@class,'tbcx-pw-navigation-item__link') and normalize-space(text())='Personal']");
    public SelenideElement locationsItem = $x("//span[text()=' Locations']");
    public SelenideElement locationFilterInput = $(Selectors.byId("tbcx-text-input-1"));
    public SelenideElement mapPin = $x("//gmp-advanced-marker[contains(@class, 'yNHHyP-marker-view')]");
    public ElementsCollection PinsCollection=$$x("//gmp-advanced-marker[contains(@slot, 'VyEnES-internal-visible-gmp-advanced-markers')]");

    public ElementsCollection listItems=$$x("//div[@class='tbcx-pw-atm-branches-section__list']");
    public SelenideElement addressAndHoursDetails = $x("//div[@class='tbcx-pw-atm-branches-section__list-item-description']");

    public SelenideElement acceptCookiesButton = $x("//button[text()=' Accept All '] ");
    public SelenideElement firstPath = $("gmp-advanced-marker[slot='VyEnES-internal-visible-gmp-advanced-markers'] svg.atm-branches-map-marker.active path.atm-branches-map-marker__background");



}
