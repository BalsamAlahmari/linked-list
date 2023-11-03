/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication121;
import java.util.Scanner;
/**
 *
 * @author balso
 */
public class ProjectDoubleLinkedList {
     ProjectNode head=null; 
    //check record 
   public boolean checkRecord(int id){ 
       ProjectNode temp=head; 
       while(temp!=null&&temp.ID!=id){ 
       temp=temp.next; 
       } 
    if(temp==null){ 
        return false;//not exist 
                }    
    else{ 
        return true;//exist 
    }} 
    //crate record 
    public void crateRecord(String name, int ID, String phNumber, String firstDayOfWork, String address, double salary, double workHours){ 
    ProjectNode record=new ProjectNode(name,  ID,  phNumber, 
            firstDayOfWork,  address, salary,  workHours); 
    if(!checkRecord(record.ID)){ 
      
        if (head == null || head.ID > record.ID) { 
            record.next = head; 
            head = record; 
        } 
        else{ 
        ProjectNode temp=head,currnt=null; 
        while(temp.next!=null&&temp.ID<record.ID){//string or int  
              currnt=temp; 
              temp=temp.next; 
                } 
        if(temp.next==null){ 
        record.next=temp.next; 
        temp.next=record; 
        } 
        else{ 
        record.next=temp; 
        currnt.next=record; 
        } 
        } 
        } 
     
        else{ 
        System.out.println("!!ID "+record.ID+" already exist!!"); 
        System.out.println("--------------------------------"); 
        } 
         
    } 
 
    public ProjectNode smartSearchRecord(int id){
       ProjectNode temp=head; 
       while(temp!=null&&temp.ID!=id){ 
       temp=temp.next; 
       } 
       if(temp==null)
       return null; 
     else
           return temp;
     
    }   
    public int deleteRecord(int id){
   ProjectNode temp=head,currnt=null; 
   if(head.ID==id){
   head=head.next;
           return 0;
   }
   else{
       while(temp!=null&&temp.ID!=id){ 
           currnt=temp;
       temp=temp.next; 
       } 
       if(temp==null){
       return -1;
       }else{
          currnt.next=temp.next;
       return 0;
           }
   }
    }
     public void updateSalary(int id,double extraHours){ 
     ProjectNode temp=head,currnt=null; 
   
       while(temp!=null&&temp.ID!=id){ 
           currnt=temp;
       temp=temp.next; 
       } 
     if(temp==null){
     System.out.println("this "+id+" record is not exist");
     System.out.println("--------------------------------"); 
     }
     else{ 
     temp.salary=temp.salary + (temp.salary * 0.02)*(extraHours);
     temp.workHours+=extraHours;
     }
     }
      public void updateRecord(int id) throws Exception { 
        smartSearchRecord( id);
        String input;
        int number;
        Scanner scanner=new Scanner(System.in);
         char choice1='y';
        while(choice1=='y'){
        
         try{
             System.out.print("!!NOTICE employee id CAN NOT be updated!!\n"+"1-update name\n"+
                     "2-update phone number\n"+"3-update address\n"+
                    "4-update work hours\n"+"5-update first day of work \n"+"6-update salary\n"+
                    "\nplease enter the number you want to update:");
               input=scanner.nextLine();
               number=Integer.parseInt(input);
         
    switch(number){
            
        case 1: System.out.println("please enter the updated name only letters:");
            input=scanner.nextLine();
            smartSearchRecord( id).setName(input);
            break;
         case 2:System.out.println("please enter the updated phone number only numbers:");
            input=scanner.nextLine();
            smartSearchRecord( id).setPhNumber(input);
            break;
             case 3:System.out.println("please enter the updated address:");
            input=scanner.nextLine();
            smartSearchRecord( id).setAddress(input);
            break;
        case 4:System.out.println("please enter the updated work hours only numbers:");
            input=scanner.nextLine();
            smartSearchRecord( id).setWorkHours(Double.parseDouble(input));
            break;
         case 5:System.out.println("please enter the updated date of first Day Of Work:");
            input=scanner.nextLine();
            smartSearchRecord( id).setFirstDayOfWork(input);
            break;
             case 6:System.out.println("please enter the updated salary only numbers:");
            input=scanner.nextLine();
            smartSearchRecord( id).setSalary(Double.parseDouble(input));
            break;
    }
         System.out.print("do you want to perform anthore update y/n?" );
                String choice2=scanner.nextLine();
                choice1=choice2.charAt(0); 
         }catch(Exception e){
         System.out.println("invalid argument please try again");
         }
    
    }
    
     }
    public void showRecord(){ 
    ProjectNode temp=head; 
       while(temp!=null){ 
           System.out.println(temp.name); 
           System.out.println(temp.ID); 
            System.out.println(temp.phNumber); 
           System.out.println(temp.firstDayOfWork); 
           System.out.println(temp.address); 
           System.out.println(temp.workHours); 
           System.out.println(temp.salary); 
           System.out.println("--------------------------------"); 
       temp=temp.next; 
       } 
     
    } 
}