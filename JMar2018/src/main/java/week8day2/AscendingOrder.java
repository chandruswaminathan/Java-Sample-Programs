package week8day2;

import java.util.LinkedList;
import java.util.List;

public class AscendingOrder {

	public static void main(String[] args) {
		int number = 45690123;

		List<Integer> numbers = new LinkedList<>(); // a LinkedList is not backed by an array
		for (int i = number; i > 0; i /= 10)
		    numbers.add(i % 10);
		numbers.stream().sorted().forEach(System.out::print);

	}

}
