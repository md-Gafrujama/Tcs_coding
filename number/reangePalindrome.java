class Gafru
{
	static int isPalindrome(int n)
	{
		int rev = 0;
		for (int i = n; i > 0; i /= 10)
			rev = rev * 10 + i % 10;
		return(n == rev) ? 1 : 0;
	}
	static void countPal(int min, int max)
	{
		for (int i = min; i <= max; i++)
			if (isPalindrome(i)==1)
				System.out.print(i + " ");
	}
	// Driver Code
	public static void main(String args[])
	{
		countPal(100, 2000);
	}
}

