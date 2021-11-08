package com.company;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int x = getInt();
        int y = getInt();
        System.out.println(" x is "+x);
        System.out.println(" y is "+y);
        System.out.println(getIntEAEP());
    }

    private static int getInt(){
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

    private static int getIntEAEP(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter an integer");
        try {
            return scanner.nextInt();
        }catch (InputMismatchException e){
            System.out.println("Input mismatchException");
            return 0;
        }
    }

    private static int getIntLBYL(){
        Scanner scanner = new Scanner(System.in);
        boolean isValid = true;
        System.out.println("Please enter an integer ");
        String input = scanner.next();
        for(int i=0;i<input.length();i++){
            if(!Character.isDigit(input.charAt(i))){
                isValid = false;
                break;
            }
        }
        if (isValid){
            return Integer.parseInt(input);
        }
        return 0;
    }

    private static int divideLBYL(int x,int y){
        if(y!=0){
            return x/y;
        }else {
            return 0;
        }
    }

}
