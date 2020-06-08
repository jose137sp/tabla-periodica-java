import java.util.Scanner;

public class inicio12 {
    public static void main(String[] args) {
    	
    	 int n=0, i, max=0, maxp=0;
    	 String nomE[] = new String[10];
    	 String simb[] = new String[10];
    	 int nAtomico[] = new int[10];  	
    	 int pesoA[] = new int[10];  
  	  
  	  
  	  // imprimir titulos del reporte
  				System.out.println("------PROGRAMA TABLA PERIODICA------");
  				System.out.println("------------------------------------");
  				System.out.println("Universidad Tecnologica de Panama"); 
  				System.out.println("Jose Saavedra | 8-958-1993 | 1SF121");
  				System.out.println("Fernando Estribi | 8-969-1399 | 1SF121");
  				System.out.println("Sebastian Arrivillaga | E-8-159257 | 1SF121");
  				System.out.println(" ");
  	// ----------------------------------------------------------------
  				
  				System.out.println("Cuantos elementos desea insertar?: ");
  				try (Scanner lee = new Scanner(System.in)) {
					n=lee.nextInt();
					System.out.println(" ");
					
					//lectura de los elementos con sus respectivos datos
					for(i=1 ; i <= n; i++)
					{
						System.out.println("Inserte el numero atomico #"+i);
						nAtomico[i]=lee.nextInt();
						System.out.println("Inserte el peso atomico #"+i);
						pesoA[i]=lee.nextInt();
						lee.nextLine();
						System.out.println("Inserte el nombre del elemento #"+i);
						nomE[i]=lee.nextLine();
						System.out.println("Inserte el simbolo del elemento #"+i);
						simb[i]=lee.nextLine();
					}
					
						max=nAtomico[1];
						maxp=pesoA[1];
						
					for(i=1 ; i <= n; i++) {
						
						if(nAtomico[i]>max) {
							max=nAtomico[i];
							
						}
						if(pesoA[i]>maxp) {
							maxp=nAtomico[i];
							
						}
					}
					
					
					for(i=1 ; i <= n; i++) {
						System.out.println(" ");
						System.out.println ("vector("+i+")= " + "Nombre: "+nomE[i]  +"  Simbolo: "+ simb[i]  +"  Numero A: "+ nAtomico[i] +"  Peso A: "+pesoA[i]);
					}
					System.out.println(" ");
					
					System.out.println ("Maximo Numero Atomico = " + max);
					System.out.println ("Maximo Peso Atomico= " + maxp);
						
					lee.close();
				}
    
}
}