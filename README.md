# Enum-Java

# Projeto Exemplo - Uso de Enum em Java

Este projeto demonstra o uso básico de `enum` em Java para representar estados de um pedido.

## 📌 Objetivo

Mostrar como criar e utilizar enums para melhorar a legibilidade e organização do código.

## 🚀 Tecnologias

- Java

## 📂 Estrutura

- `StatusPedido.java` → Enum com os estados possíveis
- `Main.java` → Classe principal com exemplo de uso

## 🧠 Conceito

Enums são usados para representar um conjunto fixo de constantes.

## ▶️ Exemplo de uso

✅ Como criar um Enum

```java
public enum StatusPedido {
    PENDENTE,
    PROCESSANDO,
    ENVIADO,
    ENTREGUE
}

StatusPedido status = StatusPedido.PENDENTE;

if (status == StatusPedido.PENDENTE) {
    System.out.println("Pedido ainda não foi processado.");
}
