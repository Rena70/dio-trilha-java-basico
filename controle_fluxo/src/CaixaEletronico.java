public class CaixaEletronico {
    public static void main(String[] args) throws Exception {
        
        double saldo = 27.0;
        double valor_solicitado = 10.0;
        
        if(valor_solicitado <= saldo){
            saldo = saldo - valor_solicitado;
            System.out.println("Novo saldo: " + saldo);
        }        
        else
            System.out.println("Saldo insuficiente");    

        
    }
}
