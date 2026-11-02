# Lucky Vending Machine

## Overview

A collaborative academic programming project developed as part of the Object-Oriented Programming (OOP) course during the First Semester of the 2022–2023 academic year.

The project involves developing a Java-based console application that simulates a Lucky Vending Machine game. Players attempt to guess a randomly generated number between 1 and 5 to win different prizes.

Each prize has a specific value and playing cost. The application tracks the player's winnings, total prize value, and total money spent.

## Key Features

- Interactive menu-driven console interface.
- Player registration and player management.
- Random number generation for prize guessing.
- Prize selection and winning mechanism.
- Input validation and error handling.
- Tracking of won prizes and their total value.
- Tracking of total money spent.
- Display of player statistics.
- Game instructions and help menu.
- Saving and loading player data using text files.

## Prize System

| **Number** | **Prize** | **Prize Value** | **Playing Cost** |
| ---------- | --------- | --------------- | ---------------- |
| 1 | Pen | $10 | $1 |
| 2 | Book | $20 | $2 |
| 3 | DVD | $30 | $3 |
| 4 | Mouse | $40 | $4 |
| 5 | Keyboard | $50 | $5 |

## Screenshots

The following screenshots demonstrate the main features and different stages of the Lucky Vending Machine application.

### 1. Welcome Message

![Welcome Message](welcome%20message.png)

### 2. Setting Up a New Player

![Setting New Player](setting%20new%20player.png)

### 3. Guessing the Prize

**Correct Guess**

![Right Guess](right%20guess.png)

**Wrong Guess**

![Wrong Guess](Wrong%20guess.png)

### 4. Player Statistics and Prize Details

Displays the prizes won by the player, along with their costs and values.

![Player Prize Statistics](showing%20what%20and%20the%20cost%20and%20worth%20of%20the%20prizes%20that%20player%20had%20won.png)

### 5. Game Help Menu

![Game Help Menu](showing%20help%20menu.png)

### 6. Player Setup Validation

Demonstrates the message displayed when attempting to start the game without setting up a player.

![Player Setup Validation](you%20cant%20start%20the%20game%20without%20setting%20player.png)

### 7. Saving Player Information

**Player Information Stored in a Text File**

![Storing Player Details](storing%20player%20details%20in%20txt%20file.png)

**Exiting the Game and Saving Player Details**

![Exiting Game and Saving Player Details](exiting%20game%20and%20saving%20player%20details.png)

## Object-Oriented Design

The project is organized into four main classes:

- **Game:** Manages the game menu, user input, and game operations.
- **Player:** Stores player information, won prizes, total prize value, and spending.
- **Prize:** Represents prizes and their attributes, including name, worth, and cost.
- **LuckyGuessGenerator:** Generates random numbers between 1 and 5.

## Technologies & Tools

- Java
- Eclipse IDE
- Object-Oriented Programming (OOP)
- File Handling (Text Files)
- Random Number Generation
- Input Validation

## Team Collaboration

This was a collaborative academic group assignment involving the design and development of a Java-based vending machine simulation.

The project focused on applying object-oriented programming principles, implementing game logic, handling user input, and managing player data.
