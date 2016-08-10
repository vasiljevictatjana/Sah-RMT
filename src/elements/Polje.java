package elements;
enum Kolona
{
	a,
	b,
	c,
	d,
	e,
	f,
	g,
	h;


}
public class Polje 
{
	Figura figura;
	String red = "";
	Kolona kolona;
	
	public Polje(Figura figura , String red, Kolona kolona)
	{
		this.figura  = figura;
		this.red = red ;
		this.kolona = kolona;
		
	}
	public boolean postaviFiguru(Figura figura)
	{
		if (this.figura == null) 
		{

			this.figura = figura;	
			return true;
		}
		return false;
	}
	public void skloniFiguru()
	{
		this.figura = null;
		
	}
	
	 static public boolean pojediFiguru(Polje start,Polje finish,Tabla tabla)
	{
		if (finish.figura != null && start.figura !=null && start.figura.color!=finish.figura.color) 
		{
			
			if(finish.figura.color == "w") 
			{
				tabla.pojedeneCrne.add(finish.figura);
			}
			else {
				tabla.pojedeneBele.add(finish.figura);
			}
			finish.figura = start.figura;
			start.skloniFiguru();
			return true;
		}	
		return false;
	}
	
	public Figura selektujFiguru(Polje polje)
	{
		
		if (polje.figura!=null)
		{
			return polje.figura;
		}
		return null;
	}
}
