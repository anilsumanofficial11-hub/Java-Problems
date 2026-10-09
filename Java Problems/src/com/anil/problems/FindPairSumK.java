package com.anil.problems;

import java.util.*;


/*
Given an array of integers arr and an integer k, create a boolean function that checks if there exist two elements in arr such that we get k when we add them together.

Example 1:

Input: arr = [4, 5, 1, -3, 6], k = 11

Output: true

Explanation: 5 + 6 is equal to 11

Example 2:

Input: arr = [4, 5, 1, -3, 6], k = -2

Output: true

Explanation: 1 + (-3) is equal to -2

Example 3:

Input: arr = [4, 5, 1, -3, 6], k = 8

Output: false

Explanation: there is no pair that sums up to 8
 */



public class FindPairSumK {

    //O(n)
    public static boolean findPair1(int[] arr, int k){
        Set<Integer> set = new HashSet<>();
        for(int i=0 ; i< arr.length ; i++){
            if(set.contains(k-arr[i])){
                return true;
            }else {
                set.add(arr[i]);
            }
        }
        return false;
    }

    public static boolean findPair3(int[] arr, int k){
        Map<Integer, Boolean> visited= new HashMap<>();

       for(int i=0 ; i< arr.length ; i++){
            if(visited.containsKey(k - arr[i])) return true;
            else
                visited.put(arr[i], true);

        }
        System.out.println(visited);
        return false;
    }


    //O(nlogn)

    public static boolean findPair2(int[] arr, int k){
        int left = 0;
        int right = arr.length-1;
        Arrays.sort(arr);
        while(left < right ){
            if(arr[left]+arr[right] == k) return true;
            else if (arr[left]+arr[right] < k) left++;
            else right--;
        }

    return false;
    }


    public static void main(String[] args) {
        int[] arr = new int[]{4, 5, 1, -3, 6};
        int k =10;
//        System.out.println(findPair1(arr,k));
//        System.out.println(findPair2(arr,k));
        System.out.println(findPair3(arr,k));



    }
}
