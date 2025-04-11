package com.cts.learning.leetcode;

public class Recursion {
    public static void main(String[] args) {
        System.out.println(climbStairs(5));
    }
        public static int climbStairs(int n) {
            if(n>=1 && n<=3) return n;
            else{
                int first = 2;
                int second =3;
                for(int i= 4; i<=n;i++){
                    int next = first +second;
                    if(n<=i){
                        return  next;
                    }
                    first = second;
                    second = next;
                }
            }
            return 0;

        }
    }
