package tests;

import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import static org.junit.Assert.*;

public class InteragindoComNotepadTestSteps {
	
	//declarando o Selenium WebDriver
	private WebDriver driver;
	private static WebDriverWait wait;
	
	private String titulo;
	
	
	
	@Before
	public void setUp() throws Throwable {
		
		//definir o local do programa que será executado
		DesiredCapabilities dc = new DesiredCapabilities();
		dc.setCapability("app", 	//app -> indica que o selenium irá abrir um sw desktop. Sempre é essa palavra
						"C:\\Program Files (x86)\\Notepad++\\notepad++.exe");
			
		
		//inicializar o selenium wb
		driver = new RemoteWebDriver(new URL("http://localhost:9999") , dc);
			//Esta porta "9999" foi informada pelo VisualStudio, quando iniciamos o Winium
		
		 wait = new WebDriverWait(driver, 10);
		
	}
	
	@After
	public void tearDown() {
		driver.quit();
	}
	
	
	@Given("^Abrir novo documento em branco$")
	public void abrir_novo_documento_em_branco() throws Throwable {
		driver.findElement(By.name("Arquivo")).click();
		driver.findElement(By.name("Novo")).click();
	    
	}
	
	@Given("^Escrever no word \"(.*?)\"$")
	public void escrever_no_word(String texto) throws Throwable {
		driver.findElement(By.className("Scintilla")).sendKeys(texto);
	    
	}
	
	@When("^Solicitar salvar documento$")
	public void solicitar_salvar_documento() throws Throwable {
	    driver.findElement(By.id("Item 41006")).click();
	}
	
	@When("^escolher a pasta onde armazenar$")
	public void escolher_a_pasta_onde_armazenar() throws Throwable {
	     driver.findElement(By.id("Item 41061")).click();
	}
	
	@When("^nomear meu documento$")
	public void nomear_meu_documento() throws Throwable {
		titulo = "nota.txt";
		driver.findElement(By.id("1148")).clear();
		driver.findElement(By.id("1148")).sendKeys(titulo);
		
	    
	}
	
	@Then("^Salvar meu documento$")
	public void meu_documento_será_salvo_com_sucesso() throws Throwable {
		
		driver.findElement(By.name("Salvar")).click();
	    
	    
	}


}
