package coreJava;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class GlobalDataDriving {

	public static void main(String[] args) throws IOException {
	
		Properties prop= new Properties();
		FileInputStream fis = new FileInputStream("D:\\Workspace-Selenium-Learn\\JavaConcepts\\src\\dataGlobal.properties");
        prop.load(fis);
        
        System.out.println(prop.getProperty("browser"));
        System.out.println(prop.getProperty("URL"));
        
        prop.setProperty("username", "sdmtb8171");
        prop.setProperty("password", "flower1234");
        
        FileOutputStream fos = new FileOutputStream("D:\\Workspace-Selenium-Learn\\JavaConcepts\\src\\dataGlobal.properties");
        prop.store(fos, null);
		
	}

}
