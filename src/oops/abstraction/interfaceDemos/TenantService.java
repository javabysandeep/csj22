package oops.abstraction.interfaceDemos;

public interface TenantService {

    // Instance variables are not allowed in the interface.
    // by default, they are public static final
    int number = 100;

    // Instance method are not allowed in the interface.
    // by default methods are public abstract
    void createTenant();

    // Constructors are not allowed in interface
    // TenantService(){};
}
