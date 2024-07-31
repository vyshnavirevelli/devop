package second;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;
public class assign {
    public static void main(String[] args) {
        ChromeDriver driver = new ChromeDriver();

        // Open the HTML file
        driver.get("C:\\Users\\pasup\\eclipse-workspace\\second\\index.html");

        try {
            // Find the input field and button elements
            WebElement nameInput = driver.findElement(By.id("name"));
            WebElement greetButton = driver.findElement(By.tagName("button"));

            // Enter name and click button
            nameInput.sendKeys("John");
            greetButton.click();

            // Wait for the greeting to appear
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

            // Verify the greeting message
            WebElement greetingElement = driver.findElement(By.id("greeting"));
            String greetingText = greetingElement.getText();
            if (greetingText.contains("Hello, John!")) {
                System.out.println("Test Passed!");
            } else {
                System.out.println("Test Failed");
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            // Close the browser
            //driver.quit();
        }
    }
}
