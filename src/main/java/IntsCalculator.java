public class IntsCalculator implements Ints {
    protected final Calculator target;

    public IntsCalculator() { this.target = new Calculator(); }

    @Override
    public double sum(int arg0, int arg1) {
        Calculator.Formula sum = target.newFormula();
        sum.addOperand(arg0);
        sum.addOperand(arg1);
        sum.calculate(Calculator.Operation.SUM);
        return sum.result;
    }

    @Override
    public double mult(int arg0, int arg1) {
        Calculator.Formula mult = target.newFormula();
        mult.addOperand(arg0);
        mult.addOperand(arg1);
        mult.calculate(Calculator.Operation.MULT);
        return mult.result;
    }

    @Override
    public double pow(int a, int b) {
        //считаем через target
        //Object pow = target.newFormula().calculate(Calculator.Operation.POW);
       // return (int) pow;
        Calculator.Formula pow = target.newFormula();
        pow.addOperand(a);
        pow.addOperand(b);
        pow.calculate(Calculator.Operation.POW);
        return pow.result;
    }
}