package com.mycompany.mavenproject1;
public class aritmetica {
    int num1, num2;
    
    public aritmetica(){
    }
    public aritmetica(int num1){
        this.num1 = num1;
    }
    public aritmetica(int num1, String texto){
        this.num1 = num1;
    }
    public void setNum1(int num1){
        this.num1 = num1;
    }
    public void setNum2(int num2){
        this.num2 = num2;
    }
    public int getNum1(){
        return this.num1;
    }
    public int getNum2(){
        return this.num2;
    }
    public void suma(){
        System.out.println("La suma de los numeros: " 
        +this.num1 + " + " + this.num2 + " = "
        + (this.num1 + this.num2));
    }
    public void restar() {
        System.out.println("La resta de los numeros: " 
        +this.num1 + " - " + this.num2 + " = "
        + (this.num1 - this.num2));
    }
    public void multiplicar() {
        System.out.println("La multiplicacion de los numeros: " 
        +this.num1 + " * " + this.num2 + " = "
        + (this.num1 * this.num2));
    }
    public void dividir() {
        System.out.println("La división de los numeros: " 
        +this.num1 + " / " + this.num2 + " = "
        + (this.num1 / this.num2));
    }

}
    

