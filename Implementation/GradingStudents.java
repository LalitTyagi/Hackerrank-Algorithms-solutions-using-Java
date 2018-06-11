import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class Solution {
    public static void main(String[] args){
    	Scanner s = new Scanner(System.in);
    	int n = s.nextInt();
    	int num;
    	int arr[] = new int[n];
    	for(int i=0;i<n;i++){
    		num=s.nextInt();
    		if(num<38){
    			arr[i]=num;
    		}
    		else if(num%5>=3){
    			arr[i]=num+(5-num%5);
    		}
    		else
    			arr[i]=num;
    	}
    	for(int i=0;i<n;i++){
    		System.out.println(arr[i]);
    	}
    }
}
