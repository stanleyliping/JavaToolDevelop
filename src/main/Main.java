package main;

import java.util.Scanner;

import first_tool.First_tool;


public class Main {
	public static void main(String[] args) {
		First_tool firstTool=new First_tool();

		System.out.println("I'm the first PROGRAMMER_TOOL!");
		System.out.println("I CAN CHANGE STRINGS TO UPPER!");
		System.out.println();
		System.out.println("please input strings");
		System.out.println();
		Scanner s=new Scanner(System.in);
		String string= s.next();
		String STRING= firstTool.stringUpper(string);
		System.out.println(STRING);
	}
}
