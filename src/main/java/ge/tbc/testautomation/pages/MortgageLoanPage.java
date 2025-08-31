package ge.tbc.testautomation.pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

public class MortgageLoanPage {
    public SelenideElement headerRow = $x("//div[contains(@class,'tbcx-pw-header__actions__row--first')]");

    public SelenideElement languageElement = headerRow.$x(".//div[contains(@class,'tbcx-language-select__selected') and normalize-space(text())='EN']");
    public SelenideElement megaMenu = $x("//div[contains(@class,'tbcx-pw-navigation-item__link') and normalize-space(text())='Personal']");
    public SelenideElement mortgageLoanLink=$x("//button[contains(@class, 'tbcx-pw-mega-menu-sub-item')]/span[text()='Mortgage']");
    public SelenideElement titleText = $x("//h1[text()=' Mortgage ']");
    public SelenideElement descriptionText=$x("//h1[text()=' Mortgage ']/following-sibling::p[@class='tbcx-pw-cta-section__info__text ng-star-inserted']");

}
