package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println(hasSharedDigit(12,32));
        System.out.println(hasSharedDigit(12,20));
        System.out.println(hasSharedDigit(20, 28));
        System.out.println(hasSharedDigit(20,82));
        System.out.println(hasSharedDigit(-22,22));
        System.out.println(hasSharedDigit(22,-22));

    }

    public static boolean hasSharedDigit(int x, int y){
        if (x < 10 || x > 99 || y < 10 || y > 99){
            return false;
        } else if ((x % 10 == y % 10) || (x % 10 == y / 10) || (x / 10 == y % 10) || (x /10 == y / 10)){
            return true;
        }
        return false;
    }
}
