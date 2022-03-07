public class Main {
    public static void main(String[] args) {
        System.out.println("式を入力してください");
        double inputNum1 = new java.util.Scanner(System.in).nextDouble();
        String inputOpe = new java.util.Scanner(System.in).nextLine();
        double inputNum2 = new java.util.Scanner(System.in).nextDouble();

        double result = 0;
        switch (inputOpe) {
            case "+":
                result = Calc.add(inputNum1, inputNum2);
                break;
            case "-":
                result = Calc.sub(inputNum1, inputNum2);
                break;
            case "*":
                result = Calc.multi(inputNum1, inputNum1);
                break;
            case "/":
                result = Calc.div(inputNum1, inputNum2);
                break;
        }

        System.out.println("計算結果：" + result);
    }
}