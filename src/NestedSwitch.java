public class NestedSwitch {

    public static void main(String[] args) {

        char ch1='A', ch2='A';

        switch(ch1){
            case 'A' :
                System.out.println("This A is outer switch");
                switch(ch2) {
                    case 'A':
                        System.out.println("This A is inner switch");
                        break;
                    case 'B':
                        //....
                }//end of inner switch
            case 'B' :
                //...

        }
    }
}

