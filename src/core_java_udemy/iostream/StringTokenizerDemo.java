package core_java_udemy.iostream;
import java.util.StringTokenizer;
public class StringTokenizerDemo {
    public static void main(String[] args) {
        //break string into multiple tokesn
        String s = "You,are,the,creator,of,your,destiny";

//        StringTokenizer st = new StringTokenizer(s);
//        StringTokenizer st = new StringTokenizer(s,",");
        StringTokenizer st = new StringTokenizer(s,",",false);

        while(st.hasMoreTokens()){
            String token = st.nextToken();
            System.out.println(token);
        }
    }
}
