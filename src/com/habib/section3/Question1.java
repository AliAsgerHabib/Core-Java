package com.habib.section3;

public class Question1 {
	public static int maxRacers(int input1,int[][] input2)
	{
		int[] cnt=new int[100];
		for(int i=0;i<input1;i++)
		{
			for(int j=input2[i][0];j<input2[i][1];j++)
			{
				cnt[j]++;
			}
		}
		int max=Integer.MIN_VALUE;
		for(int i=0;i<cnt.length;i++)
		{
			System.out.println("Value of: "+i+'='+cnt[i]);
			if(cnt[i]>=max)
			{
				max=cnt[i];
			}
		}
		return max;
	}
	public static void main(String[] args) {
		int[][] arr= {{1,7},{2,4},{6,9},{3,8},{5,10}};
		int nas=maxRacers(5, arr);
		System.out.println(nas);
	}
}
