package com.epam.weekseven;

import org.junit.Test;

import com.epam.weekseven.App;

/**
 * Hello world!
 *
 */

public class App
{
	
	private static App cal ;
	private App() {};
	public static App getInstance()
	{
		if(cal==null)
			cal = new App();
		return cal;
	}
	public int addition(int a,int b)
	{
		return a+b;
	}
	public  int subtraction(int a,int b)
	{
		return a-b;
	}
	public int multiplication(int a,int b)
	{
		return a*b;
	}
	public int division(int a,int b)
	{
		return a/b;
	}
}
