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

if-else
  Conditional statements are used to perform different actions based on different conditions.
  Use the if statement to specify a block of JavaScript code to be executed if a condition is true.
  Use the else statement to specify a block of code to be executed if the condition is false.
  Example:
  If we have to implement this condition in JavaScript "If the hour is less than 18, create a "Good day" greeting, otherwise "Good evening", it will be as follows...

    if (hour < 18) {
      greeting = "Good day";
    } else {
      greeting = "Good evening";
    }
  The result of greeting will be: Good day

while
  The while loop loops through a block of code as long as a specified condition is true.
  Example:
    In the following example, the code in the loop will run, over and over again, as long as a variable (i) is less than 10:
    while (i < 10) {
      text += "The number is " + i;
      i++;
    }

for
  The for statement creates a loop that consists of three optional expressions, enclosed in parentheses and separated by semicolons, followed by a statement (usually a block statement) to be executed in the loop.

  Syntax:
  for ([initialization]; [condition]; [final-expression])
   statement

  Example:
  The following for statement starts by declaring the variable i and initializing it to 0. It checks that i is less than nine, performs the two succeeding statements, and increments i by 1 after each pass through the loop.

    for (var i = 0; i < 9; i++) {
      console.log(i);
      // more statements
    }

for-in
  The for/in statement loops through the properties of an object.
  The block of code inside the loop will be executed once for each property.
  Note: Do not use the for/in statement to loop through arrays where index order is important. Use the for statement instead.
  example:
    var person = {fname:"John", lname:"Doe", age:25};
    var text = "";
    var x;
    for (x in person) {
      text += person[x];
    }

functions
  A JavaScript function is a block of code designed to perform a particular task.
  ex:
    function myFunction(a, b) {
      return a * b;                // Function returns the product of a and b
    }

  A JavaScript function is executed when "something" invokes it (calls it).
  ex:
    var x = myFunction(4, 3);     //result will be 8



local vs. global variables
  Local:
  Variables declared within a JavaScript function, become LOCAL to the function.
  Local variables have local scope: They can only be accessed within the function.
  Example:
    // code outside the below function cannot use carName variable.
    function myFunction() {
      var carName = "Volvo";
      // code here can use carName
    }
  Global:
  A variable declared outside a function, becomes GLOBAL.
  A global variable has global scope: All scripts and functions on a web page can access it.
  Example:
    carName can be used with in or outside the functions
    var carName = " Volvo";
    // code here can use carName
    function myFunction() {
      // code here can use carName
    }

###Arrays

  Arrays are a collection of values, stored together as a single object.  Arrays in JavaScript can include multiple data types.  So, for example, the following two array formats are both valid:

  An array with values of the same type:
  ```var animals = ["dog", "squirrel", "fish"];```

  An array with values of different types:
  ```var myNewArray = [99, "david", true];```

  Values in the array can be accessed using the syntax ArrayName[indexValue].  So for example, if you wanted to call "squirrel" from the animals array above, the command animals[1] should be called.  This will return the value at index position 1, which is "squirrel".

objects

###Methods

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
    https://www.impressivewebs.com/10-essential-dom-methods-techniques-for-practical-javascript/

###Event Handlers
  Event Handlers are JavaScript code that execute JavaScript when something happens, such as pressing a button, moving your mouse over a link, submitting a form etc.
