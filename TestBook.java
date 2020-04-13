import java.util.Scanner;
   public class TestBook{
      public static void main(String [] args){
      
      Scanner scan = new Scanner(System.in);
      
      int n=0;
      String title,expensiveBk="";
      double price,highPrice=0;
      
      System.out.print("The number of books:");
      n=scan.nextInt();
      Book [] myLibrary = new Book[n];
      
      for(int i=0;i<n;i++){
         System.out.print("Title of Book:");
         title=scan.next()+scan.nextLine();
         System.out.print("Price of Book:");
         price=scan.nextDouble();
         
         myLibrary[i] = new Book(title,price);
         
         if(myLibrary[i].getPrice()>highPrice){
            highPrice = myLibrary[i].getPrice();
            expensiveBk=myLibrary[i].getTitle();
            }//
           }//end of for loop
           System.out.printf("%nThe highest price of book:\n" + "\""+ expensiveBk +"\" "+" which is RM " + "%.2f%n",highPrice);
          
           System.out.println("Books contain the term 'Java' in title:");
           
           for(int j=0;j<myLibrary.length;j++){
            if(myLibrary[j].getTitle().indexOf("Java")!=-1)
               System.out.println(myLibrary[j].getTitle());
             }//end of for loop 
           }//end of main
         }//end of TestBook
         
            class Book {
               private String title;      //book’s title
               private double price;      //book’s price

               public Book(String t, double p) {
                 title = t;
                 price = p;
               }
               public String getTitle() {
                 return title;
               }
               
               public double getPrice() {
                 return price;
               }
            }//end of class Book             

         
         