package test;

import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Story;
import io.qameta.allure.junit4.DisplayName;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import config.ChromeConfig;
import steps.MainSteps;
import steps.SurveySteps;

import static config.Properties.POSTFIX;
import static util.StringGenerator.generateRandomString;

@Epic("Wrike site test")
public class MainTest {

    private WebDriver driver;
    private MainSteps mainSteps;
    private SurveySteps surveySteps;
    private String email;
    private String otherMessage;

    @Before
    public void prepare() {
        this.driver = ChromeConfig.ChromeDriver();
        this.mainSteps = new MainSteps(this.driver);
        this.surveySteps = new SurveySteps(this.driver);
        this.email = generateRandomString(50) + POSTFIX;
        this.otherMessage = generateRandomString(20);
    }


    @Test
    @DisplayName("Email and Q&A test")
    @Description("Check working email submission and redirect. Check working of survey")
    @Feature("Getting started test")
    @Story("Email and Q&A test")
    public void emailAndSurveyTest() {
        this.mainSteps
                .openMain()
                .clickGetStarted()
                .typeEmail(this.email)
                .submitEmail();
        this.surveySteps
                .setAnswers(this.otherMessage)
                .submitSurvey()
                .checkSuccess();
    }

    @Test
    @DisplayName("Twitter link and data test")
    @Description("Check if button redirects to the right place and icon is correct")
    @Feature("Footer test")
    @Story("Twitter link and data test")
    public void twitterTest() {
        this.mainSteps
                .openMain()
                .checkLink();
        this.mainSteps
                .checkIcon();
    }


    @After
    public void quit() {
        this.driver.quit();
    }

}