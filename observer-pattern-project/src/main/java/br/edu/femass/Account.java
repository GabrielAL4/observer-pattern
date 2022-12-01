package br.edu.femass;
import java.util.ArrayList;

public class Account implements Subject {
    private String accountName;
    private ArrayList<Subscriber> followers;
    public Account(String accountName) {
        this.accountName = accountName;
        followers = new ArrayList<Subscriber>();
    }
    @Override
    public void registerObserver(Subscriber subscriber) {
        if(subscriber != null){
            this.followers.add(subscriber);
        }
        System.out.println(subscriber + " Started following " + accountName);
    }

    @Override
    public void unregisterObserver(Subscriber subscriber) {
        if(subscriber != null){
            this.followers.remove(subscriber);
        }
        System.out.println(subscriber + " Stopped following " + accountName);
    }

    @Override
    public void notifyAllObserver(String tweet) {
        for(Subscriber follower : followers)
            follower.update(accountName, tweet);
    }
    public void tweet(String tweet) {
        System.out.println(accountName + " has tweeted: " + tweet + "\n");
        notifyAllObserver(tweet);
    }
}
