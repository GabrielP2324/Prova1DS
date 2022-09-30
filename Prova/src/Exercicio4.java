import java.util.LinkedList;
import java.util.Stack;

public class Exercicio4 {
	public static void main(String[] args) {
		
		Stack<Integer> pilha = new Stack<Integer>();
		pilha.push(10);
		pilha.push(20);
		pilha.push(5);
		pilha.push(60);
		
		imprimir(pilha);
		
		inverter(pilha);
		
		imprimir(pilha);

	}

	private static void inverter(Stack<Integer> pilha) {
		LinkedList<Integer> temp = new LinkedList<Integer>();
		
		for(Integer integer: pilha) {
			temp.addFirst(integer);
		}
		pilha.clear();
		for (Integer integer : temp) {
			pilha.push(integer);
		}
	}

	private static void imprimir(Stack<Integer> pilha) {
		for (Integer integer : pilha) {
			System.out.println(integer);
		}
	}
}
