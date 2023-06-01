public class Conta {


//#########################################################

    private int numeroConta;
   
     public int getNumeroConta() {
        return numeroConta;
    }
    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }
    

//#########################################################
    
     private String nomePessoa;

        public String getNomePessoa() {
         return nomePessoa;
     }
        public void setNomePessoa(String nomePessoa) {
          this.nomePessoa = nomePessoa;
     }


//#########################################################


    private double saldoConta;

        public double getSaldoConta() {
        return saldoConta;
    }
    public void setSaldoConta(double saldoConta) {
      this.saldoConta = saldoConta;
    }


//#########################################################

    private double valorDeposito;

    public double getValorDeposito() {
        return valorDeposito;
    }
    public void setValorDeposito(double valorDeposito) {
        this.valorDeposito = valorDeposito;
    }


    //#########################################################

    private double valorSaque;

    public double getValorSaque() {
        return valorSaque;
    }
    public void setValorSaque(double valorSaque) {
        this.valorSaque = valorSaque;
    }



}