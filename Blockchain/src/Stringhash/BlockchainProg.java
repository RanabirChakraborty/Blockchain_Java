package Stringhash;

public class BlockchainProg {

	public static void main(String[] args) {

		// hashing concept

		String today_work = "Today I have my Tech talk";
		int hashcode = today_work.hashCode();

		System.out.println("Today is " + today_work + ", which hashcode is " + hashcode);
	}
}