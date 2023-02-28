import java.util.List;

class Mahasiswa {
    private String id;
    private String namaMahasiswa;
}

class Matakuliah {
    private String kodeMatkul;
    private String namaMatkul;
    private List<Mahasiswa> mahasiswa;
}

class KartuRencanaStudi {
    private String id;
    private String namaMahasiswa;
    private Matakuliah matakuliah;

    public KartuRencanaStudi(String id, String namaMahasiswa){
        this.id = id;
        this.namaMahasiswa = namaMahasiswa;
    }
    
    public void setMatakuliah(Matakuliah value){
        this.matakuliah = value;
    }

    public final Matakuliah getMatakuliah(){
        return matakuliah;
    }
}