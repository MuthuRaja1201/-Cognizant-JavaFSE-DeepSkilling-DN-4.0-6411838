public class DependencyInjectionTest {
    public static void main(String[] args) {
        // Instantiate repository
        CustomerRepository repository = new CustomerRepositoryImpl();

        // Inject repository into service
        CustomerService service = new CustomerService(repository);

        // Use service to get customer details
        service.getCustomerDetails("C101");
    }
}
