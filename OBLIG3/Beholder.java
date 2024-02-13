class Beholder<E> {
    E element1;
    E element2;

    public void settInn(E ny1, E ny2){
        element1 = ny1;
        element2 = ny2;
    }

    public E taUt(){
        return element2;
    }

    public static void main(String[] args) {
        Beholder<Integer> b = new Beholder<>();
        b.settInn(2, 3);
        System.out.println(b.taUt());
    }
}