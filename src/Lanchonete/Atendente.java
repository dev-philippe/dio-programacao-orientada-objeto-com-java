package Lanchonete;

public class Atendente {
    public  void servindoMesa(){
        pegarLancheCozinha();
        System.out.println("SERVINDO A MESA ");
    }
    private   void pegarLancheCozinha(){
        System.out.println("PEGANDO O LANCHE NA COZINHA");
    }
    public  void receberPagemento(){
        System.out.println("RECEBENDO O PAGAMENTO");

    }
      void trocarGas(){
        System.out.println("ATENDENTE TROCANDO O GAS");
    }
    private   void pegarPedidoBalcao(){
        System.out.println("PEGANDO O PEDIDO NO BALCAO");
    }
}
