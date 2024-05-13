package Lanchonete.area.cliente;

public class Cliente {
    public void escolherLanche() {
        System.out.println("ESCOLHENDO O LANCHE");
    }

    public void fazerPedido() {
        System.out.println("FAZENDO O PEDIDO");
    }

    public void pagarConta() {
        System.out.println("PAGANDO A CONTA");
    }

    public void consultarSaldoAplicativo() {
        System.out.println("CONSULTANDO SALDO NO APLICATIVO");
    }

    private void pegarPedidoBalcao() {
        System.out.println("PEGANDO PEDIDO NO BALCÃO");

    }

    public static class Atendente {
        public void servindoMesa() {
            System.out.println("SERVINDO MESA");
        }

        public void pegarLancheCozinha() {
            System.out.println("PEANDO O LANCHE NA COZINHA");
        }

        public void receberPagamento() {
            System.out.println("RECEBENDO PAGAMENTO");
        }

        private void trocarGas() {
            System.out.println("ATENDENTE TROCANDO O GAS");
        }

        public void pegarPedidoBalcao() {
            System.out.println("PEGANDO O PEDIDO NO BALCAO");
        }

    }
}
