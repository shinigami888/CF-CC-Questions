//package com.company;

import java.io.*;
import java.time.chrono.MinguoDate;
import java.util.*;

public class Q8 {
    public static void main(String[] args) throws Exception {
        Reader8.init(System.in);
        int t = Reader8.nextInt();
        while (t-- > 0)
        {
            int n = Reader8.nextInt();
            int k = Reader8.nextInt();
            int[] arr = new int[n];
            for (int i=0;i<n;i++)
            {
                arr[i] = Reader8.nextInt();
            }
            int max = lenOfLongSubarr(arr,n,k);
            if (max==0)
            {
                System.out.println(-1);
            }
            else
            {
                System.out.println(n-max);
            }
        }
    }
    public static int lenOfLongSubarr(int[] arr, int n, int k)
    {
        // HashMap to store (sum, index) tuples
        HashMap<Integer, Integer> map = new HashMap<>();
        int sum = 0, maxLen = 0;

        // traverse the given array
        for (int i = 0; i < n; i++) {

            // accumulate sum
            sum += arr[i];

            // when subarray starts from index '0'
            if (sum == k)
                maxLen = i + 1;

            // make an entry for 'sum' if it is
            // not present in 'map'
            if (!map.containsKey(sum)) {
                map.put(sum, i);
            }

            // check if 'sum-k' is present in 'map'
            // or not
            if (map.containsKey(sum - k)) {

                // update maxLength
                if (maxLen < (i - map.get(sum - k)))
                    maxLen = i - map.get(sum - k);
            }
        }

        return maxLen;
    }
    public static double findMedian(int a[], int n)
    {
        Arrays.sort(a);
        if (n % 2 != 0)
            return (double)a[n / 2];

        return (double)(a[(n - 1) / 2] + a[n / 2]) / 2.0;
    }
    static long cntPairs(Integer arr[], int N)
    {
        long res = 0;

        int[] bit = new int[32];

        for(int i = 0; i < N; i++)
        {
            int pos = (int)(Math.log(arr[i]) /
                    Math.log(2));
            bit[pos]++;
        }
        for(int i = 0; i < 32; i++)
        {
            res += ((long) bit[i] * (bit[i] - 1)) / 2;
        }

        return res;
    }
}
class Reader8
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