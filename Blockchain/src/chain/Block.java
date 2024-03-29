package chain;

import java.util.Arrays;

public class Block {
	
	private String[] data;
	private int blockHash;
	private int previousBlockHash;
	
	
	@Override
	public String toString() {
		return "block [data=" + Arrays.toString(data) + ", blockHash=" + blockHash + ", previousBlockHash="
				+ previousBlockHash + "]";
	}

	// Here we'll generate the hashcode for the present block.
	public Block(String[] data, int previousBlockHash) {
		super();
		this.data = data;
		this.previousBlockHash = previousBlockHash;
		this.blockHash = Arrays.hashCode(new int[] {Arrays.hashCode(data), this.previousBlockHash});
	}
	
	public String[] getData() {
		return data;
	}
	public void setData(String[] data) {
		this.data = data;
	}
	public int getBlockHash() {
		return blockHash;
	}
	public void setBlockHash(int blockHash) {
		this.blockHash = blockHash;
	}
	public int getPreviousBlockHash() {
		return previousBlockHash;
	}
	public void setPreviousBlockHash(int previousBlockHash) {
		this.previousBlockHash = previousBlockHash;
	}
	
	
}
