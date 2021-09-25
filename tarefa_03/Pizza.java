package tarefa_03;

public abstract class Pizza {
    private String description;

    public void setDescription(String description) {
        this.description = description;
    }
    public String getDescription() {
        return description;
    }
    public double cost(){
        return 0.0;
    }
}
