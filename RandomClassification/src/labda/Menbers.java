package labda;

import java.util.ArrayList;
import java.util.List;

import labda.thread.SingleMember;

public class Menbers {
   
	List<SingleMember> componenti ;
	public Menbers(String...strings) {
		
		 componenti = new ArrayList<SingleMember>();
		
		 for(String i:strings)
		 {
			 componenti.add(new SingleMember(i));
		 }
		
		
	}
	public void start()
	{
		for(SingleMember p:componenti)
		{
			p.start();
		}
	}
	
}
