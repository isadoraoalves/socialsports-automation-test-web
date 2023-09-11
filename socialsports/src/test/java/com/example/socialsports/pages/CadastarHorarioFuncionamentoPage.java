package com.example.socialsports.pages;

import com.example.socialsports.core.Core;
import org.openqa.selenium.By;

public class CadastarHorarioFuncionamentoPage extends Core {


    public By menuInicial = By.xpath("//ion-menu-button[@class='md button in-toolbar in-toolbar-color ion-activatable ion-focusable hydrated']");

    public By funcionalidadeConfiguracoes = By.xpath("//span[text()='Configurações']");

    public By btnVerHorarioFucionamento = By.xpath("(//font[text()='ver'])[4]");

    public By diaDomingo = By.xpath("(//font[text()='novo'])[1]");

    public By domingoHoraInicio = By.xpath("//input[@id='ion-input-10']");

    public By domingoHoraFim = By.xpath("//input[@id='ion-input-11']");

    public By horaI (String HoraInicio) {

        return By.xpath("//input[@id='"+HoraInicio+"']");
    }

    public By horaF (String HoraFim) {

        return By.xpath("//input[@id='"+HoraFim+"']");
    }

    public By btnEnviarHorario = By.xpath("//font[text()='Enviar']");

    public void cadastrarSemanaFuncionamento() throws InterruptedException {

        clicar(menuInicial);
        Thread.sleep(3000);
        clicar(funcionalidadeConfiguracoes);
        Thread.sleep(3000);
        clicar(btnVerHorarioFucionamento);
        Thread.sleep(3000);
        clicar(diaDomingo);
        Thread.sleep(3000);
        clear(domingoHoraInicio);
        preencher(domingoHoraInicio,"09:00");
        clear(domingoHoraFim);
        preencher(domingoHoraFim, "13:00");
        Thread.sleep(3000);
        clicar(btnEnviarHorario);

       // preencher(horaI("09:00", ));

    }

}
