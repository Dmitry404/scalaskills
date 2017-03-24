#### Want to know about a Person and its age?

To run the app invoke sbt as follows

```
sbt 'phase1/run-main PersonApp "John Worm" 10/10/1900'
```

Mind the quotation marks, you'd need to escape them

```
sbt "phase1/run-main PersonApp \"John Worm\" 10/10/1900"
```

#### Looking for Prime numbers?

To run the app invoke sbt as follows

```
sbt "phase1/run-main Primes 10 15 20"
```

or like this

```
sbt "phase1/run-main Primes 10 15 27"
```

#### Want to know the Sum of odd numbers?

To run the app invoke sbt as follows

```
sbt "phase1/run-main Sum 1 2 3"
```