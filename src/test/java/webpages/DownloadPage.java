package webpages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DownloadPage extends PageObject {

	@FindBy(xpath = "//*[@id=\"dataset-resources\"]/div/ul/li[2]/span[1]/a")
	private WebElement downloadLink;
	
	@FindBy(xpath = "//*[@id=\"popup-buttons\"]/button[1]")
	private WebElement popupButton;
	
	public DownloadPage(WebDriver driver) {
		super(driver);
	}
	
	public void clickDownloadLink() {
		downloadLink.click();
	}
	
	public void clickPopupButton() {
		popupButton.click();
	}

}
