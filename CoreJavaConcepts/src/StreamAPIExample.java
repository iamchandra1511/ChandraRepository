import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Stream;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

public class StreamAPIExample 
{
    public void StreamWithCollections() 
    {

    	// created collection of string type
        Collection<String> collection = Arrays.asList("JAVA", "J2EE", "Spring", "Hibernate");  
        Stream<String> stream2 = collection.stream();
        Iterator i=stream2.iterator(); //iterator allows us to display the values from collections
        
        while(i.hasNext())
        {
        	
        }
        
        stream2.forEach(System.out::println);  //Dispay all the values from the stream 

        List<String> list = Arrays.asList("JAVA", "J2EE", "Spring", "Hibernate");
        Stream<String> stream3 = list.stream();
        stream3.forEach(System.out::println);

        Set<String> set = new HashSet<>(list);
        Stream<String> stream4 = set.stream();
        stream4.forEach(System.out::println);
    }
    public void StreamWithArrays()
    {
    	Stream<String> streamOfArray = Stream.of("a", "b", "c");
        streamOfArray.forEach(System.out::println);

        // creating from existing array or of a part of an array:
        String[] arr = new String[] { "a", "b", "c" };
        Stream<String> streamOfArrayFull = Arrays.stream(arr);
        streamOfArrayFull.forEach(System.out::println);

        Stream<String> streamOfArrayPart = Arrays.stream(arr, 1, 3);
        streamOfArrayPart.forEach(System.out::println);
    }
    public void StreamwithPrimitives()
    {
    	IntStream intStream = IntStream.range(1, 3);
        intStream.forEach(System.out::println);

        LongStream longStream = LongStream.rangeClosed(1, 3);
        longStream.forEach(System.out::println);

        Random random = new Random();
        DoubleStream doubleStream = random.doubles(3);
        doubleStream.forEach(System.out::println);
    }
    public void DisplayValuesOneByOne()
    {
    	 Stream<Integer> stream = Stream.of(1,2,3,4,5,6,7,8,9);
         stream.forEach(p -> System.out.println(p));
    }
    public void CollectorExample()
    {
    	System.out.println("Collector Example");
    	List<Integer> list = new ArrayList<Integer>();
        for(int i = 1; i< 10; i++){
            list.add(i);
        }
        Stream<Integer> stream = list.stream();
        List<Integer> evenNumbersList = stream.filter(i -> i%2 == 0).collect(Collectors.toList());
        System.out.print(evenNumbersList);
    }
    public void StreamWithFilterExample()
    {
    	List<String> memberNames = new ArrayList<>();
    	memberNames.add("Amitabh");
    	memberNames.add("Shekhar");
    	memberNames.add("Aman");
    	memberNames.add("Rahul");
    	memberNames.add("Shahrukh");
    	memberNames.add("Salman");
    	memberNames.add("Yana");
    	memberNames.add("Lokesh");
    	
    	memberNames.stream().filter((s) -> s.startsWith("A"))
        .forEach(System.out::println);
    }
    public void StreamWithmapExample()
    {
    	List<String> memberNames = new ArrayList<>();
    	memberNames.add("Amitabh");
    	memberNames.add("Shekhar");
    	memberNames.add("Aman");
    	memberNames.add("Rahul");
    	memberNames.add("Shahrukh");
    	memberNames.add("Salman");
    	memberNames.add("Yana");
    	memberNames.add("Lokesh");
    	memberNames.stream().filter((s) -> s.startsWith("A"))
        .map(String::toUpperCase)
        
        .forEach(System.out::println);
    	
    	//for(int i=1;i<=10;i++)
    	memberNames.stream(memberNames.)
    }
    public void StreamWithSortExample()
    {
    	List<String> memberNames = new ArrayList<>();
    	memberNames.add("Amitabh");
    	memberNames.add("Shekhar");
    	memberNames.add("Aman");
    	memberNames.add("Rahul");
    	memberNames.add("Shahrukh");
    	memberNames.add("Salman");
    	memberNames.add("Yana");
    	memberNames.add("Lokesh");
    	memberNames.stream().sorted()
        .map(String::toUpperCase)
        .forEach(System.out::println);
    	
    }
    public void StreamWithCollectExample()
    {
    	List<String> memberNames = new ArrayList<>();
    	memberNames.add("Amitabh");
    	memberNames.add("Shekhar");
    	memberNames.add("Aman");
    	memberNames.add("Rahul");
    	memberNames.add("Shahrukh");
    	memberNames.add("Salman");
    	memberNames.add("Yana");
    	memberNames.add("Lokesh");
    	List<String> memNamesInUppercase = memberNames.stream().sorted()
                .map(String::toUpperCase)
                .collect(Collectors.toList());

         System.out.print(memNamesInUppercase);
    }
    public void StreamWithCountExample()
    {
    	List<String> memberNames = new ArrayList<>();
    	memberNames.add("Amitabh");
    	memberNames.add("Shekhar");
    	memberNames.add("Aman");
    	memberNames.add("Rahul");
    	memberNames.add("Shahrukh");
    	memberNames.add("Salman");
    	memberNames.add("Yana");
    	memberNames.add("Lokesh");
    	
    	long totalMatched = memberNames.stream()
                .filter((s) -> s.startsWith("A"))
                .count();

        System.out.println(totalMatched);

    }
    public void StreamWithReduceExample()
    {
    	List<String> memberNames = new ArrayList<>();
    	memberNames.add("Amitabh");
    	memberNames.add("Shekhar");
    	memberNames.add("Aman");
    	memberNames.add("Rahul");
    	memberNames.add("Shahrukh");
    	memberNames.add("Salman");
    	memberNames.add("Yana");
    	memberNames.add("Lokesh");
    	
    	
    	Optional<String> reduced = memberNames.stream()
                .reduce((s1,s2) -> s1 + "#" + s2);

reduced.ifPresent(System.out::println);
    }
    public void StreamWithParllelismExample()
    {
    	 List<Integer> list = new ArrayList<Integer>();
         for(int i = 1; i< 10; i++){
             list.add(i);
         }
         //Here creating a parallel stream
         Stream<Integer> stream = list.parallelStream();  
         Integer[] evenNumbersArr = stream.filter(i -> i%2 == 0).toArray(Integer[]::new);
         System.out.print(evenNumbersArr);
    }
    public static void main(String args[])
    {
    	StreamAPIExample sae=new StreamAPIExample();
    	sae.StreamWithArrays();
    	sae.StreamWithCollections();
    	sae.StreamwithPrimitives();
    	sae.DisplayValuesOneByOne();
    	sae.CollectorExample();
    	sae.StreamWithFilterExample();
    	sae.StreamWithReduceExample();
    	sae.StreamWithParllelismExample();
    	sae.StreamWithSortExample();
    	sae.StreamWithmapExample();
    	sae.StreamWithCollectExample();
    	sae.StreamWithCountExample();
    }
}