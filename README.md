# BritishGasTest


he actual repository is to provide a solution to the first question of a quiz proposed by British Gas.

The project can be manually built by executing the following maven command:

mvn test assembly:single

A uber jar file will be then generated, by the name britishGasTest.jar. Such jar can be run by executing the following command:

java -jar britishGasTest.jar [target array] [source array]

Two arguments have to be provided:

1) The first array is the one to be used as target while looking for the starting position of the second (array) argument
2) the second array will be used to find its position within the first (array) argument

For example:

OK --> java -jar britishGasTest.jar 12345 45
WRONG --> java -jar britishGasTest.jar 1 2 3 4 5 4 5

As output, the program will provide the actual position of the second array within the first one


