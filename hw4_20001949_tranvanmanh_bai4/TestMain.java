package hw4_20001949_tranvanmanh_bai4;

import hw4_20001949_tranvanmanh_stack.*;
import java.util.Scanner;

public class TestMain {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String text = in.nextLine();
        char[] tokens = text.toCharArray();        
        in.close();
        if (checkExpression(tokens))
        	System.out.println(calculateExpression(tokens));
        else 
        	System.out.println("Lỗi biểu thức");
        
	}
	//xét tính hợp lệ
	public static boolean checkExpression(char[] tokens) {
		ArrayStack<Character> brackets = new ArrayStack<Character>();
		int check = 1;
		for (int i = 0; i < tokens.length; i++) {
			if (tokens[i] == '(') {
				brackets.push(tokens[i]);
			}
			if (tokens[i] == ')') {
				if (brackets.isEmpty() || brackets.pop() != '(' ) {
					check = 0;
					break;
				}
			}
		}
		if (check == 0) return false;
		return true;
	}

	public static int calculateExpression(char[] tokens) {
	    LinkedStack<Integer> operand = new LinkedStack<Integer>();
	    LinkedStack<Character> operator = new LinkedStack<Character>();
	 
	    for (int i = 0; i < tokens.length; i++) {
	       if (tokens[i] == ' ')
	           continue;
	       if (tokens[i] >= '0' && tokens[i] <= '9') {
	           StringBuffer sbuf = new StringBuffer();
	           while (i < tokens.length && tokens[i] >= '0' && tokens[i] <= '9') 
	                sbuf.append(tokens[i++]);
	           operand.push(Integer.parseInt(sbuf.toString()));
	           i--;
	       }

	       else if (tokens[i] == '(')
	    	   operator.push(tokens[i]);
	       else if (tokens[i] == ')') {
	                while (operator.top() != '(')
	                	operand.push(applyOperator(operator.pop(), operand.pop(), operand.pop()));
	                operator.pop();
	       }
	       else if (tokens[i] == '+' || tokens[i] == '-' || tokens[i] == '*' || tokens[i] == '/') {
	                while (!operator.isEmpty() && hasPrecedence(tokens[i], operator.top())) 
	                	operand.push(applyOperator(operator.pop(), operand.pop(), operand.pop()));
	                operator.push(tokens[i]);
	                
	       }
	    }
	    //tính toán chính
	    while (!operator.isEmpty()) 
	    	operand.push(applyOperator(operator.pop(), operand.pop(), operand.pop()));
	        
	    return operand.pop();
	    
	}
		//mức độ độ ưu tiên
	    public static boolean hasPrecedence(char op1, char op2) {
	        if (op2 == '(' || op2 == ')')
	            return false;
	        if ((op1 == '*' || op1 == '/') && (op2 == '+' || op2 == '-'))
	            return false;
	        else
	            return true;
	    }
	    //tính toán với toán tử
	    public static int applyOperator(char operator, int b, int a) {
	        switch (operator) {
	        case '+':
	            return a + b;
	        case '-':
	            return a - b;
	        case '*':
	            return a * b;
	        case '/':
	            if (b == 0) 
	            	throw new UnsupportedOperationException("Không thể chia 0");
	            return a / b;
	        }
	        return 0;
	    }
	 	
}

