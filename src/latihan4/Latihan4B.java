package latihan4;
public class Latihan4B {
    public static void main(String[] args){
        
        int sukuAwal = 5;
        int selisih = 5;
        int updateNilai;
        int total =0;
        
      for(int a = 0; a < 4; a++ ){
          for(int b = a ; b < 4; b++){
              updateNilai = sukuAwal;
              sukuAwal += selisih;
              
          
          System.out.print(" " + updateNilai);
          total += updateNilai;
      }
          System.out.println(" ");
    }
}
}
