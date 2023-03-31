package com.bridgelabz.forloop;

public class ReverseIntNum {
    public static void main(String args[])
    {
        int n= 231;
       int reverce =0;
        for (n=231; n!=0; n=n/10)
        {
            int remainder = n%10;
            reverce=reverce*10+remainder;
        }
        System.out.println("reverce of 231 is  "+reverce);
    }
}
