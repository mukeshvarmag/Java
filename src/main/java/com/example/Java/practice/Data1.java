package com.example.Java.practice;

import java.util.Scanner;



public class Data1 {
    public static void main (String[] args) throws java.lang.Exception
	{
        try (Scanner scanner = new Scanner(System.in)) {
            int result = 0;

            while(scanner.hasNextInt()){
                int x = scanner.nextInt();
                if(x>10){
                    result++;
                }


            }
            System.out.println(result);
        }

  
	}
    
}
