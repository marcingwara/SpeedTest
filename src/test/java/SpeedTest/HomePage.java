package SpeedTest;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class HomePage {
    private static WebDriver driver;


    @Before
    public void start() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://www.speedtest.net");
    }

    @Test

    public void test() {
        PrivacyPolicy privacyPolicy = new PrivacyPolicy(driver);
        privacyPolicy.clickIAcceptButton();

        LanguageSelection languageSelection = new LanguageSelection(driver);

        long startPl = System.currentTimeMillis();
        languageSelection.goToPolishVersion();
        long durationPl = System.currentTimeMillis() - startPl;
        System.out.println("Czas przełączenia na PL: " + durationPl + " ms");

        long startDe = System.currentTimeMillis();
        languageSelection.goToGermanVersion();
        long durationDe = System.currentTimeMillis() - startDe;
        System.out.println("Czas przełączenia na DE: " + durationDe + " ms");

        long startEn = System.currentTimeMillis();
        languageSelection.goToEnglishVersion();
        long durationEn = System.currentTimeMillis() - startEn;
        System.out.println("Czas przełączenia na EN: " + durationEn + " ms");

        System.out.println("Jestem na języku angielskim");
        assert driver.getCurrentUrl().contains("en");

        GoTest goTest = new GoTest(driver);
        goTest.clickGoButton();
    }
}
