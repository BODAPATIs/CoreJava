package com.basicprograms.loops;
import java.util.Scanner;

public class Forloop{
	public static void main(String[] args) {
		int i,j,c=0,d=0;
		Scanner sc = new Scanner(System.in);
		int num1=sc.nextInt();
		int num2=sc.nextInt();
		for(i=2;i<num1;i++)
		{
			if(num1%i==0)
			{
				c++;
			}
		}
		if(c==0)
			System.out.println(num1+"is a prime");
		else
			System.out.println(num1+"Not a prime");
		for(i=2;i<num2;i++)
		{
			if(num2%i==0)
			{
				d++;
			}
		}
		if(d==0)
			System.out.println(num2+"is a prime");
		else
			System.out.println(num2+"Not a prime");
		c=0;
		for(i=num1+1;i<num2;i++)
		{
			c=0;
			for(j=2;j<i;j++)
			{
				if(i%j==0)
				{
					c++;
				}
			}
			if(c==0)
				System.out.println("These to are not a twin primes");
				
		}
		if(c!=0)
			System.out.println(num1+" "+ num2+"are twin primes");
		

	}

}
