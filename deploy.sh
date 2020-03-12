cd %WORKSPACE%\auto_driver
mvn clean
mvn install
mvn package
cd %WORKSPACE%\auto_driver\target
java -jar OnlineJudge-1.0-SNAPSHOT.jar