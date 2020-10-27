package practice.concurrency.multithreading;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StrreamDriver {
	public static void main(String[] args) {
		Function<String,String> id = Function.identity();

		Stream<String> names = Stream.of("Kanika", "Sharma", "Ashu", "Ayush","Kanika", "Tarun", "Ashu" , "Ashu");
		
		
		
	}

}
