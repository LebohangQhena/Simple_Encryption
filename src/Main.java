import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Encryp_Algorithm EA = new Encryp_Algorithm();
		Scanner scinput = new Scanner(System.in);
		String strword = scinput.nextLine();
		ReadFile rf = new ReadFile(strword);
		
		System.out.println("Input Text: " + rf.filecontent());
		String StrEncryptedText = EA.shift3Right(EA.shift1Right(rf.filecontent()));
		rf.WriteFile(StrEncryptedText,"EncryptedText");
		System.out.println("Encrypted Text: " + StrEncryptedText);
		
		Decrypt_Algorithm DA = new Decrypt_Algorithm();
		System.out.println("Decrypted Word " + DA.Decryption(StrEncryptedText));
		rf.WriteFile(DA.Decryption(StrEncryptedText),"DecryptedText");
		
	}
}
