# hotel.com

If Running from terminal with sbt

"sbt run" output will be:
[info] Running ClockApplication

sample user input hours, minutes, seconds (do not prepend 0 so '4' instead of '04')
13,23,59

sample output
Converted to Berlin clock:
OFF
RR
RRR
YYRY
YYY


if there are not lights on you will see an empty line:
4,3,6

Converted to Berlin clock:
ON

RRRR

YYY


If you run it from Intellij just run the main class ClockApplication and follow the same instruction as above.
