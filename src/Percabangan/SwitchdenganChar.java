package Percabangan;

public class SwitchdenganChar {
    public static void main(String[] args) {
        char nilai='D';
        switch (nilai){
            case 'A':
                System.out.println("Mhs   :\"Terima kasih pak\"");
                System.out.println("Dosen :\"Selamat ya nak!!\"");
                break;
            case 'B':
                System.out.println("Mhs   :\"Kenapa ulun kada dapat A, pak\"");
                System.out.println("Dosen :\"!#$%^*\"");
                break;
            case 'C':
                System.out.println("Mhs   :\"Ulun turun pul pak ay,tugas ngumpul jua\"");
                System.out.println("Dosen :\"Tapi bisa lah menjawab soal ujian?\"");
                System.out.println("Mhs   :\"hihihihi..\"");
                break;
            default:
                System.out.println("Mhs   :\"ulun turun pul pak, tugas pul jua\"" );
                System.out.println("Dosen :\"Bujur jua kah?\"");
                System.out.println("Dosen :\"memeriksa berkas\"");
                System.out.println("Dosen :\"Menceleng");
                System.out.println("Mhs   :\"kabur..\"");
                break;
        }
    }
}