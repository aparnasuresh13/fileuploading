package fileuploadingpkg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUploading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/upload/");
		driver.findElement(By.name("uploadfile_0")).sendKeys("C:\\Users\\sures\\OneDrive\\Desktop\\aparna.txt"); 
	}

}
