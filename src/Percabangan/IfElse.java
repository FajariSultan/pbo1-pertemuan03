package Percabangan;

public class IfElse {
    public static void main(String[] args) {
        double totalBelanja =53000;
        double UangDiDompet =25000;

        if(UangDiDompet<totalBelanja){
            System.out.println("Uang kurang, kurangi jajan anda");
        }else {
            System.out.println("Uang cukup,selamat menikmati");
        }
    }
}