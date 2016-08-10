package elements;

import java.util.ArrayList;

public class Tabla 
{
	ArrayList<Polje> polja;
	ArrayList<Figura> pojedeneBele;
	ArrayList<Figura> pojedeneCrne;
	ArrayList<Figura> beleFigure;
	ArrayList<Figura> crneFigure;

	public Tabla() {
		generateTable();
	}
	
	private void generateTable()
	{
		this.pojedeneBele = new ArrayList<>();
		this.pojedeneCrne = new ArrayList<>();
		//???
		this.beleFigure = new ArrayList<>();
		this.crneFigure = new ArrayList<>();
		this.polja = new ArrayList<>();
		
		
		for (int i = 1; i < 9; i++) 
		{
			polja.add(new Polje(null, i+"", Kolona.a));
			polja.add(new Polje(null, i+"", Kolona.b));
			polja.add(new Polje(null, i+"", Kolona.c));
			polja.add(new Polje(null, i+"", Kolona.d));
			polja.add(new Polje(null, i+"", Kolona.e));
			polja.add(new Polje(null, i+"", Kolona.f));
			polja.add(new Polje(null, i+"", Kolona.g));
			polja.add(new Polje(null, i+"", Kolona.h));
		}
		
		for (Polje polje : polja) 
		{
			if (polje.red.equals("2"))
			{ 				
				polje.postaviFiguru(new Figura("art/pieces/plain/WP.gif", "w", "p"));
			}
			
			if (polje.red.equals("7")) 
			{
				polje.postaviFiguru(new Figura("art/pieces/plain/BP.gif","b","p"));
				
			}
			//bele
			if(polje.red.equals("1"))
			{
				if (polje.kolona == Kolona.a||polje.kolona==Kolona.h) 
				{
					polje.postaviFiguru(new Figura("art/pieces/plain/WR.gif","w","r"));
				}
				if(polje.kolona == Kolona.b || polje.kolona == Kolona.g)
				{
					polje.postaviFiguru(new Figura("art/pieces/plain/WN.gif","w","n"));
				}
				if(polje.kolona==Kolona.c || polje.kolona == Kolona.f)
				{
					polje.postaviFiguru(new Figura("art/pieces/plain/WB.gif","w","b"));
				}
				if(polje.kolona==Kolona.d)
				{
					polje.postaviFiguru(new Figura("art/pieces/plain/WQ.gif","w","q"));
				}
				if(polje.kolona==Kolona.e)
				{
					polje.postaviFiguru(new Figura("art/pieces/plain/WK.gif","w","k"));
				}
				
			}
			//crne
			if(polje.red.equals("8"))
			{
				if (polje.kolona == Kolona.a||polje.kolona==Kolona.h)
				{
					polje.postaviFiguru(new Figura("art/pieces/plain/BR.gif","b","r"));
				}
				if(polje.kolona == Kolona.b || polje.kolona == Kolona.g)
				{
					polje.postaviFiguru(new Figura("art/pieces/plain/BN.gif","b","n"));
				}
				if(polje.kolona==Kolona.c || polje.kolona == Kolona.f)
				{
					polje.postaviFiguru(new Figura("art/pieces/plain/BB.gif","b","b"));
				}
				if(polje.kolona==Kolona.d)
				{
					polje.postaviFiguru(new Figura("art/pieces/plain/BQ.gif","b","q"));
				}
				if(polje.kolona==Kolona.e)
				{
					polje.postaviFiguru(new Figura("art/pieces/plain/BK.gif","b","k"));
				}
				
			}
		}
			
		for (Polje polje : polja) 
		{
			if (polje.figura==null) 
			{
				if(polje.kolona==Kolona.h)
				{
					System.out.println("*");
				}else {System.out.print("*");
				}
			}		
			else 
			{
				if(polje.kolona==Kolona.h)
				{
					System.out.println(polje.figura.name);
				}else {System.out.print(polje.figura.name);
				}
			}
		}
		
		
	}


}
