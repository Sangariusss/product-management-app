# Product Management App

## Table of Contents

- [Overview](#overview)
- [Features](#features)
- [Usage](#usage)
- [File Structure](#file-structure)
- [Contributions](#contributions)
- [License](#license)

## Overview
This project is a Spring MVC web application designed to manage products and their categories. It allows users to create, view, edit, and delete products. The application demonstrates the use of Spring MVC for handling web requests, Thymeleaf for rendering dynamic HTML content, and Spring Data for interacting with a relational database.

### Features
- **Product Management**: Create, read, update, and delete products.
- **Category Management**: Associate products with categories for better organization.
- **Thymeleaf Integration**: Utilizes Thymeleaf for dynamic web page content.
- **Pagination**: Supports pagination for listing products efficiently.
- **Filtering**: Filters products based on category and price range.

## Usage
1. **Setup and Deployment**:
    - Clone the repository to your local machine.
    - Build the application using Maven.
    - Configure your database in the `application.properties` file.
    - Run the application.

2. **Access the Application**:
    - Open your web browser and navigate to `http://localhost:8080/main` to access the main page. From there, you can navigate between all available pages of the application, including the product listing and forms for adding or editing products.

3. **Interacting with the Application**:
    - Click on a product name to view its details.
    - Use the "Add New Product" button to create a new product.
    - Use the edit option to update existing products.
    - Delete products to manage your inventory.

## File Structure
- `src/main/java/com/sangarius/productmanagementapp/`: Java source files for controllers, models, and repositories.
    - `ProductController.java`: Controller for managing product-related requests.
    - `CategoryController.java`: Controller for managing category-related requests.
    - `HomeController.java`: Controller for handling the main page and navigation.
    - `ProductSpecification.java`: Class for defining product specifications and filters.
    - `Product.java`: Model class representing a product.
    - `Category.java`: Model class representing a product category.
    - `ProductRepository.java`: Repository interface for managing product storage and retrieval.
    - `CategoryRepository.java`: Repository interface for managing category storage and retrieval.
    - `ProductService.java`: Service class for handling business logic related to products.
    - `CategoryService.java`: Service class for handling business logic related to categories.
    - `ProductManagementAppApplication.java`: Main class for running the Spring application.

- `src/main/resources/templates/`: Directory for Thymeleaf templates.
    - `main.html`: Template for the main page, providing navigation to other sections.
    - `productList.html`: Template for displaying the list of products.
    - `productForm.html`: Template for creating and editing products.
    - `categoryList.html`: Template for displaying the list of categories.
    - `categoryForm.html`: Template for creating and editing categories.

- `src/main/resources/static/css/`: Directory for CSS stylesheets.
    - `styles.css`: Stylesheet for application styling.

- `src/main/resources/application.properties`: Configuration file for the Spring application, including database settings.

## Contributions
Contributions, feedback, and suggestions are welcome. If you have any improvements or find issues, please submit a pull request or open an issue.

## License
This project is licensed under the MIT License. See the [LICENSE](LICENSE) file for details.
