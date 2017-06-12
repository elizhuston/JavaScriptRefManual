# My JS manual = big heading
**Bold** to `JS` - backticks to show excerpt as ```

```

```
```

```
Write a reference manual for the Javascript language. For each of the following topics, provide a description and (where applicable) a simple example:
values, data types
operations / operators / operands
variables, var
reserved words
statements vs. expressions
variables vs. values
if-else
while
for
for-in
functions
local vs. global variables
arrays
Arrays are a collection of values, stored together as a single object.  Arrays in JavaScript can include multiple data types.  So, for example, the following two array formats are both valid:

An array with values of the same type:
```var animals = ["dog", "squirrel", "fish"];```

An array with values of different types:
```var myNewArray = [99, "david", true];```

Values in the array can be accessed using the syntax ArrayName[indexValue].  So for example, if you wanted to call "squirrel" from the animals array above, the command animals[1] should be called.  This will return the value at index position 1, which is "squirrel".

objects
methods
**the different uses of . [] {} ;**
  . accessing/calling methods
  . accessing/assigning properties of objects
  [] creating arrays i.e.  var my ar= [1,2,3]
  [] access/assign to indexes of arrays ar[0]
  [] access/assign to key of object o["I'm a key"] =4
  {} bodies of functions,loops, if/else...
  {} compound statements
  {} create objects {foo:3, 'hi there':9}
  ; end of statement without {}
    ; separators between condition pre-post condition in for loops
    () surrounds condition
    () calling a function and methods (surrounds arguments)
    () control order of operations (2+3)/2
    () around function parameters in function statements


object links
anonymous functions
nested function scope / closures
exceptions
try-catch
the global namespace
important functions and objects in the global namespace
DOM methods and properties
event handlers
