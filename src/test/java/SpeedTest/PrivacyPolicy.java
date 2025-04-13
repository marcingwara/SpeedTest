package SpeedTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PrivacyPolicy {

    private final WebDriver driver;


    @FindBy(id = "onetrust-accept-btn-handler")
    private WebElement IAccept;

    public PrivacyPolicy(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void clickIAcceptButton() {
        IAccept.click();
    }
}
