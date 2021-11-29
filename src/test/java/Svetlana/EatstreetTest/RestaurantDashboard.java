package Svetlana.EatstreetTest;

import ClasesToAllUs.TestInit;
import org.testng.annotations.Test;

public class RestaurantDashboard extends TestInit {
    @Test
    public void  restaurantDashboardOpened(){
        openUrl("Eatsteet");
    }
}
