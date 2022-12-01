package br.edu.femass;

public class Main {
    public static void main(String[] args) {
        Account amirkhan = new Account("Amirkhan");
        Account selenaGomez = new Account("Selena Gomez");

        Follower amar = new Follower("Amar");
        Follower juhi = new Follower("Juhi");
        Follower urja = new Follower("Urja");
        Follower malay = new Follower("Malay");
        Follower ankit = new Follower("Ankit");
        Follower harsh = new Follower("Harsh");

        amirkhan.registerObserver(amar);
        amirkhan.registerObserver(juhi);
        amirkhan.registerObserver(urja);

        selenaGomez.registerObserver(malay);
        selenaGomez.registerObserver(ankit);
        selenaGomez.registerObserver(harsh);

        amirkhan.tweet("Hey guys, came across this interesting trailer, check it out.");
        selenaGomez.tweet("Good Morning..!!");

        amirkhan.unregisterObserver(juhi);

        amirkhan.tweet("Teaser of Secret Superstar has been released..!!");
    }
}
