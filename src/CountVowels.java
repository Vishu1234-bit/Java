import java.util.*;
class Main {
    public static void main(String[] args) {
       String word = new String("Vishali");
       Set<Character> vowels = new HashSet<>(Arrays.asList('a','e','i','o','u'));
       Integer countVowels = 0;
       for(char ch:word.toLowerCase().toCharArray()){
           if(vowels.contains(ch)){
           countVowels+=1;
           }
       };
       System.out.println(countVowels);
}
}
