#jenkins中命令合成一行，可以增加step（每个step仅一行，保证可以每个step按序执行）
mvn clean install package
#linux中可以用nohup java -jar ...jar实现后台运行
java -jar %WORKSPACE%\target\OnlineJudge-1.0-SNAPSHOT.jar