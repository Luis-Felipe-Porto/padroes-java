package tarefa_03;

public abstract class CodimentDecorator extends Pizza{
    private Pizza decorPizza;

    public CodimentDecorator(Pizza pizza){
        this.decorPizza = pizza;
    }
    public double cost(){
        return this.decorPizza.cost();
    }
    public String getDescription(){
        return decorPizza.getDescription();
    }
}
