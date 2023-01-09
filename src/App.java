public class App {
    public static void main(String[] args) throws Exception {

		int numero = 5;
        System.out.println("Tabela de multiplicação de "+ numero);
		tabelaMultiplicacao(numero);
    }

	public static void tabelaMultiplicacao(int numero){

		for(int i = 0; i <= 10; i++){
			int mulplicacao = numero * i;
			System.out.println(numero + "x" + i + "=" + mulplicacao );
		}

	}
}
