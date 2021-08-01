package configReader;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class Config_Prop_Reader
{
	private Properties prop;
	private FileInputStream ip;
	
	public Properties initLangProp(String language) throws FileNotFoundException
	{
		System.out.println("language is = " + language);
		prop = new Properties();
		
		try
		{
			switch(language.toLowerCase())
			{
			case "english" :
				ip = new FileInputStream(".\\src\\main\\resources\\lang.eng.properties");
				break;
				
			case "french" :
				ip = new FileInputStream(".\\src\\main\\resources\\lang.frech.properties");
			
			case "russian" :
				ip = new FileInputStream(".\\src\\main\\resources\\lang.russian.properties");
			
			default :
				break;
			}
			
			prop.load(ip);
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
		
		return prop;
	}
}
