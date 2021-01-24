
package data.and.algorithm.lab1;


public class DataAndAlgorithmLab1  {

   
    public static void main(String[]    args)  {
       
        NoDupArray x = new NoDupArray(6);
        x.insert(9);
        x.insert(7);
        x.insert(3);   
        x.insert(8);
        x.display();
        x.delete(8);
        x.display();
    }

}

class NoDupArray {

    private long[] a;
    private int nElement;

    public NoDupArray(int max) {
        this.a = new long[max];
        this.nElement = 0;
    }

    public boolean find(long SearchKey) {
        for (int i = 0; i < this.nElement; i++) {
            if (this.a[i] == SearchKey) {
                return true;
            }
        }
        return false;
    }

    public void insert(long value) {
        if (this.nElement == a.length) {
            System.out.println("Array is full");
            return;
        } else {
            if (find(value)) {
                System.out.println("value already exsists.inserion terminte");
            } else {
                a[this.nElement] = value;
                this.nElement++;
            }
        }
    }
	class NoDupArray {

    private long[] a; 
    private int nElement;
 
    public NoDupArray(int max) {
        this.a = new long[max]; 
        this.nElement = 0;
    }

    public boolean find(long SearchKey) {
        for (int i = 0; i < this.nElement; i++) {
            if (this.a[i] == SearchKey)  {
                return true;
            }
        }
        return false;
    }

    public void insert(long value) {
        if (this.nElement == a.length) {
            System.out.println("Array is full");
            return;
        } else {
            if (find(value)) {
                System.out.println("value already exsists.inserion terminte");
            } else {
                a[this.nElement] = value;
                this.nElement++;
            }
        }
    }
    
    
    public boolean delete(long value){
    for(int i=0;i<this.nElement;i++){
    if(a[i]==value){
        for(int j=i;j<this.nElement-1;j++){
       this.a[j]= this.a[j+1];
        }
        this.nElement--;
        System.out.println("value deleted");
        return true;
    }
    }
     System.out.println("value not found.delete terminte");
        return false;
    }
    
    public void display(){
        System.out.println("value of array");
        for(int i=0;i<this.nElement;i++){
            System.out.print(this.a[i]+" ");
        }
        System.out.println();
    }
}
