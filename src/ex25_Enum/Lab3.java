package ex25_Enum;

public class Lab3 {
    public static void main(String[] args){
System.out.println(HEX_COLORS.RED.getHexCode());
    }}
  enum HEX_COLORS {
      RED("#FF0000"),
      GREEN("#GH97809"),
      BLUE("#VB78989"),
      YELLOW("#KJ6698");
      private String hexCode;

      HEX_COLORS(String hexCode) {
          this.hexCode = hexCode;
      }

      String getHexCode() {
          return this.hexCode;
      }

  }