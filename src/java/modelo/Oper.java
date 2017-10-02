package modelo;

/**
 *
 * @author Karla Alejandra Gracia Barajas
 */
public class Oper {

    private int num1;
    private int num2;
    private double res;
    private char op;

    public Oper() {

    }

    public double hacer(int num1, int num2, char op) {
        this.num1 = num1;
        this.num2 = num2;
        this.op = op;

        if (op == '+') {
            this.res = num1 + num2;
        } else {
            if (op == '-') {
                this.res = num1 - num2;
            } else {
                if (op == '*') {
                    this.res = num1 * num2;
                } else {
                    if (op == '/') {
                        this.res = num1 / num2;
                    } else {

                    }
                }
            }
        }

        return res;

    }
}
