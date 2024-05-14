package Lanchonete;

import Lanchonete.area.cliente.Cliente;
import Lanchonete.atendimento.cozinha.Almoxarife;
import Lanchonete.atendimento.cozinha.Cozinheiro;

public class Estabelecimento {
    public static void main(String[] args) {


        Cozinheiro cozinheiro = new Cozinheiro();
        //ações que não precisam estarem disponíveis para toda aplicação


        cozinheiro.prepararVitamina();
        cozinheiro.prepararVitamina();

        //ações que o estabelecimento precisa ter ciência
        cozinheiro.adicionarSucoNoBalcao();
        cozinheiro.AdicionarLancheNoBalcao();
        cozinheiro.adicionarComboNoBalcao();


        Atendente atendente = new Atendente();
        atendente.receberPagemento();
        atendente.servindoMesa();


        Cliente cliente = new Cliente();
        cliente.escolherLanche();
        cliente.fazerPedido();
        cliente.pagarConta();



        // esta ação é muito sigilosa, que tal ser privada?
        cliente.consultaSaldoAplicativo();


    }
}