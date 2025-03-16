import java.util.Random;
import java.util.Scanner;

public class Rock_paper_scissors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Select 1 - for Rock ,  2 - for Paper , 3 -  for Scissors");
        Random rand = new Random();
        int i=0;
        int user_score =0;
        int pc_score =0;
        String user_set = "Null";
        String pc_set = "Null";
        while (true){
            int user = sc.nextInt();
            int pc = rand.nextInt(3)+1;
            if(user==1){
                 user_set = "Rock";
            }else if(user==2){
                 user_set = "Paper";
            }else  if(user==3) {
                 user_set = "Scissors";
            }
            if(pc==1){
                 pc_set = "Rock";
            }else if(pc==2){
                 pc_set = "Paper";
            }else if(pc==3) {
                pc_set = "Scissors";
            }

            System.out.println("User = "+user_set);
            System.out.println("Computer = "+pc_set);
            if(pc==1 && user == 1){
                System.out.println("Draw");
            } else if (pc==1 && user==2) {
                System.out.println("User Win");
                user_score+=1;

            }else if(pc==1 && user ==3){
                System.out.println("Pc Win");
                pc_score+=1;
            }else if(pc==2 && user ==1){
                System.out.println("Pc Win");
                pc_score+=1;
            }else if(pc==2 && user==2){
                System.out.println("Draw");
            }else if(pc==2 && user==3){
                System.out.println("User Win");
                user_score+=1;
            } else if (pc==3 && user==1) {
                System.out.println("User Win");
                user_score+=1;

            }else if(pc==3 && user==2){
                System.out.println("Pc Win");
                pc_score+=1;
            }else if(pc==3 && user ==3){
                System.out.println("Draw");
            }else {
                System.out.println("Please Enter Number Between 1-3");
            }
            if(i==2){
                break;

            }
            i++;


        }
        System.out.println("Final Score:");
        System.out.println("Computer = "+pc_score);
        System.out.println("User = "+user_score);
        if(pc_score>user_score){
            System.out.println("Computer Win");
        }else if(user_score>pc_score){
            System.out.println("User Win");
        }else {
            System.out.println("Match Draw");
        }
    }
}
