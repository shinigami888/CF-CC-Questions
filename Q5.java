//package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q5 {
    public static void main(String[] args) throws Exception {
        Reader5.init(System.in);
        int t = Reader5.nextInt();
        while (t-- > 0)
        {
            int n = Reader5.nextInt();
            int b = Reader5.nextInt();
            int x = Reader5.nextInt();
            int y = Reader5.nextInt();
            long sum = 0;
            long prev = 0;
            for (int i=0;i<n;i++)
            {
                if (prev+x>b)
                {
                    sum += (prev - y);
                    prev = prev - y;
                }
                else
                {
                    sum += (prev + x);
                    prev = prev + x;
                }
            }
            System.out.println(sum);
        }
}

    }
class Reader5
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