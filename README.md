# ThinkingInJavaSample
Sample code of book Thinking In Java

- [Introduction to Objects](#introduction-to-objects)
- [Everything Is an Object](#everything-is-an-object)
- [Operators](#operators)
- [Controlling Execution](#controlling-execution)
- [Initialization & Cleanup](#initialization--cleanup)
- [Access Control](#access-control)
- [Reusing Classes](#reusing-classes)
- [Polymorphism](#polymorphism)
- [Interfaces](#interfaces)
- [Inner Classes](#inner-classes)
- [Holding Your Objects](#holding-your-objects)
- [Error Handing with Exceptions](#error-handing-with-exceptions)
- [Strings](#strings)
- [Type Information](#type-information)
- [Generics](#generics)
- [Arrays](#arrays)
- [Containers in Depth](#containers-in-depth)
- [I/O](#io)
- [Enumerated Types](#enumerated-types)
- [Annotations](#annotations)
- [Concurrency](#concurrency)
- [Graphical User Interfaces](#graphical-user-interfaces)

<hr />

## Introduction to Objects
### The progress of abstraction
### An object has an interface
### An object provides services
### The hidden implementation
### Reusing the implementation
### Inheritance
#### Is-a vs. is-like-a relationships
### Interchangeable objects with polymorphism
### The singly rooted hierarchy
### Containers
#### Parameterized types(generics)
### Object creation $ lifetime
### Exception handling: dealing with errors
### Concurrent programming
### Java and the Internet
#### What is the Web?
#### Client-side programming
#### Server-side programming
### Summary
## Everything Is an Object
### You manipulate objects with references
### You must create all the objects
#### Where storage lives
#### Special case: primitive types
#### Arrays in Java
### You never need to destory an object
#### Scoping
#### Scope of objects
### Creating new data types: class
#### Fields and methods
### Methods, arguments, and return values
#### The argument list
### Building a Java program
#### Name visibility
#### Using other components
#### The static keyword
### Your first Java program
- [object/HelloDate.java](src/main/java/object/HelloDate.java)
- [object/ShowProperties.java](src/main/java/object/ShowProperties.java)

#### Compiling and running
### Comments and embedded documentation
#### Comment documentation
#### Syntax
- [object/Documentation1.java](src/main/java/object/Documentation1.java)

#### Embedded HTML
#### Some example tags
#### Documentation example
- [object/HelloDate.java](src/main/java/object/HelloDate.java)

### Coding style
### Summary
### Exercises
## Operators
## Controlling Execution
## Initialization & Cleanup
## Access Control
## Reusing Classes
## Polymorphism
## Interfaces
## Inner Classes
## Holding Your Objects
## Error Handing with Exceptions
## Strings
## Type Information
## Generics
## Arrays
## Containers in Depth
## I/O
## Enumerated Types
## Annotations
## Concurrency
### The many face of concurrency
#### Faster execution
#### Improving code design
### Basic threading
#### Defining tasks
- [concurrency/LiftOff.java](src/main/java/concurrency/LiftOff.java)
- [concurrency/MainThread.java](src/main/java/concurrency/MainThread.java)

#### The Thread class
- [concurrency/BasicThreads.java](src/main/java/concurrency/BasicThreads.java)
- [concurrency/MoreBasicThreads.java](src/main/java/concurrency/MoreBasicThreads.java)

#### Using Executors
- [concurrency/CachedThreadPool.java](src/main/java/concurrency/CachedThreadPool.java)
- [concurrency/FixedThreadPool.java](src/main/java/concurrency/FixedThreadPool.java)
- [concurrency/SingleThreadExecutor.java](src/main/java/concurrency/SingleThreadExecutor.java)

#### Producing return values from tasks
- [concurrency/CallableDemo.java](src/main/java/concurrency/CallableDemo.java)

#### Sleeping
- [concurrency/SleepingTask.java](src/main/java/concurrency/SleepingTask.java)

#### Priority
- [concurrency/SimplePriorities.java](src/main/java/concurrency/SimplePriorities.java)

#### Yielding
#### Daemon threads
- [concurrency/SimpleDaemons.java](src/main/java/concurrency/SimpleDaemons.java)
- [net/mindview/util/DaemonThreadFactory.java](src/main/java/net/mindview/util/DaemonThreadFactory.java)
- [concurrency/DaemonFromFactory.java](src/main/java/concurrency/DaemonFromFactory.java)
- [net/mindview/util/DaemonThreadPoolExecutor.java](src/main/java/net/mindview/util/DaemonThreadPoolExecutor.java)
- [concurrency/Daemons.java](src/main/java/concurrency/Daemons.java)
- [concurrency/DaemonDontRunFinally.java](src/main/java/concurrency/DaemonDontRunFinally.java)

#### Coding variations
- [concurrency/SimpleThread.java](src/main/java/concurrency/SimpleThread.java)
- [concurrency/SelfManeged.java](src/main/java/concurrency/SelfManaged.java)
- [concurrency/ThreadVariations.java](src/main/java/concurrency/ThreadVariations.java)

#### Terminology
#### Joining a thread
- [concurrency/Joining.java](src/main/java/concurrency/Joining.java)

#### Creating responsive user interfaces
- [concurrency/ResponsiveUI.java](src/main/java/concurrency/ResponsiveUI.java)

#### Thread groups
#### Catching exceptions
- [concurrency/ExceptionThread.java](src/main/java/concurrency/ExceptionThread.java)
- [concurrency/NaiveExceptionHandling.java](src/main/java/concurrency/NaiveExceptionHandling.java)
- [concurrency/CaptureUncaughtException.java](src/main/java/concurrency/CaptureUncaughtException.java)
- [concurrency/SettingDefaultHandler.java](src/main/java/concurrency/SettingDefaultHandler.java)

### Sharing resources
#### Improperly accessing resources
- [concurrency/IntGenerator.java](src/main/java/concurrency/IntGenerator.java)
- [concurrency/EvenChecker.java](src/main/java/concurrency/EvenChecker.java)
- [concurrency/EvenGenerator.java](src/main/java/concurrency/EvenGenerator.java)

#### Resolving shared resource contention
#### Synchronizing the EvenGenerator
- [concurrency/SynchronizedEvenGenerator.java](src/main/java/concurrency/SynchronizedEvenGenerator.java)

#### Using explicit Lock objects
- [concurrency/MutexEvenGenerator.java](src/main/java/concurrency/MutexEvenGenerator.java)
- [concurrency/AttemptLocking.java](src/main/java/concurrency/AttemptLocking.java)

#### Atomicity and volatility
- [concurrency/Atomicity.java](src/main/java/concurrency/Atomicity.java)
- [concurrency/AtomicityTest.java](src/main/java/concurrency/AtomicityTest.java)
- [concurrency/SerialNumberGenerator.java](src/main/java/concurrency/SerialNumberGenerator.java)
- [concurrency/SerialNumberChecker.java](src/main/java/concurrency/SerialNumberChecker.java)

#### Atomic classes
- [concurrency/AtomicIntegerTest.java](src/main/java/concurrency/AtomicIntegerTest.java)
- [concurrency/AtomicEvenGenerator.java](src/main/java/concurrency/AtomicEvenGenerator.java)

#### Critical sections
- [concurrency/CriticalSection.java](src/main/java/concurrency/CriticalSection.java)
- [concurrency/ExplicitCriticalSection.java](src/main/java/concurrency/ExplicitCriticalSection.java)

#### Synchronizing on other objects
- [concurrency/SyncObject.java](src/main/java/concurrency/SyncObject.java)

#### Thread local storage
- [concurrency/ThreadLocalVariableHolder.java](src/main/java/concurrency/ThreadLocalVariableHolder.java)

### Terminating tasks
#### The ornamental garden
- [concurrency/OrnamentalGarden.java](src/main/java/concurrency/OrnamentalGarden.java)

#### Terminating when blocked
##### Thread states
##### Becoming blocked
#### Interruption
- [concurrency/Interrupting.java](src/main/java/concurrency/Interrupting.java)
- [concurrency/CloseResource.java](src/main/java/concurrency/CloseResource.java)
- [concurrency/NIOInterruption.java](src/main/java/concurrency/NIOInterruption.java)

#### Blocked by a mutex
- [concurrency/MultiLock.java](src/main/java/concurrency/MultiLock.java)
- [concurrency/Interrupting2.java](src/main/java/concurrency/Interrupting2.java)

#### Checking for an interrupt
- [concurrency/InterruptingIdiom.java](src/main/java/concurrency/InterruptingIdiom.java)

### Cooperation between tasks
#### wait() and notifyAll()
- [concurrency/waxomatic/WaxOMatic.java](src/main/java/concurrency/waxomatic/WaxOMatic.java)

##### Missed Signals
#### notify() vs. notifyAll()
- [concurrency/NotifyVsNotifyAll.java](src/main/java/concurrency/NotifyVsNotNotifyAll.java)

#### Producers and consumers
- [concurrency/Restaurant.java](src/main/java/concurrency/Restaurant.java)

#### Using explicit Lock and Condition objects
- [concurrency/waxomatic2/WaxOMatic2.java](src/main/java/concurrency/waxomatic2/WaxOMatic2.java)

#### Producer-consumers and queues
- [concurrency/TestBlockingQueues.java](src/main/java/concurrency/TestBlockingQueues.java)

#### BlockingQueues of toast
- [concurrency/ToastOMatic.java](src/main/java/concurrency/ToastOMatic.java)

#### Using pipes for I/O between tasks
- [concurrency/PipedIO.java](src/main/java/concurrency/PipedIO.java)

### Deadlock
- [concurrency/Chopstick.java](src/main/java/concurrency/Chopstick.java)
- [concurrency/Philosopher.java](src/main/java/concurrency/Philosopher.java)
- [concurrency/DeadlockingDiningPhilosophers.java](src/main/java/concurrency/DeadLockingDiningPhilosophers.java)
- [concurrency/FixedDiningPhilosophers.java](src/main/java/concurrency/FixedDiningPhilosophers.java)

### New library components
#### CountDownLatch
- [concurrency/CountDownLatchDemo.java](src/main/java/concurrency/CountDownLatchDemo.java)

##### Library thread safety
#### CyclicBarrier
- [concurrency/HorseRace.java](src/main/java/concurrency/HorseRace.java)

#### DelayQueue
- [concurrency/DelayQueueDemo.java](src/main/java/concurrency/DelayQueueDemo.java)

#### PriorityBlockingQueue
- [concurrency/PriorityBlockingQueueDemo.java](src/main/java/concurrency/PriorityBlockingQueueDemo.java)

#### The greenhouse controller with ScheduledExecutor
- [concurrency/GreenhouseScheduler.java](src/main/java/concurrency/GreenhouseScheduler.java)

#### Semaphore
- [concurrency/Pool.java](src/main/java/concurrency/Pool.java)
- [concurrency/Fat.java](src/main/java/concurrency/Fat.java)
- [concurrency/SemaphoreDemo.java](src/main/java/concurrency/SemaphoreDemo.java)

#### Exchanger
- [concurrency/ExchangerDemo.java](src/main/java/concurrency/ExchangerDemo.java)

### Simulation
#### Bank teller simulation
- [concurrency/BankTellerSimulation.java](src/main/java/concurrency/BankTellerSimulation.java)

#### The restaurant simulation
- [concurrency/restaurant2/RestaurantWithQueues.java](src/main/java/concurrency/restaurant2/RestaurantWithQueues.java)

#### Distributing work
- [concurrency/CarBuilder.java](src/main/java/concurrency/CarBuilder.java)

### Performance tuning
#### Comparing mutex technologies
- [concurrency/SimpleMicroBenchmark.java](src/main/java/concurrency/SimpleMicroBenchmark.java)
- [concurrency/SynchronizationComparisons.java](src/main/java/concurrency/SynchronizationComparisons.java)

#### Lock-free containers
##### Performance issues
- [concurrency/Tester.java](src/main/java/concurrency/Tester.java)
- [concurrency/ListComparisons.java](src/main/java/concurrency/ListComparisons.java)

##### Comparing Map implementations
- [concurrency/MapComparisons.java](src/main/java/concurrency/MapComparisons.java)

#### Optimistic locking
- [concurrency/FastSimulation.java](src/main/java/concurrency/FastSimulation.java)

#### ReadWriteLocks
- [concurrency/ReaderWriterList.java](src/main/java/concurrency/ReaderWriterList.java)

### Active objects
- [concurrency/ActiveObjectDemo.java](src/main/java/concurrency/ActiveObjectDemo.java)

### Summary
#### Further reading

## Graphical User Interfaces
