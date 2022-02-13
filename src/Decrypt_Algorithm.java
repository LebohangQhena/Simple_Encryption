
public class Decrypt_Algorithm {
	public Decrypt_Algorithm() {
		// TODO Auto-generated constructor stub
	}
	
	public String Decryption(String Encryptedword) {
		char[] chrEncryptedWord = Encryptedword.toCharArray();
		
		String decrypt_word = new String("");
		for(char c : chrEncryptedWord) {
			decrypt_word += (char)shiftchar((int)c, 1);
		}
		
		String final_decrypted_word = new String("");
		for(int i = 0;i<decrypt_word.length();i++) {
			if(i%2 != 0) {
				final_decrypted_word += (char)shiftchar(decrypt_word.charAt(i),3);
			}else {
				final_decrypted_word += decrypt_word.charAt(i);
			}
		}
		
		return final_decrypted_word;
	}
	
	public int shiftchar(int charUnicodePosition, int shiftValue) {
		int NewCharUnicodePosition = charUnicodePosition - shiftValue;
		/*
		if(NewCharUnicodePosition<32) {
			NewCharUnicodePosition = 126-(32-NewCharUnicodePosition);
		}
		*/
		if(NewCharUnicodePosition<0) {
			NewCharUnicodePosition = 126+(NewCharUnicodePosition);
		}
		return NewCharUnicodePosition;
	}
}
