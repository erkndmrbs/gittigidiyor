package pages;

import utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import java.io.FileWriter;
import java.io.IOException;

public class BasketPage{

    public BasketPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//select[@class='amount']")
    public WebElement dropdownElement;

    @FindBy(xpath = "//a[@title='Sil']")
    public WebElement delete;

    @FindBy(xpath = "//*[@id='empty-cart-container']//h2")
    public WebElement emptyText;

    @FindBy(xpath="//div[@class='text-box']//h2")
    public WebElement productName;

    @FindBy(xpath="//div[@class='total-price']//strong")
    public WebElement productPrice;

    @FindBy(css = "[id=\"sp-subTitle\"]")
    public WebElement secilenUrunBilgisiWebelement;

    @FindBy(xpath = "(//span[@id=\"sp-price-highPrice\"])[1]")
    public WebElement FiyatWebelement;

    @FindBy(className = "remainingCount")
    public WebElement stok;


    public void selectAmount(String amount){
        Select dropdownAmount = new Select(dropdownElement);
        dropdownAmount.selectByValue(amount);
    }

    public void yazdir(){
        // String path=System.getProperty("user.home");
        String absolutePath="src/test/resources/product.txt";
        String secilenUrunBilgisi=secilenUrunBilgisiWebelement.getText().toLowerCase();
        String fiyat=FiyatWebelement.getText().toLowerCase();

        try {
            FileWriter fileWriter=new FileWriter(absolutePath);
            fileWriter.write("Secilen ürün : "+secilenUrunBilgisi+" ");
            fileWriter.write("Fiyatı: "+fiyat);
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }

}
