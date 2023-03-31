package com.bridgelabz.WhileLoop;

public class ReverceInt {
    public static void main(String gg[])
    {
        int n= 231;
        int reverce =0;
        while (n!=0)
        {

            int remainder = n%10;
            reverce=reverce*10+remainder;
            n=n/10;
        }
        System.out.println("reverce of 231 is  "+reverce);
    }
}
