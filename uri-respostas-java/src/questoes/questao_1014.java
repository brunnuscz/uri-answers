package questoes;

import java.text.DecimalFormat;
import java.util.Scanner;

public class questao_1014 {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner entrada = new Scanner(System.in);
		double A = entrada.nextDouble();
        double B = entrada.nextDouble();
        double T = (A / B);
        DecimalFormat df = new DecimalFormat("0.###");
        String S = df.format(T);
        System.out.printf(S+" km/l%n");

	}

}
