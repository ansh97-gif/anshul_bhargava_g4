package dsa.brackets;

import java.util.Stack;

public class BalancingBrackets {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input="([[{}]]))";
		boolean result=checkBrackets(input);
		if(result)
			System.out.println("The entered String has Balanced Brackets");
		else
			System.out.println("The entered Strings do not contain Balanced Brackets");

	}
	
	public static boolean checkBrackets(String s) {
		boolean res=false;
		Stack<Character> charStack=new Stack<>();
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)=='{' || s.charAt(i)=='(' || s.charAt(i)=='[') {
				charStack.push(s.charAt(i));
			}
			else if(s.charAt(i)=='}' || s.charAt(i)==')' || s.charAt(i)==']') {
			switch(s.charAt(i)) {
			case '}':
				if(!charStack.isEmpty()&&(char)charStack.peek()=='{')
					charStack.pop();
				else
					return false;
				break;
				
			case ')':
				if(!charStack.isEmpty()&&(char)charStack.peek()=='(')
					charStack.pop();
				else
					return false;
				break;
				
			case ']':
				if(!charStack.isEmpty()&&(char)charStack.peek()=='[')
					charStack.pop();
				else
					return false;
				break;
				
			default:
				continue;
				
				
			}
			}
			
		}
		if(charStack.isEmpty()) {
			
			return true;
		}
		return res;
	}

}
