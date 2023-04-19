import java.util.Arrays;

import static java.lang.Character.isLowerCase;
import static java.lang.Character.isUpperCase;
import static java.lang.Character.toLowerCase;

public class ROT13  {

    ROT13(Character cs, Character cf) {
    }

    ROT13() {
    }


    public String crypt(String text) throws UnsupportedOperationException {
        StringBuilder sb = new StringBuilder();
        char[] arr = text.toCharArray();
        for(int i = 0; i < arr.length; i++){
            if(arr[i]!=' '&&Character.isAlphabetic(arr[i])){
                 arr[i] = Character.isLowerCase(arr[i]) ? (char) ('a'+((arr[i]-'a'+13)%26)) : (char) ('A'+((arr[i]-'A'+13)%26));
            }
            sb.append(arr[i]);
        }
        return sb.toString();
    }

    public String encrypt(String text) {
        return crypt(text);
    }

    public String decrypt(String text) {
        return crypt(text);
    }

    public static String rotate(String s, Character c) {
        StringBuilder sb = new StringBuilder();
        char[] arr = s.toCharArray();
        for(int i = 0; i < arr.length; i++){
            if(arr[i]!=' '&&Character.isAlphabetic(arr[i])){
                arr[i] = Character.isLowerCase(arr[i]) ? (char) ('a'+((arr[i]-'a'+c-'a')%26)) : (char) ('A'+((arr[i]-'A'+Character.toUpperCase(c)-'A')%26));
            }
            sb.append(arr[i]);
        }
        return sb.toString();
    }
//    public static void main(String[] args) {
//        String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
//        char s = (char) ('a'+(('w'-'a'+13)%26));
//            System.out.println(s);
//    }
}
