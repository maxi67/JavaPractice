import java.io.*;

public class SaveFile {
	public static void main(String args[]) {
		File saveFile=new File("output.txt");
	    try {
	      FileWriter fwriter = new FileWriter(saveFile);
	      fwriter.write("Taiwan NO.1 !\n");
	      fwriter.write("Give me ten !\n");
	      fwriter.close();
	    }
	    
	    catch(Exception e) {
	      e.printStackTrace();
	    }
	}
}
