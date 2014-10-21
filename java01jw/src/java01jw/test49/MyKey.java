package java01jw.test49;

public class MyKey {
  String password;
  int specialNo;
  int secreteNo;
  @Override
  public String toString() {
    return "MyKey [password=" + password + 
        ", specialNo=" + specialNo
        + ", secreteNo=" + secreteNo + "]";
  }
  public MyKey(String password, int specialNo, int secreteNo){
    this.password = password;
    this.specialNo = specialNo;
    this.secreteNo = secreteNo;
  }
  
  
  @Override
  public int hashCode() {
    String temp = this.toString();
    return temp.hashCode();
  }
  @Override
  public boolean equals(Object obj) {
    if (obj == null) return false;
    if (!(obj instanceof MyKey)) return false;
    MyKey other = (MyKey) obj;
    if (this.password.equals(other.password) &&
    this.secreteNo == other.secreteNo &&
    this.specialNo == other.specialNo) {
      
    return true;
    }
    return false;
  }
  
}
