
public class exerc1 {
	
   public static int maiorNumero (int array[]) {
	  int maior = 0;
	   
	  for(int i = 0; i < array.length; i ++ ) {
		  if (array [i] > maior)
			  maior = array [i];
	  }
	
	   return maior;
	   
}
    
   public static void main(String[] args) {
	
	   int numeros [] = {1,3,4,5,6,7,8,9};
	   
	  int maior = maiorNumero(numeros);
	  
	  System.out.println(" O maior numero do array é = " + maior);
	  
}
	}


