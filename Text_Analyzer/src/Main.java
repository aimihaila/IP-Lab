public class Main {
    public static void main(String[] args) {

        ConceptClass cc = new ConceptClass("ceva");

        cc.setKeywords("Kingdom: Animalia");
        LongMemory mem = new LongMemory();

        RegisterWiki reg = new RegisterWiki(mem);
        reg.register("cat", cc);
    }
}
