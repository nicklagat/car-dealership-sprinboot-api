# Electric Vehicle API
### This Spring Boot application provides a RESTful API to manage Electric Vehicles (EVs).

### Features:
* Fetch a Specific EV: You can retrieve details of a specific EV using its unique ID. 
##### List All EVs: 
* Retrieve a list of all available EVs.
##### Create a New EV:
* Add a new EV to the list. A unique ID is automatically generated for each new EV. 
##### Delete an EV: 
* Remove a specific EV using its unique ID.

### API Endpoints:
* GET /electric-vehicles/{id}: 
* Fetch details of the EV with the specified ID.
POST /electric-vehicles: 
* Add a new EV. Provide EV details in the request body.
DELETE /electric-vehicles/{id}: 
* Delete the EV with the specified ID.
GET /electric-vehicles: 
* Fetch a list of all EVs.


### Setup and Run:
* Ensure you have Java and Maven installed. 
* Navigate to the root directory of the project. 
* Run the command: mvn spring-boot:run. 
* The application will start, and the API will be accessible at http://localhost:8080/electric-vehicles. 
* Note:
This application currently uses dummy data for demonstration purposes. In a real-world scenario, data persistence mechanisms like databases would be integrated.

