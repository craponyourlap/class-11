package class11;

import java.io.ByteArrayInputStream;

public class ReadExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte[] buf = {35,36,37,38};
		//create the new byte array input stream
		ByteArrayInputStream byt = new ByteArrayInputStream(buf);
		int k = 0;
		while ((k = byt.read()) != -1) {
			//conversion pf a byte into a character
			char ch = (char)k;
			System.out.println("ascii value of character is: " + k + "; Special character is: " + ch);
		}
	}

}
