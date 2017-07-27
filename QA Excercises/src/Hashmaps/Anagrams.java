package Hashmaps;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Anagrams {

	HashMap<String, ArrayList> map = new HashMap<String, ArrayList>();
	int index = 0;

	public static void main(String[] args) {
		Anagrams a = new Anagrams();

		try {
			a.readFile();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		int temp = 0;
		String pls = "";
        String temp_2 = "";
        
        for (String key : a.map.keySet()) {
            
        		if (a.map.get(key).size() > temp) {
                temp = a.map.get(key).size();
                
                pls = a.map.get(key).toString();
                temp_2 = key;
            }
        }

        System.out.println("Most common: "+temp_2 + "\nInstances: " + temp);
        
	}

	public String sortString(String s) {

		char[] letters = s.toCharArray();
		Arrays.sort(letters);
		String sorted = new String(letters);
		// System.out.println(sorted);
		return sorted;
	}

	public void readFile() throws IOException {
		try {

			BufferedReader br = new BufferedReader(new FileReader("wordFile-test"));
			String line = br.readLine();
			

			while (line != null) {
				String s = sortString(line);
				ArrayList a = map.get(s);

				if (a != null) {
					a.add(line);
				} else {
					a = new ArrayList();
					a.add(line);
					map.put(s, a); // the string as the key, arraylist as value
				}

				
				/*Iterator it = map.entrySet().iterator();

				while (it.hasNext()) {
					Map.Entry pair = (Map.Entry) it.next();
					Object key = pair.getKey();
					Object val = pair.getValue();
					
					// System.out.println(key + " = " + val);
					it.remove(); // avoids a ConcurrentModificationException
				}

				// words.add(line);
*/				
				line = br.readLine();
				index++;
			}

			// printArray(words);
			// sortList(words);

		} catch (FileNotFoundException e) {
			e.printStackTrace();
			System.out.println("File doesnt exist!");
		}
	}

	public void printArray(ArrayList words) {
		for (int i = 0; i < words.size(); i++) {
			System.out.println(words.get(i).toString());
		}
	}

}
