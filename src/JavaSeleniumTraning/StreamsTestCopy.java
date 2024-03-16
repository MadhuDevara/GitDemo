package JavaSeleniumTraning;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.testng.annotations.Test;

public class StreamsTestCopy {

	@Test
		public void streamCollect()
		{
		 List<String> list = Stream.of("Abhijeet","Don","Alekhya","Adam","Rama")
		 .filter(s->s.endsWith("a")).map(s->s.toUpperCase()).collect(Collectors.toList());
			System.out.println(list.get(0));
		
			//
			List<Integer>values=Arrays.asList(3,2,27,5,1,9,7);
			//Print unique number from this array 
			//Sort the array-3rd index -1,2,3,5,7,9
			// it only unique not duplicates
			
			//values.stream().distinct().forEach(s->System.out.println(s));
			List<Integer> li=values.stream().distinct().sorted().collect(Collectors.toList());
			System.out.println(li.get(2));
		

	}

}
