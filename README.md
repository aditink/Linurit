# Linurit
Android puzzle game

Game Design + Graphics Notes:

Hi there! Emma here with some cool notes about STYLE and DESIGN!
The atmosphere we're going for is something spacey and calming.
Since some among us are against putting up time limits or clocks,
that removes the option of making more of an intense, fast, competitive game.
Instead, what we can do is keep a reward system that is not based on the speed at which
one solves each puzzle, but instead based on some other unit of efficiency.
Without time, it may be a bit difficult to decide upon what that unit might be.
I'm thinking perhaps taking the minimum number of moves, but we can decide upon it at a later date

START MENU:
The first thing that someone will see upon opening the app is the start menu.
This menu looks like the image provided in the Linurit start jpg, with perhaps some extra animation if time provides
(I'm thinking of adding some cool swirly constellations)
When any of the buttons are clicked, a pleasant dinging sound clip will play, and the screen will fade to white of increasing opacity
The white will then fade away, revealing the selected screen of either Play, Levels, or Themes
The Themes screen should be the last to implement, as it's most important to get a playable game
The first screen implemented should be Play, where we just make one playable level to test with

GAMEPLAY:
This is the section that describes the actual game where you manipulate the constellations.
To drag a node, one must first select it by tapping on it
Then they can move it by dragging their finger in whatever direction they wish to put it
Even if they didn't drag starting at the node's location, the node will still move the correct distance and direction
(I still need to finish this section)


PLAY button:
If it is not the player's first time with the game, the last level the player was working on should appear
Saving the data of how they manipulated the graph last would be ideal
The screen showing the constellation should have a small levels button in a top corner s
This should take you to the levels screen, with the last level you worked on centered in the middle


DESIGN THEMES:
All large text, such as major buttons or simple instructions, should be shown in the font DJ Stitch Regular
This font will be not a stark white, but a near-white tint of the background color gradient
There should be a slight glow outside the font, to make it more readable
One option is to make the glow slowly increase and decrease in brightness, for a dynamic look
It is most visually pleasing to have something changing on the screen, even when the player is not moving something themself
I'll probably end up programming the themes menu later on.
In beginner mode, the nodes each look like circles
In advanced mode, they look like squares
In expert mode, they look like triangles
In each mode, the selected node will glow a bit brighter than the rest and rotate around its center point



LEVELS SCREEN:
Three options of Beginner, Advanced, and Expert lie arranged vertically (These words can be changed to sound more thematic)
When one is selected, the other two options fly off the screen, and the selected option moves to the top of the screen 
as the header for the array of sublevels that you can play.
You can see all the sublevels you've unlocked so far arranged just like the constellations you play in each game
Every time you unlock a new constellation, or set of constellations, you can manipulate them

SUBLEVELS: This is the place you will spend the most time within the levels screens.
It shows another constellation graph, but this one represents different sublevels instead of simple nodes