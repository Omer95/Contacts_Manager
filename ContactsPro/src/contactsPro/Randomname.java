package contactsPro;
import java.io.*;
/**
 * 
 * @author Omer Farooq, Maaz Hassan, Tabish Muzaffar
 *
 */
class namegenerator{
    int s = 100000000;
    int r = 999999999;
    int f= 0;
    String firstnamegenerator(){
        String prefix[]= { "sar","om", "hum", "wal", "riz"};
        String suffix[] = {"ar","ish","im","ram","ab"};
        String firstname=null;
        double p = Math.random()*5;
        double s = Math.random()*5;
            firstname = prefix[(int) p]+suffix[(int) s];
            return firstname;
    }
    String lastnamegenerator(){
        String suffix[]= { "ique","far", "miz", "san", "bal"};
        String prefix[] = {"khur","huss","raf","ram","sidd"};
        String lastname=null;
        double p = Math.random()*prefix.length;
        double s = Math.random()*suffix.length;
            lastname = prefix[(int) p]+suffix[(int) s];
            return lastname;
    }
    String emailgenerator(String firstnames, String lastnames){
        String[] email ={"@gmail.com","hotmail.com","@outlook.com","@yahoo.com"};
        double p = Math.random()*email.length;
        String email2=firstnames+lastnames+email[(int)p];
        return email2;
        }
    String emailgenerator2(String firstnames, String lastnames){
        String[] email ={"@gmail.com","hotmail.com","@outlook.com","@yahoo.com"};
        double p = Math.random()*email.length;
        String email1=lastnames+"_"+firstnames+email[(int)p];
        return email1;
        }
    String phoneno(){
        s=s+2489;
        String t="03"+String.valueOf(s);
        return t;
        }
    String phoneno2(){
        r=r-3279;
        String t = "03"+String.valueOf(r);
        return t;
    }
    String Date(){
        int d =(int) (Math.random()*31);
        int m =(int) (Math.random()*12);
        int y =(int)((Math.random()*(1996-2016))+1990);
        String dob= String.valueOf(d)+"/"+String.valueOf(m)+"/"+String.valueOf(y);
        return dob;
    }
    String address(){
        String[] h = {"A","B","C","D","E"};
        String[] area = {"Gulshan-e-Iqbal,","Gulistan-e-Johar,","Maymar,","Nazimabad,","DHA,","Bahria town,"};
        f=f+2;
        String q = h[(int)(Math.random()*h.length)];
        String w = area[(int)(Math.random()*area.length)];
        return q+"-"+f+" "+w+" karachi";
    }
    
}
public class Randomname implements java.io.Serializable{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        namegenerator a = new namegenerator();
        String[] firstnames = new String[500];
        String[] lastnames = new String[500];
        String[] email = new String[500];
        String[] email2 = new String[500];
        String[] phone1 = new String[500];
        String[] phone2 = new String[500];
        String[] DOB = new String[500];
        String[] address = new String[500];
        for (int i = 0; i < firstnames.length; i++) {
            firstnames[i]=a.firstnamegenerator();
            lastnames[i]=a.lastnamegenerator();
            email[i] = a.emailgenerator(firstnames[i], lastnames[i]);
            email2[i] = a.emailgenerator2(firstnames[i], lastnames[i]);
            phone1[i] = a.phoneno();
            phone2[i] = a.phoneno2();
            DOB[i] = a.Date();
            address[i]= a.address();
            //System.out.println(firstnames[i]+"  "+lastnames[i]+" "+email[i]+"    "+email2[i]+"  "+phone1[i]+"  "+phone2[i]+"  "+DOB[i]+" "+address[i]);
        }
        
        MyContactBook newBook= new MyContactBook();
        
        for (int i=0; i<100; i++) {
            newBook.Insert(firstnames[i], lastnames[i], phone1[i], phone2[i], email[i], email2[i], DOB[i], address[i]);
        }
        
        
        //serializing the three trie data structures
        try {
            ObjectOutputStream out= new ObjectOutputStream (new FileOutputStream("trie.ser"));
            out.writeObject(newBook.a);
            ObjectOutputStream out2= new ObjectOutputStream (new FileOutputStream("trie2.ser"));
            out2.writeObject(newBook.b);
            ObjectOutputStream out3= new ObjectOutputStream (new FileOutputStream("trie3.ser"));
            out3.writeObject(newBook.c);
            out.close();
            out2.close();
            out3.close();
            
        }
        catch (IOException i) {
           i.printStackTrace();
        }
        
        PhoneNumber ph= new PhoneNumber();
        try {
            ObjectInputStream in= new ObjectInputStream(new FileInputStream("trie3.ser"));
            ph= (PhoneNumber) in.readObject();
            in.close();
        }
        catch (IOException i) {
            i.printStackTrace();
        }
        catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        ph.DisplayNumber();
        
    }
}

