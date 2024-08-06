package com.example.java_practice.string;

//Given two strings S1 and S2 as input, the task is to merge them alternatively i.e. the first character of S1 then the first character of S2 and so on till the strings end.
//NOTE: Add the whole string if other string is empty.
public class MergeTwoString {

    static String merge(String S1, String S2)
    {

        // code here
        int n=S1.length();
        int m=S2.length();
        int minlen=Math.min(n,m);
        StringBuilder res=new StringBuilder();
        for(int i=0;i<minlen;i++){

            res.append(S1.charAt(i));
            res.append(S2.charAt(i));

        }
        if(n>m){
            res.append(S1.substring(minlen));
        }
        else{
            res.append(S2.substring(minlen));
        }
        return res.toString();
    }

    public static void main(String []arg){
        System.out.println("merged string is "+merge("Name","Tarkesh"));
    }
}
