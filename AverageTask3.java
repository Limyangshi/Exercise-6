import java.util.Scanner;
   public class AverageTask3{
   
      static Scanner input = new Scanner(System.in);
      
         public static void main(String [] args){
            int numA,numB,numC,numD;
            
               System.out.print("Integer 1:");
               numA=input.nextInt();
               System.out.print("Integer 2:");
               numB=input.nextInt();
               System.out.print("Integer 3:");
               numC=input.nextInt();
               System.out.printf("The average for 3 integer is:%.3f ",average(numA,numB,numC));
               System.out.println();
               System.out.print("\nEnter another integer:");
               numD=input.nextInt();
               System.out.printf("The average for 4 integer is:%.3f ",average(numA,numB,numC,numD));
               }
                  public static double average(int numA,int numB,int numC){
                     double average = ((double)(numA+numB+numC))/3;
                     return average;
                     }//end of average
                        public static double average(int numA,int numB,int numC,int numD){
                     double average = ((double)(numA+numB+numC+numD))/4;
                     return average;
                     }//end of average

               }//end of AverageTask3
               
           