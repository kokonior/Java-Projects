public class Selection_Sort {

    public static void main(String[] args) {

        //index ke- 0   1   2  3   4   5
        //          |   |   |  |   |   |
        int A[] = {27, 14, 29, 7, 15, 20};

        System.out.println("");
        System.out.println("=====Selection Sort=====");
        System.out.println("");
        System.out.println("=====Angka Sebelum Di Urut=====");
        for (int i = 0; i < A.length; i++) {
            System.out.print(A[i] + ", ");
        }
        System.out.println("");
        
        
        int i = 0;
        do{
            int k = i;
            int j = i + 1; //i=0 j=1
        do {
            if (A[j] < A[k]) {
                k = j;
            }else{
                j = j + 1;            }
        } while (!(j == A.length));
        int T = A[i];//T = 27
        A[i] = A[k];//A[0] = 7
        A[k] = T;//A[3] = 27
        
        System.out.println("=====Angka Setelah Di Urut===== (langkah ke- " + i + ")");
        for (int a = 0; a < A.length; a++) {
            System.out.print(A[a] + ", ");
        }
        System.out.println("");
        
        i = i+1;
        }while(i < A.length-1);
        

    }
