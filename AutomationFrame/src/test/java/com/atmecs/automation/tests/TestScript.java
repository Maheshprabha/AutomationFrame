package com.atmecs.automation.tests;

import java.util.Properties;

import org.testng.annotations.Test;

import com.atmecs.automation.datalocators.DataLocator;
import com.atmecs.automation.helpers.CommonHelpers;
import com.atmecs.automation.testsuite.BaseClass;

public class TestScript extends BaseClass{
	Properties property;
	DataLocator path_name = new DataLocator();
	
	@Test
	public void frames() throws Exception {
	path_name.getPathData();
    CommonHelpers.moveOver(driver, path_name.switchname);
    CommonHelpers.clickAction(driver, path_name.switchframe);
    CommonHelpers.clickAction(driver, path_name.singleframe);
    CommonHelpers.clickAction(driver, path_name.multipleframe);
    CommonHelpers.clickAction(driver, path_name.textname);
    
	}
	

}
