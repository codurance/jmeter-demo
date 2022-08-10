# JMeter simple demo

## How to use

### First steps
Run the project as a simple Spring Boot application. This will make available two endpoints

* `/hello` which is a simple `GET` endpoint that returns a ` "Hello World!"` message
* `/event` which is a simple `POST` endpoints that receives a payload with the following structure
  * ```json
        {
          "id": "some string id",
          "date": "A Date with ISO format (like 2016-05-28T17:39:44.937)",
          "payload": "some simple string payload"
        } 
    ```
  * The endpoint will then return the same json payload as a response


### JMeter
The JMeter section is mostly based on the demo provided by https://github.com/craighurley/jmeter-load-test so all kudos to him

First, install [JMeter](https://jmeter.apache.org/). You can easily do it by using [SDKMan](https://sdkman.io/)

Then follow the instructions as specified [here](/jmeter-load-test/README.md)

After the test finishes, you can find results in the `reports` folder.
Some statistics are available for you in the `reports/<Specific Report>/statistics.json` which you can read and analyze for your basic fitness function
* Example: You could read the `MeanResTime` (Mean Response Time) and trigger an action based on the number


