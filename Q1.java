package com.company;

import com.sun.source.tree.Tree;

import java.io.*;
import java.util.*;

public class Q1 {
    public static void main(String[] args) throws Exception{
        Reader1.init(System.in);
        BufferedWriter output = new BufferedWriter(new OutputStreamWriter(System.out));
        int t = Reader1.nextInt();
        while (t-- > 0)
        {
            int n = Reader1.nextInt();
            HashMap<String,Integer> map = new HashMap<>();
            String[][] mat = new String[3][n];

            for (int i=0;i<3;i++)
            {
                //System.out.println(i);
                String[] arr = Reader1.nextLine().split(" ");
                //System.out.println(arr.length + " " + arr[0]);
                for (int j=0;j<arr.length;j++)
                {
                    //System.out.println(i + " " + j);
                    mat[i][j] = arr[j];
                    //System.out.println(i + " " + j);
                    if (map.containsKey(arr[j])) map.replace(arr[j],map.get(arr[j]),map.get(arr[j])+1);
                    else map.put(arr[j],1);
                }
                //mat[i] = arr;
            }
            //System.out.println(map);
            int[] scores = new int[3];
            for (int i=0;i<3;i++)
            {
                for (int j=0;j<n;j++)
                {
                    if (map.get(mat[i][j])==1) scores[i]+=3;
                    if (map.get(mat[i][j])==2) scores[i]+=1;
                }
            }
            System.out.println(scores[0] + " " + scores[1] + " " + scores[2]);

        }
    }
    static void sieveOfEratosthenes(int N,int s[])
    {
        boolean[] prime = new boolean[N + 1];
        // for all the even numbers
        for (int i = 2; i <= N; i += 2)
            s[i] = 2;

        // For odd numbers less
        // then equal to n
        for (int i = 3; i <= N; i += 2)
        {
            if (prime[i] == false)
            {
                // s(i) for a prime is
                // the number itself
                s[i] = i;

                // For all multiples of
                // current prime number
                for (int j = i; j * i <= N; j += 2)
                {
                    if (prime[i * j] == false)
                    {
                        prime[i * j] = true;

                        // i is the smallest prime
                        // factor for number "i*j".
                        s[i * j] = i;
                    }
                }
            }
        }
    }

    public static TreeMap<Integer,Integer> generatePrimeFactors(int N)
    {
        TreeMap<Integer,Integer> m = new TreeMap<>();
        // s[i] is going to store
        // smallest prime factor of i.
        int[] s = new int[N + 1];

        // Filling values in s[] using sieve
        sieveOfEratosthenes(N, s);


        int curr = s[N]; // Current prime factor of N
        int cnt = 1; // Power of current prime factor

        while (N > 1)
        {
            N /= s[N];

            if (curr == s[N])
            {
                cnt++;
                continue;
            }
            m.put(curr,cnt);
            curr = s[N];
            cnt = 1;
        }
        return m;
    }
    static long modFact(int n,int p)
    {
        if (n >= p)
            return 0;

        long result = 1;
        for (int i = 1; i <= n; i++)
            result = (result * i) % p;

        return result;
    }
}
class Reader1
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