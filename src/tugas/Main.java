package tugas;

public class Main {

    public static void main(String[] args) {
        DaftarGaji dg1 = new DaftarGaji(5);
        Pegawai p1 = new Pegawai("NIP1", "YUDAS MALABI", "KEPANJEN", 1000000);
        Pegawai p2 = new Pegawai("NIP2", "SHINE DEVI", "MALANG", 2000000);
        Pegawai p3 = new Pegawai("NIP3", "ARYA ADMAJA", "BALIKPAPAN", 3000000);
        Dosen d1 = new Dosen("NIP_DOSEN_1", "BU MUSTIKA MENTARI", "POLITEKNIK NEGERI MALANG", 5000000);
        Pegawai p4 = new Pegawai("NIP4", "WELSON MARIO", "MALANG", 4000000);
        d1.setSKS(12);

        dg1.addPegawai(p1);
        dg1.addPegawai(p2);
        dg1.addPegawai(p3);
        dg1.addPegawai(d1);
        dg1.addPegawai(p4);
        dg1.printSemuaGaji();
    }

}
