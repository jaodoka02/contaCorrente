public class Correntista {
    public static void main(String[] args) {
        contacliente contaUsuario = new contacliente();
        System.out.println("Bem vindo " + contaUsuario.titular + "\nBanco " + contaUsuario.agencia + "\nNúmero da conta " + contaUsuario.nconta + "\nSaldo " + contaUsuario.saldo );
        System.out.println("Data de abertura " + contaUsuario.dataabertura);

        contaUsuario.sacar(20);
        System.out.println("Seu saldo atual é de R$ " + contaUsuario.saldo  );

        contaUsuario.depositar(50);
        System.out.println("Seu saldo atual depois deste despósito é de " + contaUsuario.saldo );

        contaUsuario.rend();
        System.out.println("Com rendimento de " + contaUsuario.saldo);
    }
}
