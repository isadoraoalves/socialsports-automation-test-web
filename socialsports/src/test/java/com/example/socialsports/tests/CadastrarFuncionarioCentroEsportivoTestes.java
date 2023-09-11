package com.example.socialsports.tests;

import com.example.socialsports.core.Core;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CadastrarFuncionarioCentroEsportivoTestes extends Core {

    @BeforeEach
    void openBrowser() {

        abrirChrome("https://social-sport-lessor.web.app/auth");
    }
    @Test
    void realizarLoginCentroEsportivo() throws InterruptedException {

        loginCentroEsportivoPage.realizarLogin();
        cadastrarFuncionarioCentroEsportivoPage.cadastrarNovoFuncionario();


    }
    @AfterEach
    void quitBrowser() {
        driver.quit();


    }
}
