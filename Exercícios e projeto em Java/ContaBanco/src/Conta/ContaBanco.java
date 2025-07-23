package Conta;
public class ContaBanco {

	//Atributos
	
	public int numConta;
	protected String tipo;
	private String dono;
	private float saldo;
	private boolean status;
	
	//Métodos Personalizados
	
	public void estadoAtual() {
		System.out.println("----------------------------------------");
		System.out.println("Conta: " + this.getNumConta(numConta));
		System.out.println("Tipo: " + this.getTipo());
		System.out.println("Dono: " + this.getDono());
		System.out.println("Saldo: " + this.getSaldo());
		System.out.println("Status: " + this.getStatus());
		System.out.println("----------------------------------------");
	}
	
	public void abrirConta(String t) {
		
		this.setTipo(t);
		this.setStatus(true);
		
		if(t == "CC") {
			this.setSaldo(50);
		}
		else if(t == "CP") {
			this.setSaldo(150);
		}
		System.out.println("Conta aberto com sucesso!");
		System.out.println("\n");
	}
	
	public void fecharConta() {
		
		if(getSaldo() > 0) {
			System.out.println("Não foi possível fechar a conta retire o restante do seu saldo");
		}
		else if(getSaldo() < 0) {
			System.out.println("Não foi possível fechar a conta saldo deveder");
		}
		else {
			this.setStatus(false);		
			System.out.println("Conta fechada com sucesso!");
		}
		
		
	}
	
	public void depositar(float v) {
		if(this.status == true) {
			 this.setSaldo(getSaldo() + v);
			 System.out.println("Depósito realizado na conta de " + getDono() + "!");
			 System.out.println("\n");
		}
		else {
			System.out.println("Não foi possível depositar em uma conta fechada, abra uma conta para realizar um depósito");
			System.out.println("\n");
		}
	}
	
	public void sacar(float v) {
		if(status == true) {
			if(saldo >= 0) {
			 this.setSaldo(this.getSaldo() - v);
			 System.out.println("Dinheiro sacado na conta de " + this.getDono() + "!");
			 System.out.println("\n");
			 System.out.println(this.getDono() + " seu saldo atual é de: " + this.getSaldo() + " reais!" );
			 System.out.println("\n");
			} 
		
			else  {
				System.out.println("Não foi possível sacar saldo insuficiente");
			}
		}
		else {
			System.out.println("Conta não indentificada, impossível pagar!");
		}
	}
	
	public void pagarMensal() {
		float v = 0;
		
		if(this.getTipo() == "CC" ) {
			v = 12;
		}
		else if(this.getTipo() == "CP") {
			v = 20;
		}
		if(this.getStatus() == true) {
			if(this.getSaldo() > v) {
				this.setSaldo(this.getSaldo() - v);
				System.out.println("Mensalidade paga com sucesso por " + this.getDono() + "!");
				System.out.println("\n");
				
			}
			else {
				System.out.println("Saldo insuficiente");
			}
	
		}
		else {
			System.out.println("Conta não indentificada, abra uma conta!");
		}
	}
	
	//Métodos Especiais
	
	public void ContaBanco() {
		this.saldo = 0;
		this.status = false;
	}
	
	public void setNumConta(int n) {
		
		this.numConta = n;
	}
	
	public int getNumConta(int n) {
		
		return this.numConta;
	}
	
	public void setTipo(String t) {
		
		this.tipo = t;
		
	}
	
	public String getTipo() {
		
		return this.tipo;
	}
	
	public void setDono(String d) {
		
		this.dono = d;
	}
	
	public String getDono() {
		
		return this.dono;
	}
	
	public void setSaldo(float s) {
		
		this.saldo = s;
		
	}
	
	public float getSaldo() {
		
		return this.saldo;
		
	}
	 public void setStatus(boolean s) {
		 
		 this.status = s;
	 }
	
	public boolean getStatus() {
		
		
		return this.status;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	

}
