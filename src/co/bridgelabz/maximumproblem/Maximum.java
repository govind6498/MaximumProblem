package co.bridgelabz.maximumproblem;
import java.util.*;
public class Maximum {
	public static <E extends Comparable<E>> void findMaximum(E first, E second, E third) {

		E maximum = first;

		if(first.compareTo(second) == 1 ) {
			if(first.compareTo(third) == 1) {
				maximum = first;
			}
			else {
				maximum = third;
			}
		}
		else if(second.compareTo(first) == 1 ) {
			if(second.compareTo(third) == 1) {
				maximum = second;
			}
			else {
				maximum = third;
			}
		}
		System.out.println("Maximum: "+maximum);
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter First Integer: ");
		Integer firstIntegerNumber = Integer.valueOf(sc.nextInt());
		System.out.print("Enter Second Integer: ");
		Integer secondIntegerNumber = Integer.valueOf(sc.nextInt());
		System.out.print("Enter Third Integer: ");
		Integer thirdIntegerNumber = Integer.valueOf(sc.nextInt());
		findMaximum(firstIntegerNumber, secondIntegerNumber, thirdIntegerNumber);
		sc.nextLine();

		System.out.print("Enter First Float: ");
		Float firstFloatNumber = Float.valueOf(sc.nextFloat());
		System.out.print("Enter Second Float: ");
		Float secondFloatNumber = Float.valueOf(sc.nextFloat());
		System.out.print("Enter Third Float: ");
		Float thirdFloatNumber = Float.valueOf(sc.nextFloat());
		findMaximum(firstFloatNumber, secondFloatNumber, thirdFloatNumber);
		sc.nextLine();

		System.out.print("Enter First String: ");
		String firstString = String.valueOf(sc.nextLine());
		System.out.print("Enter Second String: ");
		String secondString = String.valueOf(sc.nextLine());
		System.out.print("Enter Third String: ");
		String thirdString = String.valueOf(sc.nextLine());
		findMaximum(firstString, secondString, thirdString);
		sc.close();
	}
}

