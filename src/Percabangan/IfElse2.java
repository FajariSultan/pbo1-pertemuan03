package Percabangan;

public class IfElse2 {
   public static void main(String[] args) {
       double totalBelanja = 25000;
       double uangdiDompet = 50000;

       if(uangdiDompet<totalBelanja) {
           System.out.println("Uang kurang, kurangi jajan anda");
       }else{
           System.out.println("Uang cukup, berelaan lah");
       }
   }
}
