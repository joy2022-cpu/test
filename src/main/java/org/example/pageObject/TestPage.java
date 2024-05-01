package org.example.pageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TestPage {
    @FindBy(className = "star_svg")
    private  WebElement etoile;

    private  String  URL="https://ztrain-web.vercel.app/home";
    public  void  navigate(){
        this.get(URL);
    }

    private void get(String url) {
    }

    public void  filletoile(){
        this.etoile.sendKeys();
    }
//    @Test
//    @Description("Test de vérification de la page de connexion")

    public void login(){

        this.etoile.click();

    }
}
