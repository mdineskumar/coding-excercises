package core_java_udemy.iostreamsecond.stringtokenize;

import java.util.StringTokenizer;

public class StringTokenizerDemo {
    public static void main(String[] args) {
        String s = "You,are,the,creator,of,your,destiny";
        StringTokenizer st = new StringTokenizer(s,",",true);

        while(st.hasMoreTokens()) {
            String token = st.nextToken();
            System.out.println(token);
        }

    }
}
