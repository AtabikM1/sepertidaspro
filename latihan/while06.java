package latihan;

public class while06 {
    public static void main(String[] args){
        int i = 1;
        while (i<=10) {
            if (i % 2 == 0) {
                System.out.println("angka "+ i +" adalah bilangan genap");
            } else {
                System.out.println("angka "+ i +" adalah bilangan ganjil");
            }
            i++;
        }   
    }
}
