# JavaScript Reference Manual

**Write a reference manual for the Javascript language. For each of the following topics, provide a description and (where applicable) a simple example:**

### Values, data types -
  Every value  has a type which affects what kind of data it can store — for example in JavaScript a variable with a data type of **Boolean** only holds true/false values, whereas a **String** holds text strings, an **int** holds whole numbers, etc.  A value's data type also affects which operations are valid on that value. For example, an integer can be multiplied by an integer, but not by a string.   Literal values differ in how they are declared by their type as well.  Number values are expressed without quotes - 1,2,3
  Strings are expressed with either double quotes or single quotes, "1",'2'
  Booleans are always expressed in lower case - either true or false.

### Operations / Operators / Operands

An **operation** is a statement that uses one of the built-in **operators** to return a value.  Examples are assignment operations, arithmetic operations and logical operations.
An assignment operation example
```var x= 1;``` where we are assigning the value 1 to the variable x.

Arithmetic operators take numerical values (either literals or variables) as their operands and return a single numerical value. The standard arithmetic operators are addition (+), subtraction (-), multiplication (*), and division (/).

``// Number + Number -> addition
1 + 2 // 3``

``// Boolean + Number -> addition
true + 1 // 2``

``// Boolean + Boolean -> addition
false + false // 0``

``// Number + String -> concatenation
5 + 'foo' // "5foo"``

``// String + Boolean -> concatenation
'foo' + false // "foofalse"``

``// String + String -> concatention
'foo' + 'bar' // "foobar"
``

Remainder (%)
The remainder operator returns the remainder left over when one operand is divided by a second operand. It always takes the sign of the dividend, not the divisor. It uses a built-in modulo function to produce the result, which is the integer remainder of dividing var1 by var2 — for example — var1 modulo var2.

The grouping operator ( ) controls the precedence of evaluation in expressions. This operator consists of a pair of parentheses around an expression or sub-expression to override the normal operator precedence so that expressions with lower precedence can be evaluated before an expression with higher priority.

Examples

```
var a = 1;
var b = 2;
var c = 3;
// default precedence
a + b * c     // 7
// evaluated by default like this
a + (b * c)   // 7
// now overriding precedence
// addition before multiplication   
(a + b) * c   // 9
// which is equivalent to
a * c + b * c // 9
```

Logical operator examples include logical OR ''||'' and logical AND ''&&''
Logical operators are typically used with Boolean (logical) values. When they are, they return a Boolean value. However, the && and || operators actually return the value of one of the specified operands, **so if these operators are used with non-Boolean values, they may return a non-Boolean value.**

As logical expressions are evaluated left to right, they are tested for possible "short-circuit" evaluation using the following rules:

false && (anything) is short-circuit evaluated to false.
true || (anything) is short-circuit evaluated to true.

Examples:
```
a1 = true  && true      // t && t returns true
a2 = true  && false     // t && f returns false
a4 = false && (3 == 4)  // f && f returns false
a5 = 'Cat' && 'Dog'     // t && t returns Dog
o1 = true  || true       // t || t returns true
o2 = false || true       // f || t returns true
o3 = true  || false      // t || f returns true
o5 = 'Cat' || 'Dog'      // t || t returns Cat
```

Increment and decrement operators ''++'' and  '--', respectively.
These operator increment (adds one to) or decrements (subtracts one from) its operand and returns a value.

If used postfix, with operator after operand (for example, x++), then it returns the value before incrementing or decrementing.
If used prefix with operator before operand (for example, --x), then it returns the value after incrementing or decrementing.

Example:
```
// Postfix
var x = 3;
y = x++; // y = 3, x = 4
// Prefix
var a = 2;
b = --a; // a = 1, b = 1
```

**Operands** are the values that are being manipulated in the operation by the operators.
For example:
```
var a = 12 + 1; // 12 and 1 are the operands
var x= a + 20// a and 20 are the operands
```

### Variables, Var
 Variables store values in memory for use during the execution of the program. They are created in javaScript  with the "Var" keyword. Variables in a JavaScript program must be declared somewhere within scope before using it. Variables are declared with the var keyword. Storing a value in a variable is called variable initialization. You can do variable initialization at the time of variable creation or at a later point in time when you need that variable.

 ```
 var foo; \\ declared but not initialized
 foo = "assign to foo"; \\ assigning a value to an already declared variable
 var bar = foo; \\ declared and initialized in one statement
 ```

### Reserved Words
  JavaScript has a number of reserved words that you cannot use as identifiers. Reserved words have a specific meaning to the JavaScript language, as they are part of the language syntax. Using a reserved word causes a compilation error when loading your script.

  Examples:

  break, default, function, return, var, case, delete, if, switch, void, catch, do, in, this, while, const, else, instanceof, throw, with, continue, finally, let, try, debugger, for, newtypeof

