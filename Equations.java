package com.company;

public class Equations {
    int valueA;
    int valueB;
    int valueC;
    int deltaValue;

    public int getValueA() {
        return valueA;
    }

    public void setValueA(int valueA) {
        this.valueA = valueA;
    }

    public int getValueB() {
        return valueB;
    }

    public void setValueB(int valueB) {
        this.valueB = valueB;
    }

    public int getValueC() {
        return valueC;
    }

    public void setValueC(int valueC) {
        this.valueC = valueC;
    }

    public Equations(int valueA, int valueB, int valueC) {
        this.valueA = valueA;
        this.valueB = valueB;
        this.valueC = valueC;
    }
    public String calculatingDelta(int valueA,int valueB,int valueC){
        this.deltaValue = (valueB*valueB)-(4*valueA*valueC);
        System.out.println("delta"+deltaValue);
        if(deltaValue>0)
            return "Equation has two solutions";
        else if (deltaValue==0)
            return "Equation has same solutions";
        else
            return "Solutions are not real";

    }
    public double getSolution1(int valueA, int valueB, int valueC){
        double solution1= (-(valueB) +Math.sqrt(deltaValue))/(2*valueA);
        System.out.println(solution1);
        return solution1;
    }
    public double getSolution2(int valueA, int valueB, int valueC){
        double solution2= (-(valueB) -Math.sqrt(deltaValue))/(2*valueA);
        System.out.println(solution2);
        return solution2;
    }
}
