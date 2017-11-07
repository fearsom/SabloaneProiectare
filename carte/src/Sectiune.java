import java.util.ArrayList;
import java.util.List;

public class Sectiune implements Element {

    private String titlu;
    private List<Element> continut= new ArrayList<>();



    public Sectiune(String titlu) {
        this.titlu = titlu;
    }

    public void addElement(Element e){
        continut.add(e);

    }




    @Override
    public void print(){
        System.out.println("sectiune " + titlu);
        for(Element e: continut){
            e.print();
        }

    }


}
