<h1># Registration Form Page Task </h1> 
<p>using Selenium with java - Page Object Model (POM) 
  - Data Driven Test (Data Model) - Extent Report </p> 


<h2>#Test Case 1: Register Form Elements Is Visible</h2>

1. Launch browser
2. Navigate to url 'https://testing.todorvachev.com/'
3. Click On Test Scenario Link
4. Click On Register Form Link
5. Verify 'ElementsRegisterFormIsDisplayed' is visible


<h2>#Test Case 2: Register Form With Invalid Data</h2>

1. Launch browser
2. Navigate to url 'https://testing.todorvachev.com/'
3. Create an Object From 'RegisterFormPage'
4. Click On Test Scenario Link
5. Click On Register Form Link
6. Use DataModel and call 'registrationFormFeatureField' method 
7. Enter Invalid Data 'InvalidUserId'
8. Enter ValidData for "Password , Name , Address , Country , ZIPCode , about"
9. Enter Invalid Data 'Email'
10. Verify that RegisterUserCurrentUrl equal url after inserted invalid data and click on register button


<h2>Test Case 3: Register Form With Valid Data</h2>

1. Launch browser
2. Navigate to url 'https://testing.todorvachev.com/'
3. Click On Test Scenario Link
4. Click On Register Form Link
5. Use DataModel and call 'registrationFormFeatureSuccess' method
6. Enter ValidData for "UserID , Password , Name , Address , Country , ZIPCode , about"
7. Click 'Register' button
8. Click On 'Accept Alert' button
9. Verify that AllElementsRegisterFormIsDisplayed equals an Empty After Registered User is successfully