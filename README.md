# SpeedTest Automation Test

This is an automated test for measuring internet speed using the SpeedTest website. The test is implemented using Selenium WebDriver in Java. It simulates the process of launching the SpeedTest website, switching between different languages, and clicking the “Go” button to start the internet speed test.

Test Steps:
	1.	Launch SpeedTest: The test begins by opening the SpeedTest website.
	2.	Switch Language: The test changes the language of the website to Polish, German, and English to verify that the site functions correctly in different languages.
	3.	Click “Go” Button: After the language is switched, the test waits for the “Go” button to become clickable and clicks it to start the speed test.

Features:
	•	WebDriverWait is used to ensure the “Go” button is clickable before attempting to click it.
	•	Test Duration: The time taken for the website to switch between languages and load the “Go” button is measured to assess the website’s performance.
	•	Error Handling: The test ensures that errors like element visibility or clickability are handled gracefully, and the test can proceed once the button is ready.

Notes:

Unfortunately, the test does not pass successfully because the time taken to switch between languages is too long. The waiting time for the page to load and the “Go” button to appear is currently too long, causing the test to fail within an acceptable timeframe.

Requirements:
	•	Selenium WebDriver 4.x
	•	JUnit for running the tests
	•	Java 11 or higher
	•	Maven dependencies for Selenium and JUnit

 Notes:

The test accounts for slow page load times, with a maximum wait time of 30 seconds before attempting to click the “Go” button. Test results can be adjusted based on the website’s load time.
