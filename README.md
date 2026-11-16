# Avengers & Doctor Doom

A Minecraft Java Edition mod for **Minecraft 1.20.1** on **Minecraft Forge 47.x**.

## Project status

This repository contains the initial playable foundation:
- Forge mod entry point and item registration
- Four prototype ability items with server-side effects
- Creative-mode item tab integration
- Gradle build configuration and GitHub Actions build workflow

The project is designed to grow into a roster of heroes and villains with dedicated models, animations, suits, weapons, abilities, bosses and dimensions. Character models and advanced abilities will be added incrementally; they are not claimed to be complete in this starter version.

## Requirements

- Java 17
- Minecraft 1.20.1
- Minecraft Forge 47.2.0 or compatible Forge 47.x build

## Build

```bash
./gradlew build
```

On Windows:

```bat
gradlew.bat build
```

The mod JAR is generated in `build/libs/`.

## First prototype items

- Arc Reactor: temporary strength and resistance
- Doom Core: temporary fire resistance and strength
- Mjolnir Token: temporary strength and jump boost
- Web Shooter: temporary speed and jump boost

These are initial gameplay placeholders. Custom 3D character models, textures, animations and deeper ability systems are planned for subsequent milestones.

## License

All original source code in this repository is provided under the MIT License. Marvel characters, names and related trademarks belong to their respective owners. This is an unofficial fan project and is not affiliated with or endorsed by Marvel.
