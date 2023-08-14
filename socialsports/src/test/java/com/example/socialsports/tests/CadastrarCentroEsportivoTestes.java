package com.example.socialsports.tests;

import com.example.socialsports.core.Core;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CadastrarCentroEsportivoTestes extends Core {

    @BeforeEach
    void openBrowser() {
        abrirChrome("https://social-sport-lessor.web.app/auth");
    }

    @Test
    void validarCadastro() throws InterruptedException {

        registroCentroEsportivoPage.clicarBotao();
        cadastrarCentroEsportivoPage.PreencherCadastro();

    }

    @AfterEach
    void quitBrowser() {
        driver.quit();


    }
}
