public class Tabel implements  Element{
    private String tabelName;

    public Tabel(String tabelName) {
        this.tabelName = tabelName;
    }

    public String getTabelName() {
        return tabelName;
    }

    public void setTabelName(String tabelName) {
        this.tabelName = tabelName;
    }

    @Override
    public String toString() {
        return "Tabel{" +
                "tabelName='" + tabelName + '\'' +
                '}';
    }


    @Override
    public void print() {
        System.out.println("tabel e " + tabelName);

    }
}
