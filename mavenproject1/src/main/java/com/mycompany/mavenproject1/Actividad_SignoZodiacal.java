package com.mycompany.mavenproject1;

import java.util.Scanner;

public class Actividad_SignoZodiacal{

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa el mes de nacimiento (1-12): ");
        int mes = scanner.nextInt();

        System.out.print("Ingresa el día de nacimiento: ");
        int dia = scanner.nextInt();

        SignoZodiacal signoZodiacal = new SignoZodiacal(mes, dia);

        String signo = signoZodiacal.determinarSigno();
        System.out.println("Tu signo zodiacal es: " + signo);
    }
}

class SignoZodiacal {
    private int mes;
    private int dia;

    public SignoZodiacal(int mes, int dia) {
        this.mes = mes;
        this.dia = dia;
    }

    public String determinarSigno() {
        if ((mes == 1 && dia >= 20) || (mes == 2 && dia <= 18)) {
            return "Acuario";
        } else if ((mes == 2 && dia >= 19) || (mes == 3 && dia <= 20)) {
            return "Piscis";
        } else if ((mes == 3 && dia >= 21) || (mes == 4 && dia <= 19)) {
            return "Aries";
        } else if ((mes == 4 && dia >= 20) || (mes == 5 && dia <= 20)) {
            return "Tauro";
        } else if ((mes == 5 && dia >= 21) || (mes == 6 && dia <= 20)) {
            return "Géminis";
        } else if ((mes == 6 && dia >= 21) || (mes == 7 && dia <= 22)) {
            return "Cáncer";
        } else if ((mes == 7 && dia >= 23) || (mes == 8 && dia <= 22)) {
            return "Leo";
        } else if ((mes == 8 && dia >= 23) || (mes == 9 && dia <= 22)) {
            return "Virgo";
        } else if ((mes == 9 && dia >= 23) || (mes == 10 && dia <= 22)) {
            return "Libra";
        } else if ((mes == 10 && dia >= 23) || (mes == 11 && dia <= 21)) {
            return "Escorpio";
        } else if ((mes == 11 && dia >= 22) || (mes == 12 && dia <= 21)) {
            return "Sagitario";
        } else if ((mes == 12 && dia >= 22) || (mes == 1 && dia <= 19)) {
            return "Capricornio";
        } 
        String signo = null;
        return signo;
    }
}

