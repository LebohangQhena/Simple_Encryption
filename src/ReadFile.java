import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class ReadFile {
	File file = null;
	
	public ReadFile(String filename) {
		String path = "files/"+filename;
		file = new File(path);
	}
	
	public String filecontent() {
		String content = new String();
		
		try {
			BufferedReader br = new BufferedReader(new FileReader(file));
			
			String strtemp;
			while((strtemp = br.readLine()) != null) {
				content += strtemp;
			}
			
			br.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return content;
	}
	
	public void WriteFile(String StrText,String FileName) {
		try {
			FileWriter FW = new FileWriter("files/"+FileName+".txt");
			
			FW.write(StrText);
			FW.flush();
			FW.close();
			/*
			FileOutputStream fos = new FileOutputStream("GeneratedNums.txt");
			DataOutputStream dos = new DataOutputStream(new BufferedOutputStream(fos));
			dos.writeUTF("Writing a new line");
			
			dos.flush();
			dos.close();
			*/
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
