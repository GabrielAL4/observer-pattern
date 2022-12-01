package br.edu.femass;

public class Main {
    public static void main(String[] args) {
        //Criando as contas
        Account matheus = new Account("Matheus");
        Account gabriel = new Account("Gabriel");

        //Criando os seguidores de Matheus
        Follower Gustin = new Follower("@Gustin");
        Follower Mefiu = new Follower("@Baby");
        Follower Tozin = new Follower("@Tozin");

        //Criando os seguidores de Gabriel
        Follower Baby = new Follower("@Mefiu");
        Follower Adryan = new Follower("@Adryan");
        Follower Dudu = new Follower("@Pedro");

        //Adicionando os seguidores a lista de 'seguidos' de Matheus
        matheus.registerObserver(Gustin);
        matheus.registerObserver(Mefiu);
        matheus.registerObserver(Tozin);

        //Adicionando os seguidores a lista de 'seguidos' de Gabriel
        gabriel.registerObserver(Baby);
        gabriel.registerObserver(Adryan);
        gabriel.registerObserver(Dudu);

        //Gerando um publicação no Twitter
        matheus.tweet("guys dont play league of legends, once you start you wont be able to do anything else... help");
        gabriel.tweet("Twitter is purging a lot of spam/scam accounts right now, so you may see your follower count drop");

        //Retirando um seguidor da lista de 'seguidos' de Matheus
        matheus.unregisterObserver(Gustin);
    }
}
