package com.example.socialsports.pages;

import com.example.socialsports.core.Core;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RegistroCentroEsportivoPage extends Core {

    public By btnRegistro  = By.xpath("//ion-button[text()='Registrar Centro Esportivo']");

    public By btnComecar = By.xpath("//ion-button[text()='Começar']");


    public void clicarBotao() throws InterruptedException {
        scroll(btnRegistro);
        clicar(btnRegistro);
        Thread.sleep(3000);
        clicar(btnComecar);


    }
}
