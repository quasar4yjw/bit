package java01jw.test55;

public class TestA extends GameCenter implements Gamer  {
  int count;
  int num;
  /*public static void main(String[] args) {
    System.out.println("1");
  }*/
  @Override
  public String who() {
    return "염정우";
    //String ddd = gamerB.play();
  }

  @Override
  public void init() {}

  @Override
  public String play() {
    ++num;
    if (count > 3) 
      return Gamer.ROCK;
    else if (count < -3) 
      return Gamer.SCISSORS;
    else 
      return Gamer.ROCK;
  }

  @Override
  public void sendResult(int result) {
  if (result == 1) {
    count += 1;
  }
  else if(result == 0){
    
  }
  else count -= 1;
  }
}
