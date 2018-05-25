package contactsPro;
/**
 * 
 * @author Omer Farooq, Maaz Hassan, Tabish Muzaffar
 *
 */
public class PhoneNumber implements java.io.Serializable{
	  
NodeNumber rootNumber; // Root value for the number trie;
NodeNumber SearchValueNumber; // this is for the delete Number function. 

public PhoneNumber() {
    rootNumber=null;
    SearchValueNumber=null;
}

public void Insert(String Number, ContactDetails CD){
    int t = 0; // 0 index of the str.characters.
    rootNumber = DoInsertNumber(rootNumber, Number,t, CD); 
}    

public NodeNumber DoInsertNumber(NodeNumber rootN, String Number, int strV, ContactDetails CD){
NodeNumber newNode = new NodeNumber();
NodeNumber temp; 
char c; 
    
    if(strV != Number.length()){
        c = Number.charAt(strV);
        strV++;
    }
    else{
        rootN.end = true; 
        rootN.ContactD = CD;
        return rootN; 
    }
    
  if(rootN == null){
        rootN = new NodeNumber(); 
        if(c == '0'){
            rootN.zero = new NodeNumber();
            rootN.zero.number = c;        
         temp = rootN.zero; 
         temp= DoInsertNumber(temp, Number, strV, CD); // the return variable temp is not needed. Will remove it later. Let it be. 
        }
        else if(c == '1'){
            rootN.i = new NodeNumber();
            rootN.i.number = c;        
         temp = rootN.i; 
        temp= DoInsertNumber(temp, Number, strV, CD);        
        }
        else if(c == '2'){
            rootN.ii = new NodeNumber();
            rootN.ii.number = c;        
            temp = rootN.ii; 
            temp= DoInsertNumber(temp, Number, strV, CD);        
        }        
        else if(c == '3'){
            rootN.iii = new NodeNumber();
            rootN.iii.number = c;        
         temp = rootN.iii; 
        temp= DoInsertNumber(temp, Number, strV, CD);        
        }
        else if(c == '4'){
            rootN.iv = new NodeNumber();
            rootN.iv.number = c;        
         temp = rootN.iv; 
        temp= DoInsertNumber(temp, Number, strV, CD);        
        }
        else if(c == '5'){
            rootN.v = new NodeNumber();
            rootN.v.number = c;        
         temp = rootN.v; 
        temp= DoInsertNumber(temp, Number, strV, CD);        
        }
        else if(c == '6'){
            rootN.vi = new NodeNumber();
            rootN.vi.number = c;        
         temp = rootN.vi; 
        temp= DoInsertNumber(temp, Number, strV, CD);        
        }
        else if(c == '7'){
            rootN.vii = new NodeNumber();
            rootN.vii.number = c;        
         temp = rootN.vii; 
        temp= DoInsertNumber(temp, Number, strV, CD);        
        }
        else if(c == '8'){
            rootN.viii = new NodeNumber();
            rootN.viii.number = c;        
         temp = rootN.viii; 
        temp= DoInsertNumber(temp, Number, strV, CD);        
        }
        else if(c == '9'){
            rootN.ix = new NodeNumber();
            rootN.ix.number = c;        
            temp = rootN.ix; 
        temp= DoInsertNumber(temp, Number, strV, CD);        
        }        
        else{}
        
    }
    else{    
        if(c == '0'){
            if(rootN.zero == null){ //no node present
            rootN.zero = new NodeNumber();
            rootN.zero.number = c; 
            temp = rootN.zero;       
            temp = DoInsertNumber(temp, Number, strV, CD);  
            }
            else{ // node is present. 
                temp = rootN.zero;
            temp = DoInsertNumber(temp, Number, strV, CD);  
            } 
        }
        else if(c == '1'){
            if(rootN.i == null){
            rootN.i = new NodeNumber();
            rootN.i.number = c; 
            temp = rootN.i;       
            temp = DoInsertNumber(temp, Number, strV, CD);  
            }
            else{
            temp = rootN.i;       
            temp = DoInsertNumber(temp, Number, strV, CD);  
            }
        }
        else if(c == '2'){
            if(rootN.ii == null){
            rootN.ii = new NodeNumber();
            rootN.ii.number = c; 
            temp = rootN.ii;       
            temp = DoInsertNumber(temp, Number, strV, CD);  
            }
            else{
            temp = rootN.ii;       
            temp = DoInsertNumber(temp, Number, strV, CD);  
            }
        }
        else if(c == '3'){
            if(rootN.iii == null){
            rootN.iii = new NodeNumber();
            rootN.iii.number = c; 
            temp = rootN.iii;       
            temp = DoInsertNumber(temp, Number, strV, CD);  
            }
            else{
            temp = rootN.iii;       
            temp = DoInsertNumber(temp, Number, strV, CD);  
            }
        }
        else if(c == '4'){
            if(rootN.iv == null){
            rootN.iv = new NodeNumber();
            rootN.iv.number = c; 
            temp = rootN.iv;       
            temp = DoInsertNumber(temp, Number, strV, CD);  
            }
            else{
            temp = rootN.iv;       
            temp = DoInsertNumber(temp, Number, strV, CD);  
            }
        }
        else if(c == '5'){
            if(rootN.v == null){
            rootN.v = new NodeNumber();
            rootN.v.number = c; 
            temp = rootN.v;       
            temp = DoInsertNumber(temp, Number, strV, CD);  
            }
            else{
            temp = rootN.v;       
            temp = DoInsertNumber(temp, Number, strV, CD);  
            }
        }
        else if(c == '6'){
            if(rootN.vi == null){
            rootN.vi = new NodeNumber();
            rootN.vi.number = c; 
            temp = rootN.vi;       
            temp = DoInsertNumber(temp, Number, strV, CD);  
            }
            else{
            temp = rootN.vi;       
            temp = DoInsertNumber(temp, Number, strV, CD);  
            }
        }
        else if(c == '7'){
            if(rootN.vii == null){
            rootN.vii = new NodeNumber();
            rootN.vii.number = c; 
            temp = rootN.vii;       
            temp = DoInsertNumber(temp, Number, strV, CD);  
            }
            else{
            temp = rootN.vii;       
            temp = DoInsertNumber(temp, Number, strV, CD);  
            }
        }        
        else if(c == '8'){
            if(rootN.viii == null){
            rootN.viii = new NodeNumber();
            rootN.viii.number = c; 
            temp = rootN.viii;       
            temp = DoInsertNumber(temp, Number, strV, CD);  
            }
            else{
            temp = rootN.viii;       
            temp = DoInsertNumber(temp, Number, strV, CD);  
            }
        }
        else if(c == '9'){
            if(rootN.ix == null){
            rootN.ix = new NodeNumber();
            rootN.ix.number = c; 
            temp = rootN.ix;       
            temp = DoInsertNumber(temp, Number, strV, CD);  
            }
            else{
            temp = rootN.ix;       
            temp = DoInsertNumber(temp, Number, strV, CD);  
            } 
        }
        else{}

    }
return rootN; 
}

public void SearchNumber(String Number){
int t = 0;
NodeNumber temp;
temp = rootNumber; 
//Goes into this recursive function to fetch value. 
temp = ToSearchNumber(rootNumber, Number, t);

}

public NodeNumber ToSearchNumber(NodeNumber rootN, String name, int strV ){
    
    char c = 0; //to Store each letter of string.
    NodeNumber temp; 
    
    if(strV < name.length()){ //itrates through string and stores letter in 'c' after each recursive call. 
    c = name.charAt(strV);
    strV++;
    }
    else{ //checks once we have reached the end of the string if the boolean/marker is true then the word is present else no. 
        if(rootN.end == true){
             System.out.println("We found the Query you were looking for!");
             rootN.ContactD.print();
             SearchValueNumber = rootN; //this is for the delete function. 
        }
        else{
            System.out.println("Your search yeilded no results");        
        }
    }
    //Sequentially goes through all the letter ifs.
    if(c == '0'){
        if(rootN.zero != null){
        temp = ToSearchNumber(rootN.zero, name, strV);
        }
        else{
        System.out.println("Your search yeilded no results");        
        }
    }
    else if(c == '1'){
        if(rootN.i != null){
        temp = ToSearchNumber(rootN.i, name, strV);
        }
        else{
        System.out.println("Your search yeilded no results");        
        }        
    }
    else if(c == '2'){
        if(rootN.ii != null){
        temp = ToSearchNumber(rootN.ii, name, strV);
        }
        else{
        System.out.println("Your search yeilded no results");        
        }        
    }
    else if(c == '3'){
        if(rootN.iii != null){
        temp = ToSearchNumber(rootN.iii, name, strV);
        }
        else{
        System.out.println("Your search yeilded no results");        
        }        
    }
    else if(c == '4'){
        if(rootN.iv != null){
        temp = ToSearchNumber(rootN.iv, name, strV);
        }
        else{
        System.out.println("Your search yeilded no results");        
        }        
    }
    else if(c == '5'){
        if(rootN.v != null){
        temp = ToSearchNumber(rootN.v, name, strV);
        }
        else{
        System.out.println("Your search yeilded no results");        
        }        
    }
    else if(c == '6'){
        if(rootN.vi != null){
        temp = ToSearchNumber(rootN.vi, name, strV);
        }
        else{
        System.out.println("Your search yeilded no results");        
        }        
    }
    else if(c == '7'){
        if(rootN.vii != null){
        temp = ToSearchNumber(rootN.vii, name, strV);
        }
        else{
        System.out.println("Your search yeilded no results");        
        }        
    }
    else if(c == '8'){
        if(rootN.viii != null){
        temp = ToSearchNumber(rootN.viii, name, strV);
        }
        else{
        System.out.println("Your search yeilded no results");        
        }        
    }    
    else if(c == '9'){
        if(rootN.ix != null){
        temp = ToSearchNumber(rootN.ix, name, strV);
        }
        else{
        System.out.println("Your search yeilded no results");        
        }        
    }
    else{
    }
return rootN;     
}

public void DeleteNumber(String number){

ToSearchNumber(rootNumber, number, 0); //First Searches for the name. 

if(SearchValueNumber != null){ //Keeps the references of the last character of the word from the seach value
                         // turns the boolean off. 
    System.out.println("Now deleting the Number");
    if(SearchValueNumber.end == true){
        SearchValueNumber.end = false;        
        SearchValueNumber.ContactD = null; 
    }
    
    //SearchValue.end = false; 
    System.out.println("'" +number + "' has been successfully deleted");
    }
else{
    System.out.println("We were unable to perform deletion");
}
    SearchValueNumber = null; //for later use. This is a global variable. 

}

public void DisplayNumber(){
    ToDisplayNumber(rootNumber);
}

public NodeNumber ToDisplayNumber(NodeNumber rootN){

//    for(int i = 0; i < 1; i++){
        
        if(rootN.zero != null){
        ToDisplayNumber(rootN.zero);
        }
        
        if(rootN.i != null){
        ToDisplayNumber(rootN.i);
        }
        
        if(rootN.ii != null){
        ToDisplayNumber(rootN.ii);
        }
        
        if(rootN.iii != null){
        ToDisplayNumber(rootN.iii);
        }
        
        if(rootN.iv != null){
        ToDisplayNumber(rootN.iv);
        }
        
        if(rootN.v != null){
        ToDisplayNumber(rootN.v);
        }
        
        if(rootN.vi != null){
        ToDisplayNumber(rootN.vi);
        }
        
        if(rootN.vii != null){
        ToDisplayNumber(rootN.vii);
        } 
        
        if(rootN.viii != null){
        ToDisplayNumber(rootN.viii);
        } 
        
        if(rootN.ix != null){
        ToDisplayNumber(rootN.ix);
        }        
        
        if(rootN.end == true){
        rootN.ContactD.printNumber();
        }
        else{
        }
  //  }
return rootN;
}

}
