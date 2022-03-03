import java.util.Scanner;

public class ProgramGit {

	private static Scanner entrada;

	public static void main(String[] args) {

		entrada = new Scanner(System.in);

		int K;
        
        K = entrada.nextInt(); 
        
        int i = 0;
        
        String [] array = new String[K];

        while( i < K ) {
        	 
             array[i] = entrada.next();
             
             i++;
        }
        
        int P;
        
        P = entrada.nextInt();

        for (i = 0; i < K; i++) {
        	
            if( P != i) {
            	
                System.out.print(array[i]+" ");
            }
        }
 
        entrada.close();

    }
	

}
