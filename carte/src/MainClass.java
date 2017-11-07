import java.util.ArrayList;
import java.util.List;

public class MainClass {

    public static void main(String[] args) {

        List<Autor> autori = new ArrayList<Autor>();
        autori.add(new Autor("autor1"));

        Sectiune sectiunea1 = new Sectiune("Sectiunea1");

        sectiunea1.addElement(new ImageProxy("imagine"));
        sectiunea1.addElement(new Tabel("tabel"));


        Carte carte = new Carte("Carte",new Cuprins("cuprins"),autori);

        carte.addElement(sectiunea1);
        carte.print();

    }
}
