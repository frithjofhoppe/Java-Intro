package com.herdt.java8.kap16;

import java.nio.file.*;

class PathOperations
{
	public static void main(String[] args){
		Path path = Paths.get("C:\\java8\\uebungen\\kap04");

		System.out.format("getFileName: %s%n", path.getFileName());
		System.out.format("getFileSystem: %s%n", path.getFileSystem());
		System.out.format("getName(1): %s%n", path.getName(1));
		System.out.format("getNameCount: %d%n", path.getNameCount());
		System.out.format("getRoot: %s%n", path.getRoot());
		System.out.format("getParent: %s%n", path.getParent());
		System.out.format("isAbsolute: %s%n", path.isAbsolute());
		System.out.format("toString: %s%n", path.toString());
	}
}