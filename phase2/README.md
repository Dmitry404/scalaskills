#### You can say hello to the Complex numbers

Run the app invoking the following

```
sbt "phase2/run-main ComplexNumbersApp"
```

#### I like big lines, at least those which are bigger than 10-symbols length. Would you like to know how many such lines inside a file? 

Run this app passing a path to file as first parameter 

```
sbt "phase2/run-main LinesInFileApp build.sbt"
```

Don't worry about file existence, the app will notify that you passed a wrong path 

```
sbt "phase2/run-main LinesInFileApp /tmp/ololo.txt"
```