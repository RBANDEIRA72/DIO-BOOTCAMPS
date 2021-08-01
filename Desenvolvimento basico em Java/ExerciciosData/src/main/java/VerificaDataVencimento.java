import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class VerificaDataVencimento {

    public static void main(String[] args) {

        Calendar dataVencimento = Calendar.getInstance();

        Integer diaVencimento = 14;

        dataVencimento.set(21,7,diaVencimento );

        //int dayOfWeek = dataVencimento.get(Calendar.DAY_OF_WEEK);
        //System.out.println(dayOfWeek);

        dataVencimento.set(21,7,diaVencimento + 10 );

        int dayOfWeek = dataVencimento.get(Calendar.DAY_OF_WEEK);
        //System.out.println(dayOfWeek);

        if (dayOfWeek == 1) {

            System.out.println("Vencimento no Sábado. Você tem 12 dias para pagar.");
        }
        else if (dayOfWeek == 2) {

            System.out.println("Vencimento no Domingo. Você tem 11 dias para pagar.");
        }
        else {
            System.out.println("Vencimento dia de Semana. Você tem 10 dias para pagar.");
        }

        Date agora = new Date();

        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");

        String dataFormatada = formatter.format(dataVencimento);

        System.out.println(dataFormatada);
        // 14/07/2019

    }

}
