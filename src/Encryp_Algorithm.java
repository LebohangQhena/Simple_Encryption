import java.util.ArrayList;

public class Encryp_Algorithm {
	public char[] lettersOfAlphabet = "abcdefghijklmnopqrstuvwxyz".toCharArray();
	
	
	public Encryp_Algorithm() {
		
	}
	
	public String shift1Right(String word) {
		char[] oldword = word.toCharArray();
		String newword = "";
		
		for(char oldletters : oldword) {
			for(int i = 0; i<=126;i++) {
				if(oldletters == (char)(i)) {
					newword += (char)(validate(i,1));
				}
			}
		}
		
		return newword;
		
	}
	
	public String shift3Right(String word) {
		char[] oldword = word.toCharArray();
		String newword = "";
		boolean iseven = true;
		
		for(char oldletters : oldword) {
			for(int i = 0; i<=126;i++) {
				if(oldletters == (char)(i)) {
					if(iseven) {
						newword += (char)i;
						iseven = false;
					}else {
						newword += (char)(validate(i,3));
						iseven = true;
					}
				}
			}
		}
		
		return newword;
		
	}
	
	public int validate(int num, int shift) {
		if((num + shift)>126) {
			return shift;
		}
		
		return num+shift;
	}
}
