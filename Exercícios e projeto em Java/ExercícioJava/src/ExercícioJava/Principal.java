package ExercícioJava;

public class Principal {

	public static void main(String[] args) {
		
		Lutador l[] = new Lutador[5];

		l[0] = new Lutador("João", "Brasil", 19, 1.76f,
				   67.3f, 17, 0, 5);
		
		l[1] = new Lutador("Pedro", "Brasil", 25, 1.80f,
				   60.2f, 17, 4, 1);
		
		Luta UEC01 = new Luta();
		
		UEC01.MarcarLuta(l[0], l[1]);
		UEC01.Luta();
		l[0].status();
		l[1].status();
	}

}
