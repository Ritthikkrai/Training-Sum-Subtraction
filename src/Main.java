public class Main {
    public static void main(String[] args) {

        Input input = new Input();
        input.setNumberA(1);
        System.out.println("Enter Number A : " + input.getNumberA());
        input.setNumberB(25);
        System.out.println("Enter Number B : " + input.getNumberB());

        Process process = new Process();
        System.out.println("A + B : " + input.getNumberA() +
                " + " + input.getNumberB() + " = " + process.getSumAB(input));
        System.out.println("A + A : " + input.getNumberA() +
                " + " + input.getNumberA() + " = " + process.sumAA(input));
        System.out.println("(B - A) : " + input.getNumberB() +
                " - " + input.getNumberA() + " = " + process.subtraction(input));
        System.out.println("(A + B) : (" + input.getNumberA() +
                " + " + input.getNumberB() + ") - " + input.getNumberB() + " = " + process.sumAndSub(input));
    }

}
