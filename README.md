# ShopService: An Integrated Java Shopping System with Flexible Order Management


## Welcome! 👋


**The "ShopService" project is a simple shopping system that allows for the management of products and the placement of orders. It comprises several components, including ProductRepo for product management, OrderListRepo and OrderMapRepo for order management, and a central ShopService class to facilitate order placements.**

## The challenge

- **Product Management**:
  - Add, remove, and query products via the ProductRepo class.
- **Order Management**: 
  - Place new orders and ensure that the ordered products exist.
  - If a product doesn't exist, the system should notify the user.
  - Orders can be managed through either the OrderListRepo or the OrderMapRepo classes, both of which implement the OrderRepo interface.
- **Flexibility**: 
  - The design allows for easy switching between the OrderListRepo and OrderMapRepo by passing either to the ShopService constructor. This showcases the power of interfaces in Java, promoting flexibility and scalability.
