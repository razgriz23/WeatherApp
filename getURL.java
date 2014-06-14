
import java.io.*;
import java.net.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class getURL
{
	 
		public static void main(String[] args) throws Exception 
		{

	        URL oracle = new URL("ftp://ftp.meteo.psu.edu/pub/bufkit/nam_kord.buf");
	        BufferedReader in = new BufferedReader(
	        new InputStreamReader(oracle.openStream()));
	        //FileWriter fstream = new FileWriter("out.xls");
      	  //BufferedWriter out = new BufferedWriter(fstream);
	        ArrayList<String> test = new ArrayList<String>();
	        
	        PrintWriter f0 = new PrintWriter(new FileWriter("output.txt"));
	        String inputLine;
	        while ((inputLine = in.readLine()) != null)
	        {
	           // System.out.println(inputLine);
	            f0.println(inputLine);
	            test.add(inputLine);
	        }
	        in.close();
	        f0.close();
	    	
	        System.out.println(test);
	        test.remove(0);
	        test.remove(0);
	        test.remove(0);
	        test.remove(0);
	        test.remove(1);
	        test.remove(0);
	        test.remove(1);
	        System.out.println(test);
	        
	        //for nam
	        List h0 = new LinkedList();
	        List h1 = new LinkedList();
	        List h2 = new LinkedList();
	        List h3 = new LinkedList();
	        List h4 = new LinkedList();
	        List h5 = new LinkedList();
	        List h6 = new LinkedList();
	        List h7 = new LinkedList();
	        List h8 = new LinkedList();
	        List h9 = new LinkedList();
	        List h10 = new LinkedList();
	        List h11 = new LinkedList();
	        List h12 = new LinkedList();
	        List h13 = new LinkedList();
	        List h14 = new LinkedList();
	        List h15 = new LinkedList();
	        List h16 = new LinkedList();
	        List h17 = new LinkedList();
	        List h18 = new LinkedList();
	        List h19 = new LinkedList();
	        List h20 = new LinkedList();
	        List h21 = new LinkedList();
	        List h22 = new LinkedList();
	        List h23 = new LinkedList();
	        List h24 = new LinkedList();
	        List h25 = new LinkedList();
	        List h26 = new LinkedList();
	        List h27 = new LinkedList();
	        List h28 = new LinkedList();
	        List h29 = new LinkedList();
	        List h30 = new LinkedList();
	        List h31 = new LinkedList();
	        List h32 = new LinkedList();
	        List h33 = new LinkedList();
	        List h34 = new LinkedList();
	        List h35 = new LinkedList();
	        List h36 = new LinkedList();
	        List h37 = new LinkedList();
	        List h38 = new LinkedList();
	        List h39 = new LinkedList();
	        List h40 = new LinkedList();
	        List h41 = new LinkedList();
	        List h42 = new LinkedList();
	        List h43 = new LinkedList();
	        List h44 = new LinkedList();
	        List h45 = new LinkedList();
	        List h46 = new LinkedList();
	        List h47 = new LinkedList();
	        List h48 = new LinkedList();
	        List h49 = new LinkedList();
	        List h50 = new LinkedList();
	        List h51 = new LinkedList();
	        List h52 = new LinkedList();
	        List h53 = new LinkedList();
	        List h54 = new LinkedList();
	        List h55 = new LinkedList();
	        List h56 = new LinkedList();
	        List h57 = new LinkedList();
	        List h58 = new LinkedList();
	        List h59 = new LinkedList();
	        List h60 = new LinkedList();
	        List h61 = new LinkedList();
	        List h62 = new LinkedList();
	        List h63 = new LinkedList();
	        List h64 = new LinkedList();
	        List h65 = new LinkedList();
	        List h66 = new LinkedList();
	        List h67 = new LinkedList();
	        List h68 = new LinkedList();
	        List h69 = new LinkedList();
	        List h70 = new LinkedList();
	        List h71 = new LinkedList();
	        List h72 = new LinkedList();
	        List h73 = new LinkedList();
	        List h74 = new LinkedList();
	        List h75 = new LinkedList();
	        List h76 = new LinkedList();
	        List h77 = new LinkedList();
	        List h78 = new LinkedList();
	        List h79 = new LinkedList();
	        List h80 = new LinkedList();
	        List h81 = new LinkedList();
	        List h82 = new LinkedList();
	        List h83 = new LinkedList();
	        
	       
	       // System.out.println("Size: " + test.size());
	       // System.out.println("First " + test.get(0));
	        System.out.println("Test" + test.indexOf("STIM = 0"));
	        System.out.println("Test" + test.indexOf("STIM = 1"));
	        h0.add(test.indexOf("STIM = 0"));
	        h1.add(test.indexOf("STIM = 1"));
	        h2.add(test.indexOf("STIM = 2"));
	        h3.add(test.indexOf("STIM = 3"));
	        h4.add(test.indexOf("STIM = 4"));
	        h5.add(test.indexOf("STIM = 5"));
	        h6.add(test.indexOf("STIM = 6"));
	        h7.add(test.indexOf("STIM = 7"));
	        h8.add(test.indexOf("STIM = 8"));
	        h9.add(test.indexOf("STIM = 9"));
	        h10.add(test.indexOf("STIM = 10"));
	        h11.add(test.indexOf("STIM = 11"));
	        h12.add(test.indexOf("STIM = 12"));
	        h13.add(test.indexOf("STIM = 13"));
	        h14.add(test.indexOf("STIM = 14"));
	        h15.add(test.indexOf("STIM = 15"));
	        h16.add(test.indexOf("STIM = 16"));
	        h17.add(test.indexOf("STIM = 17"));
	        h18.add(test.indexOf("STIM = 18"));
	        h19.add(test.indexOf("STIM = 19"));
	        h20.add(test.indexOf("STIM = 20"));
	        h21.add(test.indexOf("STIM = 21"));
	        h22.add(test.indexOf("STIM = 22"));
	        h23.add(test.indexOf("STIM = 23"));
	        h24.add(test.indexOf("STIM = 24"));
	        h25.add(test.indexOf("STIME = 25"));
	        h26.add(test.indexOf("STIM = 26"));
	        h27.add(test.indexOf("STIM = 27"));
	        h28.add(test.indexOf("STIM = 28"));
	        h29.add(test.indexOf("STIM = 29"));
	        h30.add(test.indexOf("STIME = 30"));
	        h31.add(test.indexOf("STIM = 31"));
	        h32.add(test.indexOf("STIM = 32"));
	        h33.add(test.indexOf("STIM = 33"));
	        h34.add(test.indexOf("STIM = 34"));
	        h35.add(test.indexOf("STIME = 35"));
	        h36.add(test.indexOf("STIM = 36"));
	        h37.add(test.indexOf("STIM = 37"));
	        h38.add(test.indexOf("STIM = 38"));
	        h39.add(test.indexOf("STIM = 39"));
	        h40.add(test.indexOf("STIME = 40"));
	        h41.add(test.indexOf("STIM = 41"));
	        h42.add(test.indexOf("STIM = 42"));
	        h43.add(test.indexOf("STIM = 43"));
	        h44.add(test.indexOf("STIM = 44"));
	        h45.add(test.indexOf("STIME = 45"));
	        h46.add(test.indexOf("STIM = 46"));
	        h47.add(test.indexOf("STIME = 47"));
	        h48.add(test.indexOf("STIM = 48"));
	        h49.add(test.indexOf("STIM = 49"));
	        h50.add(test.indexOf("STIM = 50"));
	        h51.add(test.indexOf("STIM = 51"));
	        h52.add(test.indexOf("STIME = 52"));
	        h53.add(test.indexOf("STIM = 53"));
	        h54.add(test.indexOf("STIM = 54"));
	        h55.add(test.indexOf("STIM = 55"));
	        h56.add(test.indexOf("STIM = 56"));
	        h57.add(test.indexOf("STIME = 57"));
	        h58.add(test.indexOf("STIM = 58"));
	        h59.add(test.indexOf("STIM = 59"));
	        h60.add(test.indexOf("STIM = 60"));
	        h61.add(test.indexOf("STIM = 61"));
	        h62.add(test.indexOf("STIME = 62"));
	        h63.add(test.indexOf("STIM = 63"));
	        h64.add(test.indexOf("STIM = 64"));
	        h65.add(test.indexOf("STIM = 65"));
	        h66.add(test.indexOf("STIM = 66"));
	        h67.add(test.indexOf("STIME = 67"));
	        h68.add(test.indexOf("STIM = 68"));
	        h69.add(test.indexOf("STIM = 69"));
	        h70.add(test.indexOf("STIM = 70"));
	        h71.add(test.indexOf("STIM = 71"));
	        h72.add(test.indexOf("STIME = 72"));
	        h73.add(test.indexOf("STIM = 73"));
	        h74.add(test.indexOf("STIM = 74"));
	        h75.add(test.indexOf("STIM = 75"));
	        h76.add(test.indexOf("STIM = 76"));
	        h77.add(test.indexOf("STIME = 77"));
	        h78.add(test.indexOf("STIM = 78"));
	        h79.add(test.indexOf("STIM = 79"));
	        h80.add(test.indexOf("STIM = 80"));
	        h81.add(test.indexOf("STIM = 81"));
	        h82.add(test.indexOf("STIME = 82"));
	        h83.add(test.indexOf("STIM = 63"));
	       
	        
	    	      
	        System.out.println(test.get(140));
	        String array[] = new String[1];              
			for(int i = 0; i < 1; i++)
			{
			  array[i] = test.get(140);
			}
		

			/*Displaying Array elements*/
			for(String k: array)
			{
				System.out.println(k); //contains the data now
			}
	        String[] ss = null;
			for(int i = 0; i < 1; i++)
			{
				 ss = array[i].toString().split(" ", 8); //break up the data
			}
			for(int i = 0; i < 8; i++)
			{
				System.out.println("Array: " + ss[i]); 
			}
	        double pressure;
	        pressure = Double.parseDouble(ss[0]);
	        System.out.println(pressure);
	        
	        
	        Calendar calendar = Calendar.getInstance();   
	    	     
	    	      int hour       = calendar.get(Calendar.HOUR_OF_DAY); 
	    	      int minute     = calendar.get(Calendar.MINUTE);
	    	      System.out.println(hour + ":"+ minute);
	    	    
	    	
	    	 InputStream is = new BufferedInputStream(new FileInputStream("output.txt"));
	    	    try {
	    	        byte[] c = new byte[1024];
	    	        int count = 0;
	    	        int readChars = 0;
	    	        boolean empty = true;
	    	        while ((readChars = is.read(c)) != -1) {
	    	            empty = false;
	    	            for (int i = 0; i < readChars; ++i) {
	    	                if (c[i] == '\n') {
	    	                    ++count;
	    	                }
	    	            }
	    	        }
	    	        System.out.println(count);
	    	      
	    	    } finally {
	    	        is.close();
	    	    }
		}
}

