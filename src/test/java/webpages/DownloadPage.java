package webpages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DownloadPage extends PageObject {

	@FindBy(xpath = "//*[@id=\"dataset-resources\"]/div/ul/li[2]/span[1]/a")
	private WebElement downloadLink;
	
	public DownloadPage(WebDriver driver) {
		super(driver);
	}
	
	public void clickDownloadLink() {
		downloadLink.click();
	}
	

}
