import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Googlechrome {

        static WebDriver driver;

        public static void main (String [] args) {
            {
                System.setProperty("webdriver.chrome.driver", "C:\\Soft\\chromedriver.exe");
                driver = new ChromeDriver();
                driver.get("https://www.google.com//");
                driver.manage().window().maximize();
                driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);

                driver.close();


            }
        }

}





