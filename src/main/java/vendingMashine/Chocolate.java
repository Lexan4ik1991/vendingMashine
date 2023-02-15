package vendingMashine;

public class Chocolate extends Product {
    private String recipe="";
    private Integer weight=0;
    public Chocolate(String name, Double price) {super(name, price);
    }

    public Chocolate(String name, Double price, String recipe,Integer weight) {
        this(name, price);
        this.recipe = recipe;
        this.weight = weight;
    }
    public String getRecipe() {
        return this.recipe;
    }

    public Integer getWeight() {
        return this.weight;
    }

    @Override
    public String toString(){
        return String.format("%s; recipe: %s; weight: %d gram", super.toString(), recipe, weight);
    }
}

