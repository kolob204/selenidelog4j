package selenidelog4j.tests;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

import java.io.File;

import com.codeborne.selenide.testng.TextReport;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.core.LoggerContext;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
 

@Listeners({TextReport.class})
public class Test001 {
	private static final Logger Log = LogManager.getLogger(Test001.class.getName());
	
	public static SelenideElement inputSearchGoogle = $(By.xpath("//textarea[@aria-label='Найти']")),
			inputSearchMail = $(By.id("q")),
					inputSearchYandex = $(By.id("text"));
	@Test
	public void testMetod() { 
		LoggerContext context = (LoggerContext) LogManager.getContext(false);
		context.setConfigLocation(new File("src/main/resources/log4j2.properties").toURI());
		
		open("http://google.com");
		
		Log.info("Открыта http://google.com");
		
		inputSearchGoogle.setValue("автоматизация тестирования");

		Selenide.actions().sendKeys(Keys.ENTER).perform();
	}
}
