package provaINGSE;

import static org.junit.Assert.assertEquals;

import java.lang.reflect.Array;
import java.util.ArrayList;

import org.joda.time.LocalDateTime;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import logica.MyListUtil;

public class TestMyListUtil {

	private static MyListUtil l;
	
	static ArrayList<Integer> list1 ;
	static ArrayList<Integer> list;
	static LocalDateTime currentDateAndTime;
	@BeforeClass
	public static void preparaTest() {
			System.out.println("Ora inizio= ");
			currentDateAndTime = LocalDateTime.now();
			System.out.println(currentDateAndTime);

			l=new MyListUtil();
			
			list1 = new ArrayList<Integer>();
			
			 list = new ArrayList<Integer>();
			
			list.add(1);
			list.add(20);
			list.add(30);
			list.add(12);
			list.add(4);
		//Print orario inizio;
	}
	@Test
	public   void testOrdinaCrescente()
	{
		 
		list1.add(1);
		list1.add(4);
		list1.add(12);
		list1.add(20);
		
		list1.add(30);
		assertEquals(list1,  l.ordina(list, "Crescente"));
		 list1.clear();
	}
	@Test
	public void testOrdinaDecrescente()
	{
		list1.add(30);
		list1.add(20);
		list1.add(12);
		list1.add(4);
		list1.add(1);
		assertEquals(list1,  l.ordina(list,  "Decrescente"));

		
		
	}
		
	@AfterClass
	public static void fineTest()
	{
		//stampa orario fine
		System.out.println("Ora fine");
		currentDateAndTime = LocalDateTime.now();
		System.out.println(currentDateAndTime);
	}
}
