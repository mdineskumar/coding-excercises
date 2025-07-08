package algomaster_lld.stackoverflow;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class User {
    private String id;
    private String username;
    private String email;
    private int reputationScore;
    private List<Question> questions;
    private List<Answer> answers;
    private List<Comment> comments;

    public User(String username, String email) {
        this.id = UUID.randomUUID().toString();
        this.username = username;
        this.email = email;
        this.answers = new ArrayList<>();
        this.questions = new ArrayList<>();
        this.comments = new ArrayList<>();
    }

    public void askQuestion(String title, String content, List<Tag> tags){


    }

    public void answerQuestion(Question question, String content){

    }

    public void addComment(Commentable commentable, String content){

    }

    public void updateReputation(int value){

    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getReputationScore() {
        return reputationScore;
    }

    public void setReputationScore(int reputationScore) {
        this.reputationScore = reputationScore;
    }

    public List<Question> getQuestions() {
        return questions;
    }

    public void setQuestions(List<Question> questions) {
        this.questions = questions;
    }

    public List<Answer> getAnswers() {
        return answers;
    }

    public void setAnswers(List<Answer> answers) {
        this.answers = answers;
    }

    public List<Comment> getComments() {
        return comments;
    }

    public void setComments(List<Comment> comments) {
        this.comments = comments;
    }

    @Override
    public String toString() {
        return "User{" +
                "id='" + id + '\'' +
                ", username='" + username + '\'' +
                ", email='" + email + '\'' +
                ", reputationScore=" + reputationScore +
                ", questions=" + questions +
                ", answers=" + answers +
                ", comments=" + comments +
                '}';
    }
}
