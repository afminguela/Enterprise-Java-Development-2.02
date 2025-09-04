# Enterprise Java Development 2.02 - RPG Character System

A Java-based Role-Playing Game (RPG) character management system that demonstrates object-oriented programming principles, inheritance, and polymorphism in enterprise Java development.

## 🎮 Features

This project implements a comprehensive RPG character system with the following features:

- **Character Classes**: Multiple character types with unique attributes and abilities
- **Inheritance Hierarchy**: Well-structured class hierarchy with abstract base classes
- **Character Conversion**: Special abilities to transform between character types
- **Combat System**: Basic attack and health management mechanics
- **Utility Functions**: Helper methods for game logic and validation

### Character Types

#### 🛡️ Player (Abstract Base Class)
- **Attributes**: Health, Strength, Lives
- **Abilities**: Attack other players, check health status, manage lives
- **Mechanics**: Automatic life decrementation when health reaches zero

#### ⚔️ Warrior
- **Extends**: Player
- **Special Attribute**: Force
- **Special Ability**: Can convert to Elf using their force as speed

#### 🏹 Elf
- **Extends**: Player  
- **Special Attribute**: Speed
- **Characteristics**: Agile character type with enhanced mobility

#### 🔮 Wizard
- **Extends**: Player
- **Special Attribute**: Spell power
- **Special Ability**: Can convert to Elf using their spell power as speed

## 🔧 Requirements

- **Java**: Version 17 or higher
- **Maven**: Version 3.6 or higher
- **IDE**: Any Java IDE (IntelliJ IDEA, Eclipse, VS Code, etc.)

## 📦 Dependencies

- **JUnit Jupiter**: 5.11.4 (Testing framework)
- **Mockito**: 5.18.0 (Mocking framework for tests)

## 🚀 Installation & Setup

1. **Clone the repository**:
   ```bash
   git clone https://github.com/afminguela/Enterprise-Java-Development-2.02.git
   cd Enterprise-Java-Development-2.02
   ```

2. **Compile the project**:
   ```bash
   mvn clean compile
   ```

3. **Run tests**:
   ```bash
   mvn test
   ```

4. **Package the application**:
   ```bash
   mvn package
   ```

## 💻 Usage Examples

### Creating Characters

```java
// Create a Warrior
Warrior warrior = new Warrior(10, 100, 15, 3); // force, health, strength, lives

// Create an Elf
Elf elf = new Elf(80, 12, 2, 20); // health, strength, lives, speed

// Create a Wizard
Wizard wizard = new Wizard(90, 18, 3, 25); // health, strength, lives, spell
```

### Character Interactions

```java
// Attack another player
warrior.attack(elf);

// Check health status
warrior.checkHealth();

// Convert Warrior to Elf
Elf convertedElf = warrior.convertToElf();

// Convert Wizard to Elf
Elf magicalElf = wizard.convertToElf();
```

### Using Utility Functions

```java
// Get odd numbers up to n
List<Integer> oddNumbers = CreateTest.oddEven(10);

// Check if text contains Java keywords
boolean hasKeywords = CreateTest.checkJavaKeywords("public class Example");

// Search for word in array
String[] words = {"hello", "world", "java"};
boolean found = CreateTest.buscarPalabraEnArray(words, "java");
```

## 🧪 Testing

The project includes comprehensive test coverage:

```bash
# Run all tests
mvn test

# Run specific test class
mvn test -Dtest=PlayerTest

# Run tests with verbose output
mvn test -X
```

### Test Coverage

- **PlayerTest**: Tests for base Player functionality
- **WarriorTest**: Tests for Warrior-specific features
- **ElfTest**: Tests for Elf character mechanics
- **WizardTest**: Tests for Wizard abilities and conversions
- **CreateTestTest**: Tests for utility functions

## 📁 Project Structure

```
src/
├── main/
│   └── java/
│       └── org/
│           └── example/
│               ├── Main.java          # Application entry point
│               ├── Player.java        # Abstract base class
│               ├── Warrior.java       # Warrior character class
│               ├── Elf.java          # Elf character class
│               ├── Wizard.java       # Wizard character class
│               └── CreateTest.java   # Utility functions
└── test/
    └── java/
        └── org/
            └── example/
                ├── PlayerTest.java    # Player class tests
                ├── WarriorTest.java   # Warrior class tests
                ├── ElfTest.java       # Elf class tests
                ├── WizardTest.java    # Wizard class tests
                └── CreateTestTest.java # Utility tests
```

## 🏗️ Architecture

The project follows object-oriented design principles:

- **Abstraction**: Player serves as an abstract base class
- **Inheritance**: All character types extend Player
- **Encapsulation**: Private attributes with public getter/setter methods
- **Polymorphism**: Characters can be treated as Player objects

## 🤝 Contributing

1. Fork the repository
2. Create a feature branch: `git checkout -b feature/new-feature`
3. Commit your changes: `git commit -am 'Add new feature'`
4. Push to the branch: `git push origin feature/new-feature`
5. Submit a pull request

## 📄 License

This project is part of an Enterprise Java Development course (2.02). Please refer to your course guidelines for usage permissions.

## 🔍 Learning Objectives

This project demonstrates:

- Java inheritance and polymorphism
- Abstract classes and method implementation
- Unit testing with JUnit 5
- Maven project structure and dependency management
- Object-oriented design patterns
- Enterprise Java development best practices

---

*Developed as part of Enterprise Java Development coursework - demonstrating core OOP concepts through an engaging RPG character system.*