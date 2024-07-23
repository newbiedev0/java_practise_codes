package Assignment5.src;

import java.util.ArrayList;
import java.util.List;


// object pooled together and address of the each objects is default initialize
// then the default memory address of the pooled objects is displayed in  the output panel
    class Sampleobj {
    private static Sampleobj instance = null;
    private static final int MAX_POOL_SIZE = 5;
    private List<Object> pool;

    private Sampleobj() {
        pool = new ArrayList<>();
    }

    public static Sampleobj getInstance() {
        if (instance == null) {
            instance = new Sampleobj();
        }
        return instance;
    }

    public synchronized Object getObject() {
        if (pool.isEmpty()) {
            return new Object();
        } else if (pool.size() < MAX_POOL_SIZE) {
            return pool.remove(0);
        } else {
            return pool.get(0);
        }
    }

    public synchronized void releaseObject(Object obj) {
        if (pool.size() < MAX_POOL_SIZE) {
            pool.add(obj);
        }
    }
}
public class Test7{
	public static void main(String[]args) {
		Sampleobj pool = Sampleobj.getInstance();

		
		Object obj1 = pool.getObject();
		Object obj2 = pool.getObject();
		Object obj3 = pool.getObject();
		Object obj4 = pool.getObject();
		Object obj5 = pool.getObject();

		
		Object obj6 = pool.getObject();
		Object obj7 = pool.getObject();
		Object obj8 = pool.getObject();

		
		pool.releaseObject(obj1);
		pool.releaseObject(obj2);
		pool.releaseObject(obj3);
		pool.releaseObject(obj4);
		pool.releaseObject(obj5);
		
		System.out.println(obj1);
		System.out.println(obj7);
		System.out.println(obj2);

		
	}
}

