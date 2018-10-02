package com.amazon.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.amazon.util.TestUtil;

public class TestBase {
	public static WebDriver driver;
	public static Properties prop;
	public TestBase() throws IOException {
		try {
			prop=new Properties();
			FileInputStream fs= new FileInputStream("D:/SeleniumQAProject/Cucumber_Amazon/src/main/java/com/amazon/config/config.properties");
			prop.load(fs);
		}
		catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
	public void initialization() {
		String browser=prop.getProperty("browser");
		if(browser.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", "D:/ProjectRead/chromedriver.exe");
			driver=new ChromeDriver();
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(TestUtil.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(TestUtil.WAIT_TIMEOUT, TimeUnit.SECONDS);
	}
}
