package com.qadiaries.generic;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ReadTestData {

	static Properties properties;
	String FilePath = "./files/testdata.properties";

	public ReadTestData() {
		try {
			FileInputStream Locator = new FileInputStream(FilePath);
			properties = new Properties();
			properties.load(Locator);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	public static String getData(String ElementName) {
		String data = properties.getProperty(ElementName);
		return data;
	}

}
