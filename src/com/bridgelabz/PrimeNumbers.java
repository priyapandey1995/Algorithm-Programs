package com.bridgelabz;

public class PrimeNumbers {
	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		/**
		 * calling the static method in main
		 * and printing the output.
		 */
			for (int i = 0; i <1000; i++)
			{
				 boolean prime=isPrime(i);
				 if(prime)
					 System.out.println(i);
			}
			
		}
		static boolean isPrime(int n)
		{
			int i=2;
			while(i<=n/2)
			{
				if(n%i==0)
					return false;
				i++;
			}
			
			return true;
			
		}

	
		

	}


