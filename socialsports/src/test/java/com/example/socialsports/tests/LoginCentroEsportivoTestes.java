package com.example.socialsports.tests;

import com.example.socialsports.core.Core;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class LoginCentroEsportivoTestes  extends Core {

    @BeforeEach
    void openBrowser(){


        abrirChrome("https://social-sport-lessor.web.app/auth");
    }

    @Test
    void validarLogin() throws InterruptedException {

        loginCentroEsportivoPage.realizarLogin();
        //loginCentroEsportivoPage.verificarPaginaInicial();
        //loginCentroEsportivoPage.verificarTexto();
        loginCentroEsportivoPage.verificarTextoSegunda();


    }
    @AfterEach
    void quitBrowser(){
        driver.quit();


    }
}
