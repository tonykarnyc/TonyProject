import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class SpanItem {
	
	@Test
	public void spanItems(){
		
		System.setProperty("webdriver.firefox.marionette", "C:\\WorkspaceTony\\AssessmentTest\\geckodriver.exe");		
		WebDriver driver=new FirefoxDriver();
		driver.get(System.getProperty("user.dir")+"\\Test.html");
		driver.manage().window().maximize();
		List<WebElement> list=driver.findElements(By.tagName("span"));
		
		System.out.println("=============== Ans: (B) ==================");
		for(int i=0; i<list.size(); i++){
			
			System.out.println(list.get(i).getText());
		}
		System.out.println("================ Ans: (A)==================");
		
		System.out.println("3rd Item is: "+ list.get(2).getText());
		System.out.println("5th Item is: "+ list.get(4).getText());
		
	}
}