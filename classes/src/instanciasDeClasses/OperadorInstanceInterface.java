package instanciasDeClasses;

import java.util.HashSet;
import java.util.Hashtable;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class OperadorInstanceInterface {

	
	public static void main(String[] args) {
		
		Set<Integer> sh = new LinkedHashSet<Integer>();
		HashSet<Integer> hs = new HashSet<Integer>();
		TreeSet<Integer> ts = new TreeSet<Integer>();
		
		// todas comparaçoes sao verdadeiros 
		System.out.println(sh instanceof Set);
		System.out.println(sh instanceof LinkedHashSet);
		System.out.println(hs instanceof Set);
		System.out.println(hs instanceof HashSet);
		System.out.println(ts instanceof Set);
		System.out.println(ts instanceof TreeSet);
				
		
		

		
		
	}
	
	
}
