package designpattern.singleton;

import java.io.*;

public class SingletonTest {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        DateUtil dateUtil1 = DateUtil.getInstance();
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(new File("/Users/dines/Documents/cse_resources/coding/src/designpattern/singleton/dateUtil.ser")));
        oos.writeObject(dateUtil1);

        //DateUtil dateUtil2 = DateUtil.getInstance();
        DateUtil dateUtil2;
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(new File("/Users/dines/Documents/cse_resources/coding/src/designpattern/singleton/dateUtil.ser")));
        dateUtil2 = (DateUtil) ois.readObject();

        oos.close();
        ois.close();

        System.out.println(dateUtil1 == dateUtil2);
    }
}
