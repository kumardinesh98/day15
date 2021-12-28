package binarysearchtree;

public class BinaryNode<K extends Comparable<K>> {

	K key;
	BinaryNode<K> left;
	BinaryNode<K> right;

	public BinaryNode(K key) {
		this.key = key;
		this.left = null;
		this.right = null;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("MyBinaryNode{key=" + key + "}");
		/*
		 * if (left != null) { builder.insert(0, "MyBinaryNode{key=" + left.key +
		 * "}<--"); } if (right != null) { builder.append("-->MyBinaryNode{key=" +
		 * right.key + "}"); }
		 */
		return builder.toString();
	}
}