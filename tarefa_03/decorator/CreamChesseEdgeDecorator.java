package tarefa_03.decorator;

import tarefa_03.CodimentDecorator;
import tarefa_03.Pizza;

public class CreamChesseEdgeDecorator extends CodimentDecorator{
    public CreamChesseEdgeDecorator(Pizza pizza){
        super(pizza);
    }
    @Override
    public double cost() {
        return super.cost()+1.20;
    }
    @Override
    public String getDescription() {
        return super.getDescription();
    }
}
