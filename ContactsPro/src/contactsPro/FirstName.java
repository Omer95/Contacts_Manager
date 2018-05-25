package contactsPro;

import java.util.LinkedList;
/**
 * 
 * @author O
 *
 */

public class FirstName implements java.io.Serializable{
   
Node root; // For first name
Node SearchValue; // this is for the delete function. 

public void Insert(String Name, ContactDetails CD){
    int t = 0; // 0 index of the str.characters.
    //Goes into the recursive function to delete. 
    //this function is only for simplicity of user.
    root = DoInsert(root, Name,t, CD); 

}
    
public Node DoInsert(Node rootN, String Name, int strV, ContactDetails CD){ //First Name
Node newNode = new Node();
Node temp = null; 
char c; 

    if(strV != Name.length()){
        c = Name.charAt(strV);
        strV++; 
    }
    else{
        if(rootN.end != true){ //Name appears for the first time. 
            rootN.end = true; 
            rootN.FirstName.add(CD);
        }
        else{         
            rootN.FirstName.add(CD);
        }        
    return rootN; 
    }

    if(rootN == null){
        rootN = new Node(); 
        if(c == 'a'){
            rootN.a = new Node();
            rootN.a.alphabet = c;        
         temp = rootN.a; 
         temp= DoInsert(temp, Name, strV, CD); // the return variable temp is not needed. Will remove it later. Let it be. 
        }
        else if(c == 'b'){
            rootN.b = new Node();
            rootN.b.alphabet = c;        
         temp = rootN.b; 
         temp = DoInsert(temp, Name, strV, CD);
        }
        else if(c == 'c'){
            rootN.c = new Node();
            rootN.c.alphabet = c;        
         temp = rootN.c; 
         temp = DoInsert(temp, Name, strV , CD);
        }        
        else if(c == 'd'){
            rootN.d = new Node();
            rootN.d.alphabet = c;        
         temp = rootN.d; 
         temp = DoInsert(temp, Name, strV, CD);
        }
        else if(c == 'e'){
            rootN.e = new Node();
            rootN.e.alphabet = c;        
         temp = rootN.e; 
         temp = DoInsert(temp, Name, strV, CD);
        }
        else if(c == 'f'){
            rootN.f = new Node();
            rootN.f.alphabet = c;        
         temp = rootN.f; 
         temp = DoInsert(temp, Name, strV, CD);
        }
        else if(c == 'g'){
            rootN.g = new Node();
            rootN.g.alphabet = c;        
         temp = rootN.g; 
         temp = DoInsert(temp, Name, strV, CD);
        }
        else if(c == 'h'){
            rootN.h = new Node();
            rootN.h.alphabet = c;        
         temp = rootN.h; 
         temp = DoInsert(temp, Name, strV, CD);
        }
        else if(c == 'i'){
            rootN.i = new Node();
            rootN.i.alphabet = c;        
         temp = rootN.i; 
         temp = DoInsert(temp, Name, strV, CD);
        }
        else if(c == 'j'){
            rootN.j = new Node();
            rootN.j.alphabet = c;        
         temp = rootN.j; 
         temp = DoInsert(temp, Name, strV, CD);
        }
        else if(c == 'k'){
            rootN.k = new Node();
            rootN.k.alphabet = c;        
         temp = rootN.k; 
         temp = DoInsert(temp, Name, strV, CD);
        }
        else if(c == 'l'){
            rootN.l = new Node();
            rootN.l.alphabet = c;        
         temp = rootN.l; 
         temp = DoInsert(temp, Name, strV, CD);
        }
        else if(c == 'm'){
            rootN.m = new Node();
            rootN.m.alphabet = c;        
         temp = rootN.m; 
        // System.out.println("here");
         temp = DoInsert(temp, Name, strV, CD);
        }
        else if(c == 'n'){
            rootN.n = new Node();
            rootN.n.alphabet = c;        
         temp = rootN.n; 
         temp = DoInsert(temp, Name, strV, CD);
        }
        else if(c == 'o'){
            rootN.o = new Node();
            rootN.o.alphabet = c;        
         temp = rootN.o; 
         temp = DoInsert(temp, Name, strV, CD);
        }
        else if(c == 'p'){
            rootN.p = new Node();
            rootN.p.alphabet = c;        
         temp = rootN.p; 
         temp = DoInsert(temp, Name, strV, CD);
        }
        else if(c == 'q'){
            rootN.q = new Node();
            rootN.q.alphabet = c;        
         temp = rootN.q; 
         temp = DoInsert(temp, Name, strV, CD);
        }
        else if(c == 'r'){
            rootN.r = new Node();
            rootN.r.alphabet = c;        
         temp = rootN.r; 
         temp = DoInsert(temp, Name, strV, CD);
        }
        else if(c == 's'){
            rootN.s = new Node();
            rootN.s.alphabet = c;        
         temp = rootN.s; 
         temp = DoInsert(temp, Name, strV, CD);
        }
        else if(c == 't'){
            rootN.t = new Node();
            rootN.t.alphabet = c;        
         temp = rootN.t; 
         temp = DoInsert(temp, Name, strV, CD);        }
        else if(c == 'u'){
            rootN.u = new Node();
            rootN.u.alphabet = c;        
         temp = rootN.u; 
         temp = DoInsert(temp, Name, strV, CD);        }
        else if(c == 'v'){
            rootN.v = new Node();
            rootN.v.alphabet = c;        
         temp = rootN.v; 
         temp = DoInsert(temp, Name, strV, CD);        }
        else if(c == 'w'){
            rootN.w = new Node();
            rootN.w.alphabet = c;        
         temp = rootN.w; 
         temp = DoInsert(temp, Name, strV, CD);        }
        else if(c == 'x'){
            rootN.x = new Node();
            rootN.x.alphabet = c;        
         temp = rootN.x; 
         temp = DoInsert(temp, Name, strV, CD);        }
        else if(c == 'y'){
            rootN.y = new Node();
            rootN.y.alphabet = c;        
         temp = rootN.y; 
         temp = DoInsert(temp, Name, strV, CD);        }
        else if(c == 'z'){
            rootN.z = new Node();
            rootN.z.alphabet = c;        
         temp = rootN.z; 
         temp = DoInsert(temp, Name, strV, CD);        }
        else{}
        
    }
    else{    
        if(c == 'a'){

            if(rootN.a == null){ //no node present
            rootN.a = new Node();
            rootN.a.alphabet = c; 
            temp = rootN.a;       
            temp = DoInsert(temp, Name, strV, CD);            }
            else{ // node is present. 
                temp = rootN.a;
                temp = DoInsert(temp, Name, strV, CD);             }
        }
        else if(c == 'b'){
            if(rootN.b == null){
            rootN.b = new Node();
            rootN.b.alphabet = c; 
            temp = rootN.b;       
            temp = DoInsert(temp, Name, strV, CD);
            }
            else{
            temp = rootN.b;       
            temp = DoInsert(temp, Name, strV, CD);          
            }
        }
        else if(c == 'c'){
            if(rootN.c == null){
            rootN.c = new Node();
            rootN.c.alphabet = c; 
            temp = rootN.c;       
            temp = DoInsert(temp, Name, strV, CD);
            }
            else{
            temp = rootN.c;       
            temp = DoInsert(temp, Name, strV, CD);
            }
        }
        else if(c == 'd'){
            if(rootN.d == null){
            rootN.d = new Node();
            rootN.d.alphabet = c; 
            temp = rootN.d;       
            temp = DoInsert(temp, Name, strV, CD);
            }
            else{
            temp = rootN.d;       
            temp = DoInsert(temp, Name, strV, CD);
            }
        }
        else if(c == 'e'){
            if(rootN.e == null){
            rootN.e = new Node();
            rootN.e.alphabet = c; 
            temp = rootN.e;       
            temp = DoInsert(temp, Name, strV, CD);
            }
            else{
            temp = rootN.e;       
            temp = DoInsert(temp, Name, strV, CD);
            }
        }
        else if(c == 'f'){
            if(rootN.f == null){
            rootN.f = new Node();
            rootN.f.alphabet = c; 
            temp = rootN.f;       
            temp = DoInsert(temp, Name, strV, CD);
            }
            else{
            temp = rootN.f;       
            temp = DoInsert(temp, Name, strV, CD);
            }
        }
        else if(c == 'g'){
            if(rootN.g == null){
            rootN.g = new Node();
            rootN.g.alphabet = c; 
            temp = rootN.g;       
            temp = DoInsert(temp, Name, strV, CD);
            }
            else{
            temp = rootN.g;       
            temp = DoInsert(temp, Name, strV, CD);
            }
        }
        else if(c == 'h'){
            if(rootN.h == null){
            rootN.h = new Node();
            rootN.h.alphabet = c; 
            temp = rootN.h;       
            temp = DoInsert(temp, Name, strV, CD);
            }
            else{
            temp = rootN.h;       
            temp = DoInsert(temp, Name, strV, CD);
            }
        }
        else if(c == 'i'){
            if(rootN.i == null){
            rootN.i = new Node();
            rootN.i.alphabet = c; 
            temp = rootN.i;       
            temp = DoInsert(temp, Name, strV, CD);
            }
            else{
            temp = rootN.i;       
            temp = DoInsert(temp, Name, strV, CD);
            }
        }
        else if(c == 'j'){
            if(rootN.j == null){
            rootN.j = new Node();
            rootN.j.alphabet = c; 
            temp = rootN.j;       
            temp = DoInsert(temp, Name, strV, CD);
            }
            else{
            temp = rootN.j;       
            temp = DoInsert(temp, Name, strV, CD);
            }
        }        
        else if(c == 'k'){
            if(rootN.k == null){
            rootN.k = new Node();
            rootN.k.alphabet = c; 
            temp = rootN.k;       
            temp = DoInsert(temp, Name, strV, CD);
            }
            else{
            temp = rootN.k;       
            temp = DoInsert(temp, Name, strV, CD);
            }
        }       
        else if(c == 'l'){
            if(rootN.l == null){
            rootN.l = new Node();
            rootN.l.alphabet = c; 
            temp = rootN.l;       
            temp = DoInsert(temp, Name, strV, CD);
            }
            else{
            temp = rootN.l;       
            temp = DoInsert(temp, Name, strV, CD);
            }
        }        
        else if(c == 'm'){
            if(rootN.m == null){
            rootN.m = new Node();
            rootN.m.alphabet = c; 
            temp = rootN.m;       
            temp = DoInsert(temp, Name, strV, CD);
            }
            else{
            temp = rootN.m;       
            temp = DoInsert(temp, Name, strV, CD);
            }
        }        
        else if(c == 'n'){
            if(rootN.n == null){
            rootN.n = new Node();
            rootN.n.alphabet = c; 
            temp = rootN.n;       
            temp = DoInsert(temp, Name, strV, CD);
            }
            else{
            temp = rootN.n;       
            temp = DoInsert(temp, Name, strV, CD);
            }
        }        
        else if(c == 'o'){
            if(rootN.o == null){
            rootN.o = new Node();
            rootN.o.alphabet = c; 
            temp = rootN.o;       
            temp = DoInsert(temp, Name, strV, CD);
            }
            else{
            temp = rootN.o;       
            temp = DoInsert(temp, Name, strV, CD);
            }
        }        
        else if(c == 'p'){
            if(rootN.p == null){
            rootN.p = new Node();
            rootN.p.alphabet = c; 
            temp = rootN.p;       
            temp = DoInsert(temp, Name, strV, CD);
            }
            else{
            temp = rootN.p;       
            temp = DoInsert(temp, Name, strV, CD);
            }
        }        
        else if(c == 'q'){
            if(rootN.q == null){
            rootN.q = new Node();
            rootN.q.alphabet = c; 
            temp = rootN.q;       
            temp = DoInsert(temp, Name, strV, CD);
            }
            else{
            temp = rootN.q;       
            temp = DoInsert(temp, Name, strV, CD);
            }
        }        
        else if(c == 'r'){
            if(rootN.r == null){
            rootN.r = new Node();
            rootN.r.alphabet = c; 
            temp = rootN.r;       
            temp = DoInsert(temp, Name, strV, CD);
            }
            else{
            temp = rootN.r;       
            temp = DoInsert(temp, Name, strV, CD);
            }
        }        
        else if(c == 's'){
            if(rootN.s == null){
            rootN.s = new Node();
            rootN.s.alphabet = c; 
            temp = rootN.s;       
            temp = DoInsert(temp, Name, strV, CD);
            }
            else{
            temp = rootN.s;       
            temp = DoInsert(temp, Name, strV, CD);
            }
        }        
        else if(c == 't'){
            if(rootN.t == null){
            rootN.t = new Node();
            rootN.t.alphabet = c; 
            temp = rootN.t;       
            temp = DoInsert(temp, Name, strV, CD);
            }
            else{
            temp = rootN.t;       
            temp = DoInsert(temp, Name, strV, CD);
            }
        }
        else if(c == 'u'){
            if(rootN.u == null){
            rootN.u = new Node();
            rootN.u.alphabet = c; 
            temp = rootN.u;       
            temp = DoInsert(temp, Name, strV, CD);
            }
            else{
            temp = rootN.u;       
            temp = DoInsert(temp, Name, strV, CD);
            }
        }
        else if(c == 'v'){
            if(rootN.v == null){
            rootN.v = new Node();
            rootN.v.alphabet = c; 
            temp = rootN.v;       
            temp = DoInsert(temp, Name, strV, CD);
            }
            else{
            temp = rootN.v;       
            temp = DoInsert(temp, Name, strV, CD);
            }
        }
        else if(c == 'w'){
            if(rootN.w == null){
            rootN.w = new Node();
            rootN.w.alphabet = c; 
            temp = rootN.w;       
            temp = DoInsert(temp, Name, strV, CD);
            }
            else{
            temp = rootN.w;       
            temp = DoInsert(temp, Name, strV, CD);
            }
        }        
        else if(c == 'x'){
            if(rootN.x == null){
            rootN.x = new Node();
            rootN.x.alphabet = c; 
            temp = rootN.x;       
            temp = DoInsert(temp, Name, strV, CD);
            }
            else{
            temp = rootN.x;       
            temp = DoInsert(temp, Name, strV, CD);
            }
        }        
        else if(c == 'y'){
            if(rootN.y == null){
            rootN.y = new Node();
            rootN.y.alphabet = c; 
            temp = rootN.y;       
            temp = DoInsert(temp, Name, strV, CD);
            }
            else{
            temp = rootN.y;       
            temp = DoInsert(temp, Name, strV, CD);
            }
        }        
        else if(c == 'z'){
            if(rootN.z == null){
            rootN.z = new Node();
            rootN.z.alphabet = c; 
            temp = rootN.z;       
            temp = DoInsert(temp, Name, strV, CD);
            }
            else{
            temp = rootN.z;       
            temp = DoInsert(temp, Name, strV, CD);
            }
        }        
        else{}
    }   
return rootN; 
    
} //First Name

public void Search(String name){
int t = 0;
Node temp;
temp = root; 
//Goes into this recursive function to fetch value. 
temp = ToSearch(root, name, t);

}

public Node ToSearch(Node rootN, String name, int strV ){
    
    char c = 0; //to Store each letter of string.
    Node temp; 
    
    if(strV < name.length()){ //itrates through string and stores letter in 'c' after each recursive call. 
    c = name.charAt(strV);
    strV++;
    }
    else{ //checks once we have reached the end of the string if the boolean/marker is true then the word is present else no. 
        if(rootN.end == true){
             System.out.println("We found the Query you were looking for!");
             for(int i = 0; i < rootN.FirstName.size(); i++){
             rootN.FirstName.get(i).print();
             
             }
        }
        else{
            System.out.println("Your search yeilded no results");        
        }
    }
    //Sequentially goes through all the letter ifs.
    if(c == 'a'){
        if(rootN.a != null){
        temp = ToSearch(rootN.a, name, strV);
        }
        else{
        System.out.println("Your search yeilded no results");        
        }
    }
    else if(c == 'b'){
        if(rootN.b != null){
        temp = ToSearch(rootN.b, name, strV);
        }
        else{
        System.out.println("Your search yeilded no results");        
        }        
    }
    else if(c == 'c'){
        if(rootN.c != null){
        temp = ToSearch(rootN.c, name, strV);
        }
        else{
        System.out.println("Your search yeilded no results");        
        }        
    }
    else if(c == 'd'){
        if(rootN.d != null){
        temp = ToSearch(rootN.d, name, strV);
        }
        else{
        System.out.println("Your search yeilded no results");        
        }        
    }
    else if(c == 'e'){
        if(rootN.e != null){
        temp = ToSearch(rootN.e, name, strV);
        }
        else{
        System.out.println("Your search yeilded no results");        
        }        
    }
    else if(c == 'f'){
        if(rootN.f != null){
        temp = ToSearch(rootN.f, name, strV);
        }
        else{
        System.out.println("Your search yeilded no results");        
        }        
    }
    else if(c == 'g'){
        if(rootN.g != null){
        temp = ToSearch(rootN.g, name, strV);
        }
        else{
        System.out.println("Your search yeilded no results");        
        }        
    }
    else if(c == 'h'){
        if(rootN.h != null){
        temp = ToSearch(rootN.h, name, strV);
        }
        else{
        System.out.println("Your search yeilded no results");        
        }        
    }
    else if(c == 'i'){
        if(rootN.i != null){
        temp = ToSearch(rootN.i, name, strV);
        }
        else{
        System.out.println("Your search yeilded no results");        
        }        
    }
    else if(c == 'j'){
        if(rootN.j != null){
        temp = ToSearch(rootN.j, name, strV);
        }
        else{
        System.out.println("Your search yeilded no results");        
        }        
    }
    else if(c == 'k'){
        if(rootN.k != null){
        temp = ToSearch(rootN.k, name, strV);
        }
        else{
        System.out.println("Your search yeilded no results");        
        }        
    }
    else if(c == 'l'){
        if(rootN.l != null){
        temp = ToSearch(rootN.l, name, strV);
        }
        else{
        System.out.println("Your search yeilded no results");        
        }        
    }
    else if(c == 'm'){
        if(rootN.m != null){
        temp = ToSearch(rootN.m, name, strV);
        }
        else{
        System.out.println("Your search yeilded no results");        
        }        
    }
    else if(c == 'n'){
        if(rootN.n != null){
        temp = ToSearch(rootN.n, name, strV);
        }
        else{
        System.out.println("Your search yeilded no results");        
        }        
    }
    else if(c == 'o'){
        if(rootN.o != null){
        temp = ToSearch(rootN.o, name, strV);
        }
        else{
        System.out.println("Your search yeilded no results");        
        }        
    }
    else if(c == 'p'){
        if(rootN.p != null){
        temp = ToSearch(rootN.p, name, strV);
        }
        else{
        System.out.println("Your search yeilded no results");        
        }        
    }
    else if(c == 'q'){
        if(rootN.q != null){
        temp = ToSearch(rootN.q, name, strV);
        }
        else{
        System.out.println("Your search yeilded no results");        
        }        
    }
    else if(c == 'r'){
        if(rootN.r != null){
        temp = ToSearch(rootN.r, name, strV);
        }
        else{
        System.out.println("Your search yeilded no results");        
        }        
    }
    else if(c == 's'){
        if(rootN.s != null){
        temp = ToSearch(rootN.s, name, strV);
        }
        else{
        System.out.println("Your search yeilded no results");        
        }        
    }
    else if(c == 't'){
        if(rootN.t != null){
        temp = ToSearch(rootN.t, name, strV);
        }
        else{
        System.out.println("Your search yeilded no results");        
        }        
    }
    else if(c == 'u'){
        if(rootN.u != null){
        temp = ToSearch(rootN.u, name, strV);
        }
        else{
        System.out.println("Your search yeilded no results");        
        }        
    }
    else if(c == 'v'){
        if(rootN.v != null){
        temp = ToSearch(rootN.v, name, strV);
        }
        else{
        System.out.println("Your search yeilded no results");        
        }        
    }
    else if(c == 'w'){
        if(rootN.w != null){
        temp = ToSearch(rootN.w, name, strV);
        }
        else{
        System.out.println("Your search yeilded no results");        
        }        
    }
    else if(c == 'x'){
        if(rootN.x != null){
        temp = ToSearch(rootN.x, name, strV);
        }
        else{
        System.out.println("Your search yeilded no results");        
        }        
    }
    else if(c == 'y'){
        if(rootN.y != null){
        temp = ToSearch(rootN.y, name, strV);
        }
        else{
        System.out.println("Your search yeilded no results");        
        }        
    }
    else if(c == 'z'){
        if(rootN.z != null){
        temp = ToSearch(rootN.z, name, strV);
        }
        else{
        System.out.println("Your search yeilded no results");        
        }        
    }
    else{
    }
return rootN;     
}

public void DisplayFirstName(){
    ToDisplay(root);
}

public Node ToDisplay(Node rootN){ // First Name

//    for(int i = 0; i < 1; i++){
        
        if(rootN.a != null){
        ToDisplay(rootN.a);
        }
        
        if(rootN.b != null){
        ToDisplay(rootN.b);
        }
        
        if(rootN.c != null){
        ToDisplay(rootN.c);
        }
        
        if(rootN.d != null){
        ToDisplay(rootN.d);
        }
        
        if(rootN.e != null){
        ToDisplay(rootN.e);
        }
        
        if(rootN.f != null){
        ToDisplay(rootN.f);
        }
        
        if(rootN.g != null){
        ToDisplay(rootN.g);
        }
        
        if(rootN.h != null){
        ToDisplay(rootN.h);
        } 
        
        if(rootN.i != null){
        ToDisplay(rootN.i);
        } 
        
        if(rootN.j != null){
        ToDisplay(rootN.j);
        }        
        
        if(rootN.k != null){
        ToDisplay(rootN.k);
        }
        
        if(rootN.l != null){
        ToDisplay(rootN.l);
        }
        
        if(rootN.m != null){
        ToDisplay(rootN.m);
        }
        
        if(rootN.n != null){
        ToDisplay(rootN.n);
        }
        
        if(rootN.o != null){
        ToDisplay(rootN.o);
        }
        
        if(rootN.p != null){
        ToDisplay(rootN.p);
        }
        
        if(rootN.q != null){
        ToDisplay(rootN.q);
        } 
        
        if(rootN.r != null){
        ToDisplay(rootN.r);
        } 
        
        if(rootN.s != null){
        ToDisplay(rootN.s);
        }            
        
        if(rootN.t != null){
        ToDisplay(rootN.t);
        }
        
        if(rootN.u != null){
        ToDisplay(rootN.u);
        }
        
        if(rootN.v != null){
        ToDisplay(rootN.v);
        }
        
        if(rootN.w != null){
        ToDisplay(rootN.w);
        }
         
        if(rootN.x != null){
        ToDisplay(rootN.x);
        } 
        
        if(rootN.y != null){
        ToDisplay(rootN.y);
        } 
        
        if(rootN.z != null){
        ToDisplay(rootN.z);
        }            
        
        if(rootN.end == true){
            for(int i = 0; i < rootN.FirstName.size(); i++){
            rootN.FirstName.get(i).print();
            }        
        }
        else{
        }
  //  }
return rootN;
} //For First Name

public void DisplayNameWhenTyped(String Name){
Node rootN; 
rootN = root;     

rootN = ToDisplayNameWhenTyped(Name, rootN, 0);
ToDisplay(rootN);

} 

