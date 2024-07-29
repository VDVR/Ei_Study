## Design Patterns Used for Rocket Launch Simulator

### 1. Strategy Pattern
The `Stage` interface and its implementations (`PreLaunchStage`, `LaunchStage`, `SecondStage`) demonstrate the Strategy Pattern. This pattern defines a family of algorithms (or stages, in this context), encapsulates each one, and makes them interchangeable. The strategy pattern allows the algorithm to vary independently from the clients that use it.

**Components:**
- **Stage interface**: Defines the operations that all stages must implement.
- **PreLaunchStage, LaunchStage, SecondStage**: Concrete implementations of the `Stage` interface, each representing a specific stage in the rocket launch process.
- **StageContext**: Maintains a reference to a `Stage` object and allows changing the stage dynamically.

### 2. State Pattern
The `StageContext` class demonstrates the State Pattern. This pattern allows an object to change its behavior when its internal state changes. The object will appear to change its class. The `StageContext` holds a reference to a `Stage` object and delegates stage-specific behavior to the currently active stage.

**Components:**
- **StageContext**: Maintains the current `Stage` and delegates the update and status check operations to it. It allows for transitioning between different stages.
- **Stage implementations**: Define the specific behaviors and state transitions for each stage.

### 3. Factory Method Pattern
The `CommandFactory` class demonstrates the Factory Method Pattern. This pattern defines an interface for creating an object but allows subclasses to alter the type of objects that will be created. The factory method pattern helps to encapsulate the creation logic of `Command` objects.

**Components:**
- **CommandFactory**: A factory class responsible for creating `Command` objects based on the input string.

### 4. Command Pattern
The `Command` class demonstrates the Command Pattern. This pattern encapsulates a request as an object, thereby allowing parameterization of clients with queues, requests, and operations. The `Command` class encapsulates the user input and provides methods to retrieve the action and value.

**Components:**
- **Command**: Encapsulates the user input and provides methods to parse and retrieve the action and value.

### Explanation of the Design Patterns in the Program

**Strategy Pattern:**
The `Stage` interface and its implementations (`PreLaunchStage`, `LaunchStage`, `SecondStage`) encapsulate the behavior of each stage of the rocket launch. The `StageContext` class maintains a reference to a `Stage` object and uses it to perform the operations related to the current stage. This allows for easily changing the behavior of the rocket launch by changing the stage.

**State Pattern:**
The `StageContext` class manages the state transitions between different stages of the rocket launch. It maintains a reference to the current `Stage` and delegates the update and status check operations to it. When the current stage is completed, the `StageContext` transitions to the next stage, changing its behavior accordingly.

**Factory Method Pattern:**
The `CommandFactory` class is responsible for creating `Command` objects based on the user input. This encapsulates the creation logic and allows for easily extending or modifying the command creation process without affecting the rest of the application.

**Command Pattern:**
The `Command` class encapsulates the user input as an object, allowing the `CommandProcessor` to interpret and execute the commands. This decouples the command execution logic from the user input parsing logic, making the code more modular and easier to maintain.
