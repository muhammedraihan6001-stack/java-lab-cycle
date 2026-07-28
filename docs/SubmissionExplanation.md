# One-Page Explanation

This submission contains three Java projects that demonstrate the use of abstract classes, abstract methods, and interfaces in a practical way.

## Why an abstract class was used
An abstract class was used in Task 1 and Task 3 to define a common structure for related classes. Both systems share common data such as student or robot identity, and common behavior such as displaying details or starting the system. The abstract class allowed the program to enforce a standard design while leaving the specific calculation or mission behavior to the subclasses.

## Why interfaces were used
Interfaces were used in Task 2 and Task 3 where objects needed to support extra capabilities such as Wi-Fi, voice control, music, video streaming, flying, swimming, or climbing. Interfaces are suitable when classes need to share behavior without inheriting the same implementation. They also support multiple inheritance of type, which is not possible with classes in Java.

## Where multiple inheritance was required
Multiple inheritance was required in Task 2 and Task 3 when a single device or robot had to support more than one capability. For example, a SmartPhone implements Wi-Fi, voice control, music, and video streaming features at the same time, and a MultiTerrainRescueRobot implements fly, swim, and climb capabilities together. This is naturally handled by interfaces.

## Could the program be implemented using only classes?
The programs could partly be implemented with classes, but not as cleanly. Classes can support inheritance, but they cannot provide multiple inheritance of behavior. Interfaces make the design more flexible and modular, especially when different objects need different combinations of capabilities. Therefore, interfaces are the better solution for these scenarios.

## Overall outcome
The projects show how abstract classes help model shared behavior and how interfaces promote flexibility, reusability, and maintainable object-oriented design.
