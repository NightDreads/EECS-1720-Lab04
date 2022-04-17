// Geometric Progression

function setup() {
  createCanvas(600, 600);
  smooth(); 
}

function draw() {
  background(253);
  stroke(0); 
  noFill();
  
  var constantFactor = 1.315;
  var circleSize = 15; 
  
  //draws 20 concentric circles of decreasing diameter and decreasing lineWeight
  for (var i=1; i<20; i++) {
    strokeWeight(circleSize/25.0); 
    ellipse(width/2,height, circleSize, circleSize);
    circleSize = circleSize * constantFactor; 
  }
  for (var i=1; i<20; i++) {
    strokeWeight(circleSize/25.0); 
    ellipse(width/2,height, circleSize, circleSize);
    circleSize = circleSize / constantFactor; 
  }//shrink

}
