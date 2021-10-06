package percobaan_2;

public class ClassA {

    protected int x;
    protected int y;

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void getNilai() {
        System.out.println("nilai x:" + x);
        System.out.println("Nilai y:" + y);
    }
}
