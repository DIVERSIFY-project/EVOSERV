package eu.diversify.ffbpg;

import eu.diversify.ffbpg.collections.SortedIntegerSet;
import eu.diversify.ffbpg.random.IntegerGenerator;
import eu.diversify.ffbpg.random.IntegerSetGenerator;
import java.util.ArrayList;

/**
 *
 * @author Franck Fleurey
 */
public class RandomGenerator {

   

    /**
     * ************************************************************************
     * Factory to create pseudo-random applications, platforms and services
     * ***********************************************************************
     */
    public ArrayList<Service> createServices(int n_services) {
        ArrayList<Service> services = new ArrayList<Service>();
        for (int i = 0; i < n_services; i++) {
            services.add(new Service("S" + i));
        }
        return services;
    }
    
    public SortedIntegerSet[] createRandomServiceSets(ArrayList<Service> services, int length, IntegerGenerator size_generator, IntegerSetGenerator sets_generator, int min_size) {
        SortedIntegerSet[] result = new SortedIntegerSet[length];
        for (int i = 0; i < length; i++) {
            result[i] = new SortedIntegerSet();
            int n_services = size_generator.getNextInteger(min_size, services.size());
            int[] ridx = sets_generator.getRandomIntegerSet(services.size(), n_services);
            for (int j = 0; j < n_services; j++) {
                result[i].add(ridx[j]);
            }
        }
        return result;
    }
    
}
