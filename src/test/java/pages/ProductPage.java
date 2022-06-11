package pages;


import utilities.ReusableMethods;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class ProductPage extends BasePage {

    @FindBy(xpath = "//div[@class=\"h1-container\"]//h1")
    public WebElement producTitleOne;

    @FindBy(id = "add-to-basket")
    public WebElement addToBasketButton;

    @FindBy(css = "#sp-subTitle")
    public WebElement productInfo;

    @FindBy(css = "#sp-price-lowPrice")
    public WebElement productPrice;


    public void writeProductInfoToTxtFile() {
        String url = "src/test/resources/product.txt";
        File file = new File(url);
        try {
            file.createNewFile();
            FileWriter myWriter = new FileWriter(file.getAbsolutePath());

            myWriter.write("Ürün Bilgisi: " + productInfo.getText() + "\nÜrün Fiyatı: " + productPrice.getText());
            myWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public void addToBasket() {
        ReusableMethods.waitFor(5);
        addToBasketButton.click();
        ReusableMethods.waitFor(2);
    }
}
