public class Imagine implements Element{

private String numeImagine;

    public Imagine(String numeImagine) {
        this.numeImagine = numeImagine;
    }

    public String getNumeImagine() {
        return numeImagine;
    }

    public void setNumeImagine(String numeImagine) {
        this.numeImagine = numeImagine;
    }



    @Override
    public void print() {
        System.out.println("image name is " + numeImagine);
    }
}
