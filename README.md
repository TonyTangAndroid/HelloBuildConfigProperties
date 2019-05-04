## System environment, gradle properties & BuildConfig.java

The first value is defined by gradle command line param, which could specify the value through -P.
You could run command to try it out.

```./gradlew :app:installDebug -Pdynamic=true```


The second value is defined by your system environment variable, which is usually defined in `.bash_profile` or `.zsh_rc`.


```export MAVEN_URL=https://jitpack.io```
(Example)

So it is the third.