package contactsPro;
/**
 * 
 * @author Omer Farooq, Maaz Hassan, Tabish Muzaffar
 *
 */
public class ContactDetails implements java.io.Serializable{
    String FName = "";
    String LName = ""; 
    String PNumber = "";   
    String PNumber2 = "";
    String Email = "";
    String Email2 = "";
    String DOB = "";
    String Address = "";
    
    ContactDetails(){
    FName = "";
  //  phoneN = "021";
    }
    
    ContactDetails(String name){
        this.FName = name;
      //  System.out.println(this.name + " has been added!");
    }
    
    ContactDetails(String FirstName, String LastName, String Number, String Number2, String Email, String Email2, String DOB, String Address){
    this.FName = FirstName;
    this.LName = LastName; 
    this.PNumber = Number;
    this.PNumber2=Number2;
    this.Email=Email;
    this.Email2=Email2;
    this.DOB=DOB;
    this.Address=Address;
        
    }
    
    ContactDetails(String name, String phoneN){
    this.FName = name;
   
    }
    
    public void print(){
    System.out.println("----------------------------------");
    System.out.println("Name: " + FName + " " + LName );
    System.out.println("Primary Number: " + PNumber); 
    System.out.println("Secondary Number: " + PNumber2);
    System.out.println("Primary Email ID: " + Email);
    System.out.println("Secondary Email ID: " + Email2);
    System.out.println("Date of Birth: " + DOB);
    System.out.println("Address: " + Address);
    System.out.println("----------------------------------");

    }
    
    public void PrintFirstName(){
    System.out.println("First Name: " + FName);
    }
    
    public void PrintLastName(){
    System.out.println("Last Name: " + LName);    
    }
    
    
    public void printNumber(){
     System.out.println("Number: " + PNumber); 
    }
    
}
