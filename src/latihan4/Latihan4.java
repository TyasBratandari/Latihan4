package latihan4;
public class Latihan4 {

    public static void main(String[] args) {
         
            int sukuAwal = 5; 
            int selisih = 5;
            int updateNilai;
            int total;
            
            for(int a = 0; a < 5 ; a++){ 
                for(int b = 0; b< a; b++){
                    updateNilai = sukuAwal;
                    sukuAwal += selisih;
                    System.out.print(" " +updateNilai);
                }
                System.out.println(" ");
            }
    }
    
}
