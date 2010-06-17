/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package ModelLag;

import java.util.ArrayList;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author nn119171
 */
public class SupplierContainerTest {

    public SupplierContainerTest() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    /**
     * Test of getInstance method, of class SupplierContainer.
     */
    @Test
    public void testGetInstance() {
        System.out.println("getInstance");
        SupplierContainer expResult = null;
        SupplierContainer result = SupplierContainer.getInstance();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getSupplierList method, of class SupplierContainer.
     */
    @Test
    public void testGetSupplierList() {
        System.out.println("getSupplierList");
        SupplierContainer instance = new SupplierContainer();
        ArrayList expResult = null;
        ArrayList result = instance.getSupplierList();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setSupplierList method, of class SupplierContainer.
     */
    @Test
    public void testSetSupplierList() {
        System.out.println("setSupplierList");
        ArrayList<Supplier> supplierList = null;
        SupplierContainer instance = new SupplierContainer();
        instance.setSupplierList(supplierList);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addSupplier method, of class SupplierContainer.
     */
    @Test
    public void testAddSupplier() {

        System.out.println("addSupplier");
        SupplierContainer supContainer = SupplierContainer.getInstance();
        //create customer
        Supplier supObj1 = new Supplier("Ole", "Olegade 5", 12345678, 59595956, "Oles auto", 1);
        supContainer.addSupplier(supObj1);
    }

    /**
     * Test of removeSupplier method, of class SupplierContainer.
     */
    @Test
    public void testRemoveSupplier() {
        System.out.println("removeSupplier");
        int id = 0;
        SupplierContainer instance = new SupplierContainer();
        Supplier expResult = null;
        Supplier result = instance.removeSupplier(id);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

}