package operator;

public class OperatorUnary {
    public static void main(String[] args) {
        int i = 0;
        i++;                    //i tadi 0 ditambahkan 1 sehingga i = 1
        System.out.println(i);  //betuljan i nilainya 1
        i++;                    //karena i tadinya sudah bernilai 1 maka sekarang ditambahkan lagi 1 menjadi 2
        System.out.println(i);  //tuh betulakan i nilainya 2
        i=i+1;                  // bisa dilihat i++ sama dengan i = i+1
        System.out.println(i);  // i tadi 2 sekarang jadi 3

        //Berlaku juga untuk penambahan angka lain dan operator aritmatik lain
        i+=3; //sama dengan i = i+3
        System.out.println(i);

        i+=3;
        System.out.println(i);

        i*=3; //sama dengan i = i*3
        System.out.println(i);

        i*=3;
        System.out.println(i);

    }
}
