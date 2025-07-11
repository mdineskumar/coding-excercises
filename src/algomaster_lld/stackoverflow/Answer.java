package algomaster_lld.stackoverflow;

import java.util.Date;
import java.util.List;
import java.util.UUID;

public class Answer implements Voteable{
    String id;
    String content;
    Date createdDate;

    Question question;
    Boolean isAccepted;
    User author;
    List<Comment> comments;

    List<Vote> votes;

    public Answer(User user, Question question, String content) {
        this.id = UUID.randomUUID().toString();
        this.author = user;
        this.question = question;
        this.content = content;
    }

    public void addComment(String comment){

    }

    public void markAsAccepted(){

    }

    @Override
    public void vote(User user, int value) {

    }

    @Override
    public int getVoteCount() {
        return 0;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    public Question getQuestion() {
        return question;
    }

    public void setQuestion(Question question) {
        this.question = question;
    }

    public Boolean getAccepted() {
        return isAccepted;
    }

    public void setAccepted(Boolean accepted) {
        isAccepted = accepted;
    }

    public User getAuthor() {
        return author;
    }

    public void setAuthor(User author) {
        this.author = author;
    }

    public List<Comment> getComments() {
        return comments;
    }

    public void setComments(List<Comment> comments) {
        this.comments = comments;
    }

    public List<Vote> getVotes() {
        return votes;
    }

    public void setVotes(List<Vote> votes) {
        this.votes = votes;
    }

    @Override
    public String toString() {
        return "Answer{" +
                "id='" + id + '\'' +
                ", content='" + content + '\'' +
                ", createdDate=" + createdDate +
                ", question=" + question +
                ", isAccepted=" + isAccepted +
                ", author=" + author +
                ", comments=" + comments +
                ", votes=" + votes +
                '}';
    }
}
