# BritishGasTest


The actual repository is to provide a solution to the first question of a quiz proposed by British Gas.

The project can be manually built by executing the following maven command:

mvn test assembly:single

A uber jar file will be then generated, by the name britishGasTest.jar. Such jar can be run by executing the following command:

java -jar britishGasTest.jar [target array] [source array]

Two arguments have to be provided:

1. The first array is the one to be used as target while looking for the starting position of the second (array) argument
2. the second array will be used to find its position within the first (array) argument

For example:

1. OK --> java -jar britishGasTest.jar 12345 45
2. WRONG --> java -jar britishGasTest.jar 1 2 3 4 5 4 5

As output, the program will provide the actual position of the second array within the first one

## Behaviour

The project contains two classes: Main and ArrayUtil. 

The first one will let a user, from the command line, execute the program by providing in input two arrays (target and source). As result, the actual position of the source array  within the target one will be given in output. In case no match is found, "-1" is returned.

The second class, ArrayUtil, provides three static methods by the name "indexOfSubList", which would accept as input parameter either Strings, integers or Integers. The first two parse the arguments into Integer arrays, and then they call the third method, which would find the position of the source array within the target array by means of "java.util.Collections" package (in particular, the static method indexOfSubList is used). 

## JAVA 8

The actual project has been developed by means of Java 8, to take advantage of the new library java.util.stream.

