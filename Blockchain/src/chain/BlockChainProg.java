package chain;

import java.util.ArrayList;

public class BlockChainProg {

	public static void main(String[] args) {

		// demonstarte a series of blocks in a chain

		ArrayList<Block> blockChain = new ArrayList<Block>();

		// first Block
		String[] initialValues = { "X has $20, Y has $10" };
		Block firstBlock = new Block(initialValues, 0);
		int previousBlockHash = 0;
		if (previousBlockHash != 0) {
			System.out.println("You have changed something in the block.");
		} else {
			blockChain.add(firstBlock);
			System.out.println("First Block is" + firstBlock.toString());
		}

		// second Block

		String[] secondValues = { "X gives Y $5. X has $15, Y has $15" };
		Block secondBlock = new Block(secondValues, firstBlock.getBlockHash());
		if (firstBlock.getBlockHash() != -1567449644) {
			System.out.println("You have changed something in the block.");
		} else {
			blockChain.add(secondBlock);
			System.out.println("Second Block is" + secondBlock.toString());
		}

		// third Block

		String[] thirdValues = { "Y gives X $10. X has $25, Y has $5" };
		Block thirdBlock = new Block(thirdValues, secondBlock.getBlockHash());
		if (secondBlock.getBlockHash() != 695200409) {
			System.out.println("You have changed something in the block.");
		} else {
			blockChain.add(thirdBlock);
			System.out.println("third Block is" + thirdBlock.toString());
		}

		// print the whole blockchain
		System.out.println("The blockChain is" + blockChain.toString());

	}

}
