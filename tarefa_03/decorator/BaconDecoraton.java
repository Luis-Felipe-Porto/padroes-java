package tarefa_03.decorator;

import tarefa_03.CodimentDecorator;
import tarefa_03.Pizza;

public class BaconDecoraton extends CodimentDecorator{
    public BaconDecoraton(Pizza pizza){
        super(pizza);
    }
    @Override
    public double cost() {

        return super.cost()+0.80;
    }
    @Override
    public String getDescription() {
        return super.getDescription() +"--"+this.cost();
    }
}
