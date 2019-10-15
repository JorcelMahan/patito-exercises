import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class EjDPA {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Introduce la cantidad de digitos");
        ArrayList<Integer> listaNumeros = new ArrayList<>();
        int n = Integer.parseInt(reader.readLine());
        for (int i = 0; i < n; i++) listaNumeros.add(Integer.parseInt(reader.readLine()));
        for (int i : listaNumeros) {
            System.out.println(dpa(i, sumaDeDivisores(i)));
        }
    }

    private static int sumaDeDivisores(int num) {
        int sumaDivisores = 0;
        for (int i = 1; i < num; i++) if (num % i == 0) sumaDivisores += i;
        return sumaDivisores;
    }

    private static String dpa(int num, int suma) {
        if (num == suma) return "Perfecto";
        else if (num > suma) return "Deficiente";
        else return "Abundante";
    }
}
