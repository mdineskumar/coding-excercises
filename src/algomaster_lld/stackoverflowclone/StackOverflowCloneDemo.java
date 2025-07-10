package algomaster_lld.stackoverflowclone;

import algomaster_lld.stackoverflowclone.entities.User;

import java.util.Arrays;

public class StackOverflowCloneDemo {
    public static void main(String[] args) {
        StackOverflowClone stackOverflowClone = StackOverflowClone.getInstance();
        //create alice
        User alice = stackOverflowClone.createUser("Alice", "alice@gmail.com");

        //create bob
        User bob = stackOverflowClone.createUser("Bob", "bob@gmail.com");

        //create charlie
        User charlie = stackOverflowClone.createUser("Charlie", "charlie@gmail.com");

        //alice post question
        stackOverflowClone.postQuestion(alice.getId(),"What is polymorphism","", Arrays.asList("oop","java"));
        //bob answer alice's question

        //charlie comment on alice's question

        //bob vote on alice's question

        //charlie vote on bob's answer

        //alice mark bob's answer as accepted

        //search

        // questions from particular users

        System.out.println(stackOverflowClone);
    }
}
