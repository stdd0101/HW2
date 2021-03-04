public class IntsCalculator implements Ints {
    protected final Calculator target;

    public IntsCalculator() { this.target = new Calculator(); }

    @Override
    public int sum(int arg0, int arg1) {
        //считаем через target
        Object summ = target.newFormula().calculate(Calculator.Operation.SUM);
        return (int) (Integer) summ;
    }

    @Override
    public int mult(int arg0, int arg1) {
        //считаем через target
        Object mult = target.newFormula().calculate(Calculator.Operation.MULT);
        return (int) (Integer) mult;
    }

    @Override
    public int pow(int a, int b) {
        //считаем через target
        Object pow = target.newFormula().calculate(Calculator.Operation.POW);
        return (int) (Integer) pow;
    }
}