package elements;

import java.util.LinkedList;

public class Igra 
{
	Tabla tabla;
	Igrac igracBeli;
	Igrac igracCrni;
	LinkedList<String> potezi = new LinkedList<>(); 
	
	public Igra(Tabla tabla, Igrac igracBeli, Igrac igracCrni) 
	{
		this.tabla = new Tabla();
		this.igracBeli = igracBeli;
		this.igracCrni = igracCrni;
	}
	
	public void pomeriFiguru(Polje poljeStart, Polje poljeFinish )
	{
		Figura figura = poljeStart.selektujFiguru(poljeStart);
		switch (figura.name) {
		case "p":
		{
			if (pravilaPijuna(poljeStart,poljeFinish,tabla)) 
			{
				
			}
		}
			break;
		case "r":
		{
			if (pravilaTopa(poljeStart,tabla)) 
			{
				
			}
		}
			
			break;

		case "n":
		{
			if (pravilaKonja(poljeStart,tabla)) 
			{
				
			}
		}
			break;
			
		case "b":
		{
			if (pravilaLovca(poljeStart,tabla)) 
			{
				
			}
		}
			break;
	
		case "q":
		{
			if (pravilaKraljice(poljeStart,tabla)) 
			{
				
			}
		}
	
			break;
		case "k":
		{
			if (pravilaKralja(poljeStart,tabla)) 
			{
				
			}
		}
	
			break;
		
		default:
			
			break;
		}
	}

	private boolean pravilaKralja(Polje polje, Tabla tabla) {
		// TODO Auto-generated method stub
		return false;
	}

	private boolean pravilaKraljice(Polje polje, Tabla tabla) {
		// TODO Auto-generated method stub
		return false;
	}

	private boolean pravilaLovca(Polje polje, Tabla tabla) {
		// TODO Auto-generated method stub
		return false;
	}

	private boolean pravilaTopa(Polje polje, Tabla tabla) {
		// TODO Auto-generated method stub
		return false;
	}

	private boolean pravilaKonja(Polje polje, Tabla tabla) {
		// TODO Auto-generated method stub
		return false;
	}

	private boolean pravilaPijuna(Polje poljeStart, Polje poljeFinish, Tabla tabla) {
		if(poljeStart.figura.color.equals("w"))
		{
			if (poljeStart.kolona==poljeFinish.kolona)	
			{			
				if((poljeStart.red+1)==poljeFinish.red && poljeFinish.figura==null)
				{
					if(poljeFinish.red.equals("8"))
					{
						poljeFinish.postaviFiguru(poljeStart.figura);
						poljeStart.figura = null;
						poljeFinish.figura.name = "q";
						poljeFinish.figura.slika = "art/pieces/plain/WQ.gif";
					}
						return true;
				}
			}
			if ((poljeStart.kolona.ordinal()==poljeFinish.kolona.ordinal()+1||poljeStart.kolona.ordinal()==poljeFinish.kolona.ordinal()-1)
					&&(poljeStart.red+1)==poljeFinish.red) 
			{
				return Polje.pojediFiguru(poljeStart, poljeFinish, tabla);
			}
		}
		return false;
	}
	
}
