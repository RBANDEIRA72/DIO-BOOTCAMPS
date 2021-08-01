import java.util.Date;
import java.time.LocalDateTime;


public class DataNascimento {

    public static void main(String[] args) {
        LocalDateTime dataNasc = LocalDateTime.of(1972,6,14,10,00,00);
        LocalDateTime dataParaComparar = LocalDateTime.of(2010,5,15,10,10,10);

        if(dataNasc.isAfter(dataParaComparar)){
            System.out.println("A data de nascimento é posterior a data comparada.");
        }
        if(dataNasc.isBefore(dataParaComparar)){
            System.out.println("A data comparada é posterior a data de nascimento.");
        }
        //if(dataNasc.isAfter(dataParaComparar)){
        //    System.out.println("A data de nascimento é anterior a data.");
        //}

    }

}
