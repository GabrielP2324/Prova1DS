import java.util.Stack;

public class Exercicio2 {
	public static void main(String[] args) {
		
		Stack<Integer> pilha1 = new Stack<Integer>();
		Stack<Integer> pilha2 = new Stack<Integer>();
		
		
		pilha1.push(null);
		if(verificar(pilha1, pilha2)) {
			System.out.println("as pilhas são iguais");
		} else {
			System.out.println("as pilhas são diferentes");
		}
		

	}

	private static boolean verificar(Stack<Integer> pilha1, Stack<Integer> pilha2) {
		boolean correct = true;
		
		if(pilha1.size() == pilha2.size() && pilha1.size() != 0) {
			for (Integer integer : pilha1) {
				if(integer==pilha2.pop()) {
					correct = true;
				}else {
					return false;
				}
			}
		}if(pilha1.size()!= pilha2.size()) {
			return false;
		}
		return correct;
	}
}
