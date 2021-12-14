package br.com.dio;

public class Main {

    public static void main(String[] args) {
	    Calculadora calculadora = new Calculadora();
        double soma = calculadora.soma(10, 5);
        double subtracao = calculadora.subtracao(10, 5);
        double multiplicacao = calculadora.multiplicacao(10, 5);
        double divisao = calculadora.divisao(10, 5);

        System.out.println("Soma: " + soma);
        System.out.println("Subtração: " + subtracao);
        System.out.println("Multiplicação: " + multiplicacao);
        System.out.println("Divisão: " + divisao);
        System.out.println();

        Horario horario = new Horario();
        horario.periodoDia(6);
        horario.periodoDia(13);
        horario.periodoDia(4);
        System.out.println();

        Emprestimo emprestimo = new Emprestimo();
        emprestimo.valorEmprestimo(4000);
        System.out.println();
        emprestimo.valorEmprestimo(8000);
        System.out.println();
        emprestimo.valorEmprestimo(12000);
    }
}
