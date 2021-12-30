package br.com.dio;

import java.util.*;

public class ExerciciosList {
    public static void main(String[] args) {
        List<Temperatura> temperaturas = new ArrayList<>(){{
           add(new Temperatura("Janeiro", 35d));
           add(new Temperatura("Fevereiro", 17d));
           add(new Temperatura("Marco", 23.5d));
           add(new Temperatura("Abril", 21.5d));
           add(new Temperatura("Maio", 39d));
           add(new Temperatura("Junho", 15d));
        }};

        Double valoresTemp = 0d;
        Integer contador = 0;
        for (Temperatura temp : temperaturas) {
            valoresTemp += temp.getTemperatura();
            contador++;
        }
        Double media = (valoresTemp / contador);
        System.out.println("Média semestral das temperaturas: " + media + "\n");

        System.out.println("Temperaturas acima da média");
        for (Temperatura temp : temperaturas) {
            if (temp.getTemperatura() > media) {
                System.out.println(temp.getMes() + " --> " + temp.getTemperatura());
            }
        }

        System.out.println("\n");
        System.out.println("\n");

        Scanner ler = new Scanner(System.in);
        String respostaTemp = "";

        List<String> respostasCrime = new ArrayList<>();
        System.out.println("Telefonou para a vitima? ");
        respostaTemp = ler.next();
        respostasCrime.add(respostaTemp);
        System.out.println("Esteve no local da vitima? ");
        respostaTemp = ler.next();
        respostasCrime.add(respostaTemp);
        System.out.println("Mora perto da vitima? ");
        respostaTemp = ler.next();
        respostasCrime.add(respostaTemp);
        System.out.println("Devia para a vitima? ");
        respostaTemp = ler.next();
        respostasCrime.add(respostaTemp);
        System.out.println("Ja trabalhou com a vitima? ");
        respostaTemp = ler.next();
        respostasCrime.add(respostaTemp);

        int countRespostasSim = Collections.frequency(respostasCrime, "sim");
        switch (countRespostasSim) {
            case 2:
                System.out.println("Suspeita");
                break;
            case 3 | 4:
                System.out.println("Cumplice");
                break;
            case 5:
                System.out.println("Assassina");
                break;
            default:
                System.out.println("Inocente");
                break;
        }
    }
}

class Temperatura {
    private String mes;
    private Double temperatura;

    public Temperatura(String mes, Double temperatura) {
        this.mes = mes;
        this.temperatura = temperatura;
    }

    public String getMes() {
        return mes;
    }

    public Double getTemperatura() {
        return temperatura;
    }

    @Override
    public String toString() {
        return "{" +
                "mes='" + mes + '\'' +
                ", temperatura=" + temperatura +
                '}';
    }
}
