package ge.tbc.testautomation.pages;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$$x;
import static com.codeborne.selenide.Selenide.$x;

public class LocationsPage {
    public SelenideElement headerRow = $x("//div[contains(@class,'tbcx-pw-header__actions__row--first')]");

    public SelenideElement languageElement = headerRow.$x(".//div[contains(@class,'tbcx-language-select__selected') and normalize-space(text())='EN']");
    public SelenideElement MegaMenu = $x("//div[contains(@class,'tbcx-pw-navigation-item__link') and normalize-space(text())='Personal']");

    public SelenideElement locationsItem = $x("//span[text()=' Locations']");
    public SelenideElement branchesTab = $x("//button[contains(@class,'tbcx-pw-tab-menu__item') and span[text()='Branches']]");
    public ElementsCollection mapCenterMarker = $$x("//gmp-advanced-marker[contains(@class,'yNHHyP-marker-view')]");
    public SelenideElement map = $x("//div[@class='tbcx-pw-atm-branches-section__map-wrapper']");

}
