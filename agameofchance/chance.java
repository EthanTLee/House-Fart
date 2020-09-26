import java.util.Scanner;
import java.util.Random;

public class chance {
    
    public static final void main(String[] args) {
        
        System.out.println("You start with 5 points. Make it to 10 and you win. 0 and you lose.");
        System.out.println("Choices and their win chances: %s a - 70% +1-3, b - 50% +2-2, c - 30% +3-1");
        
        Scanner in = new Scanner(System.in);
        Random rand = new Random();
        
        int chance;
        int score = 5;
        
        while((score > 0) && (score < 10)){
            System.out.print("Pick a choice:");
            String choice = in.nextLine();
            if (choice.equals("a")){
                chance = 70;
            }
            else if(choice.equals("b")){
                chance = 50;
            }
            else{
                chance = 30;
            }
            
            int n = rand.nextInt(100);
            
            if (n>chance){
                if(choice.equals("a")){
                    score = score - 3;
                }
                else if(choice.equals("b")){
                    score = score - 2;
                }
                else{
                    score = score - 1;
                }
            }
            
            else{
                if(choice.equals("a")){
                    score = score + 1;
                }
                else if(choice.equals("b")){
                    score = score + 2;
                }
                else{
                    score = score + 3;
                }
            }
            System.out.println("Current score = " + score);
            
            if (score < 1){
                System.out.println("small booty woman");
            }
            if (score > 9){
                System.out.println("big booty woman");
            }
        }     
    }
}