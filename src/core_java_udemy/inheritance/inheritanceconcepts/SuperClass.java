package core_java_udemy.inheritance.inheritanceconcepts;

public class SuperClass {
    int x;
    SuperClass(){
        System.out.println("NO Arg SUperClass Constructor");
    }

    SuperClass(int x){
        this.x = x;
        System.out.println("One Arg SuperCLass COnstructor");
    }


}
