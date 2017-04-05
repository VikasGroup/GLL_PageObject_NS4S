package gll.production;

import org.openqa.selenium.WebElement;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;

public class GllHomePage extends PageObject {
	@FindBy(xpath=".//*[@id='header']/div[1]/div[4]/div[2]/a")
	WebElement loginreg; 
	@FindBy(xpath=".//*[@id='mainNavi']/ul/li[1]/a")
	WebElement productstab; 
	@FindBy(xpath=".//*[@id='mainNavi']/ul/li[1]/div/div/div[1]/ul/li[1]/a[2]")
	WebElement healthandwellnesstab; 
	
	public void clickLogIn(){
		loginreg.click();
	}
	public void clickProductTab(){
		productstab.click();
	}
	public void clickHealthAndWellnessTab(){
		healthandwellnesstab.click();
	}

}
