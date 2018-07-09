PImage rainbow;
PImage unicorn;
void setup() {
  size(800, 600);
  rainbow=loadImage("rainbow.png");
  rainbow.resize(800,600);
  unicorn=loadImage("unicorn.png");
}
void draw() {
  background(rainbow);
  image(unicorn, mouseX,mouseY);
}