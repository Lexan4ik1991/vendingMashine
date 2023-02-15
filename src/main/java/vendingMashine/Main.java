package vendingMashine;

import vendingMashine.*;
//На основе кода с урока добавить еще один класс продукта, (Молоко, шоколад ,и т.п.,
// можно добавить несколько классов), они должны наследоваться от класса Product,
// надо переопределить метод toString и попробовать включить эти классы в VendingMachine,
// вывести список товаров из VendingMachine
//

public class Main {


    public static void main(String[] args) {

        vendingMashine store = new vendingMashine();

        store.addProduct(new Product("Lays" , 123.45))
                .addProduct(new Product("fanta" , 98.76))
                .addProduct(new Product("fan" , 43.21))
                .addProduct(new Product("fan" , 43.21))
                .addProduct(new Beer("alcoholfree" , 67.89))
                .addProduct(new Beer("notbeer" , 67.89, 99))
                .addProduct(new CursedProducts("milk" , 56.65, 7))
                .addProduct(new Chocolate("AlpenGold",80.00,"milk",50))
                .addProduct(new Chocolate("Milka",95.50,"milk with nuts",65))
                .addProduct(new Croissants("Croissant",35.0,"ham and cheese"));



        System.out.println(store);

        System.out.println("searching for ay's");
        System.out.println(store.findProduct("ys"));


        System.out.println("buying Lay's" );
        store.buy("Lays", 123.45);
        System.out.println(store);

        System.out.println("buying fan's" );
        store.buy("fan", 43.21);
        System.out.println(store);
        System.out.println("buying a's" );
        store.buy("fan", 4.1);
        System.out.println(store);
        System.out.println("buying a's" );
        store.buy("milk", 56.65);
        System.out.println(store);
        System.out.println("Buying AlpenGold");
        store.buy("AlpenGold", 80.00);
        System.out.println(store);
        System.out.println("Buying Milka");
        store.buy("Milka", 80.00);
        System.out.println(store);
        System.out.println("searching for Milka");
        System.out.println(store.findProduct("Milka"));
        System.out.println("searching for AlpenGold");
        System.out.println(store.findProduct("AlpenGold"));








    }


}
