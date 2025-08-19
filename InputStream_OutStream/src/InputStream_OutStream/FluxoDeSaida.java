package InputStream_OutStream;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;

public class FluxoDeSaida {

	public static void main(String[] args) throws IOException{
		OutputStream os = new FileOutputStream("arquivo");
	    OutputStreamWriter osw = new OutputStreamWriter(os);
	    BufferedWriter bw = new BufferedWriter(osw);
	    
	    bw.write("Caelum");
	    
	    bw.close();
	    
	}
	
}
