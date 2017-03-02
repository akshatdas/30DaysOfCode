import java.util.*;
import java.io.*;

public class Solution {
	Stack<Character> myStack = new Stack<>();
	Queue<Character> myQueue = new LinkedList<>();

	void pushCharacter(char ch) {
		myStack.push(ch);
	}

	void enqueueCharacter(char ch) {
		myQueue.add(ch);
	}

	char popCharacter() {
		return myStack.pop();
	}

	char dequeueCharacter() {
		return myQueue.poll();
	}
}