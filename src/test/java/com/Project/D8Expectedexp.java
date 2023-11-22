package com.Project;

import java.util.InputMismatchException;
import java.util.Scanner;

import org.testng.annotations.Test;

public class D8Expectedexp {
	private static final String Null = null;

@Test
 public void first_case() 
{
	
	System.out.println("first case");
}
@Test
public void second_case() 
{
	
	System.out.println("second case");
}
@Test(expectedExceptions = ArithmeticException.class)
public void Third_case() 
{
	int a =2;
	int b= 0;
	System.out.println(a/b);
	System.out.println("third case");
}

@Test(expectedExceptions = NullPointerException.class)
public void fourth_case() 
{
	
	String s =Null;
	System.out.println(s.length());
	System.out.println("fourth case");
}

@Test(expectedExceptions = InputMismatchException.class)
public void fifth_case() 

{
	Scanner s =new Scanner(System.in);
	System.out.println("Enter the integer no");
    byte a = s.nextByte();
	
	System.out.println("ur no"+a);
	System.out.println("fifth case");
}
}
