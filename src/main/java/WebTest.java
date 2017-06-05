import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import pages.HomePage;

import java.util.List;



/**
 * Created by User on 03.06.2017.
 */
public class WebTest {

    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://onliner.by");

        List<WebElement> titles = driver.findElements(By.cssSelector("h3.b-tile-header"));

        for (WebElement el : titles)
        {
            System.out.println(el.getText());
        }


        HomePage page = new HomePage();


        PageFactory.initElements(driver, page);

        page.query.sendKeys("test");


        driver.quit();
    }
}
