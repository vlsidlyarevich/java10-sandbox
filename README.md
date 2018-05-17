# Java10-Sandbox
My try outs in java 10.

## Compile and run
Open the project in favorite terminal and run following commands:
```console
javac -d "./out/http" $(find . -path \*http/\*.java)
 ```
```console
javac -d "./out/bootstrap" -p "./out/http" $(find . -path \*bootstrap/\*.java)
``` 
```console 
java -p 'out' -m com.github.vlsidlyarevich.java10_sandbox.bootstrap/com.github.vlsidlyarevich.java10_sandbox.bootstrap.Main
```