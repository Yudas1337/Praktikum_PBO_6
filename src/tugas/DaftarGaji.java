package tugas;

public class DaftarGaji {

    public Pegawai[] listPegawai;
    private int idx;

    DaftarGaji(int jumlah) {
        this.listPegawai = new Pegawai[jumlah];
    }

    protected void addPegawai(Pegawai pegawai) {
        if (idx < this.listPegawai.length) {
            this.listPegawai[idx] = pegawai;
            idx++;
        } else {
            System.out.println("Data sudah penuh");
        }
    }

    protected void printSemuaGaji() {
        int index = 0;
        for (Pegawai pegawai : this.listPegawai) {
            if (index < idx) {
                System.out.println("Nip     : " + pegawai.getNip());
                System.out.println("Nama    : " + pegawai.getNama());
                System.out.println("Alamat  : " + pegawai.getAlamat());
                System.out.println("Gaji    : " + pegawai.getGaji());
                index++;
            }

        }
    }

}
