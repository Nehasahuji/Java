package Stack;

import java.util.Stack;

public class StackDemo {

	public static void main(String args[]) {

		Stack<String> colorStack = new Stack<String>();
		colorStack.push("blue");
		colorStack.push("black");
		colorStack.push("green");
		colorStack.push("pink");
		colorStack.push("orange");

		for (String s : colorStack) {
			System.out.println(s);
		}

		int location = colorStack.search("green");
		System.out.println(location);
	}
}
