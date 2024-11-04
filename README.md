# MLB Team Builder Simulation
============================

## Project Description

The MLB Team Builder Simulation is a Java-based application that allows users to randomly select Major League Baseball (MLB) teams and build a fantasy team by selecting players from those teams. The application ensures that users can only select one player per position from each team, allowing for strategic team building.

## Features

- Randomly select an MLB team.
- Display players from the selected team along with their statistics.
- Build a fantasy team by selecting players while enforcing position constraints.
- Read player data from a CSV file.

## File Structure
    .
    ├── resources/
    │ └── players.csv
    ├── src/
    │ ├── Main.java
    │ ├── Player.java
    │ └── Team.java
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