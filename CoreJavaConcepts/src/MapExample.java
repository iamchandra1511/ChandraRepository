import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.concurrent.ConcurrentHashMap;


class Country 
{
	 
	 String name;
	 long population;
	 
	 public Country(String name, long population) //parameterized constructor
	 {
		  super();
		  this.name = name;    //copying local variable value into instance variable
		  this.population = population;
	 }
	 
	 public String getName() 
	 {
		 return name;
	 }
	 
	 public void setName(String name) 
	 {
		 this.name = name;
	 }
	 
	 public long getPopulation() 
	 {
		 return population;
	 }
	 
	 public void setPopulation(long population)
	 {
		 this.population = population;
	 }
	 
	@Override
	public int hashCode()   //predefined method given in Object class
	{
		 final int prime = 31;
		 int result = 1;
		 result = prime * result + ((name == null) ? 0 : name.hashCode());
		 return result;
	}
	
	@Override
	 public boolean equals(Object obj)  //predefined method
	 {
	  
		  Country other = (Country) obj;
		   if (name.equalsIgnoreCase((other.name)))
		   return true;
		  return false;
	 }
	  
	}
	 

public class MapExample 
{
	 Map map=new HashMap();    //hashmap object
	 TreeMap pairs = new TreeMap();  //treemap object
	 Hashtable ht;
	 
	
		
	
	
	public void HashMapWithintegers()
	{
		    map.put(1,"Amit");    //adding data to hashmap
		    map.put(5,"Rahul");  
		    map.put(2,"Jai");  
		    map.put(6,"Amit");  
	  
		    Set set=map.entrySet();  
		    Iterator itr=set.iterator();  
		    while(itr.hasNext())
		    {  
		          
		        Map.Entry entry=(Map.Entry)itr.next();  
		        System.out.println(entry.getKey()+" "+entry.getValue());  
		    }  
	}
	
	
	public void ShowHashTable()
	{
		ht=new Hashtable();    //adding data to hashtable
		ht.put("1001", "Madhav");
		ht.put("1002", "Rishi");
		ht.put("1003","pranesh");
		ht.put("1004", "pranav");
		ht.put("", "Madhav");
		
		Collection c=ht.values();  //getting values from hashtable into collection
		Iterator i=c.iterator();
		
		while(i.hasNext())
		{
			System.out.println(i.next());   //displaying values from hashtable with collection
		}
		
		
		Set s=ht.keySet();
		i=s.iterator();
		
		while(i.hasNext())
		{
			System.out.println(ht.get(i.next()));
		}
		
	}
	
	
	public void ShowConcurrentHashMap()
	{
		Country india=new Country("India",1000);
        Country japan=new Country("Japan",10000);
        Country france=new Country("France",2000);
        Country russia=new Country("Russia",20000);
          
        ConcurrentHashMap<Country,String> countryCapitalMap=new ConcurrentHashMap<Country,String>(); //concurrenthashmap object creation
        countryCapitalMap.put(india,"Delhi");    //adding data to concurrenthashmap
        countryCapitalMap.put(japan,"Tokyo");
        countryCapitalMap.put(france,"Paris");
        countryCapitalMap.put(russia,"Moscow");
          
        Iterator countryCapitalIter=countryCapitalMap.keySet().iterator();
        while(countryCapitalIter.hasNext())
        {
            Country countryObj=(Country)countryCapitalIter.next();
            String capital=countryCapitalMap.get(countryObj);
            System.out.println(countryObj.getName()+"----"+capital);
            }
        }
  
	
	public static void main(String args[])
	{
		MapExample ce=new MapExample();
		ce.HashMapWithintegers();
		ce.ShowHashTable();
		ce.ShowConcurrentHashMap();
		
	}
	
}
