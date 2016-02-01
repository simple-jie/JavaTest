package com.example.regex;

import java.io.BufferedReader;
import java.io.StringReader;
import java.util.Scanner;

public class BetterReader
{
	public static BufferedReader input = new BufferedReader(new StringReader("Sir Robin of Camelot\n22 1.61803"));
	public static void main(String[] args)
	{
		Scanner stdin = new Scanner(input);
		System.out.println("What is your name?");
		System.out.println(stdin.nextLine());
		System.out.println("How old are you? What is your favorite double?");
		System.out.println("(input: <arg> <double>)");
		System.out.println(stdin.nextInt());
		System.out.println(stdin.nextDouble());
		
//		System.out.format("Hi %s. \n", arg1);
	}
}
