package delete;

public class WrapperClass {
    public static void main(String[] args) {
        int x = 100;
        Integer y = Integer.valueOf(x);
        int z = y.intValue();

        byte b  =100;
        String s = Byte.toString(b);
        byte c = Byte.parseByte(s);
        Integer.parseInt(s);

        long l = 1000;
        Long lObj = Long.valueOf(l);
        String lObjString = lObj.toString();
        Long lString = Long.valueOf(lObjString);

    }
}
