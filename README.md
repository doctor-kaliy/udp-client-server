## Simple multithreaded client-server console application
There are nonblocking versions for both client and server
Client sends request string to the Server, which responds "Hello, $(request string's content)"
### Used:
  - Standard Java library
  - UDP connection
### Client
- Expected five arguments:
    1. hostname or ip-address
    2. port
    3. request string
    4. number of parallel request threads
    5. number of requests in each thread.
- To run client one of the following classes should be used:
    - HelloUDPClient
    - HelloUDPNonblockingClient
  
### Server
- Expected two arguments:
    1. port for receiving requests
    2. number of worker threads that will process the requests
- To run server one of the following classes should be used:
    - HelloUDPServer
    - HelloUDPNonblockingServer
  
### Launch
  launch.sh script can be used to launch both client and server. You need to specify classname first and all arguments needed then.
  
  Examples: 
  - ``` ./launch.sh HelloUDPClient localhost 8080 beer 228 1337 ``` (expected response: Hello, beer)
  - ``` ./launch.sh HelloUDPServer 8080 7 ```
