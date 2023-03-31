package com.bridgelabz.forloop;

public class Palindrom {
    public static void main(String args[])
    {
        int n= 122;
        int reverce =0;
        for (n=122; n!=0; n=n/10) {
            int remainder = n % 10;
            reverce = reverce * 10 + remainder;
        }

        if  (reverce==n)
        System.out.println("number is palindrome  " +reverce);
        else
            System.out.println("number is not palindrome  " +reverce);


    }

}

