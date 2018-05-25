package contactsPro;
/**
 * 
 * @author Omer Farooq, Maaz Hassan, Tabish Muzaffar
 *
 */
public class NodeNumber implements java.io.Serializable{
	   char number; 
	   NodeNumber zero, i, ii, iii, iv, v, vi, vii, viii, ix;
	   ContactDetails ContactD; 
	   Boolean end;
	   
	   NodeNumber(){
	   this.number = '-';
	   ContactD = null;
	   end = false; 
	   }
	   
	   NodeNumber(char number){
	   this.number = number;
	   ContactD = null;
	   end = false; 
	   }
	}