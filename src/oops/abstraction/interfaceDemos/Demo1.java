package oops.abstraction.interfaceDemos;

public class Demo1 {
    public static void main(String[] args) {
        TenantService tenantService = new TenantServiceImpl();
        tenantService.createTenant();

        MessageServiceImpl messageService = new MessageServiceImpl();
        messageService.sendMessage("");
        messageService.pushMessage();
    }
}
