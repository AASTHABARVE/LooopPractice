package com.bridgelabz.forloop;

public class SumOfNaturalNum {
    public static void main(String args[])
    {
        //Write a Program for the sum of n natural numbers eg. Input N=5 output 1+2+3+4+5
        int sum = 0;
        for(int i=1;i<=5;++i)
        {
            System.out.println(i);
            sum =sum+i;
        }
            System.out.println("sum of natural num  " +sum);
    }
}
