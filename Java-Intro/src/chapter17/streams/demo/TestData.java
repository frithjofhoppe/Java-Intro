package chapter17.streams.demo;

import java.io.File;

public class TestData {

	public static final String DATA_DIR = "src" + File.separator + "chapter17"
			+ File.separator + "streams" + File.separator + "demo"
			+ File.separator + "data";

	public static String getAbsoluteFilename(String relativeFileName) {
		return DATA_DIR + File.separator + relativeFileName;
	}

}
