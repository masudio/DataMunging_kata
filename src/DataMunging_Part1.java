import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;


public class DataMunging_Part1
{
	public static int DEFAULT_BUFFER_SIZE = 1024;
	
//	public static void main(String[] args) throws FileNotFoundException
//	{
//		BufferedInputStream input = new BufferedInputStream(new FileInputStream("weather.dat"));
//		String text = "";
//		byte[] buffer = new byte[DEFAULT_BUFFER_SIZE];
//		int bytesRead = 0;
//		
//		try
//        {
//	        while((bytesRead = input.read(buffer)) != -1)
//	        {
//	        	text = text.concat(new String(buffer));
//	        }
//        }
//		catch(IOException e)
//        {
//	        // TODO Auto-generated catch block
//	        e.printStackTrace();
//        }
//		
//		System.out.println(text);
//		
//		int start = text.indexOf("AvSLP\n");
//		int end = text.indexOf("mo");
//		text = text.substring(start + 7, end - 2);
//		
//		System.out.println("\n\n\n" + text);
//		
//		String[] lines = text.split("\n");
//		int maxSpread = Integer.MAX_VALUE;
//		int minSpreadDay = -1;
//		for(String string : lines)
//        {
//			string = string.trim().replaceAll(" +", " ");
//			System.out.println(string);
//	        String[] entries = string.split(" ");
//	        int currentSpread = Integer.MAX_VALUE;
//	        try
//	        {
//	        	currentSpread = Math.abs(Integer.valueOf(entries[1]) - Integer.valueOf(entries[2])); 
//	        
//	        	if(currentSpread < maxSpread)
//	        	{
//	        		maxSpread = currentSpread;
//	        		minSpreadDay = Integer.valueOf(entries[0]);
//	        	}
//	        }
//	        catch(Exception e)
//	        {}
//        }
//		System.out.println("\nMax Day: " + minSpreadDay);
}

//	}