package tarefa_03.decorator;

import tarefa_03.CodimentDecorator;
import tarefa_03.Pizza;

public class TomatoDecorator extends CodimentDecorator{
    public TomatoDecorator(Pizza pizza){
        super(pizza);
    }
    @Override
    public double cost() {
        return super.cost();
    }
    @Override
    public String getDescription() {
        return super.getDescription();
    }
}
