package Selle.Org.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class firstday {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\user\\eclipse-workspace\\selle\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://www.greenstechnologies.in/selenium-training.php");
		
		String url = driver.getCurrentUrl();
		System.out.println(url);
		
		String t1 = driver.getTitle();
		System.out.println(t1);
		
		WebElement para1 = driver.findElement(By.xpath("//p[contains(text(),'Greens Technology, Rated As ')]"));
		System.out.println(para1.getText());
		
		WebElement para2 = driver.findElement(By.xpath("//p[contains(text(),' Learn ')]"));
		System.out.println(para2.getText());
		
		WebElement txtpar = driver.findElement(By.xpath("//p[contains(text(),'Our')]"));
		System.out.println(txtpar.getText());
		
		WebElement txtreview = driver.findElement(By.xpath("//h2[contains(text(),'Greens Technologys Overall Reviews')]"));
		System.out.println(txtreview.getText());
		
	
		
		WebElement txttesti = driver.findElement(By.xpath("//span[@class='testimonial-content']"));
        System.out.println(txttesti.getText());
	 
	}
	

}
