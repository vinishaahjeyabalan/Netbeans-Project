/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dst1q2;

/**
 *
 * @author Vinishaah Jeyabalan
 */
public class Sentence {
    private String sentence;
    
    public Sentence(String s){
        this.sentence = s;
    }
    
    public void display(){
        System.out.println("The sentence is : " + sentence);
    }
    
    public void lengthOfSentence(){
        int lengthOfSentence = sentence.length();
        System.out.println("The length of the sentence : " + lengthOfSentence);
    }
    
//    public void lengthOfSentence(){
//        int lengthOfSentence = 0;
//        for(int i=0; i<sentence.length(); i++){
//            lengthOfSentence++;
//        }
//        System.out.println("The length of the sentence : " + lengthOfSentence);
//    }
    
    public void noOfVowels(){
        int count=0;
        for(int i=0; i<sentence.length(); i++){
            char ch = sentence.charAt(i);  //char ch = Character.toLowerCase(sentence.charAt(i));
            if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u'){
                count++;
            }
        }
        System.out.println("The number of vowels : " + count);
    }
    
//    public void noOfVowels(){
//        int count = 0;
//        for(int i=0; i<sentence.length(); i++){
//            String ch = Character.toString(sentence.charAt(i));
//            if(ch.equalsIgnoreCase("a")){
//                count++;
//            }
//            else if(ch.equalsIgnoreCase("e")){
//                count++;
//            }
//            else if(ch.equalsIgnoreCase("i")){
//                count++;
//            }
//            else if(ch.equalsIgnoreCase("o")){
//                count++;
//            }
//            else if(ch.equalsIgnoreCase("u")){
//                count++;
//            }
//        }
//        System.out.println("The numbers of vowels : " + count);
//    }
    
    public void noOfWords(){
        String[] words = sentence.split("\\s+");
        System.out.println("The number of words : " + words.length);
        
    }
    
//    public void noOfWords(){
//        String[] words = sentence.split(" ");
//        int w = 0;
//        for(int i=0; i<words.length; i++){
//            w++;
//        }
//        System.out.println("The number of words : " + w);
//        
//    }
    
}