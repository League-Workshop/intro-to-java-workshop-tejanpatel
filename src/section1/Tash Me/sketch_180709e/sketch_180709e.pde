PImage mustache;
PImage spongebob;
  void setup() {
  spongebob=loadImage("spongebob.png");
  size(800, 600);
  spongebob.resize(800, 600);
  mustache=loadImage("mustache.png");
}
void draw() {
  background(spongebob);
  if (mousePressed) {
    image(mustache, mouseX, mouseY);}}