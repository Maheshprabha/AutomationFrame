package com.atmecs.automation.utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadProperites {
	static Properties property;

	public static Properties readLocation(String path) throws IOException {
		property = new Properties();
		FileInputStream file = new FileInputStream(path);
		property.load(file);
		return property;
	}
}
