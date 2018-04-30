
public class main {



        public static void main(String[] args) {

            TextSeparator x= new GrammarSeparator();
            String s="I bought 10 bottles, 4 dog, 13 cats, very large cats like tigers or even lions polar bear cat cat cat.";
            x.createList(s);
            System.out.println(s);
            System.out.println(x.getPassingWords());

        }

}
