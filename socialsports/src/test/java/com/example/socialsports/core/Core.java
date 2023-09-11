package com.example.socialsports.core;

import com.example.socialsports.pages.*;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;



public class Core {

    public static WebDriver driver;

    public static RegistroCentroEsportivoPage registroCentroEsportivoPage = new RegistroCentroEsportivoPage();

    public static CadastrarCentroEsportivoPage cadastrarCentroEsportivoPage = new CadastrarCentroEsportivoPage();

    public static LoginCentroEsportivoPage loginCentroEsportivoPage = new LoginCentroEsportivoPage();

    public static CadastarHorarioFuncionamentoPage cadastarHorarioFuncionamentoPage = new CadastarHorarioFuncionamentoPage();

    public static CadastrarFuncionarioCentroEsportivoPage cadastrarFuncionarioCentroEsportivoPage = new CadastrarFuncionarioCentroEsportivoPage();



    public static void abrirChrome(String url) {
        WebDriverManager.chromedriver().setup();
        ChromeOptions ops = new ChromeOptions();
        ops.addArguments("--remote-allow-origins=*");
        driver = new ChromeDriver(ops);
        driver.manage().window().maximize();
        driver.get(url);

    }

    public static void esperaImplicita() {

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
    }

    public static void esperaExplicita(By locator) {
        WebElement firstResult = new WebDriverWait(driver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(locator));

    }

    public static void clicar(By locator) {
        esperaExplicita(locator);
        WebElement element = driver.findElement(locator);
        element.click();

    }

    public static void preencher(By locator, String text) {
        esperaExplicita(locator);
        WebElement element = driver.findElement(locator);
        element.sendKeys(text);
    }

    public static void scroll(By locator) throws InterruptedException {
        esperaExplicita(locator);
        WebElement iframe = driver.findElement(locator);
        new Actions(driver)
                .scrollToElement(iframe)
                .perform();
    }

    public static void clear(By locator) throws InterruptedException{

        esperaExplicita(locator);
        WebElement element = driver.findElement(locator);
        element.clear();
    }

}



