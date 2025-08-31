package ge.tbc.testautomation.tests;

import ge.tbc.testautomation.steps.PersonalMenuSteps;
import org.testng.annotations.Test;
import ge.tbc.testautomation.runners.BaseTest;

public class PersonalMenuTest extends BaseTest {

    private final PersonalMenuSteps personalMenuSteps = new PersonalMenuSteps();

    @Test(description = "Mega Menu Navigation with Active Item and Breadcrumb Check")
    public void testPersonalMenuNavigation() {
        personalMenuSteps
                .changeLanguage()
                .navigateToDigitalServices()
                .checkBreadCrumb()
                .checkLastBreadcrumbItem();
    }
}
