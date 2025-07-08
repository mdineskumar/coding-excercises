package algomaster_lld.stackoverflow;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StackoverFlowDemo {
    public static void main(String[] args) {
        StackOverflow stackOverflow = new StackOverflow();
        //create users
        User alice = stackOverflow.createUser("Alice","alice@gmail.com");
        User bob = stackOverflow.createUser("Bob","bob@gmail.com");
        User charlie = stackOverflow.createUser("Charlie","charlie@gmail.com");

        //Alice post question
        Question javaQuestion = stackOverflow.askQuestion(alice.getId(),
                "What is polymorphism?","Explain polymorphism, " +
                        "their usecases and implementation",
                Arrays.asList("oops","java"));

        //Bob answer ALice's question
        Answer bobAnswer = stackOverflow.answerQuestion(bob.getId(), javaQuestion.getId(), "Object can take multiple forms.");


        //Charlie comment on question
        Comment comment = stackOverflow.addComment(charlie.getId(), (Commentable) bobAnswer,"Great Question!");



    }
}
