import Lanchonete.atendimento.cozinha.Almoxarife;
import Lanchonete.area.cliente.Cliente;
import Lanchonete.atendimento.cozinha.Cozinheiro;

public class Estabelecimento {
    public static void main(String[] args) {
        Cozinheiro cozinheiro = new Cozinheiro();
        // ações que não precisam estarem disponíveis para toda aplicação


        //  ações que o estabelecimento precisa ter ciência

        cozinheiro.adicionarSucoNoBalcao();
        cozinheiro.adicionarLancheNoBalcao();
        cozinheiro.adicionarComboNoBalcao();

        Almoxarife almoxarife = new Almoxarife();
        //ações que não precisam estarem disponíveis para toda a aplicação


        //ação que somente o seu pacote cozinha precisa conhecer (default)


        Cliente.Atendente atendente = new Cliente.Atendente();
        atendente.pegarLancheCozinha();
        atendente.receberPagamento();
        atendente.servindoMesa();
        // ação que somente seu pacote cozinha precisa conhecer (default)


        Cliente cliente = new Cliente();
        cliente.escolherLanche();
        cliente.fazerPedido();
        cliente.pagarConta();

        // não deveria, mas o estabelecimento
        // ainda não definiu normas de atendimento


        // está ação  é muito sigilosa , que tal ser privada ?
        cliente.consultarSaldoAplicativo();

        //  já pensou os clientes ouvindo o gas acabou ?
        cozinheiro.pedirParaTrocarGas(atendente);


    }


}
