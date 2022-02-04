package myproject;

import java.util.Scanner;

public class Email{
    private String firstName;
    private String lastName;
    private String password;
    private String department;
    private String email;
    private int mailboxCapacity = 500;
    private int defaultPasswordLength = 10;
    private String alternateEmail;
    private String companySuffix="educompany.com";
    
     // constructor to receive the first  Name and last Name

     public Email(String firstName,String lastName)
     {
      this.firstName=firstName;
      this.lastName=lastName;

     //call a method asking for the department =return the department
      this.department = setDepartment();

    //call a method that returns a random password
     this.password = randomPassword(defaultPasswordLength);
     System.out.println("your password is:" + this.password); 

    //combine elements to generate email
    email = firstName.toLowerCase() + "." + lastName.toLowerCase() +  "@" + department + "." + companySuffix;
}

     // Ask for the department
     private String setDepartment() {
     System.out.print("New Worker:" + firstName + ", \nDepartment codes\n1 for sales\n2 for development\n3 for accounting\n0 for none\nenter \nDepartment code:");
     Scanner in = new Scanner(System.in);
     int depchoice = in.nextInt();
     if (depchoice == 1) {return "sales"; }
     else if (depchoice == 2) {return "dev"; }
     else if (depchoice == 3) {return "acct"; }
     else {return ""; }
}
     // Generate a random password
      private String randomPassword(int length) {
              String passwordset = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!@#$%";
      char[] password = new char[length];
      for(int i=0;i<length;i++)
      {
    	  int rand = (int) (Math.random() * passwordset.length());
          password[i]=passwordset.charAt(rand);
      }
      return new String(password);
      }

       // set the mail box capacity
       public void setmailboxCapacity(int capacity)
      {
      this.mailboxCapacity=capacity;
       }

       // set the alternate email
       public void setalternateemail(String altemail)
       {
       this.alternateEmail=altemail;
       }

       // change the password
       public void changePassword(String password) {
          this.password = password;
        }
        public int getmailboxCapacity (){return mailboxCapacity;}
        public String getalternateemail (){return alternateEmail;}
        public String getPassword(){return password;}

        public String showinfo() {
           return "DISPLAY NAME : " + firstName + " " + lastName +
                  "\nCOMPANY EMAIL : " + email +
                  "\nMAILBOX CAPACITY : " + mailboxCapacity+ "mb";

   }
}