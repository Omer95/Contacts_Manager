package contactsPro;

public class Tester {
	
	public static void main (String[] args) {
		FirstName trie= new FirstName();
		ContactDetails cd= new ContactDetails("omer", "ahmed", "03333681769", "03332314480","-","-","-", "-");
		//ContactDetails cd2= new ContactDetails("omer", "farooq", "03333681760", "03332314480","-","-","-", "-");
		ContactDetails cd3= new ContactDetails("omab", "ahmed", "03333681761", "03332314480","-","-","-", "-");
		//ContactDetails cd4= new ContactDetails("omab", "farooq", "03333681765", "03332314480","-","-","-", "-");
		trie.Insert(cd.FName, cd);
		//trie.Insert(cd2.FName, cd2);
		trie.Insert(cd3.FName, cd3);
		//trie.Insert(cd4.FName, cd4);
		trie.DisplayNameWhenTyped("omab");
		
		String result="";
		for (int i=0; i<trie.root.o.m.e.r.FirstName.size(); i++)
			result+=trie.root.o.m.e.r.FirstName.get(i).FName+" ";
		System.out.println(result+" "+trie.root.o.m.e.r.FirstName.size());	
	}
	
	
}
