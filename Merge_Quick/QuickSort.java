public class QuickSort {
    
    public QuickSort(){}
    
    public int partition(int[] A, int ini, int fim){
        int pivo = A[ini];
        int i = ini-1;
        int j = fim+1;
        int aux;
        
        while(true){
            do{
                i+=1;
            }while(A[i]<=pivo);
            
            do{
                j-=1;
            }while(A[j]>pivo);
            
            if(i>=j)
                break;
                
            aux = A[i];
            A[i] = A[j];
            A[j] = aux;
        }
        
        aux = A[ini];
        A[ini] = A[j];
        A[j] = aux;
        
        return i++;
    }

    public void sorting(int[] A, int e, int d){
        if(e<d){
            int q = partition(A,e,d);
            sorting(A,e,q-1);
            sorting(A,q+1,d);
        }
    }
}
