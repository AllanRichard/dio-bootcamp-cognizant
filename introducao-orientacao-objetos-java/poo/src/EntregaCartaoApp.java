import poo.model.Cliente;
import poo.model.Endereco;

import java.util.ArrayList;

public class EntregaCartaoApp {
    public static void main(String[] args) {
        Endereco endereco = new Endereco();
        endereco.cep = "0000000";
        //dados do endereco

        Cliente cliente = new Cliente();

        //dados do cliente

        try {
            cliente.adicionaEndereco(endereco);
            System.out.println("Endereco adicionado com sucesso!");
        } catch (Exception e) {
            System.err.println("Houve um erro ao adicionar endereco" + e.getMessage());
        }

    }
}
