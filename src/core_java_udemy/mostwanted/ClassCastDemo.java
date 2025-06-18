package core_java_udemy.mostwanted;

public class ClassCastDemo {

    public static void main(String[] args) {
        Object object = new Object();
        if (object instanceof String){
            String s = (String) object;
        }
    }
}
