
package assignment3;


public class Assignment3 {

   
    public static void main(String[] args) {
        // the first is declairing the value of i; then is the set conditions;then how it is incremented
        for (int i = 1; i <= 100; i++){
            // if you don't add the && statment it won't display right
            if ((i % 3 == 0) && (i % 5 ==0))
                System.out.println("Fizz Buzz");
            else if ((i % 5 == 0) && (i % 3 != 0))
                System.out.println("Buzz");
            else if((i  %  3 == 0) && ( i % 5 != 0))
                System.out.println("Fizz");
            else
                System.out.println(i);
        
        
        
        
        }
    }
    
}
