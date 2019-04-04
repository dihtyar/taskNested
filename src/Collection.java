public class Collection {

    private Object[] objects;

    public Collection(Object[] object) {
        this.objects = object;
    }

    public static void main(String[] args) {

        Object[] objects = {1,22,33,41,56,6,7,10,19,15};
//        ObjectsIterator  objectsIterator = new ObjectsIterator();
//        Collection collection = new Collection();

//        while (objectsIterator.hasNext()){
//            System.out.println(objectsIterator.next());
//        }


    }

    private class ObjectsIterator implements Iterator {

        private int currentPosition = 0;

        @Override
        public boolean hasNext() {
            return currentPosition < objects.length;
        }

        @Override
        public Object next() {
            return objects[currentPosition++];
        }
    }


    private class OddZeroIterator implements Iterator {

        private int currentPosition = 0;

        @Override
        public boolean hasNext() {
            return currentPosition < objects.length;
        }

        @Override
        public Object next() {

            Object obj = currentPosition % 2 == 0 ? objects[currentPosition] : 0;
            currentPosition++;
            return obj;
        }
    }


    public Iterator iterator() {
        return new ObjectsIterator();
    }

    public Iterator oddZeroIterator() {
        return new OddZeroIterator();
    }

    public Iterator reverseIterator() {
        return new Iterator() {

            private int currentPosition = objects.length - 1;

            @Override
            public boolean hasNext() {
                return currentPosition >= 0;
            }

            @Override
            public Object next() {
                return objects[currentPosition--];
            }
        };
    }

}
