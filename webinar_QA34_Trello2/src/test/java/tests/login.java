package tests;

import org.openqa.selenium.By;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class login extends TestBase {

    @BeforeMethod
    public void preConditions(){
        if(isLogged()){
            logOut();
        }
    }


    @Test
    public  void loginPositive() throws InterruptedException {
        initLogin();
        fillInLoginForm();
        submitLogin();


    }


}