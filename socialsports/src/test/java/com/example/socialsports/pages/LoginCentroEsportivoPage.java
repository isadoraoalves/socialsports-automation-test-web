package com.example.socialsports.pages;

import com.example.socialsports.core.Core;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.springframework.util.Assert;

public class LoginCentroEsportivoPage extends Core {

    public By nomeUsuario  = By.xpath("//input[@type='text']");

    public By passWord  = By.xpath("//input[@type='password']");

    public By btnlogin  = By.xpath("//ion-button[@type='submit']");

    public void realizarLogin() throws InterruptedException {

        //clicar(nomeUsuario);
        preencher(nomeUsuario,"thiagocavalheiri");
        //clicar(passWord);
        preencher(passWord,"524446");
        clicar(btnlogin);
        Thread.sleep(5000);


    }

    public void verificarPaginaInicial(){

        String ActualTitle = driver.getTitle();
        System.out.println(ActualTitle);

        String ExpectedTitle = "Business";

        //Verificação Passando texto como parametro
        Assert.hasText(ActualTitle, "Titulo encontrado com sucesso!!!");

        //Verificação Passando variavel como parametro
        Assertions.assertEquals(ExpectedTitle, ActualTitle);

    }

    public void verificarTexto(){

        String ActualText = driver.findElement(By.xpath("//ion-title[text()='Horário de funcionamento']")).getText();

        System.out.println(ActualText);

        String ExpectedText = "Horário de funcionamento";

        //Verificação Passando variavel como parametro
        Assertions.assertEquals(ExpectedText, ActualText);

    }
    public void verificarTextoSegunda(){

        String ActualText = driver.findElement(By.xpath("//ion-card-title[text()='SEGUNDA']")).getText();

        System.out.println(ActualText);

        String ExpectedText = "SEGUNDA";

        //Verificação Passando variavel como parametro
        Assertions.assertEquals(ExpectedText, ActualText);

    }
}
