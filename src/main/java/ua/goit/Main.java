package ua.goit;

public class Main {
    public static void main(String[] args) {
        SumCalculator sumCalculator = new SumCalculator();
        System.out.println(sumCalculator.sum(1));
        System.out.println(sumCalculator.sum(3));
        try{
            System.out.println(sumCalculator.sum(-5));
        }catch (IllegalArgumentException e){
            System.out.println("Imput should be number > 0 !");
        }
    }
}
