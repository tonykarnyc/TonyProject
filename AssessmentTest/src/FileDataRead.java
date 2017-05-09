import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import org.testng.annotations.Test;


public class FileDataRead {
	
	@Test
	public void readDataFromFile(){
		
		System.out.println("============ Ans: A & B ====================================");
		//File file = new File("C:/TonyWorkspace/TonysFirstRequest/SampleFile.properties");
		File file = new File(System.getProperty("user.dir")+"\\SampleFile.properties");
		FileInputStream fileInput=null;
	
		try{
			fileInput=new FileInputStream(file);
		}catch(FileNotFoundException e){
			e.printStackTrace();
		}
		Properties prop=new Properties();
		try{
			prop.load(fileInput);
		}catch(IOException e){
			e.printStackTrace();
		}
		
		System.out.println("FirstValue :: "+prop.getProperty("firstValue"));
		System.out.println("SecondValue :: "+prop.getProperty("secondValue"));
		System.out.println("ThirdValue :: "+prop.getProperty("thirdValue"));
		System.out.println("FourthValue :: "+prop.getProperty("fourthValue"));
		System.out.println("FifthValue :: "+prop.getProperty("fifthValue"));
		System.out.println("SixthValue :: "+prop.getProperty("sixthValue"));
	}
}