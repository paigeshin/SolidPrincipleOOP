//
//  ViewController.swift
//  DependencyInversion
//
//  Created by paige shin on 2021/06/27.
//

import UIKit

//high level module
class ProductCatalog {
    
    let productRepository: ProductRepository
    
    init(productRepository: ProductRepository) {
        self.productRepository = productRepository
    }
    
    
    func displayProductName() {
        let names = productRepository.getListOfProductNames()
        
        //display product
        print(names)
    }
    
}

class ProductFactory {
    
    static func create() -> SQLProductRepository {
        return SQLProductRepository()
    }
    
}

//Abstraction
protocol ProductRepository {
    
    func getListOfProductNames() -> [String]
    
}

//Low Level Module
class SQLProductRepository: ProductRepository {
 
    func getListOfProductNames() -> [String] {
        return ["Hello", "World"]
    }
    
}

class ViewController: UIViewController {

    override func viewDidLoad() {
        super.viewDidLoad()
        
        let productRepository = ProductFactory.create()
        let productDisplay = ProductCatalog(productRepository: productRepository)
        productDisplay.displayProductName()
        
    }


}

