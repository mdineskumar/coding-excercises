package leetcode.hashtable;

public class MyHashMapDemo {
    public static void main(String[] args) {
        MyHashMap mhm = new MyHashMap();
//        mhm.put(100,4);
//        mhm.put(200,13);
//        mhm.get(200);
//        mhm.put(300,35);
//        mhm.put(278,23);
//        mhm.put(367,12);
//        mhm.put(156,45);
//        mhm.put(17,25);
//        mhm.put(89,156);
//        System.out.println(mhm);
//        mhm.remove(156);
//
//        System.out.println(mhm);
            mhm.put(1,1);
        System.out.println(mhm);
        mhm.put(2,2);
        int result = mhm.get(1);
        int result2 = mhm.get(3);
        mhm.put(2,1);
        int result3 = mhm.get(2);
        System.out.println(mhm);
        mhm.remove(2);
        System.out.println(mhm);
        int result4 = mhm.get(2);
        System.out.println(mhm);

    }
}
