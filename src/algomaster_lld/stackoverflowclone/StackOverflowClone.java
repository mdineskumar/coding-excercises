package algomaster_lld.stackoverflowclone;


import algomaster_lld.stackoverflowclone.entities.Question;
import algomaster_lld.stackoverflowclone.entities.Tag;
import algomaster_lld.stackoverflowclone.entities.User;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class StackOverflowClone {
    private static StackOverflowClone instance = new StackOverflowClone();

    Map<String, User> users;
    Map<String, Question> questions;

    private StackOverflowClone(){
        users = new ConcurrentHashMap<>();
        questions = new ConcurrentHashMap<>();
    }

    static StackOverflowClone getInstance(){
        return instance;
    }

    public User createUser(String userName, String email){
        User user = new User(userName,email);
        users.put(user.getId(),user);

        return user;
    }

    @Override
    public String toString() {
        return "StackOverflowClone{}";
    }

    public Question postQuestion(String userId, String title, String content, List<String> tagsStr) {
        User user = users.get(userId);
        List<Tag> tags = new ArrayList<>();
        for(String tagStr:tagsStr){
            tags.add(new Tag(tagStr));
        }
        Question question = new Question(user,title,content,tags);
        System.out.println("Q: "+question+" is created");
        questions.put(question.getId(),question);

        return question;

    }
}
