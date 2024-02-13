# Instructions  

## PRACTICUM 24 - Special Variable this in Java.<br>

### BACKGROUND
Object-oriented programming languages normally provide
a way for an object instance to refer to itself. In 
Java, this is provided by the special variable `this`.
<br><br>
**One Use of Special Variable this**<br>
One use of variable `this` is to access instance
variables that are *masked* by the same named
variable within the function scope of a given method,
as given below:
```java
public class SomeClass {
  private int x;

  // constructor
  public SomeClass(int x) {
    this.x = x;
  }
  // etc.
```
Here, there is instance variable `x` at the top of
the class, and there is parameter `x` in the
constructor. Thus, there are two things with the
identifier name `x`. 
<br><br>
There is a rule that there are two (or more) entities
with the same identifier name, the entity referenced
is the **most closely defined** entity. Thus, when `x` is used in the constructor, it
refers to parameter `x`. 
<br><br>
Since the constructor needs
to set parameter `x` to the value of instance variable
`x`, it needs to somehow refer to the instance
variable. It does this by using `this.x`. Since
`this` refers to itself, `this.x` is like looking
for variable `x` from **outside** the object. From
the outside, the `x` that is seen is instance
variable `x`, since parameter `x` of the constructor
is only visible from within the function scope of
the constructor.<br><br>
**Other Uses of Special Variable this**<br>
There are other, more important uses of special 
variable `this` that we will not mention here.<br>

### WHAT TO DO<br>
- `Correct` the code in the Circle class so that the
program executes properlt.
- `Run the predefined test` to ensure that the main has been properly updated.
