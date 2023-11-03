/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication121;
import java.util.Scanner; 
/**
 *
 * @author balso
 */
public class DataSructureProject {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
       Scanner input1=new Scanner(System.in);
        String name,phNumber,firstDayOfWork,address,input2;
               int ID,choice2; 
        double salary,workHours; 
       
        char choice1='y';
         ProjectDoubleLinkedList r1=new ProjectDoubleLinkedList();
         System.out.println("Welcome To Employee record management system \n");
        while(choice1=='y')
        {
            try{
                System.out.println("--------------Services List-------------"); 
            System.out.print("1-check record\n"+"2-Create Record\n"+"3-Show Record\n"+
                    "4-Smart Search Record\n"+"5-Delete Record\n"+"6-Update salary\n"+"7-Update Record\n"+
                    "\nEnter the service number you want from the list:");
                 input2=input1.nextLine();
                choice2=Integer.parseInt(input2);
                if(choice2==1){
                 
                 System.out.print("please enter the ID:");
                 input2=input1.nextLine();
                 ID=Integer.parseInt(input2);
                   if(r1.checkRecord(ID)){
             System.out.println("the record exits ");
             System.out.println("--------------------------------"); 
         }
               else {
              System.out.println("the record is not exits ");
              System.out.println("--------------------------------"); 
             
             }
                }
                else if(choice2==2){
                
                 System.out.print("please enter the ID:");
                 input2=input1.nextLine();
                 ID=Integer.parseInt(input2);
                 System.out.print("please enter phone number:");
                 input2=input1.nextLine();
                 phNumber=input2;
                 System.out.print("please enter name :");
                 input2=input1.nextLine();
                 name=input2;
                 System.out.print("please enter first day of work:");
                 input2=input1.nextLine();
                 firstDayOfWork=input2;
                 System.out.print("please enter the address:");
                 input2=input1.nextLine();
                 address=input2;
                 System.out.print("please enter the salary:");
                 input2=input1.nextLine();
                 salary=Double.parseDouble(input2);
                 System.out.print("please enter the  work hour:");
               input2=input1.nextLine();
                 workHours=Double.parseDouble(input2);
                 r1.crateRecord(name, ID, phNumber, firstDayOfWork, address, salary, workHours);
                }else if(choice2==3){
                r1.showRecord();
                }
                else if(choice2==4){
                 System.out.print("please enter the ID:");
                 input2=input1.nextLine();
                 ID=Integer.parseInt(input2);
                 ProjectNode record=r1.smartSearchRecord(ID);
                System.out.print(record.getID()+" record has been found\n");
                System.out.println(record.getName()); 
            System.out.println(record.getPhNumber()); 
           System.out.println(record.getFirstDayOfWork()); 
           System.out.println(record.getAddress()); 
           System.out.println(record.getWorkHours()); 
           System.out.println(record.getSalary()); 
           System.out.println("--------------------------------"); 
                }
                else if(choice2==5){
                     System.out.print("please enter the ID:");
                 input2=input1.nextLine();
                 ID=Integer.parseInt(input2);
               if(r1.deleteRecord(ID)==0){
             System.out.println("the record deleted ");
             System.out.println("--------------------------------"); 
         }
               else if (r1.deleteRecord(ID)==-1){
                
              System.out.println("the record is not exits ");
              System.out.println("--------------------------------"); 
             
             }
                }
                 else if(choice2==6){
                 System.out.print("please enter the ID:");
                 input2=input1.nextLine();
                 ID=Integer.parseInt(input2);
                 System.out.print("please enter the  extra hours:");
                 input2=input1.nextLine();
                 double extraHour=Double.parseDouble(input2);
                 r1.updateSalary(ID, extraHour );
                }
                else if(choice2==7){
                 System.out.print("please enter the ID:");
                 input2=input1.nextLine();
                 ID=Integer.parseInt(input2);
                 r1.updateRecord(ID);
                }
               
        } 
        
         catch(Exception e){
                 System.out.println("invalid argument please try again");
                 }
            finally{
            System.out.print("do you want to perform anthore opration y/n?" );
               input2=input1.nextLine();
                choice1=input2.charAt(0); 
            }
        }
    }
    
}
