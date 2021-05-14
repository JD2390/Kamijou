package aula04;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class exmpLista {
	public static void main(String[] args) {
		//ArrayList no lugar de PriorityQueue
		Queue<Integer> lista = new PriorityQueue<Integer>();
		
		lista.add(2);
		lista.add(4);
		lista.add(5);
		lista.add(7);
		lista.add(-85);
		
		System.out.println(lista);
		//remove o numero 2, se fosse List no lugar de Queue seria o que está na posição nº2 (0,1,2,...)
		lista.remove(2);
		System.out.println(lista);
		//adiciona o numero 1, se fosse List no lugar de Queue seria (1,x)
		//ou seja, adicionar na posição 1 o numero x		
		lista.add(1);
		System.out.println(lista);
		//fazer com que só mostre o numero na lista menor que zero
		Stream<Integer> stream = lista.stream().filter(item-> item.intValue()<0);
		System.out.println(stream.collect(Collectors.toList()));
	}

}
