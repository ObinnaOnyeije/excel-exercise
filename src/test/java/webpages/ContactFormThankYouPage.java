package webpages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DownloadPage extends PageObject {

	public DownloadPage(WebDriver driver) {
		super(driver);
	}
	
	public static String getURL() {
		return url;
	}
	
	

}
