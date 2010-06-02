package ModelLag;



/**
 * The test class TEST.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class TEST extends junit.framework.TestCase
{
	private ModelLag.Supplier supplier1;
	private ModelLag.SupplierContainer supplier2;
	private ModelLag.Employee employee1;
	private ModelLag.EmployeeContainer employee2;
	private ModelLag.Login login1;
	private ModelLag.ProductDescription productD1;
	private ModelLag.ProductContainer productC1;
	private ModelLag.ProductDescription productD2;

	
	
	
	
	
	

	
	
	
	
	

	
	

    /**
     * Default constructor for test class TEST
     */
    public TEST()
    {
        supplier1 = new ModelLag.Supplier("Ib", "IBvej", 12345678, 123455, "Ibs biks");
		ModelLag.SupplierContainer.getInstance();
		supplier2 = new ModelLag.SupplierContainer();
		supplier2.addSupplier(supplier1);
		employee1 = new ModelLag.Employee("Kaj", "Kaj 3", 987654, 0);
		employee2 = new ModelLag.EmployeeContainer();
		employee2.addEmployee(employee1);
		login1 = new ModelLag.Login();
		login1.addEmployee(employee1);
		productD1 = new ModelLag.ProductDescription();
		productC1 = ProductContainer.getInstance();
		productC1.addProductDescription(productD1);
		productD2 = new ModelLag.ProductDescription(supplier1);
		productC1.addProductDescription(productD2);
    }
    
    public void testSalg()
    {
       supplier1 = new ModelLag.Supplier("Ib", "IBvej", 12345678, 123455, "Ibs biks");
		ModelLag.SupplierContainer.getInstance();
		supplier2 = new ModelLag.SupplierContainer();
		supplier2.addSupplier(supplier1);
		employee1 = new ModelLag.Employee("Kaj", "Kaj 3", 987654, 0);
		employee2 = new ModelLag.EmployeeContainer();
		employee2.addEmployee(employee1);
		login1 = new ModelLag.Login();
		login1.addEmployee(employee1);
		productD1 = new ModelLag.ProductDescription();
		productC1 = ProductContainer.getInstance();
		productC1.addProductDescription(productD1);
		productD2 = new ModelLag.ProductDescription(supplier1);
		productC1.addProductDescription(productD2);
    //    Sale saleObj = new Sale(1,1,null);
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    protected void setUp()
    {
		supplier1 = new ModelLag.Supplier("Ib", "IBvej", 12345678, 123455, "Ibs biks");
		ModelLag.SupplierContainer.getInstance();
		supplier2 = new ModelLag.SupplierContainer();
		supplier2.addSupplier(supplier1);
		employee1 = new ModelLag.Employee("Kaj", "Kaj 3", 987654, 0);
		employee2 = new ModelLag.EmployeeContainer();
		employee2.addEmployee(employee1);
		login1 = new ModelLag.Login();
		login1.addEmployee(employee1);
		productD1 = new ModelLag.ProductDescription();
		productC1 = ProductContainer.getInstance();
		productC1.addProductDescription(productD1);
		productD2 = new ModelLag.ProductDescription(supplier1);
		productC1.addProductDescription(productD2);
	}

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    protected void tearDown()
    {
    }
}
