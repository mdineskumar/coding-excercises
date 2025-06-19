package core_java_udemy.garbagecollection;

public class GCDemo {
    int objId;
    GCDemo(int objId){
        this.objId = objId;
        System.out.println(objId + " Created");
    }

    public static void main(String[] args) {
        new GCDemo(1);
        new GCDemo(2);
        for (int i = 0; i < 100; i++) {
//            new GCDemo(i);
            System.gc();
        }

    }

    @Override
    protected void finalize() {
        System.out.println("finalized "+objId );

    }
}
