package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.StringTokenizer;
import java.util.logging.Handler;

public class Q2 {
    public static void main(String[] args) throws Exception{
        Reader2.init(System.in);
        int t = Reader2.nextInt();
        while (t-- > 0)
        {
            String s = Reader2.next();
            HashMap<Character,Integer> map = new HashMap<>();
            for (int i=0;i<s.length();i++)
            {
                if (map.containsKey(s.charAt(i)))
                {
                    map.replace(s.charAt(i),map.get(s.charAt(i)),map.get(s.charAt(i))+1);
                }
                else
                {
                    map.put(s.charAt(i),1);
                }
            }
            int index = -1;
            for (int i=0;i<s.length();i++)
            {
                index++;
                map.replace(s.charAt(i),map.get(s.charAt(i)),map.get(s.charAt(i))-1);
                if (map.get(s.charAt(i))==0)
                {
                    break;
                }
            }
            System.out.println(s.substring(index));
        }
    }
    public static ArrayList<String> prefixes(String s)
    {
        ArrayList<String> ans = new ArrayList<>();
        ans.add("");
        for (int i=1;i<s.length();i++)
        {
            ans.add(s.substring(0,i));
        }
        return ans;
    }
    public static String finalans(String s)
    {
        if (s.length()==0)
        {
            return "";
        }
        if (s.length()==1)
        {
            return s;
        }
        if (s.length()==2)
        {
            if (s.charAt(0)==s.charAt(1))
            {
                return "";
            }
            else
            {
                return s;
            }
        }
        ArrayList<String> pref = prefixes(s);
        String sp = "";
        int c = 1;
        for (int i=1;i<pref.size();i++)
        {
            String prefix = pref.get(i);
            int q = KMPSearch(prefix,s);
            if (q>1)
            {
                if (sp.length()<prefix.length())
                {
                    sp = prefix;
                }
            }
        }
        if (sp.equals(""))
        {
            return s;
        }
        else
        {
            return finalans(s.replaceFirst(sp,""));
        }
    }
    public static int KMPSearch(String pat, String txt)
    {
        int M = pat.length();
        int N = txt.length();

        // create lps[] that will hold the longest
        // prefix suffix values for pattern
        int lps[] = new int[M];
        int j = 0; // index for pat[]

        // Preprocess the pattern (calculate lps[]
        // array)
        computeLPSArray(pat,M,lps);

        int i = 0; // index for txt[]
        int res = 0;
        int next_i = 0;

        while (i < N)
        {
            if (pat.charAt(j) == txt.charAt(i))
            {
                j++;
                i++;
            }
            if (j == M)
            {
                j = lps[j-1];
                res++;
                if (lps[j]!=0)
                    i = ++next_i;
                j = 0;
            }
            else if (i < N && pat.charAt(j) != txt.charAt(i))
            {
                if (j != 0)
                    j = lps[j-1];
                else
                    i = i+1;
            }
        }
        return res;
    }

    public static void computeLPSArray(String pat, int M, int lps[]) {
        int len = 0;
        int i = 1;
        lps[0] = 0;
        while (i < M) {
            if (pat.charAt(i) == pat.charAt(len)) {
                len++;
                lps[i] = len;
                i++;
            } else {
                if (len != 0) {
                    len = lps[len - 1];
                } else {
                    lps[i] = len;
                    i++;
                }
            }
        }
    }
}
class Reader2
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