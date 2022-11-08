/**
 * @throws benimhatam bugs are explained here
 * @return detailed explaining bugs are sent again
 * @author stkey
 * @since 08-11-2022
 *
 */
package stkey;

public class BenimHatam extends Exception {
    private String bos;

    public BenimHatam() {
    }

    public BenimHatam(String aciklama) {
        super(aciklama);
    }

    public BenimHatam(String aciklama, String bos) {
        super(aciklama);
        this.bos = bos;
    }

    public String getLocalizedMessage() {
        switch (bos) {
            case "bos1": return "Sonuc negatif hatası";
            case "bos2": return "Sonuc sıfır hatası";
            case "bos3": return "Sonuc pozitif hatası";
            default: return "Hep hata veriyor bide ben veriyim hatasu";
        }
    }

    public String getId() {
        return bos;
    }
}



