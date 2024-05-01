package org.example.pageObject;
import jdk.jfr.Description;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Panier {

    @FindBy(id = "style_content_cart_wrapper__mqNbf")
    private WebElement product;

    @FindBy(className = "style_quantity_in__XmF5D")
    private WebElement ajouter;

    @FindBy(className = "style_quantity_dec__nm5ig")
    private WebElement remove;

    @FindBy(className = "style_trash_product_cart__7Yzni")
    private WebElement deleteChoix;

    @FindBy(className = "style_btn_cart__zrT9Q")
    private WebElement commander;

    private  String  URL="https://ztrain-web.vercel.app/home";
    public  void  navigate(){
        this.get(URL);
    }

    private void get(String url) {
    }

    public void  fillproduct(String product){
        this.product.sendKeys(product);
    }
   /* public void  filldeleteChoix(String product){
        this.product.sendKeys(product);
    }
    public void  fillremove(String product){
        this.product.sendKeys(product);
    }

    public void  fillrajouter(String product){
        this.product.sendKeys(product);
    }

    public void  fillcommander(String product){
        this.product.sendKeys(product);
    }*/
//    @Test
//    @Description("Test de vérification du panier")

    public void panier(String product){

        this.fillproduct(product);
        this.product.click();
        this.ajouter.click();
        this.remove.click();
        this.deleteChoix.click();
        this.commander.click();
    }

}
