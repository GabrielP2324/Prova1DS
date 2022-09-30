
public class Lista {
	private No inicio, fim;

	public void inserirInicio(int dado) {
		No aux = new No(dado);

		if (inicio == null) {
			fim = aux;
		} else {
			aux.dir = inicio;
			inicio.esq = aux;
		}
		inicio = aux;
	}

	public void inserirFim(int dado) {
		No aux = new No(dado);

		if (inicio == null) {
			inicio = aux;
		} else {
			aux.esq = fim;
			fim.dir = aux;
		}
		fim = aux;
	}

	public void imprimir() {
		No aux = inicio;
		while (aux != null) {
			System.out.println(aux.dado);
			aux = aux.dir;
		}
	}

	public No pesquisar(int dado) {
		No aux = inicio;
		while (aux != null) {
			if (aux.dado == dado) {
				break;
			}
			aux = aux.dir;
		}

		return aux;
	}

	public void remover(int dado) {
		No aux = pesquisar(dado);
		if (aux != null) {
			if (inicio == aux && fim == aux) { // quando tiver apenas um nó
				inicio = null;
				fim = null;
				aux = null;
			} else if (aux == inicio) { // é o primeiro elemento
				inicio = aux.dir;
				inicio.esq = null;
				aux.dir = null;
				aux = null;
			} else if (aux == fim) { // é o último elemento
				fim = aux.esq;
				fim.dir = null;
				aux.esq = null;
				aux = null;
			} else {
				aux.esq.dir = aux.dir;
				aux.dir.esq = aux.esq;
				aux.esq = null;
				aux.dir = null;
				aux = null;

			}
		}
	}

	public boolean verificar() {
		No temp = inicio;
		boolean correct = false;
		while (temp != null && temp.dir != null) {
			if (temp.dado < temp.dir.dado) {
				correct = true;
			} else {
				return false;
			}
			temp = temp.dir;
		}

		return correct;

	}

	public int size() {
		int size = 0;

		No temp = inicio;
		while (temp != null) {
			size++;
			temp = temp.dir;
		}

		return size;
	}

	public void inserir(int value, int position) {
		int pos = 1;
		No temp = new No(value);
		No location = inicio;
		No aux;
		if (size() == 0) {
			inserirInicio(value);
		} else if (position <= 1) {
			inserirInicio(value);
		} else if (position == (size() + 1) || position>size()+1) {
			inserirFim(value);
		} else {
			while (pos != position) {
				pos++;
				location = location.dir;
			}
			aux = location.esq;
			aux.dir = temp;
			location.esq = temp;
			temp.dir = location;
			temp.esq = aux;
		}

	}

}
