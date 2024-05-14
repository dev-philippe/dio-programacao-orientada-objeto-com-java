package Lanchonete.atendimento.cozinha;


import Lanchonete.Atendente;

public class Cozinheiro {
    // pode ser default
    public void AdicionarLancheNoBalcao() {
        System.out.println("ADICIONANDO LANCE NATURAL HAMBURGER NO BALCÃO");
    }

    // pode ser default
    public void adicionarSucoNoBalcao()  {
        System.out.println("ADICIONANDO SUCO NO BALCÃO");
    }
    //pode ser default
    public void adicionarComboNoBalcao(){
        adicionarComboNoBalcao();
        adicionarSucoNoBalcao();

    }


    private void prepararLanche() {
        System.out.println("PREPARANDO LANCHE TIPO HAMBURGER");

    }

    public void prepararVitamina() {
        System.out.println("PREPARANDO SUCO");
    }

    private void prepararCombo() {
        prepararLanche();
        prepararVitamina();
    }

    private void selecionarIngredientesLanche() {
        System.out.println("SELECIONANDO O PÃO,SALADA,OVO, CARNE");
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

    private void fritarIngredientesLanche() {
        System.out.println("FRITANDO A CARNE E OVO PARA O HAMBURGER");
    }





    private void pedirPraTrocarGas(Almoxarife meuAmigo) {
        meuAmigo.trocarGas();
    }

    private void pedirIngredientes(Almoxarife almoxarife) {
        almoxarife.entregarIngredientes();
    }


}


