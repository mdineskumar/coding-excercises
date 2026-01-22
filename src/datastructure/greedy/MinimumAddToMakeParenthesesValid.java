package datastructure.greedy;

public class MinimumAddToMakeParenthesesValid {

    public int minAddToMakeValid(String s) {
        int open = 0;
        int result = 0;
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == '('){
               open++;
            }else{
                if(open > 0) {
                    open--;
                }else{
                    result++;
                }

            }
        }
        return open+result;
    }

    public static void main(String[] args) {
        MinimumAddToMakeParenthesesValid solution = new MinimumAddToMakeParenthesesValid();

        System.out.println(solution.minAddToMakeValid("(()"));
        System.out.println(solution.minAddToMakeValid("((("));


    }
}
