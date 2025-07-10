package algomaster_lld.stackoverflowclone.entities;

import java.util.Date;
import java.util.List;
import java.util.UUID;

public class Question {
    private String id;
    private User author;
    private String title;
    private String content;
    private Date createdDate;

    private List<Tag> tags;

    public Question(User author,String title, String content,  List<Tag> tags) {
        this.author = author;
        this.title = title;
        this.tags = tags;
        this.content = content;
        this.createdDate = new Date();
        this.id = UUID.randomUUID().toString();
    }

    @Override
    public String toString() {
        return "Question{" +
                "id='" + id + '\'' +
                ", author=" + author +
                ", title='" + title + '\'' +
                ", createdDate=" + createdDate +
                ", tags=" + tags +
                '}';
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public User getAuthor() {
        return author;
    }

    public void setAuthor(User author) {
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    public List<Tag> getTags() {
        return tags;
    }

    public void setTags(List<Tag> tags) {
        this.tags = tags;
    }
}
