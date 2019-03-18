public class Ex5{
    public static void main(String[] args){
       int[] array = {1,2,3,4,5,6,7,8,9,10};
       
       System.out.println("Maior diferença esta entre os membros: " + maiorDiferenca
    }
    public static int maiorDiferenca(int... numeros){
        int i,diferença;
        
        
        for(int i = 0; i < array.length; i++){
            if(array[i+1]>array[i]){
                diferença=array[i+1]-array[i];
        }
    }
}
