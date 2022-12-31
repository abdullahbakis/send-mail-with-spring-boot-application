# Send Mail with Spring Boot Application
This repository contains a Spring Boot application that demonstrates how to send emails using the JavaMail API and an email service provider (such as Gmail). The application allows users to enter the recipient, subject, and body of an email and sends the email upon submission.

## Getting Started
These instructions will get you a copy of the project up and running on your local machine for development and testing purposes.

### Prerequisites
Java 8 or higher
Maven
An IDE (such as IntelliJ IDEA)
A Gmail account with less secure app access enabled (see below)

### Installing
Clone the repository to your local machine:
git clone https://github.com/abdullahbakis/send-mail-with-spring-boot-application.git
Import the project into your IDE as a Maven project.

In the application.properties file, enter your Gmail username and password in the spring.mail.username and spring.mail.password properties, respectively.

Run the project as a Spring Boot application.

Open a web browser and navigate to http://localhost:8080 to access the application.

Enter the recipient, subject, and body of the email and click "Send" to send the email.

### Enabling Less Secure App Access for Gmail
In order to use your Gmail account to send emails, you need to enable less secure app access. Here's how:

Go to the Google Account security page.

Scroll down to the "Third-party apps with account access" section and click on "Manage third-party access".

In the "Allow less secure apps" section, select "Turn on".
Note: Enabling less secure app access may make your account more vulnerable to unauthorized access. It is recommended to use a separate, dedicated email account for this purpose.

## Built With
Spring Boot - The web framework used
Maven - Dependency Management
Spring Boot DevTools - Used for automatic reloading of the application during development
JavaMail - Used for sending emails
Thymeleaf - Used for rendering HTML templates on the server side
## Authors
Abdullah Bakış - abdullahbakis
## License
This project is licensed under the MIT License - see the LICENSE file for details.

## Acknowledgments
This project was developed as a learning exercise and is based on the Sending Email with Spring Boot guide from the Spring documentation.
