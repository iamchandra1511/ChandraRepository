import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamFilterExample 
{
	
	
	List<String> data = Arrays.asList("java", "not", "in", "use");
	
	public void CreateFilterStream()
	{
		Stream<String>s=data.stream();
		Stream<String>s1=s.filter(p->!"not".equals(p));
		s1.forEach(p1->System.out.println(p1));
	
	}
	public void CreateSortStream()
	{
		Stream<String>s=data.stream();
		Stream<String>s2=s.sorted();
		Stream<String>s3=s2.filter(p->p.startsWith("n"));
		Stream<String>s4=s3.map(String::toUpperCase);
		s4.forEach(p1->System.out.println(p1));
		
		
	}
	public void CreateListStream()
	{
		Stream<String>s1=data.stream();
		List<String>s2=s1.collect(Collectors.toList());
		System.out.println(s2);
	}
	public static void main(String args[])
	{
		StreamFilterExample sfe=new StreamFilterExample();
		sfe.CreateFilterStream();
		sfe.CreateSortStream();
		sfe.CreateListStream();
	}

}


