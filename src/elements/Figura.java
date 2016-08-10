package elements;

public class Figura 
{
	String slika = "";
	String color = "";
	String name = "";
	
	public Figura(String slika, String color, String name)
	{
		this.slika = slika;
		this.name = name;
		this.color = color;
		
	}
	
	public String Slika()
	{
		return this.slika;
	}
	public String Name()
	{
		return this.name;
		
	}
	public String Color()
	{
		return this.color;
		
	}
	
}
