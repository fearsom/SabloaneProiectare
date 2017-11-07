public class ImageProxy implements Element {

    private String fileName;
    private Imagine img=null;

    public ImageProxy(String fileName) {
        this.fileName = fileName;
    }

    public void print(){
        if(img==null)
            img=new Imagine(fileName);
        img.print();


    }

}
