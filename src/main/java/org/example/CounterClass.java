package org.example;

public class CounterClass {

    public  int  counterString(String newText){
        if (newText == null) {
            return 0; // Return 0 for null input
        }
        return newText.length();
    }
}