### Statements vs. Expressions

   A **statement** is any valid piece of code that ends in a either a semi colon termination or is enclosed within {}.
      examples ``var a = true;``
               ``console.log("Write this out to console please");``
               ``if (x==y) {
                 do this stuff
               }``

   An **expression** is any part of a statement that evaluates to a value.  
    examples -
``(1 > 0)
a == false
indexOf(x,"y")``

### Variables , Values
 Variable values determine the type of the variable in javaScript.  JavaScript is an untyped language. This means that a JavaScript variable can hold a value of any data type. Unlike many other languages, you don't have to tell JavaScript during variable declaration what type of value the variable will hold. The value type of a variable can change during the execution of a program and JavaScript takes care of it automatically.

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

### if-else

    An IF-ELSE statement executes a block of code if a specified condition is true.  If the condition is false, another block of code can be executed.

    ```if (12 < 18) {
    "twelve is less than eighteen";
} else {
    "twelve is not less than eighteen";
}```

### While

    A WHILE loop is a control statement that allows code to be executed repeatedly based on a given boolean condition.  As long as the condition is true, the loop will continue to run.  The loop stops when the condition is false.

    ```while (i < 10) {
    text += "The number is " + i;
    i++;
}```

### for-in
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

### functions
  A JavaScript function is a block of code designed to perform a particular task.
  ex:
    function myFunction(a, b) {
      return a * b;                // Function returns the product of a and b
    }

  A JavaScript function is executed when "something" invokes it (calls it).
  ex:
    var x = myFunction(4, 3);     //result will be 8

### local vs. global variables
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

### Arrays

  Arrays are a collection of values, stored together as a single object.  Arrays in JavaScript can include multiple data types.  So, for example, the following two array formats are both valid:

  An array with values of the same type:
  ```var animals = ["dog", "squirrel", "fish"];```

  An array with values of different types:
  ```var myNewArray = [99, "david", true];```

  Values in the array can be accessed using the syntax ArrayName[indexValue].  So for example, if you wanted to call "squirrel" from the animals array above, the command animals[1] should be called.  This will return the value at index position 1, which is "squirrel".

### Objects
In JavaScript, almost everything is an object.  All JavaScript values, except primitives (i.e., 3.14, "John", true), are objects.  Objects are variables containing variables.  This syntax for creating an object looks like this:

For an object with a single variable:
var person = "John Doe";

For an object with multiple variables:
var person = {firstName:"John", lastName:"Doe", age:50, eyeColor:"blue"};

These variables inside objects are called properties.

### Methods
JavaScript methods are the actions that can be performed on objects.  There are many existing JavaScript methods, but you an also create your own methods.  You can create and call methods.


### The Different Uses of . [] {} ;
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

### object links
TBD - David

### anonymous functions
TBD - David

### Nested Function Scope / Closures
  Nested functions are functions within functions.  The advantage of nested functions is they have access to the scope "above" them which allows them to use variable declared in the parent.

  Closure allows a self-invoking function to access private variables within the parent.  The variable is protected by the scope of the anonymous function, and can only be changed using the add function.

  Example:

    var add = (function () {
      var counter = 0;
      return function () {return counter += 1;}
    })();

add();

### Exceptions
  When a JavaScript statement generates an error, it is said to throw an exception.  Instead of proceeding to the next statement, the JavaScript interpreter checks for exception handling code.  If there is no exception handler, then the program returns from whatever function threw the exception.  This is repeated for each function on the call stack until an exception handler is found or until the top level function is reached, causing the program to terminate.

  There are seven built in error objects: Error, Range Error, Reference Error, Syntax Error, Type Error, URIError, Eval Error

  <https://www.sitepoint.com/exceptional-exception-handling-in-javascript/>

### Try-Catch
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

### The Global Namespace

  Global namespace is the area where a developer can define variables that can be used anywhere within the code.  The global namespace should be used sparingly because items scoped globally will not be eligible for garbage collection.

Important Functions and Objects in the Global Namespace
  Global functions and objects are built into JavaScript and available at all times.

  JavaScript Global Property Examples:

    Infinity, NaN, undefined

  JavaScript Global Function Examples:

    String(), eval(), parseInt(), parseFloat()

  Global Object Examples:

    Number, Date, Math, String, Array

### DOM Methods and Properties
  The Document Object Model (DOM) is a cross-platform and language-independent application programming interface that treats an HTML, XHTML, or XML document as a tree structure wherein each node is an object representing a part of the document. The objects can be manipulated programmatically and any visible changes occurring as a result may then be reflected in the display of the document.[

  Essential DOM Methods:

  <https://www.impressivewebs.com/10-essential-dom-methods-techniques-for-practical-javascript/>

###Event Handlers
  Event Handlers are JavaScript code that execute JavaScript when something happens, such as pressing a button, moving your mouse over a link, submitting a form etc.
