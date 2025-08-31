package ge.tbc.testautomation.pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;

public class PersonalMenuPage {
    public SelenideElement headerRow = $x("//div[contains(@class,'tbcx-pw-header__actions__row--first')]");

    public SelenideElement languageElement = headerRow.$x(".//div[contains(@class,'tbcx-language-select__selected') and normalize-space(text())='EN']");
    public SelenideElement MegaMenu = $x("//div[contains(@class,'tbcx-pw-navigation-item__link') and normalize-space(text())='Personal']");
    public SelenideElement digitalServicesButton = $(By.xpath("//button[contains(@class, 'tbcx-pw-mega-menu-sub-item')]/span[text()='Digital Services']"));
    public SelenideElement homeBreadcrumb = $(By.xpath("//a[contains(text(),' Home ')]"));
    public SelenideElement digitalServicesBreadcrumb = $(By.xpath("//a[contains(text(),' Digital Services ')]"));
    public SelenideElement digitalServicesLiTag=$x("//ul[@class='tbcx-pw-breadcrumbs__items']//li[last()]");

}
