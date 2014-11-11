package java02jw.test15.command;

import java.util.Map;
import java02jw.test15.ProductDao;
import java02jw.test15.annotation.Command;
import java02jw.test15.annotation.Component;

@Component
public class GeneralCommand {
  ProductDao productDao;
  
  public void setProductDao(ProductDao productDao) {
    this.productDao = productDao;
  }

  @Command("exit")
  public void doExit(Map<String, Object> params) throws Exception {
    try {
    	System.out.println("바바");
    	//      productDao.save();
    } catch (Exception e) {
      System.out.println("데이터 저장 중 오류가 발생했습니다.");
    }
  }
  
  @Command("help")
  public void doHelp(Map<String, Object> params) throws Exception {
    System.out.println("list");
    System.out.println("view 제품번호");
    System.out.println("add");
    System.out.println("delete 제품번호");
    System.out.println("update 제품번호");
    System.out.println("exit");
  }
  
  
}
