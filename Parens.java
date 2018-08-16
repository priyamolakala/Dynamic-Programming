package DynamicProgramming;

import java.util.ArrayList;

public class Parens {
	
	public void addParens(ArrayList<String> list, int leftrem, int rightrem,char[] str, int index) {
		if(leftrem > rightrem || leftrem < 0) {
			return;
		}
		if(leftrem == 0 && rightrem == 0) {
			list.add(String.copyValueOf(str));
		}
		else {
			str[index] = '(';
			addParens(list, leftrem-1, rightrem, str, index+1);
			
			str[index] = ')';
			addParens(list,leftrem, rightrem-1,str,index+1);
		}
	}
	
	public ArrayList<String> parens(int count){
		ArrayList<String> list = new ArrayList<>();
		char[] str = new char[count*2];
		addParens(list,count,count,str,0);
		return list;
	}
	
	public static void main(String[] main) {
		Parens p = new Parens();
		System.out.println(p.parens(2));
	}

}
