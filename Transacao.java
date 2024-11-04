package com.senai.java.ContaDigitalparaFintech;

public interface Transacao {
    // A interface Transacao define um conjunto de métodos que qualquer classe que a implemente deve ter.
    // Interfaces são como contratos que garantem que todas as classes que a implementam têm esses métodos.

    void realizarDeposito(double valor);
    // Método para depositar um valor na conta.
    // Não possui corpo porque a interface apenas define a assinatura do método.
    // As classes que implementarem esta interface serão responsáveis por definir como esse método funciona.

    void realizarSaque(double valor);
    // Método para sacar um valor da conta.
    // Assim como o método anterior, ele só define o que deve ser feito, não como.

    void realizarTransferencia(double valor, Conta destino);
    // Método para transferir um valor de uma conta para outra.
    // Recebe o valor a ser transferido e a conta de destino para onde o valor deve ir.
}
