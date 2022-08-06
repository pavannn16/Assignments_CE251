package com.Practicals;
/*
21CE018_Pavan Chauhan
Develop a Program that illustrate method overloading concept.
 */
public class Overloading {
    private static class Adder {
        public int getSum(int x, int y) {
            return x + y;
        }

        public String getSum(String x, String y) {
            return x + y;
        }
    }
    public static void main(String[] args) {
        Adder adder = new Adder();
        System.out.println(adder.getSum(3, 5)); // Result: 8
        System.out.println(adder.getSum("First ", "Second")); // Result: First Second
    }
}

