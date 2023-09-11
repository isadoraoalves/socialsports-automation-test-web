package com.example.socialsports.pages;

import com.example.socialsports.core.Core;
import org.openqa.selenium.By;

public class CadastrarFuncionarioCentroEsportivoPage extends Core {

    public By menuInicial = By.xpath("//ion-menu-button[@class='md button in-toolbar in-toolbar-color ion-activatable ion-focusable hydrated']");

    public By funcionalidadeFuncionarios = By.xpath("//span[text()='Funcionários']");

    public By iconeAdicionarFuncionario = By.xpath("//ion-fab-button[@class='ion-color ion-color-success md ion-activatable ion-focusable hydrated']");

    public By nomeFuncionario = By.xpath("//input[@id='ion-input-6']");

    public By usuarioFuncionario = By.xpath("//input[@id='ion-input-7']");

    public By telefoneFuncionario = By.xpath("//input[@id='ion-input-8']");

    public By emailFuncionario = By.xpath("//input[@id='ion-input-9']");

    public By btnRegistradorFuncionario = By.xpath("//font[text()='registrador']");


    public void cadastrarNovoFuncionario() throws InterruptedException {


        clicar(menuInicial);
        Thread.sleep(2000);
        clicar(funcionalidadeFuncionarios);
        Thread.sleep(2000);
        clicar(iconeAdicionarFuncionario);
        Thread.sleep(2000);
        preencher(nomeFuncionario, "Neymar Junior");
        preencher(usuarioFuncionario, "NeyJr");
        preencher(telefoneFuncionario, "34 99999-9999");
        preencher(emailFuncionario, "neymar.junior@teste.com");
        clicar(btnRegistradorFuncionario);
        Thread.sleep(2000);


    }



}
