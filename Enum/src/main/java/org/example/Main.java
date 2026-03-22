package org.example;

import java.util.Date;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Pedido pedido = new Pedido(1, new Date(), StatusPedido.ENVIADO); // Instanciando a classe pedido

        System.out.println(pedido);

        StatusPedido statusPedido = StatusPedido.valueOf("ENTREGUE"); // Tranformando um string para enum
        
    }


}