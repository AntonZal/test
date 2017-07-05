import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
<<<<<<< HEAD
=======
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
>>>>>>> bdc141c9098e8347bee30d211cee5dc85e20735f
import pages.HomePage;

import java.util.List;



/**
 * Created by User on 03.06.2017.
 */
public class WebTest {

    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
<<<<<<< HEAD
        driver.navigate().to("https://onliner.by");
=======
        driver.navigate().to("https://ya.ru");

        // #text
        //


        WebElement searchInput = driver.findElement(By.cssSelector("#text"));
        searchInput.sendKeys("поиск");

        By suggestionsLocator = By.cssSelector(".popup__content ul li");

        // Waiting
        WebDriverWait wait = new WebDriverWait(driver, 5);
        wait.until(ExpectedConditions.visibilityOfElementLocated(suggestionsLocator));

        List<WebElement> suggestions = driver.findElements(suggestionsLocator);
        for (WebElement el : suggestions)
        {
            System.out.println(el.getText());
        }

        suggestions.get(2).click();

        By resultItemsLocator= By.cssSelector("ul.serp-list h2 a.link");
        wait.until(ExpectedConditions.visibilityOfElementLocated(resultItemsLocator));

        List<WebElement> resultItems=driver.findElements(resultItemsLocator);

        for (WebElement item : resultItems){
            System.out.println(item.getText());
            System.out.println(item.getAttribute("href"));
        }




>>>>>>> bdc141c9098e8347bee30d211cee5dc85e20735f

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
