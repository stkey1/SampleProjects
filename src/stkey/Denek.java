/**
 * @throws every bugs is detected in this method
 * and sent special methods for throws
 * @return aciklama and id
 * @author stkey
 * @since 08-11-2022
 *
 */

package stkey;

public class Denek {
    public void cikart(int a, int b) throws BenimHatam, SeninHatan {
        if (a == 0) {
            throw new SeninHatan("a parametresi 0 geldi");
        }
        if (b == 0) {
            throw new SeninHatan("b parametresi 0 geldi");
        }
        int sonuc = (a + b)*(a-b);
        if (sonuc < 0) {
            throw new BenimHatam("Sonuc eksi", "bos1");
        } else if (sonuc == 0) {
            throw new BenimHatam("Sonuc sıfır", "bos2");
        } else {
            throw new BenimHatam("Sonuc Pozitif", "bos3");
        }
    }
}
