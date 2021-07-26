import java.util.Scanner; 
public class loop {

  
    public static void main(String[] args) {
        ///input angka dll
        Scanner input = new Scanner (System.in);
        int i,muncul,awal;
        System.out.println("berapa deret yang ingin di munculkan");
        muncul = input.nextInt();
        awal = 3;
        ///i adalah angka
        i = 1;
        /// angka diulang sebanyak berapa kali yang kita ingin munculkan
        while(i<=muncul){
            ///di print 
            System.out.print(awal+" ");
            i++;
            ///selisih loncatan pada setiap angka
            awal+=5;                    
        }
       
       
  
           }
      }
     
        
        
     
    
    

