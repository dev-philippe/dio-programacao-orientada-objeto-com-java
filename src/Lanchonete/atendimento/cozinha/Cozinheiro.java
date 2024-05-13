package Lanchonete.atendimento.cozinha;


import Lanchonete.area.cliente.Cliente;
import Lanchonete.atendimento.Atendente;

public class Cozinheiro {
    // pode ser default
    public void adicionarLancheNoBalcao() {
        System.out.println("ADICIONANDO LANCHE NO BALCÃO");
    }

    // pode ser default
    public void adicionarSucoNoBalcao() {
        System.out.println("ADICIONANDO SUCO NO BALCÃO");
    }

    // pode ser default
    public void adicionarComboNoBalcao() {
        adicionarLancheNoBalcao();
        adicionarSucoNoBalcao();
    }

    private void prepararLanche() {
        System.out.println("PREPARANDO O LANCHE TIPO HAMBURQUER");
    }

    private void prepararVitamina() {
        System.out.println("PREPARANDO O SUCO");
    }

    private void prepararCombo() {
        prepararLanche();
        prepararVitamina();
    }

    private void selecionarIngredientesLanche() {
        System.out.println("SELECIONANDO O PÃO,SALADA, OVO E CARNE");
    }

    private void selecionarIngredientesVitamina() {
        System.out.println("SELECIONANDO FRUTA, LEITE E SUCO");
    }

    private void lavarIngredientes() {
        System.out.println("LAVANDO INGREDIENTES");
    }

    private void baterVitaminaLiquidificador() {
        System.out.println("BATENDO VITAMINA LIQUIDIFICADOR");

    }

    public void fritarIngredientesLanche() {
        System.out.println("FRITANDO CARNEE OVO PARA HAMBURGER");
    }


    private void pedirParaTrocarGas(Almoxarife meuAmigo) {
        meuAmigo.trocarGas();
    }

    private void pedirIngredientes(Almoxarife almoxarife) {
        almoxarife.entregarIngredientes();

    }


    public void pedirParaTrocarGas(Cliente.Atendente atendente) {
    }
}

