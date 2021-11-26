package data_structure.challenges;

class Exp {
    private int coefficient;
    private int exponent;

    public Exp(int coefficient, int exponent) {
        this.coefficient = coefficient;
        this.exponent = exponent;
    }

    public int getCoefficient() {
        return coefficient;
    }

    public void setCoefficient(int coefficient) {
        this.coefficient = coefficient;
    }

    public int getExponent() {
        return exponent;
    }

    public void setExponent(int exponent) {
        this.exponent = exponent;
    }
}

public class MathematicalExpressionAddition {

    // Input : Two arrays of mathematical expression in the form of Ax^a + Bx^b + ....
    // Demo : array(1) = x^2 + 6x^3 and array(2) = 3x^2 + x^4
    // Output : 4x^2 + 6x^3 + x^4
    // let's do it!
    // Fuuuuuu..... I did this question in approx two hours.(Bad Manners.)

    public static void main(String[] args) {

        // we created a class for each expression
        // expression creation
        Exp[] exp1 = {
                new Exp(1, 2),
                new Exp(6, 3),
                new Exp(1, 5),
        };
        Exp[] exp2 = {
                new Exp(3, 2),
                new Exp(1, 4),
                new Exp(3, 5),
        };

        Exp[] result = addExpression(exp1, exp2);
        if (result != null)
            for (Exp exp : result) {
                if (exp != null) {
                    System.out.print(exp.getCoefficient() + "x^" + exp.getExponent());
                    System.out.print(" + ");
                }
            }
    }

    private static Exp[] addExpression(Exp[] exp1, Exp[] exp2) {
        if (exp1.length == 0)
            return exp2;
        if (exp2.length == 0)
            return exp1;

        Exp[] result = new Exp[exp1.length + exp2.length];
        int i = 0, j = 0, k = 0;

        while (i < exp1.length && j < exp2.length) {
            if (exp1[i].getExponent() == exp2[j].getExponent()) {
                result[k] = new Exp(exp1[i].getCoefficient() + exp2[j].getCoefficient(), exp1[i].getExponent());
                i++;
                j++;
            } else if (exp1[i].getExponent() < exp2[j].getExponent()) {
                result[k] = new Exp(exp1[i].getCoefficient(), exp1[i].getExponent());
                i++;
            } else {
                result[k] = new Exp(exp2[j].getCoefficient(), exp2[j].getExponent());
                j++;
            }
            k++;
        }

        while (i < exp1.length) {
            result[k] = new Exp(exp1[i].getCoefficient(), exp1[i].getExponent());
            k++;
            i++;
        }
        while (j < exp2.length) {
            result[k] = new Exp(exp2[j].getCoefficient(), exp2[j].getExponent());
            k++;
            j++;
        }
        return result;
    }

}
