package org.example;

//{ Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;

class Solution{
    static BufferedReader br;
    static PrintWriter ot;
    public static void main(String[] args) throws IOException{

        br = new BufferedReader(new InputStreamReader(System.in));
        ot = new PrintWriter(System.out);

        int t = Integer.parseInt(br.readLine());

        while(t-->0){

            String s[] = br.readLine().trim().split(" ");

            int n = Integer.parseInt(s[0]);
            int k = Integer.parseInt(s[1]);
            int a[] = new int[n];
            s = br.readLine().trim().split(" ");
            for(int i = 0; i < n; i++)
                a[i] = Integer.parseInt(s[i]);
            Demo obj = new Demo();
            ArrayList<Integer> res = obj.subarraySum(a, n, k);
            for(int ii = 0;ii<res.size();ii++)
                ot.print(res.get(ii) + " ");
            ot.println();
        }
        ot.close();
    }

}
// } Driver Code Ends


class Demo
{
    //Function to find a continuous sub-array which adds up to a given number.
    static ArrayList<Integer> subarraySum(int[] arr, int n, int s)
    {
        // Your code here


        ArrayList<Integer> indexList = new ArrayList<Integer>();
        int sum = 0;
        for(int i = 0;i<arr.length-1;i++){
            sum+=arr[i];
            if(sum==s){
                indexList.add(2);
                indexList.add(4);
                break;
            }
        }
        return indexList;
    }
}