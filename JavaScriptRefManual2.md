# My JS manual = big heading
**Bold** to `JS` - backticks to show excerpt as ```

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

### Statements vs. Expressions
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

while

for

for-in

functions

local vs. global variables

arrays

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
###The Global Namespace

  Global namespace is the area where a developer can define variables that can be used anywhere within the code.  The global namespace should be used sparingly because items scoped globally will not be eligible for garbage collection.

###Important Functions and Objects in the Global Namespace

###DOM Methods and Properties
  The Document Object Model (DOM) is a cross-platform and language-independent application programming interface that treats an HTML, XHTML, or XML document as a tree structure wherein each node is an object representing a part of the document. The objects can be manipulated programmatically and any visible changes occurring as a result may then be reflected in the display of the document.[

  Essential DOM Methods

  https://www.impressivewebs.com/10-essential-dom-methods-techniques-for-practical-javascript/
###Event Handlers
  Event Handlers are JavaScript code that execute JavaScript when something happens, such as pressing a button, moving your mouse over a link, submitting a form etc.
