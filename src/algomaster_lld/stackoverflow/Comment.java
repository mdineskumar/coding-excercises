package algomaster_lld.stackoverflow;

import java.util.Date;

public class Comment {
    String id;
    String content;
    Date createdDate;
    User author;

    public Comment(String content, User user){
        this.content = content;
        this.author = user;
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

    public User getAuthor() {
        return author;
    }

    public void setAuthor(User author) {
        this.author = author;
    }

    @Override
    public String toString() {
        return "Comment{" +
                "id='" + id + '\'' +
                ", content='" + content + '\'' +
                ", createdDate=" + createdDate +
                ", author=" + author +
                '}';
    }
}
