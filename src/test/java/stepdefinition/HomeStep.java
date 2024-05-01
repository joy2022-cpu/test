package stepdefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pageObject.Connexion;

import org.example.pageObject.Panier;
import org.example.pageObject.Recherche;
import org.example.pageObject.RegisterPage;
import org.testng.annotations.Test;

public class HomeStep {
    private Connexion homeStep = new  Connexion();
    private Panier homenStep = new Panier();
    private Recherche rechercheStep = new Recherche();
 @Given( "user in the page")

    @When ("user click avtar in navbar")
    public void uselinckAvatar(){}

    @Then(
            "modal is open"
    )
    public void modalIsopen(){}
}
