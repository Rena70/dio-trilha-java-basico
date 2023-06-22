public class CaixaEletronico {
    public static void main(String[] args) throws Exception {
        
        double saldo = 25.0;
        double valor_solicitado = 17.0;
        
        if(valor_solicitado < saldo)
            saldo = saldo - valor_solicitado;

        System.out.println(saldo);
    }
}
