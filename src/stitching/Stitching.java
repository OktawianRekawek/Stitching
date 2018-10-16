/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stitching;

import java.util.Scanner;
import java.io.*;

public class Stitching {
	
	//Note for programr - You need to remove this method entirely, since
	//the student needs to implement the method and it's contents
	public String stitch(String... words) {
		///{
		//write your code here
		//start
		String oneString = "";
        for (int i = 0; i < words.length; i++){
            oneString = oneString.concat(words[i]);
        }
        return oneString;
    
		//end
		///}
	}
	
	public static void main(String args[]) {
	try{
		BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Please enter a line of words: ");
		
		String line = br.readLine();
		
		String wordsAsArray[] = line.trim().split("\\s+");
		
		Stitching stitching = new Stitching();
		System.out.println("Output: ");
		System.out.println(stitching.stitch(wordsAsArray));	
} catch(Exception e){}		
	}
}
