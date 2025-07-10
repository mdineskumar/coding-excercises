package algomaster_lld.stackoverflow;

import core_java_udemy.access_modifiers.p2.C;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class StackOverflow {
    Map<String, User> users;
    Map<String, Question> questions;
    Map<String ,Answer> answers;
    Map<String, Tag> tags;

    public StackOverflow() {
        this.users = new ConcurrentHashMap<>();
        this.questions = new ConcurrentHashMap<>();
        this.answers =new ConcurrentHashMap<>();
        this.tags = new ConcurrentHashMap<>();
    }

    public User createUser(String username, String email){
        if (username.isEmpty() || email.isEmpty()){
            System.out.println("username and email should not empty");
        }
        User user = new User(username, email);
        this.users.put(user.getId(),user);
        return  user;
    }

    public Question askQuestion(String userId, String title, String content, List<String> questionTags){
        User user = this.users.get(userId);
        List<Tag> tagArrayList = new ArrayList<>();
        for(String tagStr: questionTags){
            Tag tag = new Tag(tagStr);
            tagArrayList.add(tag);
            tags.put(tag.getId(),tag);
        }
        Question question = new Question(user, title,content,tagArrayList);
        questions.put(question.getId(),question);
        return question;
    }

    public Answer answerQuestion(String userId, String questionId, String content){
        User user = this.users.get(userId);
        Question question = this.questions.get(questionId);
        Answer answer = new Answer(user,question,content);
        answers.put(answer.getId(), answer);
        return answer;
    }

    public Comment addComment(String userId, Commentable commentable, String content){
        User user = this.users.get(userId);
        Comment comment = new Comment(content,user);
        commentable.addComment(comment);
        return comment;
    }

    public void vote(User user, Voteable vote, int value){

    }

    public void acceptAnswer(Answer answer){

    }

    public void searchQuestions(String query){

    }

    public void getQuestionsByUser(User user){

    }

    public void assignReputation(User user, int value){

    }


}
