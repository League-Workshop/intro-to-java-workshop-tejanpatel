int x=249;
int y=165;
int acceleration=5;
int red=#FF0000;
PImage catPic;
void setup()
{
  size(500, 500);
  catPic=loadImage("cat.jpg");
  catPic.resize(500, 500);
  background(catPic);
}
void draw()
{
  if (mousePressed) {
    println("Mouse’s x-position: " + mouseX + "\n" + "Mouse’s y-position: " + mouseY + "\n");
  }
  fill(red);
  noStroke();
  ellipse(x+80,y,20,20);
  ellipse(x,y,20,20);
  if(x>width){background(catPic);
  x=249;
  y=165;
  acceleration=1;}
}
void keyPressed(){x+=2*acceleration;
y+=2*acceleration;}