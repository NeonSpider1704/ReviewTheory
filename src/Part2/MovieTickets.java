
package Part2;

import java.util.Scanner;


public class MovieTickets {

    
    
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int age;
        String day;
        double price;
        
        // force user to enter m,t or o
        while(true){
            System.out.print("Enter day code: \"m\"-matinee, \"t\"-Tuesday,\"o\"-Other: ");
            day = s.next().toLowerCase();
            if(day.equals("o") || day.equals("m") || day.equals("t")) break;
            System.out.println("ERROR - Must be o, t, or m - try again\n");
        }
        System.out.println("Thanks for now");
        
        if(day.equals("m")) price = 5; //matinee is $5
        else if(day.equals("t")) price = 4; //Tuesdays is $4
        else{
            do{
                System.out.print("Enter age from 1 to 99 >");
                age = s.nextInt();
            }while(age < 1 || age > 99);
            price=age<18? 8:10;
        }
        System.out.println("Price is: " + price);
            
    }
    
}
