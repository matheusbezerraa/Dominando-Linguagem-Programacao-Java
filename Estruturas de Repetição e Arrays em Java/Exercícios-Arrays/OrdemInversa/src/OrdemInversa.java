public class OrdemInversa {
    public static void main(String[] args) throws Exception {

        int[] vetor = {-5,-6,15,50,8,4};
        int count = 0;

        System.out.println("vetor: ");       
        while(count < (vetor.length-1)){
            System.out.print(vetor[count]+" ");
            count++;
        }
        System.out.println("\nvetor: ");
        for (int i = (vetor.length -1); i >= 0; i--){
            System.out.print(vetor[i]+" ");  
        }
        System.out.println("\nvetor: ");
        count=(vetor.length-1);
        while(count>=0){
            System.out.print(vetor[count] + " ");
            count--; 
        }
    }
}
