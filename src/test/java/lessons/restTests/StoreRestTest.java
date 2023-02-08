package lessons.restTests;

import org.testng.Assert;
import org.testng.annotations.Test;
import rest.StoreController;
import rest.entity.Store;

import java.io.IOException;

public class StoreRestTest {
    StoreController storeController = new StoreController();
    @Test(priority = 1)
    public void storeGetTest() throws IOException {
        Assert.assertEquals(storeController.findInventory(),200);
    }

    @Test(priority = 3)
    public void storeIdGetTest() throws IOException {
        Assert.assertEquals(true, storeController.findPurchaseById(2));
    }

    @Test(priority = 2)
    public void createStoreRequest() throws IOException {
        Store store = new Store();

        store.setId(2);
        store.setPetId(144);
        store.setQuantity(4);
        store.setShipDate("2023-02-04T20:34:54.334Z");
        store.setStatus("approved");
        store.setComplete(true);

        Assert.assertEquals(true, storeController.createOrder(store).getComplete());
        System.out.println("Request is sent");
    }

    @Test(priority = 4)
    public void deleteRequest() throws IOException {
        Assert.assertEquals(200, storeController.deleteRequest(2));
    }

}
