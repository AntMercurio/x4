//size

int r,g,b;
float button1X=250, button1Y=250, button1Z=100, button1XY=90;
void setup(){
  size( 640,480);
  r=  100;
  g= 200;
  b= 255;
}
///button
void draw() {
  background ( r, g, b );
  showButton( button1X, button1Y, button1Z, button1XY);
   text("Press me",  button1X+button1Z/2, button1Y+button1XY*1/2 );
  fill(50,150);
  rect(20,50,100,200);
}


////// click
void mousePressed(){
  if ( hit(mouseX,mouseY, r, g, b))

} 
