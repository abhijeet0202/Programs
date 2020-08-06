package gaylemcdowell.Trees;

import java.util.ArrayList;

class PrefixTree {
	char data;
	boolean isEnd;
	ArrayList<PrefixTree> child;

	public PrefixTree() {
		child = new ArrayList<PrefixTree>();
		isEnd = false;
	}

	public PrefixTree(char ch) {
		data = ch;
		child = new ArrayList<PrefixTree>();
		isEnd = false;
	}
}

public class Trie {

	PrefixTree root;

	/** Initialize your data structure here. */
	public Trie() {
		root = new PrefixTree();
	}

	/** Inserts a word into the trie. */
	public void insert(String word) {
        
		PrefixTree temp = root;
		int wordLength = word.length();
		boolean isFound = false;

		for (int i = 0; i < wordLength; i++) {
			char ch = word.charAt(i);
			isFound = false;
			for (PrefixTree node : temp.child) {
				if (ch == node.data) {
					temp = node;
					isFound = true;
					break;
				}
			}
			if (!isFound) {
				PrefixTree obj = new PrefixTree(ch);
				temp.child.add(obj);
				temp = obj;
			}
		}
		temp.isEnd = true;
		System.out.println();

	}

	/** Returns if the word is in the trie. */
	public boolean search(String word) {
		 if(root.child.isEmpty()){
	            return false;
	        }
			PrefixTree temp = root;
			int wordLength = word.length();

			for (int i = 0; i < wordLength; i++) {
				char ch = word.charAt(i);
	            boolean isFound =false;
				for (PrefixTree node : temp.child) {
					if (ch == node.data) {
	                    isFound = true;
						temp = node;
	                    break;
					}
				}
	            if(!isFound){
	                return false;
	            }
			}
			if(temp.isEnd != true) {
				return false;
			}
			return true;
	}

	/**
	 * Returns if there is any word in the trie that starts with the given prefix.
	 */
	public boolean startsWith(String prefix) {
		 if(root.child.isEmpty()){
	            return false;
	        }
	        PrefixTree temp = root;
			int wordLength = prefix.length();

			for (int i = 0; i < wordLength; i++) {
				char ch = prefix.charAt(i);
	             boolean isFound =false;
				for (PrefixTree node : temp.child) {
					if (ch == node.data) {
						temp = node;
	                    isFound= true;
	                     break;
					}
				}
	             if(!isFound){
	                return false;
	            }
			}
			
			return true;
	}

	public static void main(String[] args) {
		Trie obj = new Trie();
		
		obj.insert("app");
		obj.insert("apple");
		obj.insert("beer");
		obj.insert("jam");
		obj.insert("rental");
		obj.insert("add");
		System.out.println(obj.search("beer"));
		// boolean param_3 = obj.startsWith(prefix);
	}
}

/**
 * Your Trie object will be instantiated and called as such:
 * 
 */