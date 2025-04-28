package rocks.zipcode.quiz4.collections.culonary;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author leon on 27/12/2018.
 */
public class Food {

    List<Spice> spiceList;

    public Food() {
            this.spiceList = new ArrayList<>();
    }

    public Food(ArrayList<Spice> list) {this.spiceList = list;}

    public List<Spice> getAllSpices() {
        return this.spiceList;
    }

    public <SpiceType extends Class<? extends Spice>> Map<SpiceType, Integer> getSpiceCount() {
        Map<SpiceType, Integer> spiceMap = new HashMap<>();
//        for (Spice spice : this.spiceList) {
//            if (!spiceMap.containsKey(spice)) {
//                spiceMap.put(spice, 1);
//            } else {
//                spiceMap.put(spice, spiceMap.get(spice) + 1);
//            }
//        }
        return spiceMap;
    }

    public void applySpice(Spice spice) {
        spiceList.add(spice);
    }
}
