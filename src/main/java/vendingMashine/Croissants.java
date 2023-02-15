package vendingMashine;

public class Croissants extends Product{
    String filling = "";
    public Croissants(String name, Double price) {
        super(name, price);
    }

    public Croissants(String name, Double price, String filling) {
        this(name, price);
        this.filling = filling;
    }
    @Override
    public String toString(){
        return String.format("%s filling = %s  " , super.toString(),filling);
    }
}
