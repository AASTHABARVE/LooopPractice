package com.bridgelabz.WhileLoop;

public class SumOfnaturalNum {
    public static void main(String args[])
    {
        int i=1;
        int sum = 0;
        while(i<=5)
        {
            System.out.println(i);
            sum =sum+i;
            i++;
        }
       // System.out.println(i);
        System.out.println("sum of natural num  " +sum);
    }
}
