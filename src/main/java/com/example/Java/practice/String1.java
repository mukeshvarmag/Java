package com.example.Java.practice;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class String1 {
    public static void main (String[] args) throws java.lang.Exception
	{
        try (Scanner scan = new Scanner(System.in)) {
            List<String> ans = new ArrayList<>();

            int testcase = scan.nextInt();
      

            List<String> allString = new ArrayList<>();
            for (int i = 0; i < testcase*2; i++){
                allString.add(scan.next());
            }


            

            for(int x = 0; x <  testcase; x++){
                String hiddenWord = allString.get(2*x+0);
                String guessWord =  allString.get(2*x+1);



                String tempAns = "";

                for(int i = 0; i< hiddenWord.length(); i++){
                    if(guessWord.charAt(i) == hiddenWord.charAt(i)){
                        tempAns = tempAns+"G";
                    }
                    else{
                        tempAns = tempAns+"B";
                    }
                }
                ans.add(tempAns);
            }
            for(int i = 0; i< ans.size(); i++){
                System.out.println(ans.get(i));
            }
        }

		
	}
    
}

