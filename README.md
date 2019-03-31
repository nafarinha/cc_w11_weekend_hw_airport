# Airport!

## Brief

The task is to model a system for an airport to manage its flights, using the tools  learnt during week 11 ___where appropriate and useful___, including TDD.

## MVP

Each plane should have:

* a type (e.g. *BOEING747*) which stores the passenger capacity  :white_check_mark:
* an airline :white_check_mark:
* a collection of passengers :white_check_mark:

Every flight should have:

* a plane :white_check_mark:
* flight number :white_check_mark:
* destination :white_check_mark:

The airport should have:

* a collection of hangars (to store the planes) :white_check_mark:
* an airport code (e.g. _GLA_) :white_check_mark:

The airport should be able to:

* create flights :white_check_mark:
* assign planes from the hangar to flights :white_check_mark:
* sell tickets for flights :white_check_mark:

### Extensions
* The airport wants to keep track of how many people have booked onto each flight
* The airport shouldn't sell tickets for a flight if it is fully booked
* Think about how an airport would assign a plane to a flight. It would be wasteful to assign a super big plane for a teeny tiny flight. Make sure your system assigns the most suitable plane for the flight
* Oh diddums! A plane has broken down on the runway and is unable to fly. The airport should have a method to find the _second_ best replacement plane from the hangar

### Advanced Extensions
* Pat is sitting on a plane on the runway but has left his black and white cat in the terminal! Write the most efficient ***algorithm*** you can to find him as quickly as possible before the plane takes off!
* The airlines are seriously impressed by your work so far and as such have asked you to figure out how much baggage the planes can carry. How would you approach adding this functionality to your system?
* Handle other situations an airport might face! Use your research abilities and tremendous imagination to prepare for different possible scenarios


### PDA Reminder:

As part of this homework you are required to take screenshots of the following:

```
- An example of encapsulation in a program.
```

Demonstrate testing in your program. Take screenshots of:

```
- Example of test code
- The test code failing to pass
- Example of the test code once errors have been corrected
- The test code passing
```

- Go to your [PDA Checklist](https://github.com/codeclan/pda/tree/master/Evidence%20Gathering%20Portfolio)

- Submit your PDA evidence (screenshots, etc.) to your own PDA repo

- PDA Reference: I.T 1, P18
