package job5.latihanBubblesort;

public class Bubblesort {
    public int[] data;
    public int jmDt;
    
    public Bubblesort(int Data[], int jmlDt){
        jmDt=jmlDt;
        data = new int[jmlDt];
        for(int i=0; i<jmlDt; i++){
            data[i]=Data[i];
        }
    }
    
    public void sortData(){
        int temp=0;
        for(int i=0; i<jmDt;i++){
            for(int j=1; j<(jmDt-i);j++){
                if(data[j-1]>data[j]){
                    temp = data[j];
                    data[j]= data[j-1];
                    data[j-1]= temp;
                }
            }
        }
    }
    
    public void tampilkanData(){
        for(int i=0;i<jmDt;i++){
            System.out.print(data[i] + " ");
        }
        System.out.println("");
    }
    
}
