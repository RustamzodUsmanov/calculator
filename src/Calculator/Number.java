package Calculator;

public abstract class Number {


    public abstract void sum();

    public abstract void sub();

    public abstract void div();

    public abstract void mul();

    public abstract int getResult();
    public abstract String getStringResult();
    public abstract int getValue1();
    public abstract int getValue2();
    public boolean checkPositiveNumbers(int value1, int value2){

        if((value1 < 0 || value1 > 10)||(value2 < 0 || value2 > 10)){
            return false;
        }
        else{
            return true;
        }
    };
}