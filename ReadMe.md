EGEN ORDER PROCESSING

Steps to run the application:

Run this command to build the docker image:
  1.  Clone the repository: https://github.com/vinay-vemuri/egen-order-processing
  2.	Open terminal in the project directory
  3.	Run docker-compose up
 
Application Documentation/Swagger URL:
http://localhost:8082/swagger-ui/

ORDER SERVICE REST APIs:
 1. Create Order  API:
    Description: This API is used to create a new order.
    Endpoint: http://localhost:8082/orderservice/createOrder
    Request:
    {
      "customer_id":"30",
      "address_line_1": "hyd",
      "address_line_2": "hyd",
      "city": "hyd",
      "item_Price": "34",
      "item_Qty": "2",
      "item_name": "apple",
      "method": "test",
      "no_of_Cards_Used": "56",
      "payment_confirmation_number": "789",
      "payment_method": "card",
      "shipping_Charges": "45",
      "state": "ohio",
      "status": "ok",
      "subtotal": "56",
      "tax": "4",
      "total_amount": "70",
      "zip": "500035"
    }
    Response:
    {
      "orderId": "2fa61547-80bc-4920-bc9e-fe8ec8a19e76",
      "message": "Created Order  Successfully",
      "customer_id": "30"
    }
    
 2. Cancel Order API:
    Description: This API is used to cancel the existing order
    Endpoint: http://localhost:8082/orderservice/cancelOrder
    Request:
    {
        "orderId": "2fa61547-80bc-4920-bc9e-fe8ec8a19e76"
    }
    Response:
    {
      "orderId": "2fa61547-80bc-4920-bc9e-fe8ec8a19e76",
      "message": "Order Successfully Cancelled",
      "customer_id": "30"
    }
    
 3. Find Order By Id API:
    Description: This API is used to get the details of the existing orders.
    Endpoint: http://localhost:8082/getOrderById/{id}
    Request: http://localhost:8082/orderservice/getOrderById/2fa61547-80bc-4920-bc9e-fe8ec8a19e76
    
    Response:
    {
      "address_line_1": "hyd",
      "address_line_2": "hyd",
      "shipping_Method_id": "46b9e4b1-0528-4b64-8898-450fa57c74cf",
      "order_id": "2fa61547-80bc-4920-bc9e-fe8ec8a19e76",
      "subtotal": "56",
      "tax": "4",
      "total_amount": "70",
      "method": "test",
      "state": "ohio",
      "payment_method": "card",
      "item_id": "0cf97c94-b86f-4a74-ad95-32bbb392776b",
      "zip": "500035",
      "city": "hyd",
      "item_Price": "34",
      "item_name": "apple",
      "item_Qty": "2",
      "customer_id": "30",
      "address_id": "2968434d-18c4-46e3-9174-b5460f623e6b",
      "status": "NEW",
      "shipping_Charges": "45",
      "no_of_Cards_Used": "56",
      "billing_Address_id": "433ca5db-dc84-4786-9bc1-2e93be833c37"
    }

ENTITY RELATIONSHIP DIAGRAM: 
![Vinay_Project](https://user-images.githubusercontent.com/71419507/116293335-c6465b80-a764-11eb-8d53-d3719e092d8d.png)
