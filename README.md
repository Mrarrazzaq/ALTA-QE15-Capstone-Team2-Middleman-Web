# Selenium Web Project

## Overview
This project is a Selenium-based web testing framework written in Java. It uses Maven for build automation and dependency management, and Cucumber for writing test scenarios in a readable BDD (Behavior Driven Development) format.

## Tools and Technologies
- **Java 21**: The programming language used for writing the test scripts.
- **Maven**: Build automation tool used for managing project dependencies and running tests.
- **IntelliJ IDEA**: Integrated Development Environment (IDE) used for development.
- **Cucumber for Java**: Plugin for IntelliJ IDEA that supports Cucumber, enabling BDD testing with Gherkin syntax.

## Getting Started

### Prerequisites
- **Java 21**: Make sure Java 21 is installed on your system.
- **Maven**: Ensure Maven is installed and properly configured.
- **IntelliJ IDEA**: Recommended IDE for development.
- **Cucumber for Java plugin**: Install the Cucumber for Java plugin in IntelliJ IDEA.

### Installation
1. **Clone the repository**:
   ```bash
   git clone github.com/wisnuwm/ALTA-Selenium.git
   cd ALTA-Selenium
2. **Open the project in IntelliJ IDEA**:
Open IntelliJ IDEA.
Select File > Open and navigate to the ALTA-Selenium directory.
IntelliJ IDEA will automatically detect the Maven project and import dependencies.
3. **Install dependencies**:
Maven will automatically download and install the necessary dependencies specified in the pom.xml file.

### Running the test
* To run the tests, use the Maven command:
```shell
mvn clean verify
```

