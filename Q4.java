//package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q4 {
    public static void main(String[] args) throws Exception{
        Reader4.init(System.in);
        int t = Reader4.nextInt();
        while (t-- > 0)
        {
            int x = Reader4.nextInt();
            int y = Reader4.nextInt();
            double ans = Math.sqrt(Math.pow(x,2) + Math.pow(y,2));
            if (x==0 && y==0)
            {
                System.out.println(0);
            }
            else if (ans%1==0)
            {
                System.out.println(1);
            }
            else System.out.println(2);
        }
    }
}
class Reader4
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