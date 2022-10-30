//package com.company;

import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws Exception{
        Reader.init(System.in);
        int t = Reader.nextInt();
        int x = 0;
        while (t-- > 0)
        {
            String s = Reader.nextLine();
            if (s.charAt(0)=='+' || s.charAt(s.length()-1)=='+') x++;
            else x--;
        }
        System.out.println(x);


    }
    public static int gcd(int a, int b)
    {
        if (a == 0)
            return b;
        return gcd(b % a, a);
    }

    // method to return LCM of two numbers
    public static int lcm(int a, int b)
    {
        return (a / gcd(a, b)) * b;
    }

    public static long power(long x, long y, long p)
    {
        long res = 1; // Initialize result

        x = x % p; // Update x if it is more than or
        // equal to p

        if (x == 0)
            return 0; // In case x is divisible by p;

        while (y > 0)
        {

            // If y is odd, multiply x with result
            if ((y & 1) != 0)
                res = (res * x) % p;

            // y must be even now
            y = y >> 1; // y = y/2
            x = (x * x) % p;
        }
        return res;
    }
    public static int sumval(String s)
    {
        int summ = 0;
        for (int i=0;i<s.length()-1;i++)
        {
            summ += ((s.charAt(i)-'0')*10 + (s.charAt(i+1)-'0'));
        }
        return summ;
    }
}
class Reader
{
static BufferedReader reader;
static StringTokenizer tokenizer;

/** call this method to initialize reader for InputStream */
static void init(InputStream input) {
        reader = new BufferedReader(
        new InputStreamReader(input) );
        tokenizer = new StringTokenizer("");
        }

/** get next word */
static String next() throws IOException {
        while ( ! tokenizer.hasMoreTokens() ) {
        //TODO add check for eof if necessary
        tokenizer = new StringTokenizer(
        reader.readLine() );
        }
        return tokenizer.nextToken();
        }
static String nextLine() throws IOException {
        return reader.readLine();
        }

static int nextInt() throws IOException {
        return Integer.parseInt( next() );
        }
static long nextLong() throws IOException{
        return Long.parseLong(next() );
        }

static double nextDouble() throws IOException {
        return Double.parseDouble( next() );
        }
        }