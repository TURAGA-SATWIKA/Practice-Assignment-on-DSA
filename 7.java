import java.util.*;
class Solution{
    private static boolean matchParenthisis(String str) {
        Stack<Character> st = new Stack<Character>();
        char[] ch = str.toCharArray();
        for (char c : ch) {
            if (c == '{' || c == '[' || c == '(') {
                st.push(c);
            } else {
                if (c == ']' && !st.isEmpty() && st.pop() == '[') {
                    continue;
                } else if (c == '}' && !st.isEmpty() && st.pop() == '{') {
                    continue;
                } else if (c == ')' && !st.isEmpty() && st.pop() == '(') {
                    continue;
                } else {
                    return false;
                }
            }
        }

        return st.isEmpty();
    }
	
	public static void main(String []argh)
	{
		Scanner sc = new Scanner(System.in);
		
		while (sc.hasNext()) {
			String input=sc.next();
            //Complete the code
            System.out.println(matchParenthisis(input));
		}
        
		
	}
}



    
