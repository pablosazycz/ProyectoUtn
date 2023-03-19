
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Main {
    public static void main(String[] args) {
        String pronostico = "C:\\Users\\pablo\\Desktop\\Utn Java\\pronostico.csv";
        String resultados = "C:\\Users\\pablo\\Desktop\\Utn Java\\resultados.csv";
        Object[] lineasResultado = null;
        Object[] lineasPronostico = null;
        try {
            lineasResultado = Files.readAllLines(Paths.get(resultados)).toArray();
            for (Object linea : lineasResultado){
                System.out.println(linea.toString());

            }
            lineasPronostico = Files.readAllLines(Paths.get(pronostico)).toArray();
            for (Object linea : lineasPronostico){
                System.out.println(linea.toString());

            }

        } catch (IOException e) {
            e.printStackTrace();
        }




    }
}