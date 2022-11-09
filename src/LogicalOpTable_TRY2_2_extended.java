class LogicalOpTable_TRY2_2 {
    public static void main(String[] args){

        //truth table for logical operators
        System.out.println("P\t\tQ\t\tAND\t\tOR\t\tXOR(^)\tNOT(!)");

        boolean p,q;
        p = q = true;
        System.out.println(p+"\t"+q+"\t"+(p&q)+"\t"+
                (p|q)+"\t"+(p^q)+"\t"+(!p));

        p = true;
        q = false;
        System.out.println(p+"\t"+q+"\t"+(p&q)+"\t"+
                (p|q)+"\t"+(p^q)+"\t"+(!p));

        p = false;
        q = true;
        System.out.println(p+"\t"+q+"\t"+(p&q)+"\t"+
                (p|q)+"\t"+(p^q)+"\t"+(!p));

        p = q = false;
        System.out.println(p+"\t"+q+"\t"+(p&q)+"\t"+
                (p|q)+"\t"+(p^q)+"\t"+(!p));
    }
}
public class LogicalOpTable_TRY2_2_extended {
    public static void main(String[] args){

        //truth table for logical operators
        System.out.println("P\tQ\tAND\tOR\tXOR(^)\tNOT(!)");

        boolean p,q;
        int T1=1,F0=0;
        p = q = true;
        if(p) System.out.print(T1+"\t"); else System.out.print(F0+"\t");
        if(q) System.out.print(T1+"\t"); else System.out.print(F0+"\t");
        if(p&q) System.out.print(T1+"\t");else System.out.print(F0+"\t");
        if(p|q) System.out.print(T1+"\t");else System.out.print(F0+"\t");
        if(p^q) System.out.print(T1+"\t\t");else System.out.print(F0+"\t\t");
        if(!p) System.out.println(T1); else System.out.println(F0);

        p = true;
        q = false;
        if(p) System.out.print(T1+"\t"); else System.out.print(F0+"\t");
        if(q) System.out.print(T1+"\t"); else System.out.print(F0+"\t");
        if(p&q) System.out.print(T1+"\t");else System.out.print(F0+"\t");
        if(p|q) System.out.print(T1+"\t");else System.out.print(F0+"\t");
        if(p^q) System.out.print(T1+"\t\t");else System.out.print(F0+"\t\t");
        if(!p) System.out.println(T1); else System.out.println(F0);

        p = false;
        q = true;
        if(p) System.out.print(T1+"\t"); else System.out.print(F0+"\t");
        if(q) System.out.print(T1+"\t"); else System.out.print(F0+"\t");
        if(p&q) System.out.print(T1+"\t");else System.out.print(F0+"\t");
        if(p|q) System.out.print(T1+"\t");else System.out.print(F0+"\t");
        if(p^q) System.out.print(T1+"\t\t");else System.out.print(F0+"\t\t");
        if(!p) System.out.println(T1); else System.out.println(F0);

        p = q = false;
        if(p) System.out.print(T1+"\t"); else System.out.print(F0+"\t");
        if(q) System.out.print(T1+"\t"); else System.out.print(F0+"\t");
        if(p&q) System.out.print(T1+"\t");else System.out.print(F0+"\t");
        if(p|q) System.out.print(T1+"\t");else System.out.print(F0+"\t");
        if(p^q) System.out.print(T1+"\t\t");else System.out.print(F0+"\t\t");
        if(!p) System.out.println(T1); else System.out.println(F0);
    }
}


