package br.com.fiap.banco;

public class Teste {

	public static void main(String[] args) {

//		Conta cc = new Conta ();
//		cc.depositar(50.0);
//		cc.setAgencia(123);
//		cc.setNumero(321);
//
//		cc.depositar(1000);
//
//		System.out.println( cc.getSaldo() );
//
//		Conta poupanca = new Conta(111, 222, 1000);
//		poupanca.retirar(50);
//
//		System.out.println( poupanca.getSaldo() );
//
//		Conta cc2 = null;
//
//		if (cc2 != null) {
//			cc2.depositar(1000);
//		}
		
//		ContaCorrente cc = new ContaCorrente();
//		cc.setAgencia(1111);
//		cc.setNumero(2222);
//		cc.setTipo("PF");
//		cc.setChequeEspecial(1000);
//		
//		Conta cc2 = new ContaCorrente();
		
//		Conta cc = new Conta();
//		if (cc instanceof Conta){
//		System.out.println("cc é do tipo Conta");
//		}else{
//		System.out.println("cc não é do tipo Conta");
//		}
			

		Conta conta1 = new Conta();
		conta1.depositar(1000);
		conta1.retirar(100);
		
		ContaCorrente conta2 = new ContaCorrente();
		conta2.depositar(1000);
		conta2.retirar(100);
		
		Conta conta3 = new ContaCorrente();
		conta3.depositar(1000);
		conta3.retirar(100);
		
		System.out.println("Conta1: " + conta1.getSaldo());
		System.out.println("Conta2: " + conta2.getSaldo());
		System.out.println("Conta3: " + conta3.getSaldo());

	}
}
