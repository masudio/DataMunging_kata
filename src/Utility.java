import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;


public class Utility
{
	public void run(String filename,String outputText,int nameColumn,
	        int firstSpreadColumn,int secondSpreadColumn)
	        throws FileNotFoundException,IOException
	{
		BufferedReader input = new BufferedReader(new FileReader(filename));

		String currentLine = "";
		String[] currentLineInput = null;
		int minDifference = Integer.MAX_VALUE;
		int currentDifference = Integer.MAX_VALUE;
		String minDifferenceDate = null;

		while(input.ready())
		{
			try
			{
				currentLine = input.readLine();
				currentLine = currentLine.trim().replaceAll(" +", " ");
				currentLineInput = currentLine.split(" ");
				currentDifference = Math.abs(Integer
				                .valueOf(currentLineInput[firstSpreadColumn])
				                - Integer
				                        .valueOf(currentLineInput[secondSpreadColumn]));
				if(currentDifference < minDifference)
				{
					minDifference = currentDifference;
					minDifferenceDate = currentLineInput[nameColumn];
				}
			}catch(Exception e)
			{}
		}

		System.out.println(String.format(outputText, minDifferenceDate, minDifference));
	}

}
