package binarysearchtree;

public class BinaryTree<K extends Comparable<K>> {

	BinaryNode<K> root;

	public void add(K key) {
		this.root = this.addRecursively(root, key);
	}

	
	private BinaryNode<K> addRecursively(BinaryNode<K> current, K key) {
		if (current == null) {
			return new BinaryNode<K>(key);
		}
		int compareResult = key.compareTo(current.key);
		if (compareResult == 0) {
			return current;
		}
		if (compareResult < 0) {
			current.left = addRecursively(current.left, key);
		} else {
			current.right = addRecursively(current.right, key);
		}
		return current;
	}

	public int getSize() {
		return getSizeRecursively(root);
	}

	private int getSizeRecursively(BinaryNode<K> current) {
		return current == null ? 0 : 1 + getSizeRecursively(current.left) + getSizeRecursively(current.right);
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		if (root.left != null) {
			builder.insert(0, root.left+"<--");
		}
		builder.append(root);
		if (root.right != null) {
			builder.append("-->"+root.right);
		}
		return builder.toString();
	}


	public BinaryNode<K> search( K key) {
		BinaryNode toFindNode = findNode(root,key);
		return toFindNode;
	}


	private BinaryNode findNode(BinaryNode<K> root, K key) {

		int compareResult = key.compareTo(root.key);
		if (compareResult == 0) {
			return root;
		}

		
		if (compareResult > 0) {
			 return findNode(root.left ,  key);
		} 
		if(compareResult < 0){
			 return findNode(root.left ,  key);
		}
		return null;
	}


	
}