package modelo;

/**
 *
 * @author Karla Alejandra Gracia Barajas
 */
public class Result implements java.io.Serializable {

    private int num1;
    private int num2;
    private char op;
    private double res;

    public Result() {

    }

    public void setOp(char op) {
        this.op = op;
    }

    public char getOp() {
        return this.op;

    }

    public double getResultado() {
        Oper op = new Oper();
        res = op.hacer(this.num1, this.num2, this.op);
        return res;
    }

    public void setNum1(int num1) {
        this.num1 = num1;

    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }

    public int getNum1() {
        return this.num1;
    }

    public int getNum2() {
        return this.num2;
    }

}
