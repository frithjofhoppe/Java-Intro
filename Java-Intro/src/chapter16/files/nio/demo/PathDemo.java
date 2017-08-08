package chapter16.files.nio.demo;

import java.nio.file.Path;
import java.nio.file.Paths;

public class PathDemo {

	public static final String ROOT_PATH = "c:/couse/java/labs/Java-Intro-Solution/";
	public static final String REL_DEMO_PATH = "src/chapter16/files/nio/demo";
	public static final String ABS_DEMO_PATH = ROOT_PATH + REL_DEMO_PATH;

	public void printPathInfo(String pathAsString) {
		Path path = Paths.get(pathAsString);
		System.out.println("Path Info for " + pathAsString);
		System.out.format("getFileName: %s%n", path.getFileName());
		System.out.format("getFileSystem: %s%n", path.getFileSystem());
		System.out.format("getName(1): %s%n", path.getName(1));
		System.out.format("getNameCount: %d%n", path.getNameCount());
		System.out.format("getRoot: %s%n", path.getRoot());
		System.out.format("getParent: %s%n", path.getParent());
		System.out.format("isAbsolute: %s%n", path.isAbsolute());
		System.out.format("toString: %s%n", path.toString());
		System.out.println();
	}

	public static void main(String[] args) {
		PathDemo demo = new PathDemo();
		demo.printPathInfo(ABS_DEMO_PATH);
		demo.printPathInfo(REL_DEMO_PATH);
	}

}
