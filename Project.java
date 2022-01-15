import java.util.Scanner;


class Project {
    public static void main(String args[]) {
        //MINI PROJECT
        Scanner sc = new Scanner(System.in);
        int myNumber = (int)(Math.random()*100);
        int userNumber = 0;
        
        do{
            System.out.println("Guess my Number(1 to 100) : ");
            userNumber = sc.nextInt();

            if(userNumber == myNumber){
                System.out.println("WOOHOO......CORRECT NUMBER...!!!");
                break;
            }
            else if(userNumber > myNumber){
                System.out.println("Your Number is too Large....");
            }
            else{
                System.out.println("Your Number is too small....");
            }

        }while(userNumber >= 0);
    
        System.out.print("My Number was : ");
        System.out.println(myNumber);
    }
    
}
