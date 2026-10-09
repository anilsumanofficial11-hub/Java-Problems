package com.anil.problems;

/*
Given a string str, create a function that returns the first repeating character.
If such character doesn't exist, return the null character '\0'.

Example 1:

Input: str = "inside code"

Output: 'i'

Example 2:

Input: str = "programming"

Output: 'r'

Example 3:

Input: str = "abcd"

Output: '\0'

Example 4:

Input: str = "abba"

Output: 'b'
 */

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

    /*
    Given a string str, create a function that returns the first repeating character.
If such character doesn't exist, return the null character '\0'.

Example 1:

Input: str = "inside code"

Output: 'i'

Example 2:

Input: str = "programming"

Output: 'r'

Example 3:

Input: str = "abcd"

Output: '\0'

Example 4:

Input: str = "abba"

Output: 'b'
     */

public class FirstRepeatingCharacter {


    //O(n)
    public static char firstRepeatingChar(String str){

        char[] arr = str.toCharArray();
        Set<Character> set = new HashSet<>();
        for(char c : arr){
            if(set.contains(c))
                return c;
            else
                set.add(c);
        }
        return Character.MIN_VALUE;
    }


    public static void main(String[] args) {
        String str = "inside code";
        System.out.println(firstRepeatingChar(str));


    }
}
