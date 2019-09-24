

public class MergeSort {
    public MergeSort(){}
    
    public void sorting(int[] A, int e, int d) {
        if(e<d){
            int m = e+(d-e)/2;
            sorting(A,e,m);
            sorting(A,m+1,d);
            merge(A,e,m,d);
        }
    }
    
    public void merge(int[] A, int e, int m, int d) {
        int i,j,k;
        int n1 = m-e+1;
        int n2 = d-m;
        
        int[] E = new int[n1];
        int[] D = new int[n2];
        
        for(i=0;i<n1;i++) {
            E[i] = A[e+i];
        }
        for(j=0;j<n2;j++) {
            D[j] = A[m+1+j];
        }
        
        i=0;
        j=0;
        k=e;
        
        while(i<n1 && j<n2) {
            if(E[i] <= D[j]){
                A[k] = E[i];
                i++;
            } else {
                A[k] = D[j];
                j++;
            }
            k++;
        }
        
        while(i<n1) {
            A[k] = E[i];
            i++;
            k++;
        }
        
        while(j<n2) {
            A[k] = D[j];
            j++;
            k++;
        }
    }

}
