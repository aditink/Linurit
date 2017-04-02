This file is to discuss ideas for implementation of components of the user interface (so that understanding each other's code and building things to fit together becomes easier).
Here's what I've been thinking so far:
1. Gradient- make gradient.xml that can be called on all screens. See if colors can be made variable, and passed as argument.
2. Nodes- Node interface with subclasses like square node, circle node, active node etc. The node ought to have an underlying circular frame because:
  a. We can designate this region to be the area which you tap on to access a node
  b. You can use the edges for orbit paths
  And further components like  the circle/ triangle / square would be painted on top of this base.
  We'd also want to store the nodes center coordinates because for calculating radius/ distances 
3. Animating nodes as in the GIF constellation- 
  a. For the vibrations on the spot: could use random number generation. To give a SHM-like effect we'd use a random number for direction and amplitude, and then do the path with a quadratic; we could either write velocity as a trigonometric function of radius, or if this is too computationally intensive (in a graph with multiple nodes) then simply (A-r^2) where A is amplitude and r radius (Taylor expansion for cosine).
  b. For orbit of the smaller circle around node: i think there's bound to be something for traveling down paths, and we will have a well defined path from the border of the node's circular base. For the variation in speed: again velocity as a continuous function of position (that is, if we want to have the motion to look periodic- the same speed at the same position in a revolution) or as a function of elapsed frames/ time if this is not the case. (TO ANSWER: which do we want?)
4. Edges: Should be trivial to draw. The edges would be stored as (node 1.centre , node 2.centre) so that when one node changes position, the edge would automatically get updated
5. The clouds behind the text on start page: I think it'd be a nice idea for them to float about a bit, so the screen wouldn't seem static.
	We could generate randomly how much the opacity should reduce by as it moves away from the text. Playing around with this might be necessary to modify the number generation range to get the right width and height.
6. Animating the nodes as shown in linurit concept:
    Looks like we just need to write a velocity function for the center of node. The nice thing is the motion makes me think of (nearly elastic) collisions; the net speed before and after doesn't change. So we'll have a randomly generated accelleration that changes speed variation very slowly and a random coin toss to determine when to switch signs of x and/or y axis to get that bouncing effect.
    7. The fancy arrows: option 1: bitmap. option 2: describe as list of shapes programmatically as a class that can be easily modified and reused with different arguments. I don't know if one is going to be particaularly more effecient than the other.
    
    That's what I've been thinking so far. Feel free to format this file: making things look pretty has never been my thing.