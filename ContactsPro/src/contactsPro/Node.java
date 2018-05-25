package contactsPro;
import java.util.LinkedList;
/**
 * 
 * @author Omer Farooq, Maaz Hassan, Tabish Muzaffar
 *
 */

public class Node implements java.io.Serializable{
char alphabet; 
Node a,b,c,d,e,f,g,h,i,j,k,l,m,n,o,p,q,r,s,t,u,v,w,x,y,z;
boolean end; 
ContactDetails ContactD; 
LinkedList<ContactDetails> FirstName = new LinkedList();
LinkedList<ContactDetails> LastName = new LinkedList();

Node(){
alphabet = '-';
end = false; 
ContactD = null; 
//FirstName = null;
//LastName = null;
}

Node(char alphabet){
this.alphabet = alphabet;
ContactD = null; 
//FirstName = null;
//LastName = null;
}


    
}