package Strings;

public class JavaString {
    public static void main(String[] args) {

        JavaString obj = new JavaString();
        String reverString = obj.reverseString("Alpha");
        String vowels = obj.coundVC("humanio");
        String palindrome = obj.palindrome("malayalam");

        String subString = obj.findSubString("JavaProgramming", "Pro"); 

        System.out.println( "\n" + subString);
        
    }




// Reverse a String

String reverseString(String data){

    String reversedWord = "";

    for(int i= data.length()-1;i >= 0;i--){
        reversedWord += data.charAt(i);
    }

    return reversedWord;

}

// Count Vowels and Consonants
String coundVC(String word){

    int vowels = 0;
    char Word = ' ';
    

    for(int i=0;i<word.length();i++){
        
        Word= word.charAt(i);

        if(Word == 'a' || Word == 'e' || Word == 'i' || Word == 'o' || Word == 'u' ){
            vowels = vowels+1;
            Word = ' ';
        }
        

    }
    int consonents = word.length() - vowels;
    
    return "The Total No of Vowels is :" + vowels + "  and no of consonents is: " + consonents  ;
    
}




// Check palindrome

String palindrome(String word){
String temp = "";
    for(int i=word.length()-1;i>=0;i--){
        temp += word.charAt(i);

    }
    
    
    if(temp.equals(word)){
        return "Palindrome";
    }
    return "Not a palindrome";
}


// Find Substring

String findSubString(String word,String subStr){



    if(word.contains(subStr)){
        return "subString Found";
    }
    return "subString Not Found";
}
    



}





