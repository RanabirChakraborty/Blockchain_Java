package Listhash;

import java.util.Arrays;

public class BlockchainProg {

	public static void main(String[] args) {
		
		//hashing concept
		
		String [] bucket1 = {"mango", "banana", "orange"};
		String [] bucket2 = {"mango", "banana", "orange"};
		
		int bucket1hash = Arrays.hashCode(bucket1);
		int bucket2hash = Arrays.hashCode(bucket2);
		
		System.out.println ("bucket1 hashcode" + bucket1hash + "bucket2 hashcode" + bucket2hash);
	}

}
