package com.mallu.dp;

public class Fibonacci {
	private static int result;

	public static void main(String[] args) {
		int[] dp =new int[20];
		dp[0]=0;
		dp[1]=1;
		dp[2]=1;
		int n = 18;
		System.out.println(fib(n, dp));

	}

	private static int fib(int n, int[] dp) {
		if (dp[n] != 0)
			return dp[n];
//		if (n == 1 || n == 2)
//			result = 1;
		else {
			result = fib(n - 1, dp) + fib(n - 2, dp);
			dp[n]=result;
		}
		return result;
	}

}
