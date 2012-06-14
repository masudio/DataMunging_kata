import java.io.IOException;

public class DataMunging_Part2
{
	public void run() throws IOException
	{
		Utility utility = new Utility();
		utility.run("football.dat", "Minimum goal difference team name: %s\nMinimum goal difference: %d", 1, 6, 8);
	}
}
