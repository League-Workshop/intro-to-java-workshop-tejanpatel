int foodx=100;
int foody=20;
int score=0;
void setup(){
  size(500,500);
  
  
  
  
  
  
}
void draw(){
  background(141,233,237);

fill(#FFF300,#03FF00 , #0039FF);
noStroke();
ellipse(foodx, foody,20, 20);
 foody=foody+10;
  
  drawFish();
  
  if(foody > height)
  {
  foody=20;
  foodx=(int)random(width-20);
    
  }
  
}
void drawFish(){
     noStroke();
     fill(255,255,255);
     ellipse(mouseX-17,mouseY-17,20,20); //back side eye
     fill(255,200,88);
     ellipse(mouseX,mouseY,90,50); //body
     triangle(mouseX+30,mouseY,mouseX+70,mouseY+30,mouseX+70,mouseY-30); //tail
     stroke(0);
     triangle(mouseX,mouseY,mouseX+15,mouseY+10,mouseX+15,mouseY-10); //side fin
     noStroke();
     fill(255,200,88);
     ellipse(mouseX,mouseY,15,15); //side fin cover
     noStroke();
     fill(255,255,255);
     ellipse(mouseX-25,mouseY-15,20,20); //front eye
     fill(0,0,0);
     ellipse(mouseX-25,mouseY-15,5,5); //pupil
     fill(141,233,237);
     ellipse(mouseX-45,mouseY,25,25); //mouth
}
void checkCatch(int x, int y){
     if(x > mouseX && x < mouseX+70){
          if(y > mouseY-17 && y < mouseY+30){
               score++;
               foody = 20; //if the food was eaten, make more food fall from the top
               foodx = (int) random(width-20);
          }
     }
     else if (foody > height && score > 0){
          score--;}
          fill(0, 0, 0);
          if(score>10){
            z
textSize(16);
text("You win " + score, 20, 20);

}