import java.util.Scanner;
  class Student{
   	//list of data members
   private String matricNo;
   	private double test1, test2, averageMark;
   	
   	//constructor
   	public Student(String matric, double ts1, double ts2 ){
   		this.matricNo = matric;
   		this.test1 = ts1;
   		this.test2 = ts2;	 
   	}
   	//method that returns some of students’ info
   	public String getStudentInfo()
   {
   		return "\t"+matricNo+"\t\t\t"+averageMark;
   	}
   	//method that calculates the average of 2 tests
   public void calculateAverage()
   	{
   		averageMark = (test1 + test2)/2;
   	} 
     }//end of class Student
   
     public class TestStudent{
   
      static Scanner scan = new Scanner(System.in);
      
         public static void main(String [] args){
            String matricNo;
            double test1,test2,averageMark=0;
            
            Student [] stdDegree = new Student[3];
            
            for(int i=0;i<stdDegree.length;i++){
               System.out.print("Matric No:");
               matricNo=scan.next()+scan.nextLine();
               System.out.print("Test 1:");
               test1=scan.nextInt();
               System.out.print("Test 2:");
               test2=scan.nextInt();
               
               stdDegree[i] = new Student(matricNo,test1,test2);
               
               }//end for loop
               
               System.out.println("-----------------------------------------------");
               System.out.println("\t\t\t\tSTUDENT INFORMATION\t\t");
               System.out.println("-----------------------------------------------");
               System.out.println("Matric No\t\tAverage Mark");
               
               for(int a=0;a<stdDegree.length;a++){
                  stdDegree[a].calculateAverage();
                  System.out.println(stdDegree[a].getStudentInfo());
                  }//end for loop
                  }//end main
               }//end class TestStudent
               

               