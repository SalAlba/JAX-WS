# Create simple CRUD in JAVA using SOAP/JAX-WS

## How To run
We assume you are in the main folder(__src__).

````
|_src
  |_ server
  |_ client
  |_ README.md
	
````
	
### For Windows 
1. `$ javac server/*.java`
2. `$ start java server.FactoryServer` __OR__ `$ start java server/FactoryServer`
3. `$ wsimport -keep -p client http://localhost:9999/factoryService?wsdl`
4. `$ javac client/FactoryClient.java` __OR__ `$ javac client/*.java`
5. `$ java client.FactoryClient` __OR__ ` $ java client/FactoryClient`


## Some popular error

1.  could not find or load main class problem in java to fix it type the command  below in cmd
  >
  > $ SET PATH=%PATH%;C:\Program Files\Java\???JDK???\bin
  >
  > SET PATH=%PATH%;C:\Program Files\Java\jdk1.8.0_152\bin
  >