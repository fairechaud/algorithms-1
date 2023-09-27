public class App {
    public static void main(String[] args) throws Exception {
        /* QuickFindUF qf = new QuickFindUF(10);
        qf.union(4, 3);
        qf.union(3, 8);
        qf.union(6, 5);
        qf.union(9, 4);
        qf.union(2, 1);
        System.out.println(qf.connected(8, 9));
        System.out.println(qf.connected(5, 0));
        qf.union(5, 0);
        qf.union(7, 2);
        qf.union(6, 1);
        qf.print(); */
        /* QuickUnionUF qu = new QuickUnionUF(10);
        qu.union(4, 3);
        qu.union(3, 8);
        qu.union(6, 5);
        qu.union(9, 4);
        qu.union(2, 1);
        System.out.println(qu.connected(8, 9));
        System.out.println(qu.connected(5, 4));
        qu.union(5, 0);
        qu.union(7, 2);
        qu.union(6, 1);
        qu.union(7, 3);
        qu.print(); */
        QuickUnionWUF qu = new QuickUnionWUF(10);
        qu.union(4, 3);
        qu.union(3, 8);
        qu.union(6, 5);
        qu.union(9, 4);
        qu.union(2, 1);
        qu.union(5, 0);
        qu.union(7, 2);
        qu.union(6, 1);
        qu.union(7, 3);
        qu.print();
    }

    
}

