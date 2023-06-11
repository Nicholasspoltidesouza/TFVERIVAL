package com.chess;

import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestCases {
     private WebDriver driver;

    @Before
    public void setup() {
        driver = Utils.browser("chrome");
    }

    @Test
    public void testPaginaAprender() {
        WebDriver driver = new ChromeDriver();

        // Navegar para o site chess.com
        driver.get("https://www.chess.com/");

        // Clicar no elemento
        WebElement element = driver.findElement(By.cssSelector("a.nav-link-component.nav-link-main-design.nav-link-top-level.sprite.learn-top"));
        element.click();

        // Verificar se a URL corresponde à página esperada
        String expectedUrl = "https://www.chess.com/learn";
        String actualUrl = driver.getCurrentUrl();
        assertEquals("A URL está correta.", expectedUrl, actualUrl);

        // Fechar o navegador
        driver.quit();
    }

     @Test
    public void testPaginaSocial() {
        WebDriver driver = new ChromeDriver();

        // Navegar para o site chess.com
        driver.get("https://www.chess.com/");

        // Clicar no elemento
        WebElement element = driver.findElement(By.cssSelector("a.nav-link-component.nav-link-main-design.nav-link-top-level.sprite.social-page"));
        element.click();

        // Verificar se a URL corresponde à página esperada
        String expectedUrl = "https://www.chess.com/social";
        String actualUrl = driver.getCurrentUrl();
        assertEquals("A URL está correta.", expectedUrl, actualUrl);

        // Fechar o navegador
        driver.quit();
    }
}

    