import java.net.*;

public class Launcher {
	
	public static void Main(String[] args) {
		
		/* we need to
		Get list of TIC categories
		
		Get ArrayList of Tics
		
		Get path to XML for run 1
		Construct JSON request for run 1
		Submit JSON request for run 1
		Save response for run 1
		
		Get path to XML for run 2
		Construct JSON request for run 1
		Submit JSON request for run 2
		Save response for run 2
		
		Iterate to next TIC
		*/
		
		
	File tics = new File("C:/code/numbers.txt");
	
		try {
			
			ArrayList<Integer> list = getArrayListOfNums(tics);
			for (int i=0; i < list.size(); i++){
						System.out.println(list.get(i));
						
			}
			
		}
		catch(Exception e){
            e.printStackTrace();
        }
    }

	
	
	}

		