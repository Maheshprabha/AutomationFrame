package com.atmecs.automation.filepath;

import java.io.File;

public class FilePath {
	     public static final String User_Home = System.getProperty("user.dir") + File.separator;
         public static final String Chrome_Path = "./Drivers/chromedriver.exe";
         public static final String Location_Reader ="./src/main/java/com/atmecs/automation/utils/ReadProperites.java";
         public static final String Config_Path = "./src/test/resources/config.property";
         public static final String locator_path ="./src/test/resources/locators/frame.properties";
         public static final String User_data ="./src/test/resources/userdata/userdetails.properties";
}
