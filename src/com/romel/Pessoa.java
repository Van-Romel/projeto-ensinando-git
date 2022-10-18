package com.romel;

public class Pessoa {
    public static void main(String[] args) {
        System.out.println("Olá Mundo");
        if (args.length > 0)
            System.out.println("Este é o primeiro argumento: " + args[0]);
        else
            System.out.println("Não foi recebido nenhum argumento.");

        if (args.length > 0)
            System.out.println("Este é o primeiro argumento: " + args[0]);
        else
            System.out.println("Não foi recebido nenhum argumento.");
    }
}