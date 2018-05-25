package contactsPro;
/**
 * 
 * @author Omer Farooq Ahmed, Maaz Hassan, Tabish Muzaffar
 *
 */

public class MyContactBook implements java.io.Serializable {
public FirstName a;
public LastName b; 
public PhoneNumber c;
    
MyContactBook(){
a = new FirstName();
b = new LastName();
c = new PhoneNumber();
}  

public void Insert(String FirstName, String LastName, String PhoneNumber){
ContactDetails d = new ContactDetails();    
    d.FName = FirstName;
    d.LName = LastName;
    d.PNumber = PhoneNumber;
    a.Insert(FirstName, d);
    b.Insert(LastName, d);
    c.Insert(PhoneNumber, d);

}

public void Insert(String FirstName, String LastName, String PhoneNumber, String PhoneNumber2,
        String Email, String Email2, String DOB, String Address){
ContactDetails d = new ContactDetails();    
  
    d.FName = FirstName;
    d.LName = LastName;
    d.PNumber = PhoneNumber;
    d.PNumber2 = PhoneNumber2;
    d.Email = Email;
    d.Email2 = Email2; 
    d.DOB = DOB;
    d.Address = Address;
    
    a.Insert(FirstName, d);
    b.Insert(LastName, d);
    c.Insert(PhoneNumber, d);      
}



public static void main(String[] args) {
    MyContactBook a = new MyContactBook();
    a.Insert("maaz", "akhtar", "45454554", "5485455","maazh@gmail.com","nasd@gmail.com","12/12/55","Nazimabad, Karachi");
 //   System.out.print(a.a.root.m.a.a.z.FirstName.get(0).FName);

    a.Insert("ali", "jilani", "982148742");
    a.Insert("ali", "amir", "54852962");
    a.Insert("omer", "amir", "1785412");

    a.Insert("omer", "farooq", "1785412");
 //   a.a.DisplayFirstName();
    a.b.DisplayNameWhenTyped("a");

   // System.out.print(a.a.root.m.a.a.z.FirstName.get(0).FName);
    
    PhoneNumber ph= new PhoneNumber();
    System.out.println(ph.rootNumber);
    }    
}
