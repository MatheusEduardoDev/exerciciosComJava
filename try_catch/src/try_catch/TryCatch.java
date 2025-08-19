package try_catch;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Scanner;

public class TryCatch {

	public static void main(String[] args)  throws IOException{
		int array[] = new int[10];

		InputStream is = System.in;
        InputStreamReader isr = new InputStreamReader(is);
        BufferedReader br = new BufferedReader(isr);
        String s = br.readLine();
        
  
        
     
        
        while (s != null) {
			System.out.println(s);
			s = br.readLine();
			br.close();
		}
        


		int n = 10;
		String string = Integer.toString(n);

		try {

			for (int i = 0; i <= 15; i++) {
				array[i] = i;
				System.out.println(i);
			}
		} catch (RuntimeException e) {
			
			System.out.println("erro: " + e);
		}

	}

}


