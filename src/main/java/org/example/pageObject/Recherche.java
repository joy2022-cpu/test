package org.example.pageObject;
import jdk.jfr.Description;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Recherche {
    @FindBy(id = "Style_select_cat__vyiIE")
    private WebElement selectCategorie;

    @FindBy(id = "style_input_navbar_search__5caxy")
    private WebElement inputSearch;

    private  String  URL="https://ztrain-web.vercel.app/home";
    public  void  navigate(){
        this.get(URL);
    }

    private void get(String url) {
    }

    public void  fillSelectCategorie(){
        this.selectCategorie.sendKeys();
    }
    public void  fillinputCategorie(String categorie){
        this.inputSearch.sendKeys(categorie);
    }
//    @Test
//    @Description("Test de vérification de la page de la recherche")

    public void login(String categorie){

        this.fillSelectCategorie();
        this.fillinputCategorie(categorie);

    }
}
