package com.example.regex;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;


/*! Here's a block of text to use as input to regular expression matcher. Note that we'll first extract the block of text by looking for the special delimiters, then process the extracted block. !*/

public class Groups
{
	private final static String POM = "Twas bRilling, and the slithy toves\n" + "Did gyre and gimble in the wabe.\n" + "All mimsy were the borogoves,\n"
			+ "And the mome raths putgrabe.\n\n" + "Beware the Jabberwock, my son,\n" + "The jaws that bite, the claws that catch.\n"
			+ "Beware the Jubjub bird, and shun\n" + "The frumious Bandersnatch.";

	public static void main(String[] args)
	{
		File file = new java.io.File("E:\\developer\\workspace\\JavaTest\\src\\com\\example\\regex\\Groups.java");
		String s = null;
		try
		{
			BufferedInputStream in = new BufferedInputStream(new FileInputStream(file));
			byte[] bytes = new byte[in.available()];
			in.read(bytes);
			s = new String(bytes);
		} catch (FileNotFoundException e)
		{
			e.printStackTrace();
		}
//		String[] strs = Pattern.compile("\n").split(POM);
		//		while (matcher.find())
		//		{
		//			System.out.println(matcher.group() + " \t\t[start=" + matcher.start() + "-" + matcher.end() +"]");
		//		}
//		for (String s : strs)
//		{
//			System.out.println(s);
//		}
		//		System.out.println(matcher.lookingAt());
		catch (IOException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println(s);
	}
}
