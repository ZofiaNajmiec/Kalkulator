package kodillakalkulator.kalkulator;

public class Calculator {
    public int addAToB(int a, int b) {
        return a + b;
    }

    public int substractAFromB(int a, int b) {
        return a - b;
    }

    public static void main(String args[]) {
        Calculator calculator = new Calculator();

        int result = calculator.addAToB(49, 3);
        int result2 = calculator.substractAFromB(80, 20);

        System.out.println("Wynik dodawania to: " + result);
        System.out.println("Wynik odjemowania to: " + result2);
    }
}