package br.edu.femass;

public class Follower implements Subscriber {
    private String followerName;

    public Follower(String followerName){
        this.followerName = followerName;
    }

    @Override
    public void update(String accountName, String tweet) {
        System.out.println(followerName + " has received " + accountName + "'s tweet: " + tweet);
    }

    @java.lang.Override
    public java.lang.String toString() {
        return "Follower{" + followerName + "}";
    }

}