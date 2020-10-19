package bot;

import java.util.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Main {
	
	public static void main(String[] args) {
		ChromeOptions chromeOptions = new ChromeOptions();
		chromeOptions.addArguments("--start-maximized"); //Makes the window maximized
		WebDriver chrome = new ChromeDriver(chromeOptions);
		chrome.get("https://www.nike.com/t/kyrie-6-n7-shoe-GT5h8v/DA1348-001"); //url depends. This also will change the css selectors, they will need to be reintialzied in Actions.java 
		Specifics.Look(chrome);
		
	}
}

