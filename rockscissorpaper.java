import java.util.Scanner;
public class rockpaperscissor {
public static void main(String[]args){
    //initial variabel
    Scanner input = new Scanner(System.in);
    String You = null;
        String Computer = null;
        String Result = null;

        System.out.println("Game Rock Scissor Paper ");
        System.out.println("   1.Rock 2.Scissor 3. Paper   ");
        System.out.print("input your choice = ");

    int option = input.nextInt();
    //if else
    if(option==1){
        You = "Rock";
    }
    else if(option==2){
        You = "Scissor";
    }
    else if(option==3){
        You = "Paper";
    }
    else if(option==4){
        System.exit(0);
    }
    else {
      System.out.println("error");
    }

    int generate = (int) (Math.random()*3+1);
    if(generate==1){
        Computer = "Rock";
    }
    else if(generate==2){
        Computer = "Scissor";
    }
    else{
        Computer = "Paper";
    }

    if(option<1 || option>4)
        System.out.println("Try again");
    else if(You.equals(Computer)){
        Result = "SERI";
    } else if(You=="Rock" && Computer == "Paper"){
        Result = "You Lose";
    } else if(You=="Rock" && Computer == "Scissor"){
        Result = "You Lose";
    } else if(You=="Paper" && Computer == "Scissor"){
        Result = "You Lose";
    } else if(You=="Scissor" && Computer == "Paper"){
        Result = "You Win";
    } else if(You=="Scissor" && Computer == "Rock"){
        Result = "You Lose";
    }
    //output
    System.out.println("You choice = "+You);
    System.out.println("Computer choice = "+Computer);
    System.out.println("The result is = "+Result);
}
}
