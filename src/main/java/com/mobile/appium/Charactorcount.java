package com.mobile.appium;

public class Charactorcount {
        public static void main(String[] args) {
            String input = "rajendra";
            countCharacterOccurrences(input);
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
    }

