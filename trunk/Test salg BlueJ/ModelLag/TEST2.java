package ModelLag;



/**
 * The test class TEST2.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class TEST2 extends junit.framework.TestCase
{
    /**
     * Default constructor for test class TEST2
     */
    public TEST2()
    {
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    protected void setUp()
    {
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    protected void tearDown()
    {
    }

	public void testOpretSalg()
	{
		ModelLag.Supplier supplier3 = new ModelLag.Supplier("Ib", "Bo", 12345, 1234, "Ibs biks");
		ModelLag.SupplierContainer supplier4 = new ModelLag.SupplierContainer();
		supplier4.addSupplier(supplier3);
		ModelLag.Employee employee3 = new ModelLag.Employee("Bo", "Voresvej", 678908, 0);
		ModelLag.EmployeeContainer employee4 = new ModelLag.EmployeeContainer();
		employee4.addEmployee(employee3);
		ModelLag.Login login2 = new ModelLag.Login();
		login2.addEmployee(employee3);
		ModelLag.ProductDescription productD3 = new ModelLag.ProductDescription();
		ModelLag.ProductDescription productD4 = new ModelLag.ProductDescription("Søm", 34.89, 15, 1234, 12345, 2, supplier3, 3, 4, 2222);
		ModelLag.ProductContainer productC2 = new ModelLag.ProductContainer("Voresvej", "Q 3");
		productC2.addProductDescription(productD3);
		productC2.addProductDescription(productD4);
	}
}

