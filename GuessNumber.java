import java.util.Scanner;

class GuessNumber{
    int randomNum;
    int userNum;
    int count =1;
    Scanner sc = new Scanner(System.in);
    void generateRandomNum(){
        randomNum =  (int)(Math.random()*10);
        getNumber();
    }

    void getNumber(){
    System.out.println("Guess The Random Number (Between 1-100) : ");
    userNum= sc.nextInt();
    if(userNum>-1 && userNum<100)
    display();
    else{
        System.out.println("Wrong Input");
        getNumber();
    }
    }

    void display(){
        
        if(userNum<randomNum){
            System.out.println("too low");
            count++;
            generateRandomNum();
        }else if(userNum>randomNum){
            System.out.println("too high");
            count++;
            generateRandomNum();
        }else{
            System.out.println("Congratulations YOU WON...");
            System.out.println("-------Your Score-------");
            System.out.println("Total Attempts : "+count);
        }
    }
}
class Main{
    public static void main(String[] args){
        GuessNumber gs = new GuessNumber();
       
        gs.generateRandomNum();
    }
}