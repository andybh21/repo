package ProgramaGit;

public class TestGit extends Git{

	public static void main(String[] args) {

        int K;
        
        K = entrada.nextInt(); 
        

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
