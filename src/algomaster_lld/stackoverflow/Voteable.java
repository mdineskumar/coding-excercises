package algomaster_lld.stackoverflow;

public interface Voteable {

    public void vote(User user, int value);
    public int getVoteCount();
}


