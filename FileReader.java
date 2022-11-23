import java.util.*;
import java.io.*;



public class FileReader {
	
		public static ArrayList<Integer> getArrayListOfNums (File tics) throws FileNotFoundException {
		Scanner s;
		ArrayList<Integer> ticlist = new ArrayList<Integer>();
		s = new Scanner(tics);
		while (s.hasNext()) {
						ticlist.add(Integer.parseInt(s.next()));
		}
		s.close();
		return ticlist;
		
		
	}
	}