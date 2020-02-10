import java.util.Scanner;

public class Student {

    public static void main(String[] args) {

        long subMarks=0,sum=0;
        long subNo=0, i, avgMarks=0;
        Scanner scn=new Scanner(System.in);
        System.out.print("How Many Subject Are there ");
        subNo=scn.nextLong();
        for(i=0;i<subNo;i++){
            System.out.print("Enter the Marks ");
            subMarks=scn.nextLong();
            sum=sum+subMarks;
        }
        avgMarks=sum/subNo;

        if (avgMarks>=80){
            System.out.println("Grade A");
        }
        else if (avgMarks>=60){
            System.out.println("Grade B");
        }
        else if (avgMarks>=40){
            System.out.println("Grade C");
        }
        else{
            System.out.println("Grade D");
        }


      /*  long number=0,sum=0;
        Scanner scn=new Scanner(System.in);
        System.out.println("How Many Number Are there");
        number=scn.nextLong();
        for(int i=1;i<=number;i++){
            sum=sum+i;
        }*/



      /*int x;
      Scanner scn=new Scanner(System.in);
      System.out.println("Enter Any Number ");
      x=scn.nextInt();
      for(int i=2;i<=10;i++){
          System.out.println(x*i);
      }*/



     /* int number;
      Scanner scn1=new Scanner(System.in);
      System.out.print(" Enter Any Number ");
      number=scn1.nextInt();
      for (int i=1;i<=number;i++){
          double result = Math.pow(i,4);
          System.out.println(result);
      }*/



      /*int number, rem;
      Scanner scn=new Scanner(System.in);
      System.out.println("Enter Any Number ");
      number=scn.nextInt();
      for (int i=2;i<number;i++){
          rem=number%i;
          if (rem==0){
              System.out.print("Not Prime Number.");
              return;
          }
      }
        System.out.print(" Prime Number.");
    }*/

  }
}
