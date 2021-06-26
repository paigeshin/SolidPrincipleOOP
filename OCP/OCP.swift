class InsurancePremiumDiscountCalculator {
    
    public func calculatePremiumDiscountPercent(customer: CustomerProfile) -> Int {
        if customer.isLoyalCustomer() {
            return 20
        }
        return 0
    }
}

public protocol CustomerProfile {
    func isLoyalCustomer() ->  Bool
}


class HealthInsuranceCustomerProfile: CustomerProfile {
    func isLoyalCustomer() -> Bool {
        return true
    }
}

class VehicleInsuranceCustomerProfile: CustomerProfile {
    func isLoyalCustomer() -> Bool {
        return true
    }
}


class ViewController: UIViewController {

    override func viewDidLoad() {
        super.viewDidLoad()
        // Do any additional setup after loading the view.
        
        
        let discountRate = InsurancePremiumDiscountCalculator().calculatePremiumDiscountPercent(customer: HealthInsuranceCustomerProfile())
        print(discountRate)
        
    }


}

