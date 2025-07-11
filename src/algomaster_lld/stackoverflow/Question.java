package algomaster_lld.stackoverflow;

import java.util.Date;
import java.util.List;
import java.util.UUID;

public class Question implements Commentable, Voteable{
    String id;
    String title;
    String content;
    Date createdDate;

    User author;

    //I think no need
    List<Answer> answers;
    List<Comment> comments;
    List<Tag> tags;
    List<Vote> votes;

    public Question(User user, String title, String content, List<Tag> tags){
        this.id = UUID.randomUUID().toString();
        this.author = user;
        this.title = title;
        this.content = content;
        this.tags = tags;

    }

    public void addTag(User user, String value){

    }

    public void addAnswer(String answer){

    }

    @Override
    public void addComment(Comment comment) {

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

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
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

    public User getAuthor() {
        return author;
    }

    public void setAuthor(User author) {
        this.author = author;
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

    public List<Tag> getTags() {
        return tags;
    }

    public void setTags(List<Tag> tags) {
        this.tags = tags;
    }

    public List<Vote> getVotes() {
        return votes;
    }

    public void setVotes(List<Vote> votes) {
        this.votes = votes;
    }

    @Override
    public String toString() {
        return "Question{" +
                "id='" + id + '\'' +
                ", title='" + title + '\'' +
                ", content='" + content + '\'' +
                ", createdDate=" + createdDate +
                ", author=" + author +
                ", answers=" + answers +
                ", comments=" + comments +
                ", tags=" + tags +
                ", votes=" + votes +
                '}';
    }
}
