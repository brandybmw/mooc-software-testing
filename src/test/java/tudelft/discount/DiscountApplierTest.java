package tudelft.discount;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import tudelft.invoicemocked.Invoice;
import tudelft.invoicemocked.InvoiceDao;
import tudelft.invoicemocked.InvoiceFilter;

import java.util.Arrays;
import java.util.List;

/*The DiscountApplier class is responsible for applying the new discounts on the
prices of the product. If the category of the product is HOME, the new price should
now be 90% of the old price. If the category of the product is BUSINESS, the new
price should be 110% of the old price.

You will have to use mocks to simulate the ProductDao class, the one responsible
for getting all the products from the database.
*/
/* Test template
@Test
public void testMethodName() {
        int result = new ClassName().methodName(parameter);
        Assertions.assertEquals(expected,result);
        } */
// class DiscountApplier
// method setNewPrices
// Product (String name, double price, String category)
public class DiscountApplierTest {

    @Test
    public void checkSetNewPricesHome() {
        // creates 2 new products
        Product pen = new Product("SpecialPen", 5, "BUSINESS");
        Product candle = new Product("SpecialCandle", 10, "HOME");

        // mock() method from Mockito receives the class to mock (Invoice database)
        // Mockito returns the same type of class
        ProductDao mockedDao = Mockito.mock(ProductDao.class);

        // creates list of the new products as an in-memory list
        List<Product> ProductList = Arrays.asList(pen, candle);
        // ARRANGE: returns a list of products when the method all() is invoked.
        // .when instructs it to return the fake list when called
        Mockito.when(mockedDao.all()).thenReturn(ProductList);

        // MOCK: creates a mocked database
        DiscountApplier apply = new DiscountApplier(mockedDao);

        //ACT
        apply.setNewPrices();

        //INSTANTIATE product object to test
        Product product = mockedDao.all().get(0);

        // ASSERT: test
        Assertions.assertEquals(0.9*5, product.getPrice());

    }

    @Test
    public void checkSetNewPricesBusiness() {
        // creates 2 new products
        Product pen = new Product("SpecialPen", 5, "BUSINESS");
        Product candle = new Product("SpecialCandle", 10, "HOME");

        // mock() method from Mockito receives the class to mock (Invoice database)
        // Mockito returns the same type of class
        ProductDao mockedDao = Mockito.mock(ProductDao.class);

        // creates list of the new products as an in-memory list
        List<Product> ProductList = Arrays.asList(pen, candle);
        // ARRANGE: returns a list of products when the method all() is invoked.
        // .when instructs it to return the fake stuff when called
        Mockito.when(mockedDao.all()).thenReturn(ProductList);

        // MOCK
        DiscountApplier apply = new DiscountApplier(mockedDao);

        //ACT
        apply.setNewPrices();

        //INSTANTIATE product object to test
        Product product = mockedDao.all().get(1);

        // ASSERT: test
        Assertions.assertEquals(1.1*10, product.getPrice());

    }

}
