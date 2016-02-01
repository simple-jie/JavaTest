package com.example.regex;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class TextFile
{
	public static String openFile(String path)
	{
		File file = new File(path);
		if (!file.exists())
			return null;
		BufferedInputStream in = null;
		try
		{
			in = new BufferedInputStream(new FileInputStream(file));
			byte[] bytes = new byte[in.available()];
			in.read(bytes);
			return new String(bytes);
		} catch (FileNotFoundException e)
		{
			e.printStackTrace();
		} catch (IOException e)
		{
			e.printStackTrace();
		} finally
		{
			if (in != null)
				try
				{
					in.close();
				} catch (IOException e)
				{
					e.printStackTrace();
				}
		}
		return null;
	}
}
