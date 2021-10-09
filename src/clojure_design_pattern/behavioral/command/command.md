# Command design pattern

Command pattern is **behaviour** design pattern

## Problem statement

Suppose we need to build a remote control for home automation system which shall control different lights/electrical units of the home. A single button in remote may be able to perform same operation on similar devices e.g. a TV ON/OFF button can be used to turn ON/OFF different TV set in different rooms.

First of all, let’s see how the problem can be solved with any design approach. Her the code of the remote control may look like

```
(if (= "Light" buttonName)
  ;; true - Do some operation related to Light
  ;; false- Do some other operation
  )
  ```

### But above solution apparently has many visible issues like –

* Any new item (e.g. TubeLight) will require change in the code of the remote control. You will need to add more if-elses.
* If we want to change the button for any other purpose, then we need to change the code as well.
* Finally, code is not clean and is tightly coupled and we are not following best practices like coding to interfaces etc.

## Advantages
* Makes our code scalable as we can add new commands without changing existing code.
* Increase loose-coupling between the invoker and the receiver using the command object.
