import java.io.*;
import java.net.*;
import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;
import java.util.Objects;

public class Task1 {
    private static final String FILENAME = "temploki.csv";

    public static void main(String[] args) {
        FileReader file;
        BufferedReader stream = null;
        URL url;
        String line;
        String[]columnNames = new String[0];
        String[]paivat = new String[0];
        boolean header = true;
        try{
            url = new URL("https://users.metropolia.fi/~jarkkov/temploki.csv");
        } catch (MalformedURLException e) {
            System.err.println(e);
            return;
        }

        try {
            InputStream input = url.openStream();
            InputStreamReader inputReader = new InputStreamReader(input);
            BufferedReader reader = new BufferedReader(inputReader);
            StringBuilder response = new StringBuilder();
            int ulko = 0;
            int paiva = 0;
            int count = 0;
            double sum = 0;
            while ((line = reader.readLine()) != null){
                if(header) {
                    columnNames = line.split(";");
                    header = false;
                    for(String column: columnNames){
                        if(column.equals("UlkoTalo")){
                            break;
                        }
                        ulko++;
                    }
                    /*for(String column: columnNames){
                        if(column.equals("Paiva")){
                            break;
                        }
                        paiva++;
                    }*/
                } else {
                    paivat = line.split(" ");
                    String[] data = line.split(";");
                    if(Objects.equals(paivat[paiva], "01.01.2023")){
                        String s = data[ulko];
                        s = s.replaceAll(",", ".").trim();
                        double d = Double.parseDouble(s);
                        sum =+ d;
                        count++;
                    }
                }
            }
            double avg = (double) sum / count;
            System.out.println("Average temperature outside during 01.01.2023 was " + avg);
            inputReader.close();
            System.out.println(response.toString());
        } catch (IOException e){
            System.err.println(e);
        } finally {
            try{
                if(stream != null)
                    stream.close();
            } catch (Exception e){
                System.out.println("Error while closing the file " + FILENAME);
            }
        }
    }
}
