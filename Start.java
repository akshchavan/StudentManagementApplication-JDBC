package com.student.manage;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Start {

	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub
		System.out.println("Welecom to Student Management Application.");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       while(true){
    	   System.out.println("press 1 to add student");
    	   System.out.println("press 2 delete student");
    	   System.out.println("press 3 display student");
    	   System.out.println("press 4 to exit app ");
    	   int c=Integer.parseInt(br.readLine());
    	   
    	   if(c==1) {
    		   //add student..
    		   System.out.println("Enter user name:");
    		   String name = br.readLine();
    		   
    		   System.out.println("Enter user phone number:");
    		   String phone = br.readLine();
    		   
    		   System.out.println("Enter user city:");
    		   String city = br.readLine();
    		   
    		   //create student object to store student
    		   Student st=new Student(name,phone,city);
    		   boolean answer=StudentDao.insertStudentToDB(st);
    		   if (answer) {
    			   System.out.println("Student is added successfully");
    		   }
    		   else {
    			   System.out.println("someting get wrong..try again");
    		   }
    		   
    		   System.out.println(st);
    		   
    		   }
    	   
    	   else if(c==2) {
    		   //delete student..
    		   System.out.println("Enter student id to Delete:");
    		   int userId=Integer.parseInt(br.readLine());
    		   boolean f=StudentDao.deleteStudent(userId);
    		   if(f) {
    			   System.out.println("Deleted..");
    		   }
    		   else {
    			   System.out.println("Someting get wrong...try again.");
    		   }
    	   }
    	   else if(c==3) {
    		   //display student..
    		   StudentDao.showAllStudent();
    	   }
    	   else if(c==4) {
    		   //exit..
    		   break;
    	   }
    	   else {
    		   
    	   }
       }
       System.out.println("Thank You for Using My Application");
       System.out.println("See you soon..");
	}

}
