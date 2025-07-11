package algomaster_lld.stackoverflowclone.entities;

import java.util.UUID;

public class User {
    private String id;
    private String username;
    private String email;
    private int reputationScore;

    public User(String username, String email) {
        this.id = UUID.randomUUID().toString();
        this.username = username;
        this.email = email;
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

    @Override
    public String toString() {
        return "User{" +
                "id='" + id + '\'' +
                ", username='" + username + '\'' +
                ", email='" + email + '\'' +
                ", reputationScore=" + reputationScore +
                '}';
    }
}
