public class Client {
    public static void main(String[] args) {
        MyHashSet myHashSet=new MyHashSet();
        myHashSet.add(10);
        myHashSet.add(100000);
        myHashSet.add(1000);
        myHashSet.add(1000);

        myHashSet.remove(12);
        myHashSet.remove(10);
        System.out.println(myHashSet.contains(12));
        System.out.println(myHashSet.contains(1000));
        System.out.println(myHashSet.contains(1));
    }
}
