To run the app invoke sbt as follows

```
sbt 'phase1/run-main PersonApp "John Worm" 10/10/1900'
```

Mind the quotation marks, you'd need to escape them

```
sbt "phase1/run-main PersonApp \"John Worm\" 10/10/1900"
```