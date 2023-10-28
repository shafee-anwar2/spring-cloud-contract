package contracts

import org.springframework.cloud.contract.spec.Contract

Contract.make {

    description "should return product by id=1"

    request {
        url "/products/1"
        method GET()
    }

    response {
        status OK()
        headers {
            contentType applicationJson()
        }
        body(
                "productId": "1",
                "name": "iphone",
                "price": 1099.99
        )
    }
}