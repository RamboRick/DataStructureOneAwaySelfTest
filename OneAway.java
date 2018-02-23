package outoneway;

import java.util.HashSet;
public class OneAway {
	
	public boolean isOneAway (String one, String two){
		if (one.length() - two.length() >1 || one.length() - two.length() <-1 ){
			return false; 
		} else { 
			String combineString = one + two;
			HashSet<Character> crr = new HashSet<>();
			for (char s : combineString.toCharArray()){
				if (crr.contains(s)){
					crr.remove(s);
				}else{
					crr.add(s);
				}
			}
			return crr.size() <= 1;
		}

	}
}
