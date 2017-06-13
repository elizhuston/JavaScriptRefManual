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

### Reserved Words
  JavaScript has a number of reserved words that you cannot use as identifiers. Reserved words have a specific meaning to the JavaScript language, as they are part of the language syntax. Using a reserved word causes a compilation error when loading your script.

  Examples:

  break, default, function, return, var, case, delete, if, switch, void, catch, do, in, this, while, const, else, instanceof, throw, with, continue, finally, let, try, debugger, for, newtypeof

###Statements vs. Expressions
   a statement is any valid piece of code that ends in a either a semi colon termination or is enclosed within {}.
      examples var a = true;
               console.log("Write this out to console please");
               if (x==y) {
                 do this stuff
               }

   An expression is anything that evaluates to a value.  
    examples - "(1 > 0), "a == false", "indexOf(x,"y")"

variables vs. values

###if-else

    An IF-ELSE statement executes a block of code if a specified condition is true.  If the condition is false, another block of code can be executed.

    ```if (12 < 18) {
    "twelve is less than eighteen";
} else {
    "twelve is not less than eighteen";
}```

###while

    A WHILE loop is a control statement that allows code to be executed repeatedly based on a given boolean condition.  As long as the condition is true, the loop will continue to run.  The loop stops when the condition is false.

    ```while (i < 10) {
    text += "The number is " + i;
    i++;
}```

###for

    A FOR loop is a control statement that allows code to be executed a number of times.  That number is set within the for loop syntax.  A FOR loop contains three statements:

    - Statement 1 is executed before the loop (the code block) starts.

    - Statement 2 defines the condition for running the loop (the code block).

    - Statement 3 is executed each time after the loop (the code block) has been executed.

    ```for (i = 0; //Statement 1
      i < 5; //Statement 2
      i++ //Statement 3
      ) {
    text += "The number is " + i + "<br>"; //Code to be executed each time the FOR loop executes a loop
}```

for-in

functions

local vs. global variables

###Arrays

  Arrays are a collection of values, stored together as a single object.  Arrays in JavaScript can include multiple data types.  So, for example, the following two array formats are both valid:

  An array with values of the same type:
  ```var animals = ["dog", "squirrel", "fish"];```

  An array with values of different types:
  ```var myNewArray = [99, "david", true];```

  Values in the array can be accessed using the syntax ArrayName[indexValue].  So for example, if you wanted to call "squirrel" from the animals array above, the command animals[1] should be called.  This will return the value at index position 1, which is "squirrel".

objects

###Methods

###The Different Uses of . [] {} ;
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

###Nested Function Scope / Closures
  Nested functions are functions within functions.  The advantage of nested functions is they have access to the scope "above" them which allows them to use variable declared in the parent.

  Closure allows a self-invoking function to access private variables within the parent.  The variable is protected by the scope of the anonymous function, and can only be changed using the add function.

  Example:

    var add = (function () {
      var counter = 0;
      return function () {return counter += 1;}
    })();

add();

###Exceptions
  When a JavaScript statement generates an error, it is said to throw an exception.  Instead of proceeding to the next statement, the JavaScript interpreter checks for exception handling code.  If there is no exception handler, then the program returns from whatever function threw the exception.  This is repeated for each function on the call stack until an exception handler is found or until the top level function is reached, causing the program to terminate.

  There are seven built in error objects: Error, Range Error, Reference Error, Syntax Error, Type Error, URIError, Eval Error

  <https://www.sitepoint.com/exceptional-exception-handling-in-javascript/>

###Try-Catch
  The try statement allows you to define a block of code to be tested for errors while it is being executed.

  The catch statement allows you to define a block of code to be executed, if an error occurs in the try block.

  The finally statement lets you execute code, after try and catch, regardless of the result.
  Example:
    
    try {
      int result = divide(2,1);
      System.out.println(result);
      } catch (BadNumberException e) {
        //do something clever with the exception
        System.out.println(e.getMessage());
      }

###The Global Namespace

  Global namespace is the area where a developer can define variables that can be used anywhere within the code.  The global namespace should be used sparingly because items scoped globally will not be eligible for garbage collection.

Important Functions and Objects in the Global Namespace

###DOM Methods and Properties
  The Document Object Model (DOM) is a cross-platform and language-independent application programming interface that treats an HTML, XHTML, or XML document as a tree structure wherein each node is an object representing a part of the document. The objects can be manipulated programmatically and any visible changes occurring as a result may then be reflected in the display of the document.[

  Essential DOM Methods:

  <https://www.impressivewebs.com/10-essential-dom-methods-techniques-for-practical-javascript/>

###Event Handlers
  Event Handlers are JavaScript code that execute JavaScript when something happens, such as pressing a button, moving your mouse over a link, submitting a form etc.
