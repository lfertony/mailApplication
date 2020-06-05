package emailapp;

import java.util.Scanner;

public class Email {
 private final String firstName;
 private final String lastName;
 private String email;
 private String password;
 private int defaultPasswordLength = 10;
 private String department;
 private String companySuffix = "company.com";
 private int mailBoxCapacity = 500;
 private String mailAlternative;

 // contructor to receive first name and last name
 public Email(final String firstName, final String lastName) {
     this.firstName = firstName;
     this.lastName = lastName;

     //System.out.println("Email has been created: " + this.firstName + " " + this.lastName);
     // asking for the department
     this.department = setDepartment();
     //System.out.println("Department: " + this.department);

     //returning a random password
     this.password = radomPassword(defaultPasswordLength);
     System.out.println("\nPassword: " + this.password);

     //combine elements to generte an email
     email = firstName.toLowerCase() + "." + lastName.toLowerCase() + "@" +
             department.toLowerCase() + "." + companySuffix;
     //System.out.println("\nEmail: " + email + "\n");


 }

 // call a method asking for the department
 private String setDepartment() {
     System.out.print("\nNew Worker " + firstName + ", Type your Department:\n1 - Dev\n2 - DevOps\n3 - VCS\n4 - Platform\n5 - none\nEnter the department code: ");
     final Scanner in = new Scanner(System.in);
     int depChoice = in.nextInt();
     if(depChoice == 1){ return "Dev";}
     else if(depChoice == 2){ return "DevOps";}
     else if(depChoice == 3){ return "VCS";}
     else if(depChoice == 4){ return "Platform";}
     else {return "";}
 }
 
 // call a method to genereate a radom password
 private String radomPassword(int length){
     String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ123456789!@#*";
     char[] password = new char[length];
     for(int i = 0; i < length; i++){
        int rand = (int) (Math.random() * passwordSet.length());
        password[i] = passwordSet.charAt(rand);
    }
    return new String (password);
 }

 // call a method to set the email capacity
 public void setMailboxCapacity(int capacity){
    this.mailBoxCapacity = capacity;
 }

 // call a method to set the alternative email
 public void setAlternativeEmail(String setAlt){
     this.mailAlternative = setAlt;
 }

 // call a method to change password
 public void changePassword(String newPass){
     this.password = newPass;
 }

 public int getMailboxCapacity(){ return mailBoxCapacity; }
 public String getAlternativeEmail(){ return mailAlternative;}
 public String getPasswprd(){ return password;}

 public String showInfo(){
     return "\nDisplay name: " + firstName + " " + lastName +
            "\nCompany Email: " + email +
            "\nMailBox Capacity: " + mailBoxCapacity + "mb";
 }

} 