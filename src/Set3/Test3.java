package Set3;

class Test {

    Test(int x) {
            System.out.println("Constructor called " + x);
        }
    }

class Test3 {

        Test test = new Test(10);
        Test3(int i) {
            test = new Test(i);
        }

        public static void main(String[] args) {
            Test3 t = new Test3(5);
        }
    }
