import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        FormulaRestoration formulaRestoration = new FormulaRestoration();
        System.out.println(Arrays.toString(formulaRestoration.solution(
            new String[]{"1 + 1 = 2", "1 + 3 = 4", "1 + 5 = X", "1 + 2 = X"})));

    }

}