 public Node ToDisplayNameWhenTyped(String Name, Node rootN, int StrV){
    	char c = 's'; 

    	if(StrV < Name.length()){
    		c = Name.charAt(StrV);
    		// System.out.println("C - " + c);
    		// System.out.println("Strv " + StrV + " lenth: " + Name.length());
    		StrV++;
    	}
    	else{
    		//System.out.println("Strv " + StrV + " lenth: " + Name.length());
    		// System.out.println("here");
    		return rootN; 
    	}
    	if(c == 'a'){
    		if(rootN.a != null){
    			rootN = rootN.a;
    			rootN=ToDisplayNameWhenTyped(Name, rootN, StrV);
    		}
    		else{
    			System.out.println("Your search yeilded no results");        
    		}
    	}	
    	else if(c == 'b'){
    		if(rootN.b != null){
    			rootN = rootN.b;
    			rootN=ToDisplayNameWhenTyped(Name, rootN, StrV);
    		}
    		else{
    			System.out.println("Your search yeilded no results");        
    		}        
    	}
    	else if(c == 'c'){
    		if(rootN.c != null){
    			rootN = rootN.c;
    			rootN=ToDisplayNameWhenTyped(Name, rootN, StrV);
    		}
    		else{
    			System.out.println("Your search yeilded no results");        
    		}        
    	}
    	else if(c == 'd'){
    		if(rootN.d != null){
    			rootN = rootN.d;
    			rootN=ToDisplayNameWhenTyped(Name, rootN, StrV);

    		}
    		else{
    			System.out.println("Your search yeilded no results");        
    		}        
    	}
    	else if(c == 'e'){
    		if(rootN.e != null){
    			rootN = rootN.e;
    			rootN=ToDisplayNameWhenTyped(Name, rootN, StrV);

    		}
    		else{
    			System.out.println("Your search yeilded no results");        
    		}        
    	}
    	else if(c == 'f'){
    		if(rootN.f != null){
    			rootN = rootN.f;
    			rootN=ToDisplayNameWhenTyped(Name, rootN, StrV);

    		}
          else{
        	  System.out.println("Your search yeilded no results");        
          }        
    	}
    	else if(c == 'g'){
    		if(rootN.g != null){
    			rootN = rootN.g;
    			rootN=ToDisplayNameWhenTyped(Name, rootN, StrV);
    		}
    		else{
          System.out.println("Your search yeilded no results");        
          }        
      }
      else if(c == 'h'){
          if(rootN.h != null){
              rootN = rootN.h;
              rootN=ToDisplayNameWhenTyped(Name, rootN, StrV);
          }
          else{
          System.out.println("Your search yeilded no results");        
          }        
      }
      else if(c == 'i'){
          if(rootN.i != null){
              rootN = rootN.i;
              rootN=ToDisplayNameWhenTyped(Name, rootN, StrV);
          }
          else{
          System.out.println("Your search yeilded no results");        
          }        
      }
      else if(c == 'j'){
          if(rootN.j != null){
              rootN = rootN.j;
              rootN=ToDisplayNameWhenTyped(Name, rootN, StrV);
          }
          else{
          System.out.println("Your search yeilded no results");        
          }        
      }
      else if(c == 'k'){
          if(rootN.k != null){
              rootN = rootN.k;
              rootN=ToDisplayNameWhenTyped(Name, rootN, StrV);
          }
          else{
          System.out.println("Your search yeilded no results");        
          }        
      }
      else if(c == 'l'){
          if(rootN.l != null){
              rootN = rootN.l;
              rootN=ToDisplayNameWhenTyped(Name, rootN, StrV);
          }
          else{
          System.out.println("Your search yeilded no results");        
          }        
      }
      else if(c == 'm'){
          if(rootN.m != null){
        	  System.out.println("true m"); //DEBUGGING
              rootN = rootN.m;
              rootN=ToDisplayNameWhenTyped(Name, rootN, StrV);
          }
          else{
          System.out.println("Your search yeilded no results");        
          }        
      }
      else if(c == 'n'){
          if(rootN.n != null){
              rootN = rootN.n;
              rootN=ToDisplayNameWhenTyped(Name, rootN, StrV);
          }
          else{
          System.out.println("Your search yeilded no results");        
          }        
      }
      else if(c == 'o'){
          if(rootN.o != null){
        	  System.out.println("true o"); //DEBUGGING
              rootN = rootN.o;
              rootN=ToDisplayNameWhenTyped(Name, rootN, StrV);
          }
          else{
          System.out.println("Your search yeilded no results");        
          }        
      }
      else if(c == 'p'){
          if(rootN.p != null){
              rootN = rootN.p;
              rootN=ToDisplayNameWhenTyped(Name, rootN, StrV);
          }
          else{
          System.out.println("Your search yeilded no results");        
          }        
      }
      else if(c == 'q'){
          if(rootN.q != null){
              rootN = rootN.q;
              rootN=ToDisplayNameWhenTyped(Name, rootN, StrV);
          }
          else{
          System.out.println("Your search yeilded no results");        
          }        
      }
      else if(c == 'r'){
          if(rootN.r != null){
              rootN = rootN.r;
              rootN=ToDisplayNameWhenTyped(Name, rootN, StrV);
          }
          else{
          System.out.println("Your search yeilded no results");        
          }        
      }
      else if(c == 's'){
          if(rootN.s != null){
              rootN = rootN.s;
              rootN=ToDisplayNameWhenTyped(Name, rootN, StrV);
          }
          else{
          System.out.println("Your search yeilded no results");        
          }        
      }
      else if(c == 't'){
          if(rootN.t != null){
              rootN = rootN.t;
              rootN=ToDisplayNameWhenTyped(Name, rootN, StrV);
          }
          else{
          System.out.println("Your search yeilded no results");        
          }        
      }
      else if(c == 'u'){
          if(rootN.u != null){
              rootN = rootN.u;
              rootN=ToDisplayNameWhenTyped(Name, rootN, StrV);
          }
          else{
          System.out.println("Your search yeilded no results");        
          }        
      }
      else if(c == 'v'){
          if(rootN.v != null){
              rootN = rootN.v;
              rootN=ToDisplayNameWhenTyped(Name, rootN, StrV);
          }
          else{
          System.out.println("Your search yeilded no results");        
          }        
      }
      else if(c == 'w'){
          if(rootN.w != null){
              rootN = rootN.w;
              rootN=ToDisplayNameWhenTyped(Name, rootN, StrV);
          }
          else{
          System.out.println("Your search yeilded no results");        
          }        
      }
      else if(c == 'x'){
          if(rootN.x != null){
              rootN = rootN.x;
              rootN=ToDisplayNameWhenTyped(Name, rootN, StrV);
          }
          else{
          System.out.println("Your search yeilded no results");        
          }        
      }
      else if(c == 'y'){
          if(rootN.y != null){
              rootN = rootN.y;
              rootN=ToDisplayNameWhenTyped(Name, rootN, StrV);
          }
          else{
          System.out.println("Your search yeilded no results");        
          }        
      }
      else if(c == 'z'){
          if(rootN.z != null){
              rootN = rootN.z;
              rootN=ToDisplayNameWhenTyped(Name, rootN, StrV);
          }
          else{
          System.out.println("Your search yeilded no results");        
          }        
      }
      else{
      }
  return rootN;     
         
  }

public void Delete(String name){

ToSearch(root, name, 0); //First Searches for the name. 

if(SearchValue != null){ //Keeps the references of the last character of the word from the seach value
                         // turns the boolean off. 
    System.out.println("Now deleting it First Name");
    if(SearchValue.end == true){
        SearchValue.end = false;        
        SearchValue.ContactD = null; 
    }
    
    //SearchValue.end = false; 
    System.out.println("'" +name + "' has been successfully deleted");
    }
else{
    System.out.println("We were unable to perform deletion");
}
    SearchValue = null; //for later use. This is a global variable. 
} //Delete function would be configured

    
}
