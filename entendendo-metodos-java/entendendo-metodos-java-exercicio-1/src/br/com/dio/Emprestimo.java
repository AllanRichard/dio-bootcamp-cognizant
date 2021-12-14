package br.com.dio;

public class Emprestimo {
    public void valorEmprestimo(double valor) {
        double taxa = valorTaxas(valor);
        double juros = valor * taxa;
        double valorFinalEmprestimo = valor + juros;
        System.out.println("Valor Emprestado: " + valor);
        System.out.println("Valor taxa: " + taxa);
        System.out.println("Valor de Juros: " + juros);
        System.out.println("Valor a Pagar com Juros: " + valorFinalEmprestimo);
    }

    private double valorTaxas(double valor) {
        double valorTaxa;
        if (valor <= 5000) {
            valorTaxa = 0.08;
        } else if (valor > 5000 && valor <= 10000) {
            valorTaxa = 0.12;
        } else {
            valorTaxa = 0.16;
        }
        return valorTaxa;
    }
}
