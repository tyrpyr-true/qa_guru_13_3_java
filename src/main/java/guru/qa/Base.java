package guru.qa;

public class Base {



    public static void main(String[] args) {

        boolean bvar1 = ((5 < 1) || (8 < 2));
        System.out.println(bvar1);
        boolean bvar2 = 4 >= 4;
        System.out.println(bvar2);
        boolean bvar3= 0 < -1;
        System.out.println(bvar3);
        boolean bvar4= 3 <= 2;
        System.out.println(bvar4);
        boolean bvar5= 6 != 3;
        System.out.println(bvar5);
        boolean bvar6= 6 == 2;
        System.out.println(bvar6);
        boolean bvar7= !(8 >1);
        System.out.println(bvar7);

        int ivar1 = 3+2;
        System.out.println(ivar1);
        int ivar2 = 3-2;
        System.out.println(ivar2);
        int ivar3 = 100/3;
        System.out.println(ivar3);
        int ivar10= 100;
        System.out.println(ivar10);
        int ivar11= 100;
        System.out.println(ivar11);
        int ivar12= 101;
        System.out.println(ivar12);
        int ivar13=0;
        System.out.println(ivar13);

        //byte var3 = 127+5;


        float fvar5 = 100f/3;
        System.out.println(fvar5);
        float fvar6 = 100%3;
        System.out.println(fvar6);
        float fvar7= 10009878768657546796878543532.30f*18762138976868467867867867887623.8f;
        System.out.println(fvar7);

        double dvar1= 1000000E6/5.27E5;
        System.out.println(dvar1);
        double dvar2= 1000000E-96/5;
        System.out.println(dvar2);

        String svar1= null;
        System.out.println(svar1);


        if (bvar7) {
            System.out.println("Случай 1");
            if( ivar12==100  && ivar10==ivar11 ) {
                System.out.println("Случай 1.1");
            }
            else if(ivar12!=100) {
                System.out.println("Случай 1.2");
                ivar13=ivar10/ivar13;
            }
        }
        else {
            System.out.println("Случай 2");
        }


        }

    }



