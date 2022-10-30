package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q6 {
    public static void main(String[] args) throws Exception{
        Reader6.init(System.in);
        int t = Reader6.nextInt();
        while (t-- > 0)
        {
            int n = Reader6.nextInt();
            String brac = Reader6.next();
            String left = "";
            int[] array = new int[n];
            int last = Integer.MAX_VALUE;
            for (int i=0;i<brac.length();i++)
            {
                if (brac.charAt(i)==')' && last==Integer.MAX_VALUE)
                {
                    last = i;
                }
                else if (brac.charAt(i)==')' && last!=Integer.MAX_VALUE)
                {
                    array[last] = i;
                    last = i;
                }
            }
            if (last!=Integer.MAX_VALUE)
            {
                array[last] = Integer.MAX_VALUE;
            }
            int i = 0;
            int oper = 0;
            while (i<brac.length())
            {
                if (brac.charAt(i)=='(')
                {
                    if (i==brac.length()-1)
                    {
                        break;
                    }
                    i+=2;
                    oper++;
                }
                else
                {
                    if (array[i]==Integer.MAX_VALUE)
                    {
                        break;
                    }
                    i = array[i] + 1;
                    oper++;
                }
            }
            System.out.println(oper + " " + (n-i));
        }
    }
    public static boolean isPalindrome(String s)
    {
        for (int i=0;i<s.length()/2;i++)
        {
            if (s.charAt(i)!=s.charAt(s.length()-1-i))
            {
                return false;
            }
        }
        return true;
    }
    public static boolean isBalanced(String exp)
    {
        boolean flag = true;
        int count = 0;
        for(int i = 0; i < exp.length(); i++)
        {
            if (exp.charAt(i) == '(')
            {
                count++;
            }
            else
            {
                count--;
            }
            if (count < 0)
            {
                flag = false;
                break;
            }
        }
        if (count != 0)
        {
            flag = false;
        }
        return flag;
    }
}
class Reader6
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