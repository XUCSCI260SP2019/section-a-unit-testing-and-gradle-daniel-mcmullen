package edu.xavier.csci;

public class Calculator {
    public int add(int ... a){
        int result = 0;
        for(int i = 0; i < a.length; i++){
            result = result + a[i];
        }
        System.out.println(result);
        return result;
    }
}
