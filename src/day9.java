public class Day9{
    static class College implements AutoClose{
        college(){
            System.out.println("college Opens");
        }
        @Override
        public void close() throws Exception {
            System.out.println("College Closed");
        }
    }
    static class Department extend College{
        Department(){
            System.out.println("CT Have opened");
        }
        @Override
        public void close() throws Exception {
            System.out.println("CT Has Closed");
        }
    }
    static class Year extends Department{
        Department(){
            System.out.println("I-Year Have opened");
        }
        @Override
        public void close() throws Exception {
            System.out.println("I-Year Has Closed");
        }
    }

}
