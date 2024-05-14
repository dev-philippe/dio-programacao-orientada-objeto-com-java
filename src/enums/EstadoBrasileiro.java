package enums;

import java.util.Locale;

public enum EstadoBrasileiro {
    SAO_PAULO ("SP", "SÃO PAULO", 11),
    RIO_JANEIRO ("RJ", "RIO DE JANEIRO",12),
    PIAUI ("PI", "PIAUÍ",13),
    MARANHAO ("MA", "MARANHÃO",15),
    CEARA ("CE", "CEARA",16);

    private String nome;
    private String sigla;

    private int Ibge;



    private EstadoBrasileiro(String sigla, String nome,int ibge){
        this.sigla = sigla;
        this.nome = nome;
        this.Ibge = ibge;
    }
    public String getSigla(){
        return  sigla;
    }
    public String getNome(){
        return  nome;
    }
    public  String getNomeMaiusculo(){
        return nome.toUpperCase();
    }

}
