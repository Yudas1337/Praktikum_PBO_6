package tugas;

public class Dosen extends Pegawai {

    public int jumlahSKS;
    public int TARIF_SKS = 100000;

    Dosen(String nip, String nama, String alamat, int gaji) {

        super(nip, nama, alamat, gaji);
    }

    public void setSKS(int sks) {
        this.jumlahSKS = sks;
        super.gaji += (this.jumlahSKS * this.TARIF_SKS);
    }

    // idk what this is used for ?
    public int getGaji() {
        return super.getGaji();
    }

}
