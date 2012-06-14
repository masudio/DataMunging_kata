import java.io.IOException;

public class DataMunging_Part1
{
	public void run() throws IOException
	{
		Utility utility = new Utility();
		utility.run("weather.dat", "Date of minimum spread: %s\nMinimum spread: %d", 0, 1, 2);
	}

}