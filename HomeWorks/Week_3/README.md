# Clock Timer Program

## Overview

This C program provides three clock-based functionalities: a countdown timer, a stopwatch, and a 24-hour clock that resets after reaching `23:59:59`. It uses the `Sleep()` function to cause a delay, making it act like a real-time clock.

## Features

1. **Countdown Timer**: Set a specific time in seconds, and the timer will count down to zero.
2. **Stopwatch**: Set a maximum time in seconds, and the stopwatch will count up from zero.
3. **24-hour Clock**: Displays a clock that starts from a specific time and resets after 24 hours (00:00:00 to 23:59:59).

## How to Use

### Menu Options:

When the program runs, you'll see the following options:

1. **Set a timer (Countdown)** - Allows you to input time in seconds and counts down to 0.
2. **Set a stopwatch (Count up)** - Starts the stopwatch from 00:00:00 up to a maximum time.
3. **Set a normal clock** - Displays a running clock that resets every 24 hours.
4. **Exit** - Exits the program.

## Code Structure

### Clock Functions:

- `Countdown()`: Handles the countdown timer.
- `Stopwatch()`: Handles the stopwatch functionality.
- `TheClock()`: Implements the 24-hour running clock.
- `ClockStatus()`: The core clock logic shared by all functionalities.

### For User Experience Functions:

- `progressBar()`: Displays a progress bar when transitioning between operations.
- `colorToGreen()`, `colorToRed()`, `resetColor()`: Handles console text coloring for better user experience.

## Time Conversion Algorithm

#### The program converts total seconds into hours, minutes, and seconds using division and modulus operations:

- `seconds = totalTimeInSeconds % 60`: extracts the remaining seconds.
- `minutes = (totalTimeInSeconds / 60) % 60`: converts total seconds into minutes and resets after 60 minutes.
- `hours = (totalTimeInSeconds / 3600) % 24`: converts total seconds into hours and resets after 24 hours.

```txt
For example, given 5844 totalTimeInSeconds:

seconds = 5844 % 60 equals 24.
minutes = (5844 / 60) % 60 equals 37.
hours = (5844 / 3600) % 24 equals 1.
the output is : 01:37:24

Therefore, the time is 01:37:24, and 01:37:24 is equivalent to 5844 seconds.
```

## Notes

- `Sleep()` function in the program is used to delay time, simulating real-time counting.
  Fast debugging is enabled by reducing the time step (e.g., currentTime += 10), but this can be changed to += 1 for actual second intervals and also the
  `Sleep()` to 1000 instead of 1

- The program uses [ANSI ](https://gist.github.com/RabaDabaDoba/145049536f815903c79944599c6f952a) for coloring, which may not be supported in all terminal environments.
