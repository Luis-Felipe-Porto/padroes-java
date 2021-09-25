package tarefa_05.bingo_system.domain;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import tarefa_05.bingo_system.domain.observer.BingoCardObserver;

public class BingoSystem {
    private static BingoSystem uniqueInstance;
    private List <BingoCardObserver> bingoCards;
    private int numberDrawn;
    private boolean gameEnded;

    private BingoSystem(){
        this.bingoCards = new ArrayList<>();
    }
    public static BingoSystem getInstance(){
        uniqueInstance = new BingoSystem();
        return uniqueInstance;
    }
    public void startBingo(int maxNumber){
        Random random = new Random();
        numberDrawn = random.nextInt(maxNumber);
        this.notifyBingCardObserver();
    }
    public String bingo(String message){
        return "\n\n PARABENS "+ message + " GANHOOUU!!\n\n";
        
    }
    public void notifyBingCardObserver(){
        this.bingoCards.forEach(bingoCard -> {
            BingoCard nBingoCard = bingoCard.notify(this);
            if(nBingoCard.didWin()){
                  this.gameEnded = true;
                  System.out.println(bingo(Integer.toString(nBingoCard.getCardId())));
                return;        
            }
        });
    }
    public void subscribe(BingoCardObserver bObserver){
        this.bingoCards.add(bObserver);
    }
    public int getNumberDrawn() {
        return numberDrawn;
    }
    public boolean getGameEnded(){
        return this.gameEnded;
    }

}
