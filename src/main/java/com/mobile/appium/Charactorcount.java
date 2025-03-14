package com.mobile.appium;

public class Charactorcount {
        public static void main(String[] args) {
            String input = "rajendra sahu";
           // countCharacterOccurrences(input);
            duplicate();
        }

        public static void countCharacterOccurrences(String str) {
            // Assuming the input is ASCII characters only
            int[] charCount = new int[256]; // Array to store the count of each character

            // Iterate through the string and count each character
            for (int i = 0; i < str.length(); i++) {
                 charCount[str.charAt(i)]++;
            }

            // Display the counts for each character
            for (int i = 0; i < 256; i++) {
                if (charCount[i] > 0) {
                    System.out.println((char) i + " : " + charCount[i]);
                }
            }
        }

    public static void duplicate(){
        String input= "I am am doing doing testing testing";
        String[] str="I am am doing doing testing testing".split(" ");
        int count;
        for(int i=0; i<str.length;i++){

            for(int j=0;j<str.length;j++){
                if(str[i]==str[j]){
                    System.out.println("duplicate string : " +str[j]);
                }
            }
        }


        for(int i=0; i<input.length();i++){

            for(int j=0;j<input.length();j++){
                if(input.charAt(i)==input.charAt(j)){
                    System.out.print("==================");
                    System.out.print("duplicate char: "+ input.charAt(j));

                }

            }
        }

    }
    }

