public class InsuerancePremiumDiscountCalculator {

    public int calculatePremiumDiscountPercent(CustomerProfile customer)
 {
     if(customer.isLoyalCustomer()) {
         return 20; 
     } 
     return 0; 
 }

}


public interface CustomerProfile {
    public boolean isLoyalCustomer(); 
}


public class HealtInsuranceCustomerProfile implements CustomerProfile {

    @Override 
    public boolean isLoyalCustomer() {
        return true; //or false 
    }

}

public class VehicleInsuranceCustomerProfile implements CustomerProfile {

    @Override 
    public boolean isLoyalCustomer() {
        return true; //or false 
    }

}