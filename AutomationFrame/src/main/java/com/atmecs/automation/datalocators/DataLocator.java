package com.atmecs.automation.datalocators;

import java.util.Properties;

import com.atmecs.automation.filepath.FilePath;
import com.atmecs.automation.utils.ReadProperites;

public class DataLocator {
	Properties property;
	public String switchname;
	public String switchframe;
	public String singleframe;
	public String multipleframe;
	public String textname;

	public void getPathData() throws Exception {
		property = ReadProperites.readLocation(FilePath.locator_path);
		setSwitchname();
		setSwitchframe();
		setSingleframe();
		setMultipleframe();
		setTextframe();

	}

	public String getTextname() {
		return textname;
	}

	public void setTextname() {
		textname = property.getProperty("loc_text");
	}

	public String getSwitchframe() {
		return switchframe;
	}

	public void setSwitchframe() {
		switchframe = property.getProperty("loc_iframe");
	}

	public String getMultipleframe() {
		return multipleframe;
	}

	public void setMultipleframe() {
		multipleframe = property.getProperty("loc_multipleframe");
	}

	public String getSwitchname() {
		return switchname;
	}

	public void setSwitchname() {
		switchname = property.getProperty("loc_frame");
	}

	public String getSingleframe() {
		return singleframe;
	}

	public void setSingleframe() {
       singleframe = property.getProperty("loc_singleframe");

	}
}
