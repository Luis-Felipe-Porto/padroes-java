package tarefa_03.decorator;

import tarefa_03.CodimentDecorator;
import tarefa_03.Pizza;

public class OreganoDecorator extends CodimentDecorator{
    public OreganoDecorator(Pizza pizza){
        super(pizza);
    }
    @Override
    public double cost() {
        return super.cost()+0.50;
    }
    @Override
    public String getDescription() {
        return super.getDescription();
    }
}
