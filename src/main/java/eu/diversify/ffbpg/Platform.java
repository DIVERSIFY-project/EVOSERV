package eu.diversify.ffbpg;

/**
 *
 * @author ffl
 */
public class Platform {
    protected String name;
    protected SortedIntegerCollection providedServices;

    public String getName() {
        return name;
    }

    public SortedIntegerCollection getProvidedServices() {
        return providedServices;
    }
    
    public Platform(String name) {
        this.name = name;
        providedServices = new SortedIntegerCollection();
    }
}
