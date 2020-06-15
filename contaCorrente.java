
public class contaCorrente {
    private String nomeCorrentista;
	   private int numeroConta;
	   private float saldoConta;
	
	   public contaCorrente(String titular, int nconta, float saldo){
	      this.nomeCorrentista = titular;
	      this.numeroConta = nconta;
	      this.saldoConta = saldo;	   
	   }

	   public void depositar(float valorDeposito){
	      saldoConta = saldoConta + valorDeposito;
	   }

	   public void sacar(float valorSaque){
              if (valorSaque <= saldoConta)
		saldoConta = saldoConta - valorSaque;
	      else
                  
		System.out.println("Saldo insuficiente!");

	   }
	
	   public void mostrarStatus(){
	      System.out.println(nomeCorrentista);
	      System.out.println(numeroConta);
	      System.out.println("R$ " + saldoConta);
	   }
	
	
}
