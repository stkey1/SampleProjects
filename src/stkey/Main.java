/**
 * @throw benimhatam and seninhatan bugs are sent
 * @return bug results is showed
 * @author stkey
 * @since 08-11-2022
 *
 */

package stkey;

public class Main {

    public static void main(String[] args) {
        System.out.println("-----------------");
        try {
            Denek firlatim = new Denek();
            firlatim.cikart(1, 0);
            firlatim.cikart(1, 0);
            firlatim.cikart(2, 2);
            firlatim.cikart(200, -200);
            firlatim.cikart(5, -6);
        } catch (BenimHatam e1) {
            System.out.println(e1.getLocalizedMessage());
            System.out.println("Benim Hata  Bulundu ve Fırlatıldı");
        } catch (SeninHatan e2) {
            System.out.println("Senin Hata bulundu ve Fırlatıldı");
        } finally {
            System.out.println("Sonuc olarak hata var");
        }
    }
}
