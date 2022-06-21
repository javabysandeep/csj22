package oops.abstraction.interfaceDemos;

public class TenantServiceImpl implements TenantService{
    @Override
    public void createTenant() {
        System.out.println("Tenant created!!");
    }
}
