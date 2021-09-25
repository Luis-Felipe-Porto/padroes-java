package tarefa_03;

import tarefa_03.decorator.BaconDecoraton;
import tarefa_03.decorator.CreamChesseEdgeDecorator;
import tarefa_03.decorator.OreganoDecorator;
import tarefa_03.decorator.TomatoDecorator;
import tarefa_03.domain.Mozzarela;
import tarefa_03.domain.Pepperoni;

public class Pizzaiolo {
    public static void main(String[] args) {

        Pizza pizza1 = new Mozzarela();
        pizza1.setDescription("Pizza Mozzarella -- 11.90");
        Pizza pedido1 = new TomatoDecorator(pizza1);
        System.out.println(pedido1.getDescription());
        Pizza pedido2 = new CreamChesseEdgeDecorator(new TomatoDecorator(pizza1));
        
        Pizza pizza3 = new Pepperoni();
        pizza3.setDescription("Pizza Pepperoni --- 14.90");
        Pizza pedido3 = new CreamChesseEdgeDecorator(new TomatoDecorator(pizza3));
        System.out.println(pedido3.getDescription());
        Pizza pedido4 = new BaconDecoraton(new OreganoDecorator(pizza3));
        Pizza pedido5 = new TomatoDecorator(new BaconDecoraton(new OreganoDecorator(pizza3)));

    }
}
