package cf.redlyst.reservasi.Data;

/**
 * Created by Ayo Maju on 28/01/2018.
 */

public class DataMenu {
    private String Jam,Tersedia;

    public DataMenu() {
    }

    public DataMenu(String jam, String tersedia) {
        Jam = jam;
        Tersedia = tersedia;
    }

    public String getJam() {
        return Jam;
    }

    public void setJam(String jam) {
        Jam = jam;
    }

    public String getTersedia() {
        return Tersedia;
    }

    public void setTersedia(String tersedia) {
        Tersedia = tersedia;
    }
}
