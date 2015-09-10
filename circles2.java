//// Wild circles #2.
String title=  "Click for another circle.";
String subtitle=  "Press any key to erase.";
String author=  "Bruce Alan Martin";
String name= "Justin";

// GLOBAL VARIABLES //
float x,y;
int h,w;

// Setup:  screen size, initialization. //
void setup() {
  background(0, 0, 150);
  
  size(500, 500);
  x=  width/2;
  y=  height/2;
  w=  150;          // width of ellipse.
  h=  150;          // height of ellipse
  
  

  

  
  
  
  
  

}


// Next frame. //
void draw(){
  
  text( title, 10, 10 ); 
  text( subtitle, width/2, 10 );
  text( author, 10, height-10 );
  text( w+"x"+h, width/2,height-10 );
  
  

 
  //
  stroke(0);
  fill(0, 150, 0);
  ellipse(x, y, w, h);
  fill(0, 150, 0);
  rect(175, 300, 150, 150);
  fill(0);
  ellipse(210, 230, 40, 20);
  ellipse(280, 230, 40, 20);
  line(175, 300, 150, 350);
  line(320, 300, 350, 350);
  fill(255);
  text(name, 230, 370);
  

  
  
}


//  Handle mouse clicks //
void mousePressed() {
  x=  mouseX;
  y=  mouseY;
}


//  Handle keyboard //
void keyPressed() {
  // Erase everything, change size & color. //
  background( 255, 0, 0 );
  fill( random(255), random(255), random(255) );
  w=  int( random(50,150) );
  h=  int( random(50,150) );
}
//
