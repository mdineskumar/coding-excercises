package core_java_udemy.immutable.string;

public class StringReversal {
    public static String firstWay(String actual){
        String reversed = "";
        for(int i = actual.length() - 1;i >= 0; i-- ){
            reversed += actual.charAt(i);
        }

        return reversed;
    }

    public static String secondWay(String actual){
        byte[] s1 = actual.getBytes();
        byte[] s2 = new byte[s1.length];

        for(int i = 0 ; i < s1.length;i++){
            s2[i] = s1[s1.length - 1 - i];
        }
        return new String(s2);
    }
    public static void main(String[] args) {
        String str = "Dineskumar";
        System.out.println("Reverse: "+StringReversal.firstWay(str));
        System.out.println("Reverse second: "+StringReversal.secondWay(str));
    }
}
