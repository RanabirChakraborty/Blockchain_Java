package Stringhash;

public class BlockchainProg {

	public static void main(String[] args) {

		// hashing concept

		String today = "Today I have my Tech talk";
		int hashcode = today.hashCode();

		System.out.println("Today is " + today + ", which hashcode is " + hashcode);
	}
}