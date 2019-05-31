import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Selenium {

	
	
	
	
	public void openDriver () throws MalformedURLException {
		
		DesiredCapabilities dr = new DesiredCapabilities ();
		dr.setBrowserName("chrome");
		dr.setPlatform(Platform.MAC);
		WebDriver d = new RemoteWebDriver(new URL("http://192.168.86.40:4444/wd/hub"), dr);
		d.get("https://www.google.com/?client=safari&channel=iphone_bm");
		
		
		
		
		
	}
	
	
}
