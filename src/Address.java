import java.util.ArrayList;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
public class Address {

	public static void main(String[] args)
	throws FileNotFoundException
	{
		
		Scanner file = new Scanner(new File("GettysburgAddress.txt"));
		
		ArrayList<String> word = new ArrayList<String>();
		
		while(file.hasNext())
		{
			word.add(file.next());
		}
		
		for(String words : word)
		{
			System.out.print(words + " ");
		}
		
		for(String length : word)
		{
			String longest = word.set(0, length);
			if(word.size() >> longest)
		}
	}

}
