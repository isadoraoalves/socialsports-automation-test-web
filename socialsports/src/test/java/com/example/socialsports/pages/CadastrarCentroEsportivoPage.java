package com.example.socialsports.pages;

import com.example.socialsports.core.Core;
import org.openqa.selenium.By;

public class CadastrarCentroEsportivoPage extends Core {

    public By inputNomeCentroEsportivo = By.xpath("//input[@id='ion-input-2']");

    public By inputCNPJ = By.xpath("//input[@id='ion-input-3']");

    public By btnProximoTela1 = By.xpath("//span[text()='Próximo (1/5)']");

    public By inputNomeP_Fisica = By.xpath("//input[@id='ion-input-4']");

    public By inputCPF = By.xpath("//input[@id='ion-input-5']");

    public By inputCelular = By.xpath("//input[@id='ion-input-6']");

    public By inputEmail = By.xpath("//input[@id='ion-input-7']");

    public By inputDataNasc = By.xpath("//input[@id='ion-input-8']");

    public By btnProximoTela2 = By.xpath("//ion-button[text()='Próximo (2/5)']");

    public By inputCEP = By.xpath("//input[@id='ion-input-25']");

    public By inputRua = By.xpath("//input[@id='ion-input-26']");
    public By inputNumero = By.xpath("//input[@id='ion-input-27']");

    public By inputComplemento = By.xpath("//input[@id='ion-input-12']");


    //public By inputBairro = By.xpath("//input[@id='ion-input-13']");

    public By btnProximoTela3 = By.xpath("/span[text()='Próximo (3/5)']");

    public By inputUserName = By.xpath("//input[@id='ion-input-15']");

    public By btnProximoTela4 = By.xpath("//span[text()='Próximo (4/5)']");

    public By btnRegistro = By.xpath("//span[text()='Registrar']");


    public void PreencherCadastro() throws InterruptedException {

      preencher(inputNomeCentroEsportivo,"Centro Esportivo FUTEL - Uberlandia");
      preencher(inputCNPJ, "05709360000180");
      Thread.sleep(2000);
      clicar(btnProximoTela1);
      preencher(inputNomeP_Fisica, "Rafaela Santos");
      preencher(inputCPF, "63820013687");
      preencher(inputCelular, "34999999999");
      preencher(inputEmail, "rafaela_mam@hotmail.com");
      scroll(inputDataNasc);
      clear(inputDataNasc);
      preencher(inputDataNasc, "03031993");
      Thread.sleep(2000);
      clicar(btnProximoTela2);
      clicar(inputCEP);
      preencher(inputCEP, "38408150");
      //Thread.sleep(3000);
        clicar(inputRua);
      preencher(inputNumero,"3415");
      //preencher(inputNumero,"3415");
      preencher(inputComplemento,"Parque Sabiá");
      //scroll(inputBairro);
      //preencher(inputBairro, "Tibery");
      Thread.sleep(2000);
      clicar(btnProximoTela3);
      preencher(inputUserName,"Futel123");
      Thread.sleep(2000);
      clicar(btnProximoTela4);
      clicar(btnRegistro);

    }

}
