import java.util.Scanner;

public class Palindrome {
    String text; //instance variable

    Palindrome(String text){
        this.text=text; 
    }

    public boolean checkPalindrome(){
        int start=0;
        int end=text.length()-1; //last character of string
        while(start<end){
            if(text.charAt(start)!=text.charAt(end)){
                return false;
            }
            start++;
            end--;
        }
        return true;
    }

    public void display(){
        boolean isPalindrome=checkPalindrome();
        if(isPalindrome){
            System.out.println("Given string is palindrome.");
        }
        else{
            System.out.println("Given string is not palindrome.");
        }
    }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str=sc.nextLine();

        // Removing spaces and converting to lowercase 
        str=str.replaceAll("\\s", "").toLowerCase();

        Palindrome obj=new Palindrome(str);
        obj.display();

        sc.close();
    }
}

/*
Enter a string: madam   madam
Given string is palindrome. 
*/