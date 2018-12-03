# Cloud Foundary - Patient Service.

- This project is a representation of how we can use spark framework to create restful service and update it the pivotal cloud foundary.

### Pre Requisite
- Create a free account in pivotal network to get access to pivotal web service.
### TODO: 
- The patient service application is basic and does not yet contain the complete implementation.
- This has the bare bones of how [spark](http://sparkjava.com) can be used to bring up a simple restful application.

### PCF Changes
- This project will be updated with service binding and user service binding features.

### How to run and push to could

- Build the project using ```gradlew build``` or ```gradlew.bat build```
- Run application locally ```gradle run```
- Make a jar using ```gradlew jar```

- Push the built jar to cloud ```cf push <app name> ./<built jar> --random-route```
this has tobe executed from the folder containing the build jar.
- The standard out will provide the url to access in order to access you service.

