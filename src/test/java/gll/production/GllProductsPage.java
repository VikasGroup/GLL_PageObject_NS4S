package gll.production;

import org.openqa.selenium.WebElement;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;

public class GllProductsPage extends PageObject {
	@FindBy(xpath=".//*[@id='mainNavi']/ul/li[1]/div/div/div[1]/ul/li[1]/a[2]")
	WebElement airPureAirPurifier ; 
	@FindBy(xpath=".//*[@id='header']/div[1]/div[2]/div[1]/div/a")
	WebElement cart ; 
	@FindBy(xpath=".//*[@id='header']/div[1]/div[2]/div[1]/div/div/div[3]/a")
	WebElement checkout ; 
 void clickAirPureAirPurifier(){
		airPureAirPurifier.click();
	}
 void clickCartIcon(){
	 cart.click();
	}
 void clickCheckOutBtn(){
	 checkout.click();
	}
}
