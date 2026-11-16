# Avengers: Age of Doom

An expandable Minecraft Java Edition mod targeting **Minecraft 1.20.1**, **Minecraft Forge 47.3.0**, and **Java 17**.

## Current foundation
- Forge mod entry point
- Deferred item registry
- Prototype Hero Database item
- Gradle build configuration

This is the first project foundation, not a finished character mod. The next milestones will add the shared character/entity framework, then individual heroes and villains, abilities, equipment, models, textures, animations, bosses and world content in tested increments.

## Requirements
- Java 17 JDK
- Minecraft 1.20.1
- Minecraft Forge 47.3.0 (Forge 47.x)

## Build
Open the repository as a Gradle project in IntelliJ IDEA or Eclipse, then run:

```bash
./gradlew build
```

On Windows:

```bat
gradlew.bat build
```

The mod JAR will be generated in `build/libs/`.

## Run development client
Run the Gradle task `runClient` after Gradle has imported the project.

## Fan-project notice
This is an unofficial fan project and is not affiliated with, endorsed by, or sponsored by Marvel. Marvel characters, names and related trademarks belong to their respective owners. Original code and assets will be documented separately as the project grows.
