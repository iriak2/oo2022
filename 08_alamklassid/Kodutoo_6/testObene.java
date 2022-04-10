public class testObene {
    public static void main(String[] args){

        suurObene s=new suurObene();
        vaikeObene v=new vaikeObene();
        beebiObene b=new beebiObene();

        System.out.println(s.paevaHein(600));
        System.out.println(v.paevaHein(300));
        System.out.println(b.paevaHein());

        s.treeningKoormus();
        b.treeningKoormus();

    }
}