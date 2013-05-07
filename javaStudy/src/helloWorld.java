

public class helloWorld {
    
    public class hanna {
        private String abc = "avav";
        
        private hanna(String abc) {
            this.abc = abc;
        }
        
        private void out() {
            System.out.println("inner class");
        }
    }

    
    public static void main(String[] args) {
        helloWorld.hanna h = new helloWorld().new hanna("");
        
        h.out();
    }
}
