package ge.tbc.testautomation.pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

public class ConsumerLoanPage {
    public SelenideElement headerRow = $x("//div[contains(@class,'tbcx-pw-header__actions__row--first')]");

    public SelenideElement languageElement = headerRow.$x(".//div[contains(@class,'tbcx-language-select__selected') and normalize-space(text())='EN']");
    public SelenideElement megaMenu = $x("//div[contains(@class,'tbcx-pw-navigation-item__link') and normalize-space(text())='Personal']");
    public SelenideElement consumerLoanLink=$x("//button[contains(@class, 'tbcx-pw-mega-menu-sub-item')]/span[text()='Consumer']");
    public SelenideElement titleText = $x("//h1[text()=' Consumer Loan ']");
    public SelenideElement descriptionText=$x("//h1[text()=' Consumer Loan ']/following-sibling::p[@class='tbcx-pw-cta-section__info__text ng-star-inserted']");



}
