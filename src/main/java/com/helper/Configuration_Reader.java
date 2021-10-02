package com.helper;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class Configuration_Reader {

	public static Properties p;

	public  Configuration_Reader() throws Throwable {

		File f = new File(
				".\\src\\main\\java\\com\\properties\\Configuration.properties");

		FileInputStream fis = new FileInputStream(f);

		p = new Properties();

		p.load(fis);

	}

	public String getBrowser() throws Throwable {

		String browser = p.getProperty("browser");

		return browser;

	}

	public String getUrl() {
		String url = p.getProperty("url");
		return url;
		
	}

	public String getUsername() {
		String username = p.getProperty("db_Username");
		return username;

	}

	public String getPassword() {
		String password = p.getProperty("db_Password");
		return password;
		

	}

}
