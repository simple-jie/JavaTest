package com.example.regex;

import java.io.File;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*! Here's a block of text to use as input to regular expression matcher. Note that we'll first extract the block of text by looking for the special delimiters, then process the extracted block. !*/

public class Groups
{
	private final static String POM = "Twas bRilling, and the slithy toves\n" + "Did gyre and gimble in the wabe.\n" + "All mimsy were the borogoves,\n"
			+ "And the mome raths putgrabe.\n\n" + "Beware the Jabberwock, my son,\n" + "The jaws that bite, the claws that catch.\n"
			+ "Beware the Jubjub bird, and shun\n" + "The frumious Bandersnatch.";

	public static void main(String[] args)
	{
		File file = new java.io.File("F:\\Github\\JavaTest\\src\\com\\example\\regex\\Groups.java");
		String s = TextFile.openFile(file.getAbsolutePath());

//		Matcher matcher = Pattern.compile("^/\\*!(.*)!\\*/$", Pattern.MULTILINE | Pattern.DOTALL).matcher(s);
//		String matched = "";
//		if (matcher.find())
//		{
//			matched = matcher.group();
//			System.out.println(matched + "\n" + matcher.group(1));
//		}
//		
//		Matcher m = Pattern.compile("[aoeiu]").matcher(matched);
//		StringBuffer buffer = new StringBuffer();
//		while (m.find())
//		{
//			m.appendReplacement(buffer, m.group().toUpperCase());
//		}
//		m.appendTail(buffer);
		
		

		//		System.out.println(s.replaceAll("(?m)^( +|\t+)", ""));
//		System.out.println(matched);
//		System.out.println(buffer);
		
		Matcher m = Pattern.compile("class +\\b(.+)\\b").matcher(s);
		if (m.find())
			System.out.print(m.group(1));
	}
}
