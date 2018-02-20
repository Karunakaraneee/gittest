package gittest;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class GitTest2 {
	@Test
	public void logintest() throws IOException, InterruptedException {
		WebDriver wd = new FirefoxDriver();
		wd.get("http://www.ntltaxi.com/");
		File src = ((TakesScreenshot) wd).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src, new File("C:\\seleniumWorkspace\\gittest\\screenshot\\test.jpg"));
		Thread.sleep(6000);
		wd.quit();
		//int i=1/0;
		
	}
}
