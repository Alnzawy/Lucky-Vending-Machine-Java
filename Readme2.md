## Class Design and Responsibilities

The project is organized into four main classes: `Prize`, `Game`, `Player`, and `LuckyGuessGenerator`. Each class has a specific responsibility in managing the game and its functionality.

### 1. Prize Class

The `Prize` class represents the prizes available in the vending machine. It stores each prize's name, worth, and cost.

**Attributes**

| Attribute | Data Type | Description |
|---|---|---|
| `PrizeName` | String | Represents the name of the prize. |
| `PrizeWorth` | double | Represents the value of the prize. |
| `PrizeCost` | double | Represents the cost of the prize. |

**Constructors**

- `Prize()`: Default constructor with no parameters.
- `Prize(String prizeName, double prizeWorth, double prizeCost)`: Initializes a Prize object with its name, worth, and cost.

**Methods**

- **Getters and Setters:** Provide access to the private attributes and allow their values to be retrieved and modified.
- `TheNameOfPrize(int item): String`: Returns the name of the prize corresponding to the given item number.
- `TheWorthOfPrize(int item): double`: Returns the worth of the prize corresponding to the given item number.
- `TheCostOfPrize(int item): double`: Returns the cost of the prize corresponding to the given item number.

### 2. Game Class

The `Game` class manages the main game operations and controls the interaction between the player, prizes, and random number generator.

**Attributes**

| Attribute | Data Type | Description |
|---|---|---|
| `used` | boolean | Indicates whether a player has been set up. |
| `player` | Player | An instance of the Player class used to manage the player's information. |
| `GuessTheNumber` | int | Stores the number entered by the player as their guess. |
| `luckyGuessGenerator` | LuckyGuessGenerator | An instance of the LuckyGuessGenerator class used to generate random numbers. |

**Constructor**

- `Game()`: Initializes the game attributes, sets `used` to `false`, and creates new instances of the Player and LuckyGuessGenerator classes.

**Methods**

- **Getters and Setters:** Provide access to the class attributes and allow their values to be retrieved and modified.
- `deletePlayer(): void`: Deletes the previous player's information.
- `ViewMenu(): void`: Displays the available game menu options.
- `CreatePlayer(): void`: Allows the user to create a new player by entering their name.
- `Guessing(): void`: Generates a random number, allows the player to enter a guess, and determines whether the guess is correct. If the guess is correct, the corresponding prize is awarded.
- `PlayerStats(): void`: Displays the player's statistics, including their name, won prizes, total prize worth, and total spending.
- `GameHelp(): void`: Displays the game instructions and information about the available prizes.
- `savePlayerInfo(): void`: Saves the player's information to a text file named `player_Info.txt`.
- `RunGame(): void`: Starts and runs the main game.

### 3. Player Class

The `Player` class stores and manages the player's personal information and game statistics, including their spending, the total worth of prizes won, and the list of prizes collected.

**Attributes**

| Attribute | Data Type | Description |
|---|---|---|
| `playerName` | String | Represents the player's name. |
| `totalSpending` | double | Represents the total amount spent by the player. |
| `totalWorth` | double | Represents the cumulative worth of the prizes won. |
| `WonPrizes` | ArrayList<String> | Stores the names of the prizes won by the player. |

**Constructor**

- `Player()`: Initializes the `WonPrizes` ArrayList and sets `totalSpending` and `totalWorth` to `0`.

**Methods**

- **Getters and Setters:** Provide access to the private attributes and allow their values to be retrieved and modified.
- `getPlayerName(): String`: Returns the player's name.
- `setPlayerName(String playerName): void`: Updates the player's name.
- `getTotalSpending(): double`: Returns the player's total spending.
- `setTotalSpending(double spending): void`: Updates the player's total spending.
- `getTotalWorth(): double`: Returns the total worth of the prizes won.
- `setTotalWorth(double totalWorth): void`: Updates the total worth of the prizes.
- `getWonPrizes(): ArrayList<String>`: Returns the list of prizes won by the player.
- `setWonPrizes(ArrayList<String> wonPrizes): void`: Updates the list of won prizes.
- `AddPrize(String Prizees, double Worth, double Spent): void`: Adds a prize to the player's list of won prizes and updates the total prize worth and total spending.

### 4. LuckyGuessGenerator Class

The `LuckyGuessGenerator` class is responsible for generating random numbers used in the guessing game.

**Attribute**

| Attribute | Data Type | Description |
|---|---|---|
| `randomNumber` | int | Stores the generated random number. |

**Methods**

- `GenerateRandomNumber(): int`: Generates a random integer between `1` and `5` (inclusive) using `Math.random()` and assigns it to the `randomNumber` attribute.
- `getRandomNumber(): int`: Returns the generated random number.
- `setRandomNumber(int randomNumber): void`: Sets the value of the `randomNumber` attribute.

---

**Overall Design**

The four classes work together to implement the game's functionality. The `Game` class controls the game flow, the `Player` class manages player information and statistics, the `Prize` class handles prize details, and the `LuckyGuessGenerator` class generates the random numbers required for the guessing process.
