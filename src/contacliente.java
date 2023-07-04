public class contacliente {
   
        String titular = "Neymar Junio";
        int nconta = 102030 ;
        String agencia = "Nubank";
        double saldo = 500.00;
        String dataabertura = "04/07/2023";
    


        public void sacar(double valorSaq) {
            if (saldo >= valorSaq) {
                saldo -=valorSaq;
            }          


        }

        public void depositar(double valorDep) {
            saldo +=valorDep;
        }


        public void rend() {
             saldo = saldo * 0.1;

        }

}
