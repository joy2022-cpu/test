package org.example.pageObject;
import jdk.jfr.Description;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Inscription {

    @FindBy(css = "nav>div:nth-child(4)")
    private WebElement avatar;

    @FindBy(className = "style_input__dvx2f")
    private  WebElement email_register;

    @FindBy(className = "style_input_password__6FtLe")
    private  WebElement password_regiser;

    @FindBy(className = "style_input_password__6FtLe")
    private  WebElement confirm_password_regiser;

    @FindBy(id = "btn_register")
    private WebElement inscription;

    private  String  URL="https://ztrain-web.vercel.app/home";
    public  void  navigate(){
        this.get(URL);
    }

    private void get(String url) {
    }

    public void  fillemail(String email){
        this.email_register.sendKeys(email);
        
    }
    public void  fillpassword(String motpasse){
        this.password_regiser.sendKeys(motpasse);
    }
    public void  fillconfirmpassword(String motpasse){
        this.confirm_password_regiser.sendKeys(motpasse);
    }
//    @Test
//    @Description("Test de vérification de la page de connexion")

    public void login(String email , String motpasse){

        this.fillemail(email);
        this.fillpassword(motpasse);
        this.fillconfirmpassword(motpasse);
        this.inscription.click();
    }
}
