package elements;

public class Igrac 
{
	String username;
	String password;
	int osvojeniPoeni;
	String ipAdresa;
	static final int port = 22220;
	
	public Igrac(String username, String password,int osvojeniPoeni,String ipAdresa) 
	{
		this.username=username;
		this.password=password;
		this.osvojeniPoeni = osvojeniPoeni;
		this.ipAdresa=ipAdresa;
	}
	
	public boolean noviIgrac(Igrac igrac)
	{
		//TODO database contains igrac?
		return false;
	}
}
