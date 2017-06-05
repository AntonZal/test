package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by User on 03.06.2017.
 */
public class HomePage {

    @FindBy(css = "[name=\"query\"]")
    public WebElement query;

    public String name;

}
