package com.mycompany.calculadoracompleta;

/**
 * @SamRivas
 */
public class Operaciones {
    
    private double num1, num2;
    String operacion;
    
    public Operaciones(){
        this.num1 = 0;
        this.num2 = 0;
    }

    public void setNum1(double num1) {
        this.num1 = num1;
    }

    public void setNum2(double num2) {
        this.num2 = num2;
    }
    
    public void setOperacion(String operacion) {
        this.operacion = operacion;
    }

    public double getNum1() {
        return num1;
    }

    public double getNum2() {
        return num2;
    }
    
    public double sumar(){
        return this.num1+ this.num2;
    }
    
    public double restar(){
        return this.num1 - this.num2;
    }
    
    public double multiplicar(){
        return this.num1 * this.num2;
    }
    
    public double dividir(){
        return this.num1 / this.num2;
    }
    
}
