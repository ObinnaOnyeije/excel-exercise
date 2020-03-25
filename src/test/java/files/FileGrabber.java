package files;

import java.nio.file.FileSystems;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import webpages.*;

public class FileGrabber 
{
	
	public static void getData() {
//		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\Weshi\\Desktop\\java\\chromedriver.exe");
		 ChromeOptions options = new ChromeOptions();
	        Map<String, Object> prefs = new HashMap<String, Object>();
	        prefs.put("download.prompt_for_download", false);
	        final String separator = FileSystems.getDefault().getSeparator();
	        Path basePath = Paths.get("").toAbsolutePath();
	        String resourcePath = "src" + separator + "main" + separator + "resources" + separator;
	        Path downloadPath = basePath.resolve(resourcePath);
	        prefs.put("download.default_directory", downloadPath.toString());
	        options.setExperimentalOption("prefs", prefs);
	        options.addArguments("start-maximized");
	        WebDriver driver = new ChromeDriver(options);
	        driver.navigate().to("https://data.europa.eu/euodp/en/data/dataset/eu-expenditure-and-revenue-2014-2020");
	        DownloadPage downloadPage = new DownloadPage(driver);
	        downloadPage.clickPopupButton();
	        downloadPage.clickDownloadLink();
	}
	
	public static void main(String[] args) {
		getData();
	}
	
}
