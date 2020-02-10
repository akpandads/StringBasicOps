package strings;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class BasicStringOps {
    public char[] copyString(char[] source, char[] destination){
        destination = new char[source.length];
        for(int i=0; i<source.length; i++){
            destination[i]= source[i];
        }
        return destination;
    }

    public boolean chackPangram(String input){
        boolean isPangram = false;
        input = input.toLowerCase();
        Map<Character,Integer> charMap = new HashMap<>();
        for(int i=0; i<input.length(); i++){
            if(Character.isAlphabetic(input.charAt(i))){
                charMap.putIfAbsent(input.charAt(i),0);
            }
        }
        if(charMap.size()==26)
            isPangram = true;
        return isPangram;
    }

    public boolean chackPangrammaticLipogran(String input){
        boolean isPangramaticLipogrm = false;
        input = input.toLowerCase();
        Map<Character,Integer> charMap = new HashMap<>();
        for(int i=0; i<input.length(); i++){
            if(Character.isAlphabetic(input.charAt(i))){
                charMap.putIfAbsent(input.charAt(i),0);
            }
        }
        if(26 - charMap.size()==1)
            isPangramaticLipogrm = true;
        return isPangramaticLipogrm;
    }

    public char[] missingLetters(String input){
        char[] missingLettersArray = new char[26];
        Map<Character,Integer> charMap = new HashMap<>();
        for(int i=0; i<input.length(); i++){
            if(Character.isAlphabetic(input.charAt(i))){
                charMap.putIfAbsent(input.charAt(i),0);
            }
        }
        for(int i =0;i<26;i++){
            if(!charMap.containsKey((char) ((char) 'a'+i)))
                missingLettersArray[i] = (char) ((char) 'a'+i);
        }
        return missingLettersArray;
    }

    public String removePunctuation(String input){
        char[] charArray = input.toCharArray();
        String result = "";
        for( char c: charArray){
            if( (Character.isLetterOrDigit(c) || Character.isWhitespace(c)) ){
                result  = result+c;
            }
        }
        return result;
    }

    public String rearrangeChars(String input){
        char[] charArray = input.toCharArray();

        String result = "";
        for( char c: charArray){
            if( (Character.isLetterOrDigit(c) || Character.isWhitespace(c)) ){
                result  = result+c;
            }
        }
        return result;
    }
}
