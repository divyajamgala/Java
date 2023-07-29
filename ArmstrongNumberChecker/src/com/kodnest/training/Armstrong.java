package com.kodnest.training;

public class Armstrong {
	
public int find(int n)
{
	int count=0;
	
	while(n!=0)
	{
		n=n/10;
		count++;
		}
	return count;
}
  public int finding(int n,int res)
{
	  int sum=0;
	  while(n!=0)
	  {
	  int rem=n%10;
	  int pow=(int)Math.pow(rem,res);
	  sum=sum+pow;
	  n=n/10;
	}
     return sum;
     }	

}
