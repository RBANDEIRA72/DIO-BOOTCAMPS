import java.io.*;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class CombinaStrings {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int tamanho = 0;

        int N = Integer.parseInt(br.readLine());

        for (int i = 0; i < N; i++) {

            String resultado = "";
            String letrasRestantes = "";

            String str = br.readLine();
            String s[] = str.split(" ");

            if ( s[0].length() < s[1].length() ) {
                tamanho = s[0].length();
                letrasRestantes = s[1].substring(tamanho,s[1].length());

            } else {
                tamanho = s[1].length();
                letrasRestantes = s[0].substring(tamanho,s[0].length());
            }

            for (  int j=0; j < tamanho ; j++) {
			    resultado += s[0].substring(j,j+1) + s[1].substring(j,j+1);
            }

            resultado = resultado + letrasRestantes;

            System.out.println(resultado);
        }

    }

}