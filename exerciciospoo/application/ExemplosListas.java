package application;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ExemplosListas {

	public static void main(String[] args) {
		
			List<String> list = new ArrayList<>();

			//para adicionar um elemento
			list.add("Maria");
			list.add("Alex");
			list.add("Bob");
			list.add("Ana");
			
			//inserir novo elemento em tal posição
			list.add(2, "Marco");
			
			//imprimir o tamanho da lista
			System.out.println("Tamanho Lista: " + list.size());

			//encontrar a posição de um elemento
			System.out.println("Index of Bob: " + list.indexOf("Bob"));
			
			//encontrar quando não existe na lista, e sempre que não existir ele retorna -1
			System.out.println("Index of Talita: " + list.indexOf("Talita"));
			
			System.out.println("---------------------");
						
			//encontrar com base em um predicado
			String name = list.stream().filter(x -> x.charAt(0) == 'A').findFirst().orElse(null);
			System.out.println(name);
			
			for(String x : list) {
				System.out.println(x);
			}
			
			System.out.println("---------------------");
			//remover elemento da lista a partir da comparação dele com outro
			list.remove("Ana");
			
			//remover elemento da lista pela sua posição
			list.remove(1);
			
			//remover elemento da lista que atendam a um predicado
			list.removeIf(x -> x.charAt(0) == 'M');
			
			//filtrar na lista e só deixar o que atende a um predicado
			List<String> resultado = list.stream().filter(x -> x.charAt(0) == 'B').collect(Collectors.toList());
	
			for(String x : resultado) {
				System.out.println(x);
			}
	
	}

}
