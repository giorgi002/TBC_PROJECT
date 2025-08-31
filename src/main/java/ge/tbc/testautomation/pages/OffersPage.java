package ge.tbc.testautomation.pages;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$$x;
import static com.codeborne.selenide.Selenide.$x;

public class OffersPage {
    public SelenideElement headerRow = $x("//div[contains(@class,'tbcx-pw-header__actions__row--first')]");

    public SelenideElement languageElement = headerRow.$x(".//div[contains(@class,'tbcx-language-select__selected') and normalize-space(text())='EN']");
    public SelenideElement MegaMenu = $x("//div[contains(@class,'tbcx-pw-navigation-item__link') and normalize-space(text())='Personal']");
    public SelenideElement offersLink=$x("//span[@class='tbcx-pw-mega-menu-quick-acitons-item__title' and contains(text(), ' Offers')]");
    public SelenideElement forYouthSection=$x("//div[contains(@class, 'tbcx-pw-section-title') and .//h2[contains(text(), 'For Youth')]]//button[contains(text(), 'Read More')]");
    public SelenideElement transportCheckbox = $x("//div[@class='filter-item__label' and text()=' Transport ']/input[@class='filter-item__input']");
    public SelenideElement clearButton = $x("//button[contains(@class, 'filter__button ng-star-inserted') and contains(text(), 'Clear')]");

    public ElementsCollection offerListDescription=$$x("//div[@class='marketing__cards-list ng-star-inserted']//h3");
}
