# native-image-debug-test

- For https://github.com/apache/shardingsphere-elasticjob/pull/2428 .

- Execute the following command on Ubuntu 22.04.4 with `SDKMAN!` installed.

```shell
sdk install java 22.0.2-graalce

sudo apt update && sudo apt upgrade -y
sudo apt install build-essential gdb -y
sudo apt install gdbserver -y

git clone git@github.com:linghengqian/native-image-debug-test.git
cd ./native-image-debug-test/
sdk use java 22.0.2-graalce
./mvnw -PnativeTestInCustom -T1C -e clean test
```
- Set a breakpoint.
- 

```shell
gdbserver :12345 ./target/native-tests --xml-output-dir ./target/native-test-reports -Djunit.platform.listeners.uid.tracking.output.dir=./target/test-ids
```