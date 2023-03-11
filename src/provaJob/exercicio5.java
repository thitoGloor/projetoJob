package provaJob;

public class exercicio5 {
	public static void main(String[] args) {			
		String palavra = "thiago gloor";
		String revertida = "";
		for(int i = palavra.length()-1; i>=0; i--) {
			revertida+= palavra.charAt(i);
		}
		System.out.println(revertida);			

	}
}


