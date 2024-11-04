# MLB Team Builder Simulation

## Project Description

The MLB Team Builder Simulation is a command-line application that allows you to create your very own fantasy team using the real-life statistics of Major League Baseball (MLB) players from the randomly selected order of teams. This program is designed to make users use creative and strategic thinking and team-building as there is a limit of 1 player that can be drafted per position. The program will then assign you a game score based on the cumulative Wins Above Replacement (WAR - retrieved from baseball-reference.com) of your fantasy team lineup.

## Features

- Randomly select an MLB team.
- Display players from the selected team along with their statistics.
- Build a fantasy team by selecting players while enforcing position constraints.
- Read player data from a CSV file.

## Notes

- Absolute highest score possible is 61.7 (pretty much impossible). Therefore keep in mind:
- Anything above 55.5 is considered incredible.
- Anything above 49.4 is considered great.
- Anything above 43.2 is considered good.
- Anything above 37.0 is considered decent.

## File Structure
    .
    ├── resources/
    │ └── players.csv
    ├── src/
    │ ├── Main.java
    │ ├── Player.java
    │ └── Team.java
    ├── .gitignore
    ├── README.md
    └── run.sh

## Prerequisites

- Java Development Kit (JDK) 8 or higher
- A terminal or command line interface

## Setup Note

Make sure the 'run.sh' script is executable:

```bash
chmod +x run.sh
```

Then you can compile and run the application with:

```bash
./run.sh
```