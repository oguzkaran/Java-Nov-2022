package mest;

import test.A;

public class B {
    public void bar()
    {
        A a = new A(); //error

        a.x = 10; //error
        a.foo(); //error
    }
}
