package com.example.socialsports.pages;

import com.example.socialsports.core.Core;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;

public class RegistroCentroEsportivoPage extends Core {

    public By btnRegistro  = By.xpath("//font[text()='Registrador Centro Esportivo']");


    public void clicarBotao() throws InterruptedException {

        JavascriptExecutor jse = (JavascriptExecutor)driver;
        jse.executeScript("window.scrollBy(0,-250)", "");
        clicar(btnRegistro);


    }
}
