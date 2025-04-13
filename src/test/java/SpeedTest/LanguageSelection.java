package SpeedTest;

import org.junit.runner.manipulation.Ordering;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class LanguageSelection {
    private final WebDriver driver;

    @FindBy(css = "link[rel='alternate'][hreflang='pl']")
    private WebElement polishLink;

    @FindBy(css = "link[rel='alternate'][hreflang='de']")
    private WebElement germanLink;

    @FindBy(css = "link[rel='alternate'][hreflang='en']")
    private WebElement englishLink;


    public LanguageSelection(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    private void goToLanguage(WebElement linkElement) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.presenceOfElementLocated(
                By.cssSelector("link[rel='alternate']"))); // ogólny wait na obecność linków
        String href = linkElement.getAttribute("href");
        driver.get(href);
    }

    public void goToPolishVersion() {
        goToLanguage(polishLink);
    }

    public void goToGermanVersion() {
        goToLanguage(germanLink);
    }

    public void goToEnglishVersion() {
        goToLanguage(englishLink);
    }
}
