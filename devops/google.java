package srinidhi;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test1{
    public static void main(String[] args) {
    ChromeDriver driver=new ChromeDriver();

   driver.get("https://www.google.com");

   driver.quit();
 }

}