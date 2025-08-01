import java.util.*;
public class Day2
{
	public static int q2(int n) {
		if(n<=1)return n;
		else if(n>1 && n%2==0)return(n + q2(n/2));
		else return(q2((n+1)/2) + q2((n-1)/2));
	}

	public static int q3(int x, int y) {
		if(y==0 || x==y)return 1;
		return q3(x-1, y) + q3(x-1, y-1);
	}

	public static int q4(int x, int y) {
		if(x==y)return x*y;
		return (q4(x, (x+y)/2) + q4((x+y)/2 + 1, y));
	}

	public static String q5(int n) {
		if(n==1) return "1";
		return q5(n-1) + " " +Integer.toString(n)+ " " +q5(n-1);
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Please enter the value of n: ");
		int n=sc.nextInt();
		System.out.println();
		System.out.println("Answers are follows");


		//Q1...
		//Factorial
		if(n==0)System.out.println(1);
		int fac=1;
		for(int i=1; i<=n; i++)fac*=i;
		System.out.println("Q1. Facotial of " + n + ": " + fac);


		//Q2...
		System.out.println("Q2. Ans: " + q2(n));
		System.out.println();


		//Q3...
		System.out.println("Q3...");
		System.out.print("Enter first value: ");
		int x=sc.nextInt();
		System.out.print("Enter second value: ");
		int y=sc.nextInt();
		System.out.println("Q3. Ans: " + q3(x,y));


		//Q4...
		System.out.println("Q4...");
		System.out.print("Enter first value: ");
		int x1=sc.nextInt();
		System.out.print("Enter second value: ");
		int y1=sc.nextInt();
		System.out.println("Q4. Ans: "+ q4(x1,y1));


		//Q5...
		System.out.println(q5(n));
	}



}