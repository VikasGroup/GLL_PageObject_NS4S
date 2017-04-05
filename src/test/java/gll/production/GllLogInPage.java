package gll.production;

import org.openqa.selenium.WebElement;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;

public class GllLogInPage extends PageObject {
	@FindBy(xpath=".//*[@id='UserName']")
	WebElement irid; 
	@FindBy(xpath=".//*[@id='Password']")
	WebElement pass; 
	@FindBy(xpath=".//*[@id='form2']/input[3]")
	WebElement loginbtn; 
	public void enterIRID(String value){
		irid.sendKeys(value);
	}
	public void enterPassword(String value){
		pass.sendKeys(value);
	}
	public void clickLogInBtn(){
		loginbtn.click();
	}
}
