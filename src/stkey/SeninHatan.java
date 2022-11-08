/**
 * @throws seninhatan bugs are explained here
 * @return nothing is sent
 * @author stkey
 * @since 08-11-2022
 *
 */
package stkey;

public class SeninHatan extends Exception {
    public SeninHatan() {
    }

    public SeninHatan(String aciklama) {
        super(aciklama);
    }

}
