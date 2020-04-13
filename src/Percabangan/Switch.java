package percabangan;

public class Switch {
    public static void mian(String[] args) {
        int jalanjalan=3;
        switch (jalanjalan){
            case 1:
                System.out.println("Buaya");
                break;
            case 2:
                System.out.println("Kadal");
                break;
            case 3:
                System.out.println("Ayam-ayam");
                break;
            case 4:
                System.out.println("Cicak");
                break;
            default:
                System.out.println("Binatang");
                break;
        }
    }
}
