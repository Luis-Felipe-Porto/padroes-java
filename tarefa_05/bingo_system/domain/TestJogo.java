package tarefa_05.bingo_system.domain;

public class TestJogo {
    public static void main(String[] args) {
        final int  NUM_RODADA_CARTELA = 30;
        BingoSystem bsys = BingoSystem.getInstance();
        
        BingoCard bCard1 = new BingoCard(111, 5, 50);
        BingoCard bCard2 = new BingoCard(112, 5, 50);
        BingoCard bCard3 = new BingoCard(113, 5, 50);
        BingoCard bCard4 = new BingoCard(114, 5, 50);
        BingoCard bCard5 = new BingoCard(115, 5, 50);

        bsys.subscribe(bCard1);
        bsys.subscribe(bCard2);
        bsys.subscribe(bCard3);
        bsys.subscribe(bCard4);
        bsys.subscribe(bCard5);

        /* SORTEANDO  PEDRAS DE BINGO  */
        for (int i = 1; i < NUM_RODADA_CARTELA; i++) {
            bsys.startBingo(i);    
            if(bsys.getGameEnded() == true){
                break;
                
            }else if(i==NUM_RODADA_CARTELA-1){
                System.out.println("\n\n***$$$ PREMIO ACUMULADO NAO TEVE GANHANDOR $$$***\n\n");      
            }
        }
        /* Imprimindo Cartela */
        System.out.println(bCard1.toString());
        System.out.println(bCard2.toString());
        System.out.println(bCard3.toString());
        
        
    }
}
