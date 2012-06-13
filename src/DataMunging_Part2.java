import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class DataMunging_Part2
{
	public static int DEFAULT_BUFFER_SIZE = 1024;

	public static void main(String[] args) throws IOException
	{
		BufferedReader input = new BufferedReader(
		        new FileReader("football.dat"));

		String currentLine = "";
		String[] currentLineInput = null;
		int minDifference = Integer.MAX_VALUE;
		int currentDifference = Integer.MAX_VALUE;
		String minDifferenceTeamName = null;

		while(input.ready())
		{
			try
			{
				currentLine = input.readLine();
				currentLine = currentLine.trim().replaceAll(" +", " ");
				currentLineInput = currentLine.split(" ");
				System.out.println(currentLine);
				currentDifference = Math.abs(Integer
				        .valueOf(currentLineInput[6])
				        - Integer.valueOf(currentLineInput[8]));
				if(currentDifference < minDifference)
				{
					minDifference = currentDifference;
					minDifferenceTeamName = currentLineInput[1];
				}
			}catch(Exception e)
			{}
		}

		System.out.println("\n\n\nMinimum Goal difference: " + minDifference);
		System.out.println("Team name: " + minDifferenceTeamName);
	}
}
