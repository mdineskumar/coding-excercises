package leetcode.hashtable;

import java.util.Arrays;

public class MaxNoOfBalloons {

    public int maxNumberOfBalloons(String text) {
        String balloon_str = "balloon";
        int instance = 0;
        int[] visited = new int[text.length()];

        for(int i=0; i < balloon_str.length();i++){
            char c = balloon_str.charAt(i);
            int index = text.indexOf(c);

            if(index == -1) {
                return 0;
            }else{
                visited[index] = -1; //already taken
            }
        }

        System.out.println("Visited: "+ Arrays.toString(visited));

        instance++;

        return instance;
    }

    public static void main(String[] args) {
        MaxNoOfBalloons maxNoOfBalloons = new MaxNoOfBalloons();
        System.out.println("nlaebolko: "+maxNoOfBalloons.maxNumberOfBalloons("nlaebolko"));
        System.out.println("loonbalxballpoon: "+maxNoOfBalloons.maxNumberOfBalloons("loonbalxballpoon"));
        System.out.println("leetcode: "+maxNoOfBalloons.maxNumberOfBalloons("leetcode"));

    }
}
