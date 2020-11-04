package logica;


import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

import org.joda.time.LocalDate;
import org.joda.time.LocalDateTime;

public class MyListUtil {

	//non so se vuole un ordinamento fatto da funzione oppure fatto maunalmente, io lo faccio manunalmente 
	//so che non è efficiente , ma credo che non posso andare a vedere come si setta il compartore(che non ricordo)
   ArrayList<Integer> l = new ArrayList<Integer>();
   int tmp=0;
   
   public  List<Integer> ordina (ArrayList<Integer> l, String verso )
   {
	   if(verso.equals("Decrescente"))
	   {
		   for(int i=0;i<l.size();i++)
		   {
			   for(int j=0;j<l.size();j++)
			   {
				   if(l.get(i)>l.get(j))
				   {
					   tmp=l.get(j);
					   l.set(j, l.get(i));
					   l.set(i, tmp);
				   }
			   }
		   }
	   }if(verso.equals("Crescente"))
	   {
		   for(int i=0;i<l.size();i++)
		   {
			   for(int j=0;j<l.size();j++)
			   {
				   if(l.get(i)<l.get(j))
				   {
					   tmp=l.get(j);
					   l.set(j, l.get(i));
					   l.set(i, tmp);
				   }
			   }
		   }
	   }
	   
	return l;
	   
   }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			MyListUtil m =new MyListUtil();
			ArrayList<Integer > l= new ArrayList<Integer>();
			l.add(1);
			l.add(3);
			l.add(10);
			l.add(21);
			System.out.println(m.ordina(l, "Decrescente")); 
			System.out.println(m.ordina(l, "Crescente")); 
			
			 

	}

}
