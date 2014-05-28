package Pilha;

import java.util.*;

public class Palindromo {

	    public static void main(String[] args) {

	        String palavra = "radar"; 
	        String palindromo="";
	        char vetor[] = palavra.toCharArray(); 
	        Stack<Character> pilha = new Stack();

	        for(int auxiliar = vetor.length-1; auxiliar>=0; auxiliar--){
	            pilha.push(vetor[auxiliar]);
	        }
	        System.out.println("Palvra escrita normal: " + palavra);
	        System.out.println("Palavra escrita invertida:");
	        for(Character caractere : pilha){
	            System.out.println(caractere);
	        }
	        System.out.println("");

	        for(Character caractere : pilha){
	            palindromo += caractere;
	        }

	        if(palavra.equals(palindromo)){
	            System.out.println("É palíndromo " + palavra + "  " + palindromo);
	        }else
	            System.out.println("Não é palíndromo");

	        palavra = "camisa"; 
	        palindromo="";
	        vetor = palavra.toCharArray(); 
	        pilha = new Stack();

	        for(int auxiliar = vetor.length-1; auxiliar>=0; auxiliar--){
	            pilha.push(vetor[auxiliar]);
	        }
	        System.out.println("Palvra escrita normal: " + palavra);
	        System.out.println("Palavra escrita invertida:");
	        for(Character caractere : pilha){
	            System.out.println(caractere);
	        }

	        for(Character caractere : pilha){
	            palindromo += caractere;
	        }

	        System.out.println("");
	        if(palavra.equals(palindromo)){
	            System.out.println("É palíndromo " + palavra + "  " + palindromo);
	        }else
	            System.out.println("Não é palíndromo");

	    }

	}
