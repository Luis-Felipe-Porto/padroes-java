package tarefa_05.bingo_system.domain.observer;

import tarefa_05.bingo_system.domain.BingoCard;
import tarefa_05.bingo_system.domain.BingoSystem;

public interface BingoCardObserver {
    public BingoCard notify(BingoSystem bingoSystem);
}
