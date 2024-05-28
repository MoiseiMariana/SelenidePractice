package pages;
import static com.codeborne.selenide.Selenide.sleep;
import static com.codeborne.selenide.WebDriverRunner.getWebDriver;
import org.openqa.selenium.Alert;
import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class HomePage {

    private final SelenideElement product = $("body > div:nth-child(6) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > h4:nth-child(1) > a:nth-child(1)");
    private final SelenideElement samsungGalaxy = $(By.xpath("//*[@id=\"tbodyid\"]/div[1]/div/div/h4/a"));
    private final SelenideElement signUpButton = $(By.cssSelector("#signin2"));
    private final SelenideElement signUpModal = $(By.cssSelector("#signInModal > div > div > div.modal-header"));
    private final SelenideElement usernameFld = $(By.cssSelector("#sign-username"));
    private final SelenideElement passwordFld = $(By.cssSelector("#sign-password"));
    private final SelenideElement signUpButton2 = $(By.cssSelector("#signInModal > div > div > div.modal-footer > button.btn.btn-primary"));
    private final SelenideElement categoriesFld = $(By.cssSelector("#cat"));
    private final SelenideElement loginButton = $(By.cssSelector("#login2"));
    private final SelenideElement loginModalWindow = $(By.cssSelector("#logInModal > div > div > div.modal-header"));
    private final SelenideElement usernameForLoginFeature = $(By.cssSelector("#loginusername"));
    private final SelenideElement passwordForLoginFeature = $(By.cssSelector("#loginpassword"));
    private final SelenideElement getLoginButtonAfterCredentials = $(By.cssSelector("#logInModal > div > div > div.modal-footer > button.btn.btn-primary"));
    private final SelenideElement logOutButton = $(By.xpath("//*[@id=\"logout2\"]"));
    private final SelenideElement phonesCategoryButton = $(By.cssSelector("#itemc"));
    private final SelenideElement contactButton = $(By.cssSelector("#navbarExample > ul > li:nth-child(2) > a"));
    private final SelenideElement contactFormModalWindow = $(By.cssSelector("#exampleModalLabel"));
    private final SelenideElement contactFormEmailField = $(By.cssSelector("#recipient-email"));
    private final SelenideElement contactFormNameField = $(By.cssSelector("#recipient-name"));
    private final SelenideElement contactFormMessageField = $(By.xpath("//*[@id=\"message-text\"]"));
    private final SelenideElement contactFormSendMessageButton = $(By.cssSelector("#exampleModal > div > div > div.modal-footer > button.btn.btn-primary"));
    private final SelenideElement deleteSamsungGalaxyS6FromCart = $(By.cssSelector("#tbodyid > tr > td:nth-child(4) > a"));
    public void scrollToTheProduct() {
        product.scrollIntoView(true);
        sleep(2000);
    }

    public void userclickonSamsung() {
        samsungGalaxy.should(Condition.clickable).click();

    }

    public void customerClickOnSignUpButton() {
        signUpButton.should(Condition.clickable).click();

    }

    public void singUpModalShouldOpen() {
        signUpModal.should(Condition.appear).click();
    }

    public void customerEnterStringUsername(String username) {
        usernameFld.should(Condition.appear).setValue(username);
    }

    public void enterStringPassword(String password) {

        passwordFld.should(Condition.appear).sendKeys(password);
    }

    public void clickOnSignUp() {
        signUpButton2.should(Condition.clickable).click();
    }

    public void anAlertWindowShouldAppearWithConfirmation() {
        sleep(2000);
        Alert alert = getWebDriver().switchTo().alert();
    }

    public void confirmAlert() {
        Alert alert = getWebDriver().switchTo().alert();
        alert.accept();
    }

    public void theSignUpProcessIsSuccessfullyDoneAndCustomerIsLandingToHomePage() {
        categoriesFld.should(Condition.appear).click();

    }

    public void clickOnLogInButton() {
        loginButton.should(Condition.clickable).click();
    }

    public void openlogInModalWindow() {
        loginModalWindow.should(Condition.appear).click();
    }

    public void enterUsername(String usernameForLogin) {
        usernameForLoginFeature.should(Condition.appear).setValue(usernameForLogin);
    }

    public void enterPassword(String passwordForLogin) {
        passwordForLoginFeature.should(Condition.appear).setValue(passwordForLogin);
    }

    public void clickOnLogIn() {
        getLoginButtonAfterCredentials.should(Condition.clickable).click();
    }

    public void appearsLogOutButton() {
        logOutButton.should(Condition.appear);
        sleep(2000);

    }

    public void clickOnLogOutButton() {
        logOutButton.shouldBe(Condition.visible).shouldBe(Condition.enabled);
        logOutButton.click();
    }

    public void appearsLogInButtonAgain() {
        loginButton.should(Condition.appear);
    }

    public void clickOnPhonesCategory() {
        phonesCategoryButton.should(Condition.clickable).click();

    }
    public void theProductIsDisplayedInTheRightCategory() {
        samsungGalaxy.should(Condition.appear);
    }
    public void clickOnContactButton() {
        contactButton.should(Condition.clickable).click();

    }
    public void contactFormShouldOpen() {
        contactFormModalWindow.should(Condition.appear);
        sleep(2000);
    }
    public void enterContactEmail(String uniqueEmail) {
        contactFormEmailField.should(Condition.appear).setValue(uniqueEmail);
    }
    public void enterContactName(String Name) {
        contactFormNameField.should(Condition.appear).setValue(Name);
    }
    public void enterContactMessage(String randomMessage) {
        contactFormMessageField.should(Condition.appear).setValue(randomMessage);
    }
    public void clickOnSendMessageButton() {
        contactFormSendMessageButton.should(Condition.clickable).click();
    }
    public void appearsAnAlertPopUp() {
        sleep(2000);
        Alert alert = getWebDriver().switchTo().alert();
        alert.accept();
    }



}

