package Lanchonete.area.cliente;

public class Cliente {
    public  void escolherLanche(){
        System.out.println("ESCOLHENDO O LANCHE");
    }
    public  void fazerPedido(){
        System.out.println("FAZENDO O PEDIDO");
    }
    public  void pagarConta(){
        consultaSaldoAplicativo();
        System.out.println("PAGANDO A CONTA");
    }
    private   void consultaSaldoAplicativo(){
        System.out.println("CONSULTANDO O SALDO NO APLICATIVO");
    }


}
