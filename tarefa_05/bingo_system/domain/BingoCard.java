package tarefa_05.bingo_system.domain;

import java.util.Random;

import tarefa_05.bingo_system.domain.observer.BingoCardObserver;

//@Observer

public class BingoCard implements BingoCardObserver {
    private int cardId;
    private int[] numbers;
    static final int NUMBER_VERIFY = -1;

    public BingoCard(int cardId, int numberOfSlots, int maxNumber) {
        this.cardId = cardId;
        Random random = new Random();
        this.numbers = new int[numberOfSlots];
        for (int i = 0; i < numbers.length; i++) {
            int numeroRandomCard = random.nextInt(maxNumber);
           numbers[i] = numeroRandomCard;
           //numbers[i] = NUMBER_VERIFY;
        }

    }

    @Override
    public BingoCard notify(BingoSystem bingoSystem) {
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == bingoSystem.getNumberDrawn()) {
                numbers[i] = NUMBER_VERIFY;
            }   
        }
        return this;
        
    }

    public boolean didWin() {
        // verificar se toda cartela tem -1, caso sim cartela vencedora
        int indicesWithVerifyInCard = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == NUMBER_VERIFY) {
                indicesWithVerifyInCard++;
            }
        }
        return (indicesWithVerifyInCard == this.numbers.length);
    }

    public int getCardId() {
        return cardId;
    }

    @Override
    public String toString() {
        StringBuilder sBuilder = new StringBuilder();
        sBuilder
        .append("\n\n----CARTELA[")
        .append(this.cardId).append("]-----\n\n");
        for (int i = 0; i < numbers.length; i++) {
            sBuilder
            .append(" | ")
            .append(this.numbers[i])
            .append(" | ");
        }
        sBuilder
        .append("\n\n-------FIM----------\n\n");
        return sBuilder.toString();
    }

}
