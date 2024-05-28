package pages;
import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class InventoryPages {


    private final SelenideElement addBagToCart = $(By.xpath("//*[@id=\"tbodyid\"]/div[2]/div/a"));
    private final SelenideElement cartItem = $(By.xpath("//*[@id=\"cartur\"]"));

    public void addBag() {
        addBagToCart.should(Condition.clickable).click();

    }
    public void navigateToCart() {
        cartItem.should(Condition.appear).click();

    }

}