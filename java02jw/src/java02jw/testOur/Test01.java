package java02jw.testOur;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

import java02jw.testOur.annotation.Command;
import java02jw.testOur.annotation.Component;

import org.reflections.ReflectionUtils;
import org.reflections.Reflections;

public class Test01 {
  static class CommandInfo{
    Object instance;
    Method method;

  }
  HashMap<String, CommandInfo> commandMap;
  Scanner scanner;



  DrinkDao drinkDao;



  public void init() throws Exception{
    drinkDao = new DrinkDao();

    try{
      drinkDao.load();
    } catch (Exception e){
     System.out.println("로딩에러");
    }
    scanner = new Scanner(System.in);
    commandMap = new HashMap<>();

    Reflections refle = new Reflections("java02.testOur");
    Set<Class<?>> clazzList = 
        refle.getTypesAnnotatedWith(Component.class);

    Object command = null;
    Component component = null;
    Command commandAnno = null;
    CommandInfo commandInfo = null;
    Method method = null;

    for(Class clazz : clazzList){
      component = (Component)clazz.getAnnotation(Component.class);
      command = clazz.newInstance();

      Set<Method> methods = ReflectionUtils.getMethods(
          clazz, 
          ReflectionUtils.withAnnotation(Command.class));
      for(Method m : methods) {
        commandAnno = m.getAnnotation(Command.class);
        commandInfo = new CommandInfo();
        commandInfo.instance = command;
        commandInfo.method = m;
        commandMap.put(commandAnno.value(), commandInfo);


      }

      try{
        method = clazz.getMethod("setDrinkDao", DrinkDao.class);
        method.invoke(command, drinkDao);
      }catch(Exception e){

      }
      try{
        method = clazz.getMethod("setScanner", Scanner.class);
        method.invoke(command, scanner);
      }catch(Exception e){

      }
    }



  }//init()

  public void service(){
    CommandInfo commandInfo = null;


    loop:
      while (true) {
        try {
          String[] token = promptCommand();
          commandInfo = commandMap.get(token[0]);
          
          if (commandInfo == null){
            System.out.println("해당 명령을 지원하지 않아요");
            continue;
          }
          
          HashMap<String, Object> params = new HashMap<>();

          ArrayList<String> option = new ArrayList<>();
          for(int i = 1; i < token.length; i++){
            option.add(token[i]);
          }
          params.put("option", option);

          commandInfo.method.invoke(commandInfo.instance, params);


          if(token[0].equalsIgnoreCase("exit")){
            break loop;
          }
        } catch (Exception e){
          e.printStackTrace();
          System.out.println("명령어 처리 중 오류 발생");
        }

      }






  }//service()

  public void destroy(){
    scanner.close();




  }//destroy






  private String[] promptCommand() {
    //Scanner scanner = new scanner(System.in();)
    System.out.println("명령> ");
    String[] token = scanner.nextLine().split(" "); 
    return token;
  }







  public static void main(String[] args) throws Exception {
    Test01 app = new Test01();
    app.init();
    app.service();
    app.destroy();
  }

}
