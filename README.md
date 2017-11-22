## Install Kotlin on Mac
```bash
brew install kotlin
```
Or
```bash
curl -s https://get.sdkman.io | bash
sdk install kotlin
```

## Run kotlin file
Let's say you have a kotlin file called: hello.kt

1. Compile kt -> .jar
```
kotlinc hello.kt -include-runtime -d hello.jar
```
2. Run by java
```
java -jar hello.jar
```

While we can write a shell command to run these two command in one time. Edit your ~/.zshrc as below:
```
# Kotlin starts
export PATH=$PATH:/usr/local/bin/kotlin
function kotlinr() {
  echo Compiling, please wait...
  kotlinc $1 -include-runtime -d out.jar
  java -jar out.jar
}
# Kotlin ends
```
Then,
```
source ~/.zshrc
```

now you can run kt file as:
```
kotlinr hello.kt
```

