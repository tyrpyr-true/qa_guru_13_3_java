package guru.qa;

public class Base {



    public static void main(String[] args) {

        int var1 = 3+2;
        int var2 = 3-2;
        //byte var3 = 127+5;
        int var4 = 100/3;
        float var5 = 100f/3;
        float var6 = 100%3;
        boolean var7 = var1>var2;
        String var0= null;
        int var10= 100;
        int var11= 100;
        int var12= 101;
        int var13=0;
        if (var7) {
            System.out.println("Случай 1");
            if( var12==100  && var10==var11 ) {
                System.out.println("Случай 1.1");
            }
            else if(var12!=100) {
                System.out.println("Случай 1.2");
                var13=var10/var13;
            }
        }
        else {
            System.out.println("Случай 2");
        }

        System.out.println(var5);
        }

    }



