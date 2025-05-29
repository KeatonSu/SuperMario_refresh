# Super Mario Java

A Java implementation of Super Mario Bros. using Java Swing.

## Features

- Classic Super Mario gameplay
- Multiple stages
- Sound effects and background music
- Save/Load game functionality
- Score system and lives

## Controls

- Left/Right Arrow: Move Mario
- Space/Up Arrow: Jump
- Down Arrow: Enter pipes
- S: Save game
- L: Load game

## Requirements

- Java 8 or higher
- Java Swing

## How to Run

1. Compile the Java files:
```bash
javac src/*.java
```

2. Run the game:
```bash
java -cp src SuperMario
```

## Project Structure

- `src/` - Source code directory
  - `SuperMario.java` - Main game class
  - `Stage.java` - Game stage management
  - `Mario.java` - Player character
  - `Map.java` - Level design
  - `GameObject.java` - Base class for game objects
  - `AudioManager.java` - Sound management
  - Other game object classes

## License

This project is for educational purposes only.
