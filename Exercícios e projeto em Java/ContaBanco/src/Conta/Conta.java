package Conta;
public class Conta {

	public static void main(String[] args) {
		
		ContaBanco p1 = new ContaBanco();
		p1.setNumConta(1234);
		p1.setDono("João Guilherme");
		p1.abrirConta("CC");
		p1.pagarMensal();
		p1.depositar(1000);
		p1.sacar(350);
		p1.estadoAtual();
		
		ContaBanco p2 = new ContaBanco();
		p2.setNumConta(5678);
		p2.setDono("Pedro");
		p2.abrirConta("CP");
		p2.pagarMensal();
		p2.depositar(700);
		p2.sacar(300);
		
		//p1.fecharConta();
		//p2.fecharConta();
		
		
		p2.estadoAtual();
		
		
		

	}

}
