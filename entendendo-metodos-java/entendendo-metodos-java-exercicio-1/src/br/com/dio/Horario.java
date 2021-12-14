package br.com.dio;

public class Horario {
    public void periodoDia(double horario) {
        if (horario >= 4.59 && horario <= 11.59) {
            System.out.println("Horário: " + horario + " Bom dia!");
        } else if (horario >= 12 && horario <= 18.59) {
            System.out.println("Horário: " + horario + " Boa tarde!");
        } else {
            System.out.println("Horário: " + horario + " Boa Noite!");
        }
    }
}
