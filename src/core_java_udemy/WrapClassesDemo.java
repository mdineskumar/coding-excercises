package core_java_udemy;

public class WrapClassesDemo {

    public static void main(String[] args) {
        int x = 10;
        Integer y = Integer.valueOf(x);
        int z = y.intValue();


        byte m = 100;
        String n = Byte.toString(m);
        byte o = Byte.parseByte(n);

        long a = 1000;
        Long b = Long.valueOf(a); // primitive to object
        String c = b.toString(); //object to string
        Long d = Long.valueOf(c); // string to object

        long l = 1000;
        Long lObj = new Long(l);//deprecated

        String s = "2000";
        Long sObj  = new Long(s);
    }
}
