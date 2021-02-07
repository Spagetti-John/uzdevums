# uzdevums
A simple project

# How to build a runnable jar
To build a runnable jar you must have maven and Java-11 installed

```mvn clean compile assembly:single```
or run maven goal `clean compile assembly:single`

.jar file will be available in `target/` directory

# How to run unit tests?

For full test, run following command

```mvn clean test```

Test report will be available in `target/surefire-reports` directory
