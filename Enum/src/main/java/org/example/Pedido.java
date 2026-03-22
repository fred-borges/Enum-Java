package org.example;


import java.util.Date;

public class Pedido {
    private int id;
    private Date data;
    private StatusPedido statusPedido;


    public Pedido() {
    }

    public Pedido(int id, Date data, StatusPedido statusPedido) {
        this.id = id;
        this.data = data;
        this.statusPedido = statusPedido;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public StatusPedido getStatusPedido() {
        return statusPedido;
    }

    public void setStatusPedido(StatusPedido statusPedido) {
        this.statusPedido = statusPedido;
    }

    @Override
    public String toString() {
        return "Pedido{" +
                "id=" + id +
                ", data=" + data +
                ", statusPedido=" + statusPedido +
                '}';
    }
}
