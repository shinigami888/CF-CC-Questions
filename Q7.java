//package com.company;

import java.io.*;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.*;

public class Q7 {
    public static void main(String[] args) throws Exception{
        Reader7.init(System.in);
        BufferedWriter output = new BufferedWriter(new OutputStreamWriter(System.out));
        int t = Reader7.nextInt();
        while (t-- > 0)
        {
            int n = Reader7.nextInt();
            Integer[] arr = new Integer[n];
            for (int i=0;i<n;i++)
            {
                arr[i] = Reader7.nextInt();
            }
            int ans = threeSum(arr);
            if (ans>0)
            {
                output.write("YES" + "\n");
            }
            else
            {
                output.write("NO" + "\n");
            }

        }
        output.close();
    }
    public static int threeSum(Integer[] nums) {
        Arrays.parallelSort(nums);
        // Sort the given array
        int count = 0;
        for (int num1Idx = 0; num1Idx + 2 < nums.length; num1Idx++) {
            if (num1Idx > 0 && nums[num1Idx] == nums[num1Idx - 1]) {
                continue;
            }

            int num2Idx = num1Idx + 1;
            int num3Idx = nums.length - 1;
            while (num2Idx < num3Idx) {
                int sum = nums[num2Idx] + nums[num3Idx] + nums[num1Idx];
                if (sum%10 == 3) {
                    count++;
                    num3Idx--;

                    // Skip all duplicates from right
                    while (num2Idx < num3Idx && nums[num3Idx] == nums[num3Idx + 1]) num3Idx--;
                } else if (sum > 0) {
                    // Decrement num3Idx to reduce sum value
                    num3Idx--;
                } else {
                    // Increment num2Idx to increase sum value
                    num2Idx++;
                }
            }
        }
        return count;
    }
}
class Reader7
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