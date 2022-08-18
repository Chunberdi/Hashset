public class SomeClass <T,V, C>{
    public static String var1;
    public int var2;

    public SomeClass(String var1) {
        this.var1 = var1;
        this.var2 = var2;


    }

    public SomeClass() {

    }

    public static void var1(String salam) {
    }

    public String getVar1() {
        return var1;
    }

    public void setVar1(String var1) {
        this.var1 = var1;
    }

    public String getVar2() {
        return String.valueOf(var2);
    }

    public void setVar2(int var2) {
        this.var2 = var2;
    }

    @Override
    public String toString() {
        return "SomeClass{" +
                "var1='" + var1 + '\'' +
                ", var2=" + var2 +
                '}';
    }
}
