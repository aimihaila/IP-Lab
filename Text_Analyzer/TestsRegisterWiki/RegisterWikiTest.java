import org.junit.Test;

import static org.junit.Assert.*;

public class RegisterWikiTest {

    @Test
    public void Dog() {
        String AnimalsNames = "dog";
        ConceptClass cc = new ConceptClass("animals");
        cc.setKeywords("Kingdom: Animalia");
        LongMemory mem = new LongMemory();
        RegisterWiki reg = new RegisterWiki(mem);
        System.out.println(AnimalsNames);
        Concept c = new Concept();
        c.setConceptClass(cc);
        c.setName(cc.getNameClass());
        c.setFoundInDB(false);

        assertEquals(c.getName(),reg.register(AnimalsNames,cc).getName());

    }

   @Test
    public void Cat(){
       String AnimalsNames = "cat";
       ConceptClass cc = new ConceptClass("animals");
       cc.setKeywords("Kingdom: Animalia");
       LongMemory mem = new LongMemory();
       RegisterWiki reg = new RegisterWiki(mem);
       System.out.println(AnimalsNames);
       Concept c = new Concept();
       c.setConceptClass(cc);
       c.setName(cc.getNameClass());
       c.setFoundInDB(false);

       assertEquals(c.getName(),reg.register(AnimalsNames,cc).getName());
   }

  @Test
    public void test0_Aardvark(){
        String AnimalsNames = "Aardvark";
        ConceptClass cc = new ConceptClass("animals");
        cc.setKeywords("Kingdom: Animalia");
        LongMemory mem = new LongMemory();
        RegisterWiki reg = new RegisterWiki(mem);
        System.out.println(AnimalsNames);
        Concept c = new Concept();
        c.setConceptClass(cc);
        c.setName(cc.getNameClass());
        c.setFoundInDB(false);

        assertEquals(c.getName(),reg.register(AnimalsNames,cc).getName());
    }

    @Test
    public void test1_Abyssinian(){
        String AnimalsNames = "Abyssinian";
        ConceptClass cc = new ConceptClass("animals");
        cc.setKeywords("Kingdom: Animalia");
        LongMemory mem = new LongMemory();
        RegisterWiki reg = new RegisterWiki(mem);
        System.out.println(AnimalsNames);
        Concept c = new Concept();
        c.setConceptClass(cc);
        c.setName(cc.getNameClass());
        c.setFoundInDB(false);

        assertEquals(c.getName(),reg.register(AnimalsNames,cc).getName());
    }

    @Test
    public void test2_AdeliePenguin(){
        String AnimalsNames = "Adelie Penguin";
        ConceptClass cc = new ConceptClass("animals");
        cc.setKeywords("Kingdom: Animalia");
        LongMemory mem = new LongMemory();
        RegisterWiki reg = new RegisterWiki(mem);
        System.out.println(AnimalsNames);
        Concept c = new Concept();
        c.setConceptClass(cc);
        c.setName(cc.getNameClass());
        c.setFoundInDB(false);

        assertEquals(c.getName(),reg.register(AnimalsNames,cc).getName());
    }

    @Test
    public void test3_Affenpinscher(){
        String AnimalsNames = "Affenpinscher";
        ConceptClass cc = new ConceptClass("animals");
        cc.setKeywords("Kingdom: Animalia");
        LongMemory mem = new LongMemory();
        RegisterWiki reg = new RegisterWiki(mem);
        System.out.println(AnimalsNames);
        Concept c = new Concept();
        c.setConceptClass(cc);
        c.setName(cc.getNameClass());
        c.setFoundInDB(false);

        assertEquals(c.getName(),reg.register(AnimalsNames,cc).getName());
    }

    @Test
    public void test4_AfghanHound(){
        String AnimalsNames = "Afghan Hound";
        ConceptClass cc = new ConceptClass("animals");
        cc.setKeywords("Kingdom: Animalia");
        LongMemory mem = new LongMemory();
        RegisterWiki reg = new RegisterWiki(mem);
        System.out.println(AnimalsNames);
        Concept c = new Concept();
        c.setConceptClass(cc);
        c.setName(cc.getNameClass());
        c.setFoundInDB(false);

        assertEquals(c.getName(),reg.register(AnimalsNames,cc).getName());
    }

    @Test
    public void test5_AfricanBushElephant(){
        String AnimalsNames = "African Bush Elephant";
        ConceptClass cc = new ConceptClass("animals");
        cc.setKeywords("Kingdom: Animalia");
        LongMemory mem = new LongMemory();
        RegisterWiki reg = new RegisterWiki(mem);
        System.out.println(AnimalsNames);
        Concept c = new Concept();
        c.setConceptClass(cc);
        c.setName(cc.getNameClass());
        c.setFoundInDB(false);

        assertEquals(c.getName(),reg.register(AnimalsNames,cc).getName());
    }

    @Test
    public void test6_AfricanCivet(){
        String AnimalsNames = "African Civet";
        ConceptClass cc = new ConceptClass("animals");
        cc.setKeywords("Kingdom: Animalia");
        LongMemory mem = new LongMemory();
        RegisterWiki reg = new RegisterWiki(mem);
        System.out.println(AnimalsNames);
        Concept c = new Concept();
        c.setConceptClass(cc);
        c.setName(cc.getNameClass());
        c.setFoundInDB(false);

        assertEquals(c.getName(),reg.register(AnimalsNames,cc).getName());
    }

    @Test
    public void test7_AfricanClawedFrog(){
        String AnimalsNames = "African Clawed Frog";
        ConceptClass cc = new ConceptClass("animals");
        cc.setKeywords("Kingdom: Animalia");
        LongMemory mem = new LongMemory();
        RegisterWiki reg = new RegisterWiki(mem);
        System.out.println(AnimalsNames);
        Concept c = new Concept();
        c.setConceptClass(cc);
        c.setName(cc.getNameClass());
        c.setFoundInDB(false);

        assertEquals(c.getName(),reg.register(AnimalsNames,cc).getName());
    }

    @Test
    public void test8_AfricanForestElephant(){
        String AnimalsNames = "African Forest Elephant";
        ConceptClass cc = new ConceptClass("animals");
        cc.setKeywords("Kingdom: Animalia");
        LongMemory mem = new LongMemory();
        RegisterWiki reg = new RegisterWiki(mem);
        System.out.println(AnimalsNames);
        Concept c = new Concept();
        c.setConceptClass(cc);
        c.setName(cc.getNameClass());
        c.setFoundInDB(false);

        assertEquals(c.getName(),reg.register(AnimalsNames,cc).getName());
    }

    @Test
    public void test9_AfricanPalmCivet(){
        String AnimalsNames = "African Palm Civet";
        ConceptClass cc = new ConceptClass("animals");
        cc.setKeywords("Kingdom: Animalia");
        LongMemory mem = new LongMemory();
        RegisterWiki reg = new RegisterWiki(mem);
        System.out.println(AnimalsNames);
        Concept c = new Concept();
        c.setConceptClass(cc);
        c.setName(cc.getNameClass());
        c.setFoundInDB(false);

        assertEquals(c.getName(),reg.register(AnimalsNames,cc).getName());
    }

    @Test
    public void test10_AfricanPenguin(){
        String AnimalsNames = "African Penguin";
        ConceptClass cc = new ConceptClass("animals");
        cc.setKeywords("Kingdom: Animalia");
        LongMemory mem = new LongMemory();
        RegisterWiki reg = new RegisterWiki(mem);
        System.out.println(AnimalsNames);
        Concept c = new Concept();
        c.setConceptClass(cc);
        c.setName(cc.getNameClass());
        c.setFoundInDB(false);

        assertEquals(c.getName(),reg.register(AnimalsNames,cc).getName());
    }

    @Test
    public void test11_AfricanTreeToad(){
        String AnimalsNames = "African Tree Toad";
        ConceptClass cc = new ConceptClass("animals");
        cc.setKeywords("Kingdom: Animalia");
        LongMemory mem = new LongMemory();
        RegisterWiki reg = new RegisterWiki(mem);
        System.out.println(AnimalsNames);
        Concept c = new Concept();
        c.setConceptClass(cc);
        c.setName(cc.getNameClass());
        c.setFoundInDB(false);

        assertEquals(c.getName(),reg.register(AnimalsNames,cc).getName());
    }

    @Test
    public void test12_AfricanWildDog(){
        String AnimalsNames = "African Wild Dog";
        ConceptClass cc = new ConceptClass("animals");
        cc.setKeywords("Kingdom: Animalia");
        LongMemory mem = new LongMemory();
        RegisterWiki reg = new RegisterWiki(mem);
        System.out.println(AnimalsNames);
        Concept c = new Concept();
        c.setConceptClass(cc);
        c.setName(cc.getNameClass());
        c.setFoundInDB(false);

        assertEquals(c.getName(),reg.register(AnimalsNames,cc).getName());
    }

    @Test
    public void test13_AinuDog(){
        String AnimalsNames = "Ainu Dog";
        ConceptClass cc = new ConceptClass("animals");
        cc.setKeywords("Kingdom: Animalia");
        LongMemory mem = new LongMemory();
        RegisterWiki reg = new RegisterWiki(mem);
        System.out.println(AnimalsNames);
        Concept c = new Concept();
        c.setConceptClass(cc);
        c.setName(cc.getNameClass());
        c.setFoundInDB(false);

        assertEquals(c.getName(),reg.register(AnimalsNames,cc).getName());
    }

    @Test
    public void test14_AiredaleTerrier(){
        String AnimalsNames = "Airedale Terrier";
        ConceptClass cc = new ConceptClass("animals");
        cc.setKeywords("Kingdom: Animalia");
        LongMemory mem = new LongMemory();
        RegisterWiki reg = new RegisterWiki(mem);
        System.out.println(AnimalsNames);
        Concept c = new Concept();
        c.setConceptClass(cc);
        c.setName(cc.getNameClass());
        c.setFoundInDB(false);

        assertEquals(c.getName(),reg.register(AnimalsNames,cc).getName());
    }

    @Test
    public void test15_Akbash(){
        String AnimalsNames = "Akbash";
        ConceptClass cc = new ConceptClass("animals");
        cc.setKeywords("Kingdom: Animalia");
        LongMemory mem = new LongMemory();
        RegisterWiki reg = new RegisterWiki(mem);
        System.out.println(AnimalsNames);
        Concept c = new Concept();
        c.setConceptClass(cc);
        c.setName(cc.getNameClass());
        c.setFoundInDB(false);

        assertEquals(c.getName(),reg.register(AnimalsNames,cc).getName());
    }

    @Test
    public void test16_Akita(){
        String AnimalsNames = "Akita";
        ConceptClass cc = new ConceptClass("animals");
        cc.setKeywords("Kingdom: Animalia");
        LongMemory mem = new LongMemory();
        RegisterWiki reg = new RegisterWiki(mem);
        System.out.println(AnimalsNames);
        Concept c = new Concept();
        c.setConceptClass(cc);
        c.setName(cc.getNameClass());
        c.setFoundInDB(false);

        assertEquals(c.getName(),reg.register(AnimalsNames,cc).getName());
    }

    @Test
    public void test17_AlaskanMalamute(){
        String AnimalsNames = "Alaskan Malamute";
        ConceptClass cc = new ConceptClass("animals");
        cc.setKeywords("Kingdom: Animalia");
        LongMemory mem = new LongMemory();
        RegisterWiki reg = new RegisterWiki(mem);
        System.out.println(AnimalsNames);
        Concept c = new Concept();
        c.setConceptClass(cc);
        c.setName(cc.getNameClass());
        c.setFoundInDB(false);

        assertEquals(c.getName(),reg.register(AnimalsNames,cc).getName());
    }

    @Test
    public void test18_Albatross(){
        String AnimalsNames = "Albatross";
        ConceptClass cc = new ConceptClass("animals");
        cc.setKeywords("Kingdom: Animalia");
        LongMemory mem = new LongMemory();
        RegisterWiki reg = new RegisterWiki(mem);
        System.out.println(AnimalsNames);
        Concept c = new Concept();
        c.setConceptClass(cc);
        c.setName(cc.getNameClass());
        c.setFoundInDB(false);

        assertEquals(c.getName(),reg.register(AnimalsNames,cc).getName());
    }

    @Test
    public void test19_AldabraGiantTortoise(){
        String AnimalsNames = "Aldabra Giant Tortoise";
        ConceptClass cc = new ConceptClass("animals");
        cc.setKeywords("Kingdom: Animalia");
        LongMemory mem = new LongMemory();
        RegisterWiki reg = new RegisterWiki(mem);
        System.out.println(AnimalsNames);
        Concept c = new Concept();
        c.setConceptClass(cc);
        c.setName(cc.getNameClass());
        c.setFoundInDB(false);

        assertEquals(c.getName(),reg.register(AnimalsNames,cc).getName());
    }

    @Test
    public void test20_Alligator(){
        String AnimalsNames = "Alligator";
        ConceptClass cc = new ConceptClass("animals");
        cc.setKeywords("Kingdom: Animalia");
        LongMemory mem = new LongMemory();
        RegisterWiki reg = new RegisterWiki(mem);
        System.out.println(AnimalsNames);
        Concept c = new Concept();
        c.setConceptClass(cc);
        c.setName(cc.getNameClass());
        c.setFoundInDB(false);

        assertEquals(c.getName(),reg.register(AnimalsNames,cc).getName());
    }

    @Test
    public void test21_AlpineDachsbracke(){
        String AnimalsNames = "Alpine Dachsbracke";
        ConceptClass cc = new ConceptClass("animals");
        cc.setKeywords("Kingdom: Animalia");
        LongMemory mem = new LongMemory();
        RegisterWiki reg = new RegisterWiki(mem);
        System.out.println(AnimalsNames);
        Concept c = new Concept();
        c.setConceptClass(cc);
        c.setName(cc.getNameClass());
        c.setFoundInDB(false);

        assertEquals(c.getName(),reg.register(AnimalsNames,cc).getName());
    }

    @Test
    public void test22_AmericanBulldog(){
        String AnimalsNames = "American Bulldog";
        ConceptClass cc = new ConceptClass("animals");
        cc.setKeywords("Kingdom: Animalia");
        LongMemory mem = new LongMemory();
        RegisterWiki reg = new RegisterWiki(mem);
        System.out.println(AnimalsNames);
        Concept c = new Concept();
        c.setConceptClass(cc);
        c.setName(cc.getNameClass());
        c.setFoundInDB(false);

        assertEquals(c.getName(),reg.register(AnimalsNames,cc).getName());
    }

    @Test
    public void test23_AmericanCockerSpaniel(){
        String AnimalsNames = "American Cocker Spaniel";
        ConceptClass cc = new ConceptClass("animals");
        cc.setKeywords("Kingdom: Animalia");
        LongMemory mem = new LongMemory();
        RegisterWiki reg = new RegisterWiki(mem);
        System.out.println(AnimalsNames);
        Concept c = new Concept();
        c.setConceptClass(cc);
        c.setName(cc.getNameClass());
        c.setFoundInDB(false);

        assertEquals(c.getName(),reg.register(AnimalsNames,cc).getName());
    }

    @Test
    public void test24_AmericanCoonhound(){
        String AnimalsNames = "American Coonhound";
        ConceptClass cc = new ConceptClass("animals");
        cc.setKeywords("Kingdom: Animalia");
        LongMemory mem = new LongMemory();
        RegisterWiki reg = new RegisterWiki(mem);
        System.out.println(AnimalsNames);
        Concept c = new Concept();
        c.setConceptClass(cc);
        c.setName(cc.getNameClass());
        c.setFoundInDB(false);

        assertEquals(c.getName(),reg.register(AnimalsNames,cc).getName());
    }

    @Test
    public void test25_AmericanEskimoDog(){
        String AnimalsNames = "American Eskimo Dog";
        ConceptClass cc = new ConceptClass("animals");
        cc.setKeywords("Kingdom: Animalia");
        LongMemory mem = new LongMemory();
        RegisterWiki reg = new RegisterWiki(mem);
        System.out.println(AnimalsNames);
        Concept c = new Concept();
        c.setConceptClass(cc);
        c.setName(cc.getNameClass());
        c.setFoundInDB(false);

        assertEquals(c.getName(),reg.register(AnimalsNames,cc).getName());
    }

    @Test
    public void test26_AmericanFoxhound(){
        String AnimalsNames = "American Foxhound";
        ConceptClass cc = new ConceptClass("animals");
        cc.setKeywords("Kingdom: Animalia");
        LongMemory mem = new LongMemory();
        RegisterWiki reg = new RegisterWiki(mem);
        System.out.println(AnimalsNames);
        Concept c = new Concept();
        c.setConceptClass(cc);
        c.setName(cc.getNameClass());
        c.setFoundInDB(false);

        assertEquals(c.getName(),reg.register(AnimalsNames,cc).getName());
    }

    @Test
    public void test27_AmericanPitBullTerrier(){
        String AnimalsNames = "American Pit Bull Terrier";
        ConceptClass cc = new ConceptClass("animals");
        cc.setKeywords("Kingdom: Animalia");
        LongMemory mem = new LongMemory();
        RegisterWiki reg = new RegisterWiki(mem);
        System.out.println(AnimalsNames);
        Concept c = new Concept();
        c.setConceptClass(cc);
        c.setName(cc.getNameClass());
        c.setFoundInDB(false);

        assertEquals(c.getName(),reg.register(AnimalsNames,cc).getName());
    }

    @Test
    public void test28_AmericanStaffordshireTerrier(){
        String AnimalsNames = "American Staffordshire Terrier";
        ConceptClass cc = new ConceptClass("animals");
        cc.setKeywords("Kingdom: Animalia");
        LongMemory mem = new LongMemory();
        RegisterWiki reg = new RegisterWiki(mem);
        System.out.println(AnimalsNames);
        Concept c = new Concept();
        c.setConceptClass(cc);
        c.setName(cc.getNameClass());
        c.setFoundInDB(false);

        assertEquals(c.getName(),reg.register(AnimalsNames,cc).getName());
    }

    @Test
    public void test29_AmericanWaterSpaniel(){
        String AnimalsNames = "American Water Spaniel";
        ConceptClass cc = new ConceptClass("animals");
        cc.setKeywords("Kingdom: Animalia");
        LongMemory mem = new LongMemory();
        RegisterWiki reg = new RegisterWiki(mem);
        System.out.println(AnimalsNames);
        Concept c = new Concept();
        c.setConceptClass(cc);
        c.setName(cc.getNameClass());
        c.setFoundInDB(false);

        assertEquals(c.getName(),reg.register(AnimalsNames,cc).getName());
    }

    @Test
    public void test30_AnatolianShepherdDog(){
        String AnimalsNames = "Anatolian Shepherd Dog";
        ConceptClass cc = new ConceptClass("animals");
        cc.setKeywords("Kingdom: Animalia");
        LongMemory mem = new LongMemory();
        RegisterWiki reg = new RegisterWiki(mem);
        System.out.println(AnimalsNames);
        Concept c = new Concept();
        c.setConceptClass(cc);
        c.setName(cc.getNameClass());
        c.setFoundInDB(false);

        assertEquals(c.getName(),reg.register(AnimalsNames,cc).getName());
    }

    @Test
    public void test31_Angelfish(){
        String AnimalsNames = "Angelfish";
        ConceptClass cc = new ConceptClass("animals");
        cc.setKeywords("Kingdom: Animalia");
        LongMemory mem = new LongMemory();
        RegisterWiki reg = new RegisterWiki(mem);
        System.out.println(AnimalsNames);
        Concept c = new Concept();
        c.setConceptClass(cc);
        c.setName(cc.getNameClass());
        c.setFoundInDB(false);

        assertEquals(c.getName(),reg.register(AnimalsNames,cc).getName());
    }

    @Test
    public void test32_Ant(){
        String AnimalsNames = "Ant";
        ConceptClass cc = new ConceptClass("animals");
        cc.setKeywords("Kingdom: Animalia");
        LongMemory mem = new LongMemory();
        RegisterWiki reg = new RegisterWiki(mem);
        System.out.println(AnimalsNames);
        Concept c = new Concept();
        c.setConceptClass(cc);
        c.setName(cc.getNameClass());
        c.setFoundInDB(false);

        assertEquals(c.getName(),reg.register(AnimalsNames,cc).getName());
    }

    @Test
    public void test33_Anteater(){
        String AnimalsNames = "Anteater";
        ConceptClass cc = new ConceptClass("animals");
        cc.setKeywords("Kingdom: Animalia");
        LongMemory mem = new LongMemory();
        RegisterWiki reg = new RegisterWiki(mem);
        System.out.println(AnimalsNames);
        Concept c = new Concept();
        c.setConceptClass(cc);
        c.setName(cc.getNameClass());
        c.setFoundInDB(false);

        assertEquals(c.getName(),reg.register(AnimalsNames,cc).getName());
    }

    @Test
    public void test34_Antelope(){
        String AnimalsNames = "Antelope";
        ConceptClass cc = new ConceptClass("animals");
        cc.setKeywords("Kingdom: Animalia");
        LongMemory mem = new LongMemory();
        RegisterWiki reg = new RegisterWiki(mem);
        System.out.println(AnimalsNames);
        Concept c = new Concept();
        c.setConceptClass(cc);
        c.setName(cc.getNameClass());
        c.setFoundInDB(false);

        assertEquals(c.getName(),reg.register(AnimalsNames,cc).getName());
    }

    @Test
    public void test35_AppenzellerDog(){
        String AnimalsNames = "Appenzeller Dog";
        ConceptClass cc = new ConceptClass("animals");
        cc.setKeywords("Kingdom: Animalia");
        LongMemory mem = new LongMemory();
        RegisterWiki reg = new RegisterWiki(mem);
        System.out.println(AnimalsNames);
        Concept c = new Concept();
        c.setConceptClass(cc);
        c.setName(cc.getNameClass());
        c.setFoundInDB(false);

        assertEquals(c.getName(),reg.register(AnimalsNames,cc).getName());
    }

    @Test
    public void test36_ArcticFox(){
        String AnimalsNames = "Arctic Fox";
        ConceptClass cc = new ConceptClass("animals");
        cc.setKeywords("Kingdom: Animalia");
        LongMemory mem = new LongMemory();
        RegisterWiki reg = new RegisterWiki(mem);
        System.out.println(AnimalsNames);
        Concept c = new Concept();
        c.setConceptClass(cc);
        c.setName(cc.getNameClass());
        c.setFoundInDB(false);

        assertEquals(c.getName(),reg.register(AnimalsNames,cc).getName());
    }

    @Test
    public void test37_ArcticHare(){
        String AnimalsNames = "Arctic Hare";
        ConceptClass cc = new ConceptClass("animals");
        cc.setKeywords("Kingdom: Animalia");
        LongMemory mem = new LongMemory();
        RegisterWiki reg = new RegisterWiki(mem);
        System.out.println(AnimalsNames);
        Concept c = new Concept();
        c.setConceptClass(cc);
        c.setName(cc.getNameClass());
        c.setFoundInDB(false);

        assertEquals(c.getName(),reg.register(AnimalsNames,cc).getName());
    }

    @Test
    public void test38_ArcticWolf(){
        String AnimalsNames = "Arctic Wolf";
        ConceptClass cc = new ConceptClass("animals");
        cc.setKeywords("Kingdom: Animalia");
        LongMemory mem = new LongMemory();
        RegisterWiki reg = new RegisterWiki(mem);
        System.out.println(AnimalsNames);
        Concept c = new Concept();
        c.setConceptClass(cc);
        c.setName(cc.getNameClass());
        c.setFoundInDB(false);

        assertEquals(c.getName(),reg.register(AnimalsNames,cc).getName());
    }

    @Test
    public void test39_Armadillo(){
        String AnimalsNames = "Armadillo";
        ConceptClass cc = new ConceptClass("animals");
        cc.setKeywords("Kingdom: Animalia");
        LongMemory mem = new LongMemory();
        RegisterWiki reg = new RegisterWiki(mem);
        System.out.println(AnimalsNames);
        Concept c = new Concept();
        c.setConceptClass(cc);
        c.setName(cc.getNameClass());
        c.setFoundInDB(false);

        assertEquals(c.getName(),reg.register(AnimalsNames,cc).getName());
    }

    @Test
    public void test40_AsianElephant(){
        String AnimalsNames = "Asian Elephant";
        ConceptClass cc = new ConceptClass("animals");
        cc.setKeywords("Kingdom: Animalia");
        LongMemory mem = new LongMemory();
        RegisterWiki reg = new RegisterWiki(mem);
        System.out.println(AnimalsNames);
        Concept c = new Concept();
        c.setConceptClass(cc);
        c.setName(cc.getNameClass());
        c.setFoundInDB(false);

        assertEquals(c.getName(),reg.register(AnimalsNames,cc).getName());
    }

    @Test
    public void test41_AsianGiantHornet(){
        String AnimalsNames = "Asian Giant Hornet";
        ConceptClass cc = new ConceptClass("animals");
        cc.setKeywords("Kingdom: Animalia");
        LongMemory mem = new LongMemory();
        RegisterWiki reg = new RegisterWiki(mem);
        System.out.println(AnimalsNames);
        Concept c = new Concept();
        c.setConceptClass(cc);
        c.setName(cc.getNameClass());
        c.setFoundInDB(false);

        assertEquals(c.getName(),reg.register(AnimalsNames,cc).getName());
    }

    @Test
    public void test42_AsianPalmCivet(){
        String AnimalsNames = "Asian Palm Civet";
        ConceptClass cc = new ConceptClass("animals");
        cc.setKeywords("Kingdom: Animalia");
        LongMemory mem = new LongMemory();
        RegisterWiki reg = new RegisterWiki(mem);
        System.out.println(AnimalsNames);
        Concept c = new Concept();
        c.setConceptClass(cc);
        c.setName(cc.getNameClass());
        c.setFoundInDB(false);

        assertEquals(c.getName(),reg.register(AnimalsNames,cc).getName());
    }

    @Test
    public void test43_AsiaticBlackBear(){
        String AnimalsNames = "Asiatic Black Bear";
        ConceptClass cc = new ConceptClass("animals");
        cc.setKeywords("Kingdom: Animalia");
        LongMemory mem = new LongMemory();
        RegisterWiki reg = new RegisterWiki(mem);
        System.out.println(AnimalsNames);
        Concept c = new Concept();
        c.setConceptClass(cc);
        c.setName(cc.getNameClass());
        c.setFoundInDB(false);

        assertEquals(c.getName(),reg.register(AnimalsNames,cc).getName());
    }

    @Test
    public void test44_AustralianCattleDog(){
        String AnimalsNames = "Australian Cattle Dog";
        ConceptClass cc = new ConceptClass("animals");
        cc.setKeywords("Kingdom: Animalia");
        LongMemory mem = new LongMemory();
        RegisterWiki reg = new RegisterWiki(mem);
        System.out.println(AnimalsNames);
        Concept c = new Concept();
        c.setConceptClass(cc);
        c.setName(cc.getNameClass());
        c.setFoundInDB(false);

        assertEquals(c.getName(),reg.register(AnimalsNames,cc).getName());
    }

    @Test
    public void test45_AustralianKelpieDog(){
        String AnimalsNames = "Australian Kelpie Dog";
        ConceptClass cc = new ConceptClass("animals");
        cc.setKeywords("Kingdom: Animalia");
        LongMemory mem = new LongMemory();
        RegisterWiki reg = new RegisterWiki(mem);
        System.out.println(AnimalsNames);
        Concept c = new Concept();
        c.setConceptClass(cc);
        c.setName(cc.getNameClass());
        c.setFoundInDB(false);

        assertEquals(c.getName(),reg.register(AnimalsNames,cc).getName());
    }

    @Test
    public void test46_AustralianMist(){
        String AnimalsNames = "Australian Mist";
        ConceptClass cc = new ConceptClass("animals");
        cc.setKeywords("Kingdom: Animalia");
        LongMemory mem = new LongMemory();
        RegisterWiki reg = new RegisterWiki(mem);
        System.out.println(AnimalsNames);
        Concept c = new Concept();
        c.setConceptClass(cc);
        c.setName(cc.getNameClass());
        c.setFoundInDB(false);

        assertEquals(c.getName(),reg.register(AnimalsNames,cc).getName());
    }

    @Test
    public void test47_AustralianShepherd(){
        String AnimalsNames = "Australian Shepherd";
        ConceptClass cc = new ConceptClass("animals");
        cc.setKeywords("Kingdom: Animalia");
        LongMemory mem = new LongMemory();
        RegisterWiki reg = new RegisterWiki(mem);
        System.out.println(AnimalsNames);
        Concept c = new Concept();
        c.setConceptClass(cc);
        c.setName(cc.getNameClass());
        c.setFoundInDB(false);

        assertEquals(c.getName(),reg.register(AnimalsNames,cc).getName());
    }

    @Test
    public void test48_AustralianTerrier(){
        String AnimalsNames = "Australian Terrier";
        ConceptClass cc = new ConceptClass("animals");
        cc.setKeywords("Kingdom: Animalia");
        LongMemory mem = new LongMemory();
        RegisterWiki reg = new RegisterWiki(mem);
        System.out.println(AnimalsNames);
        Concept c = new Concept();
        c.setConceptClass(cc);
        c.setName(cc.getNameClass());
        c.setFoundInDB(false);

        assertEquals(c.getName(),reg.register(AnimalsNames,cc).getName());
    }

    @Test
    public void test49_Avocet(){
        String AnimalsNames = "Avocet";
        ConceptClass cc = new ConceptClass("animals");
        cc.setKeywords("Kingdom: Animalia");
        LongMemory mem = new LongMemory();
        RegisterWiki reg = new RegisterWiki(mem);
        System.out.println(AnimalsNames);
        Concept c = new Concept();
        c.setConceptClass(cc);
        c.setName(cc.getNameClass());
        c.setFoundInDB(false);

        assertEquals(c.getName(),reg.register(AnimalsNames,cc).getName());
    }

    @Test
    public void test50_Axolotl(){
        String AnimalsNames = "Axolotl";
        ConceptClass cc = new ConceptClass("animals");
        cc.setKeywords("Kingdom: Animalia");
        LongMemory mem = new LongMemory();
        RegisterWiki reg = new RegisterWiki(mem);
        System.out.println(AnimalsNames);
        Concept c = new Concept();
        c.setConceptClass(cc);
        c.setName(cc.getNameClass());
        c.setFoundInDB(false);

        assertEquals(c.getName(),reg.register(AnimalsNames,cc).getName());
    }

    @Test
    public void test51_AyeAye(){
        String AnimalsNames = "Aye Aye";
        ConceptClass cc = new ConceptClass("animals");
        cc.setKeywords("Kingdom: Animalia");
        LongMemory mem = new LongMemory();
        RegisterWiki reg = new RegisterWiki(mem);
        System.out.println(AnimalsNames);
        Concept c = new Concept();
        c.setConceptClass(cc);
        c.setName(cc.getNameClass());
        c.setFoundInDB(false);

        assertEquals(c.getName(),reg.register(AnimalsNames,cc).getName());
    }

    @Test
    public void test52_B(){
        String AnimalsNames = "B";
        ConceptClass cc = new ConceptClass("animals");
        cc.setKeywords("Kingdom: Animalia");
        LongMemory mem = new LongMemory();
        RegisterWiki reg = new RegisterWiki(mem);
        System.out.println(AnimalsNames);
        Concept c = new Concept();
        c.setConceptClass(cc);
        c.setName(cc.getNameClass());
        c.setFoundInDB(false);

        assertEquals(c.getName(),reg.register(AnimalsNames,cc).getName());
    }

    @Test
    public void test53_Baboon(){
        String AnimalsNames = "Baboon";
        ConceptClass cc = new ConceptClass("animals");
        cc.setKeywords("Kingdom: Animalia");
        LongMemory mem = new LongMemory();
        RegisterWiki reg = new RegisterWiki(mem);
        System.out.println(AnimalsNames);
        Concept c = new Concept();
        c.setConceptClass(cc);
        c.setName(cc.getNameClass());
        c.setFoundInDB(false);

        assertEquals(c.getName(),reg.register(AnimalsNames,cc).getName());
    }

    @Test
    public void test54_BactrianCamel(){
        String AnimalsNames = "Bactrian Camel";
        ConceptClass cc = new ConceptClass("animals");
        cc.setKeywords("Kingdom: Animalia");
        LongMemory mem = new LongMemory();
        RegisterWiki reg = new RegisterWiki(mem);
        System.out.println(AnimalsNames);
        Concept c = new Concept();
        c.setConceptClass(cc);
        c.setName(cc.getNameClass());
        c.setFoundInDB(false);

        assertEquals(c.getName(),reg.register(AnimalsNames,cc).getName());
    }

    @Test
    public void test55_Badger(){
        String AnimalsNames = "Badger";
        ConceptClass cc = new ConceptClass("animals");
        cc.setKeywords("Kingdom: Animalia");
        LongMemory mem = new LongMemory();
        RegisterWiki reg = new RegisterWiki(mem);
        System.out.println(AnimalsNames);
        Concept c = new Concept();
        c.setConceptClass(cc);
        c.setName(cc.getNameClass());
        c.setFoundInDB(false);

        assertEquals(c.getName(),reg.register(AnimalsNames,cc).getName());
    }

    @Test
    public void test56_Balinese(){
        String AnimalsNames = "Balinese";
        ConceptClass cc = new ConceptClass("animals");
        cc.setKeywords("Kingdom: Animalia");
        LongMemory mem = new LongMemory();
        RegisterWiki reg = new RegisterWiki(mem);
        System.out.println(AnimalsNames);
        Concept c = new Concept();
        c.setConceptClass(cc);
        c.setName(cc.getNameClass());
        c.setFoundInDB(false);

        assertEquals(c.getName(),reg.register(AnimalsNames,cc).getName());
    }

    @Test
    public void test57_BandedPalmCivet(){
        String AnimalsNames = "Banded Palm Civet";
        ConceptClass cc = new ConceptClass("animals");
        cc.setKeywords("Kingdom: Animalia");
        LongMemory mem = new LongMemory();
        RegisterWiki reg = new RegisterWiki(mem);
        System.out.println(AnimalsNames);
        Concept c = new Concept();
        c.setConceptClass(cc);
        c.setName(cc.getNameClass());
        c.setFoundInDB(false);

        assertEquals(c.getName(),reg.register(AnimalsNames,cc).getName());
    }

    @Test
    public void test58_Bandicoot(){
        String AnimalsNames = "Bandicoot";
        ConceptClass cc = new ConceptClass("animals");
        cc.setKeywords("Kingdom: Animalia");
        LongMemory mem = new LongMemory();
        RegisterWiki reg = new RegisterWiki(mem);
        System.out.println(AnimalsNames);
        Concept c = new Concept();
        c.setConceptClass(cc);
        c.setName(cc.getNameClass());
        c.setFoundInDB(false);

        assertEquals(c.getName(),reg.register(AnimalsNames,cc).getName());
    }

    @Test
    public void test59_Barb(){
        String AnimalsNames = "Barb";
        ConceptClass cc = new ConceptClass("animals");
        cc.setKeywords("Kingdom: Animalia");
        LongMemory mem = new LongMemory();
        RegisterWiki reg = new RegisterWiki(mem);
        System.out.println(AnimalsNames);
        Concept c = new Concept();
        c.setConceptClass(cc);
        c.setName(cc.getNameClass());
        c.setFoundInDB(false);

        assertEquals(c.getName(),reg.register(AnimalsNames,cc).getName());
    }

    @Test
    public void test60_BarnOwl(){
        String AnimalsNames = "Barn Owl";
        ConceptClass cc = new ConceptClass("animals");
        cc.setKeywords("Kingdom: Animalia");
        LongMemory mem = new LongMemory();
        RegisterWiki reg = new RegisterWiki(mem);
        System.out.println(AnimalsNames);
        Concept c = new Concept();
        c.setConceptClass(cc);
        c.setName(cc.getNameClass());
        c.setFoundInDB(false);

        assertEquals(c.getName(),reg.register(AnimalsNames,cc).getName());
    }

    @Test
    public void test61_Barnacle(){
        String AnimalsNames = "Barnacle";
        ConceptClass cc = new ConceptClass("animals");
        cc.setKeywords("Kingdom: Animalia");
        LongMemory mem = new LongMemory();
        RegisterWiki reg = new RegisterWiki(mem);
        System.out.println(AnimalsNames);
        Concept c = new Concept();
        c.setConceptClass(cc);
        c.setName(cc.getNameClass());
        c.setFoundInDB(false);

        assertEquals(c.getName(),reg.register(AnimalsNames,cc).getName());
    }

    @Test
    public void test62_Barracuda(){
        String AnimalsNames = "Barracuda";
        ConceptClass cc = new ConceptClass("animals");
        cc.setKeywords("Kingdom: Animalia");
        LongMemory mem = new LongMemory();
        RegisterWiki reg = new RegisterWiki(mem);
        System.out.println(AnimalsNames);
        Concept c = new Concept();
        c.setConceptClass(cc);
        c.setName(cc.getNameClass());
        c.setFoundInDB(false);

        assertEquals(c.getName(),reg.register(AnimalsNames,cc).getName());
    }

    @Test
    public void test63_BasenjiDog(){
        String AnimalsNames = "Basenji Dog";
        ConceptClass cc = new ConceptClass("animals");
        cc.setKeywords("Kingdom: Animalia");
        LongMemory mem = new LongMemory();
        RegisterWiki reg = new RegisterWiki(mem);
        System.out.println(AnimalsNames);
        Concept c = new Concept();
        c.setConceptClass(cc);
        c.setName(cc.getNameClass());
        c.setFoundInDB(false);

        assertEquals(c.getName(),reg.register(AnimalsNames,cc).getName());
    }

    @Test
    public void test64_BaskingShark(){
        String AnimalsNames = "Basking Shark";
        ConceptClass cc = new ConceptClass("animals");
        cc.setKeywords("Kingdom: Animalia");
        LongMemory mem = new LongMemory();
        RegisterWiki reg = new RegisterWiki(mem);
        System.out.println(AnimalsNames);
        Concept c = new Concept();
        c.setConceptClass(cc);
        c.setName(cc.getNameClass());
        c.setFoundInDB(false);

        assertEquals(c.getName(),reg.register(AnimalsNames,cc).getName());
    }

    @Test
    public void test65_BassetHound(){
        String AnimalsNames = "Basset Hound";
        ConceptClass cc = new ConceptClass("animals");
        cc.setKeywords("Kingdom: Animalia");
        LongMemory mem = new LongMemory();
        RegisterWiki reg = new RegisterWiki(mem);
        System.out.println(AnimalsNames);
        Concept c = new Concept();
        c.setConceptClass(cc);
        c.setName(cc.getNameClass());
        c.setFoundInDB(false);

        assertEquals(c.getName(),reg.register(AnimalsNames,cc).getName());
    }

    @Test
    public void test66_Bat(){
        String AnimalsNames = "Bat";
        ConceptClass cc = new ConceptClass("animals");
        cc.setKeywords("Kingdom: Animalia");
        LongMemory mem = new LongMemory();
        RegisterWiki reg = new RegisterWiki(mem);
        System.out.println(AnimalsNames);
        Concept c = new Concept();
        c.setConceptClass(cc);
        c.setName(cc.getNameClass());
        c.setFoundInDB(false);

        assertEquals(c.getName(),reg.register(AnimalsNames,cc).getName());
    }

    @Test
    public void test67_BavarianMountainHound(){
        String AnimalsNames = "Bavarian Mountain Hound";
        ConceptClass cc = new ConceptClass("animals");
        cc.setKeywords("Kingdom: Animalia");
        LongMemory mem = new LongMemory();
        RegisterWiki reg = new RegisterWiki(mem);
        System.out.println(AnimalsNames);
        Concept c = new Concept();
        c.setConceptClass(cc);
        c.setName(cc.getNameClass());
        c.setFoundInDB(false);

        assertEquals(c.getName(),reg.register(AnimalsNames,cc).getName());
    }

    @Test
    public void test68_Beagle(){
        String AnimalsNames = "Beagle";
        ConceptClass cc = new ConceptClass("animals");
        cc.setKeywords("Kingdom: Animalia");
        LongMemory mem = new LongMemory();
        RegisterWiki reg = new RegisterWiki(mem);
        System.out.println(AnimalsNames);
        Concept c = new Concept();
        c.setConceptClass(cc);
        c.setName(cc.getNameClass());
        c.setFoundInDB(false);

        assertEquals(c.getName(),reg.register(AnimalsNames,cc).getName());
    }

    @Test
    public void test69_Bear(){
        String AnimalsNames = "Bear";
        ConceptClass cc = new ConceptClass("animals");
        cc.setKeywords("Kingdom: Animalia");
        LongMemory mem = new LongMemory();
        RegisterWiki reg = new RegisterWiki(mem);
        System.out.println(AnimalsNames);
        Concept c = new Concept();
        c.setConceptClass(cc);
        c.setName(cc.getNameClass());
        c.setFoundInDB(false);

        assertEquals(c.getName(),reg.register(AnimalsNames,cc).getName());
    }

    @Test
    public void test70_BeardedCollie(){
        String AnimalsNames = "Bearded Collie";
        ConceptClass cc = new ConceptClass("animals");
        cc.setKeywords("Kingdom: Animalia");
        LongMemory mem = new LongMemory();
        RegisterWiki reg = new RegisterWiki(mem);
        System.out.println(AnimalsNames);
        Concept c = new Concept();
        c.setConceptClass(cc);
        c.setName(cc.getNameClass());
        c.setFoundInDB(false);

        assertEquals(c.getName(),reg.register(AnimalsNames,cc).getName());
    }

    @Test
    public void test71_BeardedDragon(){
        String AnimalsNames = "Bearded Dragon";
        ConceptClass cc = new ConceptClass("animals");
        cc.setKeywords("Kingdom: Animalia");
        LongMemory mem = new LongMemory();
        RegisterWiki reg = new RegisterWiki(mem);
        System.out.println(AnimalsNames);
        Concept c = new Concept();
        c.setConceptClass(cc);
        c.setName(cc.getNameClass());
        c.setFoundInDB(false);

        assertEquals(c.getName(),reg.register(AnimalsNames,cc).getName());
    }

    @Test
    public void test72_Beaver(){
        String AnimalsNames = "Beaver";
        ConceptClass cc = new ConceptClass("animals");
        cc.setKeywords("Kingdom: Animalia");
        LongMemory mem = new LongMemory();
        RegisterWiki reg = new RegisterWiki(mem);
        System.out.println(AnimalsNames);
        Concept c = new Concept();
        c.setConceptClass(cc);
        c.setName(cc.getNameClass());
        c.setFoundInDB(false);

        assertEquals(c.getName(),reg.register(AnimalsNames,cc).getName());
    }

    @Test
    public void test73_BedlingtonTerrier(){
        String AnimalsNames = "Bedlington Terrier";
        ConceptClass cc = new ConceptClass("animals");
        cc.setKeywords("Kingdom: Animalia");
        LongMemory mem = new LongMemory();
        RegisterWiki reg = new RegisterWiki(mem);
        System.out.println(AnimalsNames);
        Concept c = new Concept();
        c.setConceptClass(cc);
        c.setName(cc.getNameClass());
        c.setFoundInDB(false);

        assertEquals(c.getName(),reg.register(AnimalsNames,cc).getName());
    }

    @Test
    public void test74_Beetle(){
        String AnimalsNames = "Beetle";
        ConceptClass cc = new ConceptClass("animals");
        cc.setKeywords("Kingdom: Animalia");
        LongMemory mem = new LongMemory();
        RegisterWiki reg = new RegisterWiki(mem);
        System.out.println(AnimalsNames);
        Concept c = new Concept();
        c.setConceptClass(cc);
        c.setName(cc.getNameClass());
        c.setFoundInDB(false);

        assertEquals(c.getName(),reg.register(AnimalsNames,cc).getName());
    }

    @Test
    public void test75_BengalTiger(){
        String AnimalsNames = "Bengal Tiger";
        ConceptClass cc = new ConceptClass("animals");
        cc.setKeywords("Kingdom: Animalia");
        LongMemory mem = new LongMemory();
        RegisterWiki reg = new RegisterWiki(mem);
        System.out.println(AnimalsNames);
        Concept c = new Concept();
        c.setConceptClass(cc);
        c.setName(cc.getNameClass());
        c.setFoundInDB(false);

        assertEquals(c.getName(),reg.register(AnimalsNames,cc).getName());
    }

    @Test
    public void test76_BerneseMountainDog(){
        String AnimalsNames = "Bernese Mountain Dog";
        ConceptClass cc = new ConceptClass("animals");
        cc.setKeywords("Kingdom: Animalia");
        LongMemory mem = new LongMemory();
        RegisterWiki reg = new RegisterWiki(mem);
        System.out.println(AnimalsNames);
        Concept c = new Concept();
        c.setConceptClass(cc);
        c.setName(cc.getNameClass());
        c.setFoundInDB(false);

        assertEquals(c.getName(),reg.register(AnimalsNames,cc).getName());
    }

    @Test
    public void test77_BichonFrise(){
        String AnimalsNames = "Bichon Frise";
        ConceptClass cc = new ConceptClass("animals");
        cc.setKeywords("Kingdom: Animalia");
        LongMemory mem = new LongMemory();
        RegisterWiki reg = new RegisterWiki(mem);
        System.out.println(AnimalsNames);
        Concept c = new Concept();
        c.setConceptClass(cc);
        c.setName(cc.getNameClass());
        c.setFoundInDB(false);

        assertEquals(c.getName(),reg.register(AnimalsNames,cc).getName());
    }

    @Test
    public void test78_Binturong(){
        String AnimalsNames = "Binturong";
        ConceptClass cc = new ConceptClass("animals");
        cc.setKeywords("Kingdom: Animalia");
        LongMemory mem = new LongMemory();
        RegisterWiki reg = new RegisterWiki(mem);
        System.out.println(AnimalsNames);
        Concept c = new Concept();
        c.setConceptClass(cc);
        c.setName(cc.getNameClass());
        c.setFoundInDB(false);

        assertEquals(c.getName(),reg.register(AnimalsNames,cc).getName());
    }

    @Test
    public void test79_Bird(){
        String AnimalsNames = "Bird";
        ConceptClass cc = new ConceptClass("animals");
        cc.setKeywords("Kingdom: Animalia");
        LongMemory mem = new LongMemory();
        RegisterWiki reg = new RegisterWiki(mem);
        System.out.println(AnimalsNames);
        Concept c = new Concept();
        c.setConceptClass(cc);
        c.setName(cc.getNameClass());
        c.setFoundInDB(false);

        assertEquals(c.getName(),reg.register(AnimalsNames,cc).getName());
    }

    @Test
    public void test80_BirdsOfParadise(){
        String AnimalsNames = "Birds Of Paradise";
        ConceptClass cc = new ConceptClass("animals");
        cc.setKeywords("Kingdom: Animalia");
        LongMemory mem = new LongMemory();
        RegisterWiki reg = new RegisterWiki(mem);
        System.out.println(AnimalsNames);
        Concept c = new Concept();
        c.setConceptClass(cc);
        c.setName(cc.getNameClass());
        c.setFoundInDB(false);

        assertEquals(c.getName(),reg.register(AnimalsNames,cc).getName());
    }

    @Test
    public void test81_Birman(){
        String AnimalsNames = "Birman";
        ConceptClass cc = new ConceptClass("animals");
        cc.setKeywords("Kingdom: Animalia");
        LongMemory mem = new LongMemory();
        RegisterWiki reg = new RegisterWiki(mem);
        System.out.println(AnimalsNames);
        Concept c = new Concept();
        c.setConceptClass(cc);
        c.setName(cc.getNameClass());
        c.setFoundInDB(false);

        assertEquals(c.getName(),reg.register(AnimalsNames,cc).getName());
    }

    @Test
    public void test82_Bison(){
        String AnimalsNames = "Bison";
        ConceptClass cc = new ConceptClass("animals");
        cc.setKeywords("Kingdom: Animalia");
        LongMemory mem = new LongMemory();
        RegisterWiki reg = new RegisterWiki(mem);
        System.out.println(AnimalsNames);
        Concept c = new Concept();
        c.setConceptClass(cc);
        c.setName(cc.getNameClass());
        c.setFoundInDB(false);

        assertEquals(c.getName(),reg.register(AnimalsNames,cc).getName());
    }

    @Test
    public void test83_BlackBear(){
        String AnimalsNames = "Black Bear";
        ConceptClass cc = new ConceptClass("animals");
        cc.setKeywords("Kingdom: Animalia");
        LongMemory mem = new LongMemory();
        RegisterWiki reg = new RegisterWiki(mem);
        System.out.println(AnimalsNames);
        Concept c = new Concept();
        c.setConceptClass(cc);
        c.setName(cc.getNameClass());
        c.setFoundInDB(false);

        assertEquals(c.getName(),reg.register(AnimalsNames,cc).getName());
    }

    @Test
    public void test84_BlackRhinoceros(){
        String AnimalsNames = "Black Rhinoceros";
        ConceptClass cc = new ConceptClass("animals");
        cc.setKeywords("Kingdom: Animalia");
        LongMemory mem = new LongMemory();
        RegisterWiki reg = new RegisterWiki(mem);
        System.out.println(AnimalsNames);
        Concept c = new Concept();
        c.setConceptClass(cc);
        c.setName(cc.getNameClass());
        c.setFoundInDB(false);

        assertEquals(c.getName(),reg.register(AnimalsNames,cc).getName());
    }

    @Test
    public void test85_BlackRussianTerrier(){
        String AnimalsNames = "Black Russian Terrier";
        ConceptClass cc = new ConceptClass("animals");
        cc.setKeywords("Kingdom: Animalia");
        LongMemory mem = new LongMemory();
        RegisterWiki reg = new RegisterWiki(mem);
        System.out.println(AnimalsNames);
        Concept c = new Concept();
        c.setConceptClass(cc);
        c.setName(cc.getNameClass());
        c.setFoundInDB(false);

        assertEquals(c.getName(),reg.register(AnimalsNames,cc).getName());
    }

    @Test
    public void test86_BlackWidowSpider(){
        String AnimalsNames = "Black Widow Spider";
        ConceptClass cc = new ConceptClass("animals");
        cc.setKeywords("Kingdom: Animalia");
        LongMemory mem = new LongMemory();
        RegisterWiki reg = new RegisterWiki(mem);
        System.out.println(AnimalsNames);
        Concept c = new Concept();
        c.setConceptClass(cc);
        c.setName(cc.getNameClass());
        c.setFoundInDB(false);

        assertEquals(c.getName(),reg.register(AnimalsNames,cc).getName());
    }

    @Test
    public void test87_Bloodhound(){
        String AnimalsNames = "Bloodhound";
        ConceptClass cc = new ConceptClass("animals");
        cc.setKeywords("Kingdom: Animalia");
        LongMemory mem = new LongMemory();
        RegisterWiki reg = new RegisterWiki(mem);
        System.out.println(AnimalsNames);
        Concept c = new Concept();
        c.setConceptClass(cc);
        c.setName(cc.getNameClass());
        c.setFoundInDB(false);

        assertEquals(c.getName(),reg.register(AnimalsNames,cc).getName());
    }

    @Test
    public void test88_BlueLacyDog(){
        String AnimalsNames = "Blue Lacy Dog";
        ConceptClass cc = new ConceptClass("animals");
        cc.setKeywords("Kingdom: Animalia");
        LongMemory mem = new LongMemory();
        RegisterWiki reg = new RegisterWiki(mem);
        System.out.println(AnimalsNames);
        Concept c = new Concept();
        c.setConceptClass(cc);
        c.setName(cc.getNameClass());
        c.setFoundInDB(false);

        assertEquals(c.getName(),reg.register(AnimalsNames,cc).getName());
    }

    @Test
    public void test89_BlueWhale(){
        String AnimalsNames = "Blue Whale";
        ConceptClass cc = new ConceptClass("animals");
        cc.setKeywords("Kingdom: Animalia");
        LongMemory mem = new LongMemory();
        RegisterWiki reg = new RegisterWiki(mem);
        System.out.println(AnimalsNames);
        Concept c = new Concept();
        c.setConceptClass(cc);
        c.setName(cc.getNameClass());
        c.setFoundInDB(false);

        assertEquals(c.getName(),reg.register(AnimalsNames,cc).getName());
    }

    @Test
    public void test90_BluetickCoonhound(){
        String AnimalsNames = "Bluetick Coonhound";
        ConceptClass cc = new ConceptClass("animals");
        cc.setKeywords("Kingdom: Animalia");
        LongMemory mem = new LongMemory();
        RegisterWiki reg = new RegisterWiki(mem);
        System.out.println(AnimalsNames);
        Concept c = new Concept();
        c.setConceptClass(cc);
        c.setName(cc.getNameClass());
        c.setFoundInDB(false);

        assertEquals(c.getName(),reg.register(AnimalsNames,cc).getName());
    }

    @Test
    public void test91_Bobcat(){
        String AnimalsNames = "Bobcat";
        ConceptClass cc = new ConceptClass("animals");
        cc.setKeywords("Kingdom: Animalia");
        LongMemory mem = new LongMemory();
        RegisterWiki reg = new RegisterWiki(mem);
        System.out.println(AnimalsNames);
        Concept c = new Concept();
        c.setConceptClass(cc);
        c.setName(cc.getNameClass());
        c.setFoundInDB(false);

        assertEquals(c.getName(),reg.register(AnimalsNames,cc).getName());
    }

    @Test
    public void test92_BologneseDog(){
        String AnimalsNames = "Bolognese Dog";
        ConceptClass cc = new ConceptClass("animals");
        cc.setKeywords("Kingdom: Animalia");
        LongMemory mem = new LongMemory();
        RegisterWiki reg = new RegisterWiki(mem);
        System.out.println(AnimalsNames);
        Concept c = new Concept();
        c.setConceptClass(cc);
        c.setName(cc.getNameClass());
        c.setFoundInDB(false);

        assertEquals(c.getName(),reg.register(AnimalsNames,cc).getName());
    }

    @Test
    public void test93_Bombay(){
        String AnimalsNames = "Bombay";
        ConceptClass cc = new ConceptClass("animals");
        cc.setKeywords("Kingdom: Animalia");
        LongMemory mem = new LongMemory();
        RegisterWiki reg = new RegisterWiki(mem);
        System.out.println(AnimalsNames);
        Concept c = new Concept();
        c.setConceptClass(cc);
        c.setName(cc.getNameClass());
        c.setFoundInDB(false);

        assertEquals(c.getName(),reg.register(AnimalsNames,cc).getName());
    }

    @Test
    public void test94_Bongo(){
        String AnimalsNames = "Bongo";
        ConceptClass cc = new ConceptClass("animals");
        cc.setKeywords("Kingdom: Animalia");
        LongMemory mem = new LongMemory();
        RegisterWiki reg = new RegisterWiki(mem);
        System.out.println(AnimalsNames);
        Concept c = new Concept();
        c.setConceptClass(cc);
        c.setName(cc.getNameClass());
        c.setFoundInDB(false);

        assertEquals(c.getName(),reg.register(AnimalsNames,cc).getName());
    }

    @Test
    public void test95_Bonobo(){
        String AnimalsNames = "Bonobo";
        ConceptClass cc = new ConceptClass("animals");
        cc.setKeywords("Kingdom: Animalia");
        LongMemory mem = new LongMemory();
        RegisterWiki reg = new RegisterWiki(mem);
        System.out.println(AnimalsNames);
        Concept c = new Concept();
        c.setConceptClass(cc);
        c.setName(cc.getNameClass());
        c.setFoundInDB(false);

        assertEquals(c.getName(),reg.register(AnimalsNames,cc).getName());
    }

    @Test
    public void test96_Booby(){
        String AnimalsNames = "Booby";
        ConceptClass cc = new ConceptClass("animals");
        cc.setKeywords("Kingdom: Animalia");
        LongMemory mem = new LongMemory();
        RegisterWiki reg = new RegisterWiki(mem);
        System.out.println(AnimalsNames);
        Concept c = new Concept();
        c.setConceptClass(cc);
        c.setName(cc.getNameClass());
        c.setFoundInDB(false);

        assertEquals(c.getName(),reg.register(AnimalsNames,cc).getName());
    }

    @Test
    public void test97_BorderCollie(){
        String AnimalsNames = "Border Collie";
        ConceptClass cc = new ConceptClass("animals");
        cc.setKeywords("Kingdom: Animalia");
        LongMemory mem = new LongMemory();
        RegisterWiki reg = new RegisterWiki(mem);
        System.out.println(AnimalsNames);
        Concept c = new Concept();
        c.setConceptClass(cc);
        c.setName(cc.getNameClass());
        c.setFoundInDB(false);

        assertEquals(c.getName(),reg.register(AnimalsNames,cc).getName());
    }

    @Test
    public void test98_BorderTerrier(){
        String AnimalsNames = "Border Terrier";
        ConceptClass cc = new ConceptClass("animals");
        cc.setKeywords("Kingdom: Animalia");
        LongMemory mem = new LongMemory();
        RegisterWiki reg = new RegisterWiki(mem);
        System.out.println(AnimalsNames);
        Concept c = new Concept();
        c.setConceptClass(cc);
        c.setName(cc.getNameClass());
        c.setFoundInDB(false);

        assertEquals(c.getName(),reg.register(AnimalsNames,cc).getName());
    }

    @Test
    public void test99_BorneanOrangutan(){
        String AnimalsNames = "Bornean Orang-utan";
        ConceptClass cc = new ConceptClass("animals");
        cc.setKeywords("Kingdom: Animalia");
        LongMemory mem = new LongMemory();
        RegisterWiki reg = new RegisterWiki(mem);
        System.out.println(AnimalsNames);
        Concept c = new Concept();
        c.setConceptClass(cc);
        c.setName(cc.getNameClass());
        c.setFoundInDB(false);

        assertEquals(c.getName(),reg.register(AnimalsNames,cc).getName());
    }

    @Test
    public void test100_BorneoElephant(){
        String AnimalsNames = "Borneo Elephant";
        ConceptClass cc = new ConceptClass("animals");
        cc.setKeywords("Kingdom: Animalia");
        LongMemory mem = new LongMemory();
        RegisterWiki reg = new RegisterWiki(mem);
        System.out.println(AnimalsNames);
        Concept c = new Concept();
        c.setConceptClass(cc);
        c.setName(cc.getNameClass());
        c.setFoundInDB(false);

        assertEquals(c.getName(),reg.register(AnimalsNames,cc).getName());
    }

    @Test
    public void test101_BostonTerrier(){
        String AnimalsNames = "Boston Terrier";
        ConceptClass cc = new ConceptClass("animals");
        cc.setKeywords("Kingdom: Animalia");
        LongMemory mem = new LongMemory();
        RegisterWiki reg = new RegisterWiki(mem);
        System.out.println(AnimalsNames);
        Concept c = new Concept();
        c.setConceptClass(cc);
        c.setName(cc.getNameClass());
        c.setFoundInDB(false);

        assertEquals(c.getName(),reg.register(AnimalsNames,cc).getName());
    }

    @Test
    public void test102_BottleNosedDolphin(){
        String AnimalsNames = "Bottle Nosed Dolphin";
        ConceptClass cc = new ConceptClass("animals");
        cc.setKeywords("Kingdom: Animalia");
        LongMemory mem = new LongMemory();
        RegisterWiki reg = new RegisterWiki(mem);
        System.out.println(AnimalsNames);
        Concept c = new Concept();
        c.setConceptClass(cc);
        c.setName(cc.getNameClass());
        c.setFoundInDB(false);

        assertEquals(c.getName(),reg.register(AnimalsNames,cc).getName());
    }

    @Test
    public void test103_BoxerDog(){
        String AnimalsNames = "Boxer Dog";
        ConceptClass cc = new ConceptClass("animals");
        cc.setKeywords("Kingdom: Animalia");
        LongMemory mem = new LongMemory();
        RegisterWiki reg = new RegisterWiki(mem);
        System.out.println(AnimalsNames);
        Concept c = new Concept();
        c.setConceptClass(cc);
        c.setName(cc.getNameClass());
        c.setFoundInDB(false);

        assertEquals(c.getName(),reg.register(AnimalsNames,cc).getName());
    }

    @Test
    public void test104_BoykinSpaniel(){
        String AnimalsNames = "Boykin Spaniel";
        ConceptClass cc = new ConceptClass("animals");
        cc.setKeywords("Kingdom: Animalia");
        LongMemory mem = new LongMemory();
        RegisterWiki reg = new RegisterWiki(mem);
        System.out.println(AnimalsNames);
        Concept c = new Concept();
        c.setConceptClass(cc);
        c.setName(cc.getNameClass());
        c.setFoundInDB(false);

        assertEquals(c.getName(),reg.register(AnimalsNames,cc).getName());
    }

    @Test
    public void test105_BrazilianTerrier(){
        String AnimalsNames = "Brazilian Terrier";
        ConceptClass cc = new ConceptClass("animals");
        cc.setKeywords("Kingdom: Animalia");
        LongMemory mem = new LongMemory();
        RegisterWiki reg = new RegisterWiki(mem);
        System.out.println(AnimalsNames);
        Concept c = new Concept();
        c.setConceptClass(cc);
        c.setName(cc.getNameClass());
        c.setFoundInDB(false);

        assertEquals(c.getName(),reg.register(AnimalsNames,cc).getName());
    }

    @Test
    public void test106_BrownBear(){
        String AnimalsNames = "Brown Bear";
        ConceptClass cc = new ConceptClass("animals");
        cc.setKeywords("Kingdom: Animalia");
        LongMemory mem = new LongMemory();
        RegisterWiki reg = new RegisterWiki(mem);
        System.out.println(AnimalsNames);
        Concept c = new Concept();
        c.setConceptClass(cc);
        c.setName(cc.getNameClass());
        c.setFoundInDB(false);

        assertEquals(c.getName(),reg.register(AnimalsNames,cc).getName());
    }

    @Test
    public void test107_Budgerigar(){
        String AnimalsNames = "Budgerigar";
        ConceptClass cc = new ConceptClass("animals");
        cc.setKeywords("Kingdom: Animalia");
        LongMemory mem = new LongMemory();
        RegisterWiki reg = new RegisterWiki(mem);
        System.out.println(AnimalsNames);
        Concept c = new Concept();
        c.setConceptClass(cc);
        c.setName(cc.getNameClass());
        c.setFoundInDB(false);

        assertEquals(c.getName(),reg.register(AnimalsNames,cc).getName());
    }

    @Test
    public void test108_Buffalo(){
        String AnimalsNames = "Buffalo";
        ConceptClass cc = new ConceptClass("animals");
        cc.setKeywords("Kingdom: Animalia");
        LongMemory mem = new LongMemory();
        RegisterWiki reg = new RegisterWiki(mem);
        System.out.println(AnimalsNames);
        Concept c = new Concept();
        c.setConceptClass(cc);
        c.setName(cc.getNameClass());
        c.setFoundInDB(false);

        assertEquals(c.getName(),reg.register(AnimalsNames,cc).getName());
    }

    @Test
    public void test109_BullMastiff(){
        String AnimalsNames = "Bull Mastiff";
        ConceptClass cc = new ConceptClass("animals");
        cc.setKeywords("Kingdom: Animalia");
        LongMemory mem = new LongMemory();
        RegisterWiki reg = new RegisterWiki(mem);
        System.out.println(AnimalsNames);
        Concept c = new Concept();
        c.setConceptClass(cc);
        c.setName(cc.getNameClass());
        c.setFoundInDB(false);

        assertEquals(c.getName(),reg.register(AnimalsNames,cc).getName());
    }

    @Test
    public void test110_BullShark(){
        String AnimalsNames = "Bull Shark";
        ConceptClass cc = new ConceptClass("animals");
        cc.setKeywords("Kingdom: Animalia");
        LongMemory mem = new LongMemory();
        RegisterWiki reg = new RegisterWiki(mem);
        System.out.println(AnimalsNames);
        Concept c = new Concept();
        c.setConceptClass(cc);
        c.setName(cc.getNameClass());
        c.setFoundInDB(false);

        assertEquals(c.getName(),reg.register(AnimalsNames,cc).getName());
    }

    @Test
    public void test111_BullTerrier(){
        String AnimalsNames = "Bull Terrier";
        ConceptClass cc = new ConceptClass("animals");
        cc.setKeywords("Kingdom: Animalia");
        LongMemory mem = new LongMemory();
        RegisterWiki reg = new RegisterWiki(mem);
        System.out.println(AnimalsNames);
        Concept c = new Concept();
        c.setConceptClass(cc);
        c.setName(cc.getNameClass());
        c.setFoundInDB(false);

        assertEquals(c.getName(),reg.register(AnimalsNames,cc).getName());
    }

    @Test
    public void test112_Bulldog(){
        String AnimalsNames = "Bulldog";
        ConceptClass cc = new ConceptClass("animals");
        cc.setKeywords("Kingdom: Animalia");
        LongMemory mem = new LongMemory();
        RegisterWiki reg = new RegisterWiki(mem);
        System.out.println(AnimalsNames);
        Concept c = new Concept();
        c.setConceptClass(cc);
        c.setName(cc.getNameClass());
        c.setFoundInDB(false);

        assertEquals(c.getName(),reg.register(AnimalsNames,cc).getName());
    }

    @Test
    public void test113_Bullfrog(){
        String AnimalsNames = "Bullfrog";
        ConceptClass cc = new ConceptClass("animals");
        cc.setKeywords("Kingdom: Animalia");
        LongMemory mem = new LongMemory();
        RegisterWiki reg = new RegisterWiki(mem);
        System.out.println(AnimalsNames);
        Concept c = new Concept();
        c.setConceptClass(cc);
        c.setName(cc.getNameClass());
        c.setFoundInDB(false);

        assertEquals(c.getName(),reg.register(AnimalsNames,cc).getName());
    }

    @Test
    public void test114_BumbleBee(){
        String AnimalsNames = "Bumble Bee";
        ConceptClass cc = new ConceptClass("animals");
        cc.setKeywords("Kingdom: Animalia");
        LongMemory mem = new LongMemory();
        RegisterWiki reg = new RegisterWiki(mem);
        System.out.println(AnimalsNames);
        Concept c = new Concept();
        c.setConceptClass(cc);
        c.setName(cc.getNameClass());
        c.setFoundInDB(false);

        assertEquals(c.getName(),reg.register(AnimalsNames,cc).getName());
    }

    @Test
    public void test115_Burmese(){
        String AnimalsNames = "Burmese";
        ConceptClass cc = new ConceptClass("animals");
        cc.setKeywords("Kingdom: Animalia");
        LongMemory mem = new LongMemory();
        RegisterWiki reg = new RegisterWiki(mem);
        System.out.println(AnimalsNames);
        Concept c = new Concept();
        c.setConceptClass(cc);
        c.setName(cc.getNameClass());
        c.setFoundInDB(false);

        assertEquals(c.getName(),reg.register(AnimalsNames,cc).getName());
    }

    @Test
    public void test116_BurrowingFrog(){
        String AnimalsNames = "Burrowing Frog";
        ConceptClass cc = new ConceptClass("animals");
        cc.setKeywords("Kingdom: Animalia");
        LongMemory mem = new LongMemory();
        RegisterWiki reg = new RegisterWiki(mem);
        System.out.println(AnimalsNames);
        Concept c = new Concept();
        c.setConceptClass(cc);
        c.setName(cc.getNameClass());
        c.setFoundInDB(false);

        assertEquals(c.getName(),reg.register(AnimalsNames,cc).getName());
    }

    @Test
    public void test117_Butterfly(){
        String AnimalsNames = "Butterfly";
        ConceptClass cc = new ConceptClass("animals");
        cc.setKeywords("Kingdom: Animalia");
        LongMemory mem = new LongMemory();
        RegisterWiki reg = new RegisterWiki(mem);
        System.out.println(AnimalsNames);
        Concept c = new Concept();
        c.setConceptClass(cc);
        c.setName(cc.getNameClass());
        c.setFoundInDB(false);

        assertEquals(c.getName(),reg.register(AnimalsNames,cc).getName());
    }

    @Test
    public void test118_ButterflyFish(){
        String AnimalsNames = "Butterfly Fish";
        ConceptClass cc = new ConceptClass("animals");
        cc.setKeywords("Kingdom: Animalia");
        LongMemory mem = new LongMemory();
        RegisterWiki reg = new RegisterWiki(mem);
        System.out.println(AnimalsNames);
        Concept c = new Concept();
        c.setConceptClass(cc);
        c.setName(cc.getNameClass());
        c.setFoundInDB(false);

        assertEquals(c.getName(),reg.register(AnimalsNames,cc).getName());
    }

    @Test
    public void test119_C(){
        String AnimalsNames = "C";
        ConceptClass cc = new ConceptClass("animals");
        cc.setKeywords("Kingdom: Animalia");
        LongMemory mem = new LongMemory();
        RegisterWiki reg = new RegisterWiki(mem);
        System.out.println(AnimalsNames);
        Concept c = new Concept();
        c.setConceptClass(cc);
        c.setName(cc.getNameClass());
        c.setFoundInDB(false);

        assertEquals(c.getName(),reg.register(AnimalsNames,cc).getName());
    }

    @Test
    public void test120_Caiman(){
        String AnimalsNames = "Caiman";
        ConceptClass cc = new ConceptClass("animals");
        cc.setKeywords("Kingdom: Animalia");
        LongMemory mem = new LongMemory();
        RegisterWiki reg = new RegisterWiki(mem);
        System.out.println(AnimalsNames);
        Concept c = new Concept();
        c.setConceptClass(cc);
        c.setName(cc.getNameClass());
        c.setFoundInDB(false);

        assertEquals(c.getName(),reg.register(AnimalsNames,cc).getName());
    }

    @Test
    public void test121_CaimanLizard(){
        String AnimalsNames = "Caiman Lizard";
        ConceptClass cc = new ConceptClass("animals");
        cc.setKeywords("Kingdom: Animalia");
        LongMemory mem = new LongMemory();
        RegisterWiki reg = new RegisterWiki(mem);
        System.out.println(AnimalsNames);
        Concept c = new Concept();
        c.setConceptClass(cc);
        c.setName(cc.getNameClass());
        c.setFoundInDB(false);

        assertEquals(c.getName(),reg.register(AnimalsNames,cc).getName());
    }

    @Test
    public void test122_CairnTerrier(){
        String AnimalsNames = "Cairn Terrier";
        ConceptClass cc = new ConceptClass("animals");
        cc.setKeywords("Kingdom: Animalia");
        LongMemory mem = new LongMemory();
        RegisterWiki reg = new RegisterWiki(mem);
        System.out.println(AnimalsNames);
        Concept c = new Concept();
        c.setConceptClass(cc);
        c.setName(cc.getNameClass());
        c.setFoundInDB(false);

        assertEquals(c.getName(),reg.register(AnimalsNames,cc).getName());
    }

    @Test
    public void test123_Camel(){
        String AnimalsNames = "Camel";
        ConceptClass cc = new ConceptClass("animals");
        cc.setKeywords("Kingdom: Animalia");
        LongMemory mem = new LongMemory();
        RegisterWiki reg = new RegisterWiki(mem);
        System.out.println(AnimalsNames);
        Concept c = new Concept();
        c.setConceptClass(cc);
        c.setName(cc.getNameClass());
        c.setFoundInDB(false);

        assertEquals(c.getName(),reg.register(AnimalsNames,cc).getName());
    }

    @Test
    public void test124_CanaanDog(){
        String AnimalsNames = "Canaan Dog";
        ConceptClass cc = new ConceptClass("animals");
        cc.setKeywords("Kingdom: Animalia");
        LongMemory mem = new LongMemory();
        RegisterWiki reg = new RegisterWiki(mem);
        System.out.println(AnimalsNames);
        Concept c = new Concept();
        c.setConceptClass(cc);
        c.setName(cc.getNameClass());
        c.setFoundInDB(false);

        assertEquals(c.getName(),reg.register(AnimalsNames,cc).getName());
    }

    @Test
    public void test125_Capybara(){
        String AnimalsNames = "Capybara";
        ConceptClass cc = new ConceptClass("animals");
        cc.setKeywords("Kingdom: Animalia");
        LongMemory mem = new LongMemory();
        RegisterWiki reg = new RegisterWiki(mem);
        System.out.println(AnimalsNames);
        Concept c = new Concept();
        c.setConceptClass(cc);
        c.setName(cc.getNameClass());
        c.setFoundInDB(false);

        assertEquals(c.getName(),reg.register(AnimalsNames,cc).getName());
    }

    @Test
    public void test126_Caracal(){
        String AnimalsNames = "Caracal";
        ConceptClass cc = new ConceptClass("animals");
        cc.setKeywords("Kingdom: Animalia");
        LongMemory mem = new LongMemory();
        RegisterWiki reg = new RegisterWiki(mem);
        System.out.println(AnimalsNames);
        Concept c = new Concept();
        c.setConceptClass(cc);
        c.setName(cc.getNameClass());
        c.setFoundInDB(false);

        assertEquals(c.getName(),reg.register(AnimalsNames,cc).getName());
    }

    @Test
    public void test127_CarolinaDog(){
        String AnimalsNames = "Carolina Dog";
        ConceptClass cc = new ConceptClass("animals");
        cc.setKeywords("Kingdom: Animalia");
        LongMemory mem = new LongMemory();
        RegisterWiki reg = new RegisterWiki(mem);
        System.out.println(AnimalsNames);
        Concept c = new Concept();
        c.setConceptClass(cc);
        c.setName(cc.getNameClass());
        c.setFoundInDB(false);

        assertEquals(c.getName(),reg.register(AnimalsNames,cc).getName());
    }

    @Test
    public void test128_Cassowary(){
        String AnimalsNames = "Cassowary";
        ConceptClass cc = new ConceptClass("animals");
        cc.setKeywords("Kingdom: Animalia");
        LongMemory mem = new LongMemory();
        RegisterWiki reg = new RegisterWiki(mem);
        System.out.println(AnimalsNames);
        Concept c = new Concept();
        c.setConceptClass(cc);
        c.setName(cc.getNameClass());
        c.setFoundInDB(false);

        assertEquals(c.getName(),reg.register(AnimalsNames,cc).getName());
    }

    @Test
    public void test129_Cat(){
        String AnimalsNames = "Cat";
        ConceptClass cc = new ConceptClass("animals");
        cc.setKeywords("Kingdom: Animalia");
        LongMemory mem = new LongMemory();
        RegisterWiki reg = new RegisterWiki(mem);
        System.out.println(AnimalsNames);
        Concept c = new Concept();
        c.setConceptClass(cc);
        c.setName(cc.getNameClass());
        c.setFoundInDB(false);

        assertEquals(c.getName(),reg.register(AnimalsNames,cc).getName());
    }

    @Test
    public void test130_Caterpillar(){
        String AnimalsNames = "Caterpillar";
        ConceptClass cc = new ConceptClass("animals");
        cc.setKeywords("Kingdom: Animalia");
        LongMemory mem = new LongMemory();
        RegisterWiki reg = new RegisterWiki(mem);
        System.out.println(AnimalsNames);
        Concept c = new Concept();
        c.setConceptClass(cc);
        c.setName(cc.getNameClass());
        c.setFoundInDB(false);

        assertEquals(c.getName(),reg.register(AnimalsNames,cc).getName());
    }

    @Test
    public void test131_Catfish(){
        String AnimalsNames = "Catfish";
        ConceptClass cc = new ConceptClass("animals");
        cc.setKeywords("Kingdom: Animalia");
        LongMemory mem = new LongMemory();
        RegisterWiki reg = new RegisterWiki(mem);
        System.out.println(AnimalsNames);
        Concept c = new Concept();
        c.setConceptClass(cc);
        c.setName(cc.getNameClass());
        c.setFoundInDB(false);

        assertEquals(c.getName(),reg.register(AnimalsNames,cc).getName());
    }

    @Test
    public void test132_CavalierKingCharlesSpaniel(){
        String AnimalsNames = "Cavalier King Charles Spaniel";
        ConceptClass cc = new ConceptClass("animals");
        cc.setKeywords("Kingdom: Animalia");
        LongMemory mem = new LongMemory();
        RegisterWiki reg = new RegisterWiki(mem);
        System.out.println(AnimalsNames);
        Concept c = new Concept();
        c.setConceptClass(cc);
        c.setName(cc.getNameClass());
        c.setFoundInDB(false);

        assertEquals(c.getName(),reg.register(AnimalsNames,cc).getName());
    }

    @Test
    public void test133_Centipede(){
        String AnimalsNames = "Centipede";
        ConceptClass cc = new ConceptClass("animals");
        cc.setKeywords("Kingdom: Animalia");
        LongMemory mem = new LongMemory();
        RegisterWiki reg = new RegisterWiki(mem);
        System.out.println(AnimalsNames);
        Concept c = new Concept();
        c.setConceptClass(cc);
        c.setName(cc.getNameClass());
        c.setFoundInDB(false);

        assertEquals(c.getName(),reg.register(AnimalsNames,cc).getName());
    }

    @Test
    public void test134_CeskyFousek(){
        String AnimalsNames = "Cesky Fousek";
        ConceptClass cc = new ConceptClass("animals");
        cc.setKeywords("Kingdom: Animalia");
        LongMemory mem = new LongMemory();
        RegisterWiki reg = new RegisterWiki(mem);
        System.out.println(AnimalsNames);
        Concept c = new Concept();
        c.setConceptClass(cc);
        c.setName(cc.getNameClass());
        c.setFoundInDB(false);

        assertEquals(c.getName(),reg.register(AnimalsNames,cc).getName());
    }

    @Test
    public void test135_Chameleon(){
        String AnimalsNames = "Chameleon";
        ConceptClass cc = new ConceptClass("animals");
        cc.setKeywords("Kingdom: Animalia");
        LongMemory mem = new LongMemory();
        RegisterWiki reg = new RegisterWiki(mem);
        System.out.println(AnimalsNames);
        Concept c = new Concept();
        c.setConceptClass(cc);
        c.setName(cc.getNameClass());
        c.setFoundInDB(false);

        assertEquals(c.getName(),reg.register(AnimalsNames,cc).getName());
    }

    @Test
    public void test136_Chamois(){
        String AnimalsNames = "Chamois";
        ConceptClass cc = new ConceptClass("animals");
        cc.setKeywords("Kingdom: Animalia");
        LongMemory mem = new LongMemory();
        RegisterWiki reg = new RegisterWiki(mem);
        System.out.println(AnimalsNames);
        Concept c = new Concept();
        c.setConceptClass(cc);
        c.setName(cc.getNameClass());
        c.setFoundInDB(false);

        assertEquals(c.getName(),reg.register(AnimalsNames,cc).getName());
    }

    @Test
    public void test137_Cheetah(){
        String AnimalsNames = "Cheetah";
        ConceptClass cc = new ConceptClass("animals");
        cc.setKeywords("Kingdom: Animalia");
        LongMemory mem = new LongMemory();
        RegisterWiki reg = new RegisterWiki(mem);
        System.out.println(AnimalsNames);
        Concept c = new Concept();
        c.setConceptClass(cc);
        c.setName(cc.getNameClass());
        c.setFoundInDB(false);

        assertEquals(c.getName(),reg.register(AnimalsNames,cc).getName());
    }

    @Test
    public void test138_ChesapeakeBayRetriever(){
        String AnimalsNames = "Chesapeake Bay Retriever";
        ConceptClass cc = new ConceptClass("animals");
        cc.setKeywords("Kingdom: Animalia");
        LongMemory mem = new LongMemory();
        RegisterWiki reg = new RegisterWiki(mem);
        System.out.println(AnimalsNames);
        Concept c = new Concept();
        c.setConceptClass(cc);
        c.setName(cc.getNameClass());
        c.setFoundInDB(false);

        assertEquals(c.getName(),reg.register(AnimalsNames,cc).getName());
    }

    @Test
    public void test139_Chicken(){
        String AnimalsNames = "Chicken";
        ConceptClass cc = new ConceptClass("animals");
        cc.setKeywords("Kingdom: Animalia");
        LongMemory mem = new LongMemory();
        RegisterWiki reg = new RegisterWiki(mem);
        System.out.println(AnimalsNames);
        Concept c = new Concept();
        c.setConceptClass(cc);
        c.setName(cc.getNameClass());
        c.setFoundInDB(false);

        assertEquals(c.getName(),reg.register(AnimalsNames,cc).getName());
    }

    @Test
    public void test140_Chihuahua(){
        String AnimalsNames = "Chihuahua";
        ConceptClass cc = new ConceptClass("animals");
        cc.setKeywords("Kingdom: Animalia");
        LongMemory mem = new LongMemory();
        RegisterWiki reg = new RegisterWiki(mem);
        System.out.println(AnimalsNames);
        Concept c = new Concept();
        c.setConceptClass(cc);
        c.setName(cc.getNameClass());
        c.setFoundInDB(false);

        assertEquals(c.getName(),reg.register(AnimalsNames,cc).getName());
    }

    @Test
    public void test141_Chimpanzee(){
        String AnimalsNames = "Chimpanzee";
        ConceptClass cc = new ConceptClass("animals");
        cc.setKeywords("Kingdom: Animalia");
        LongMemory mem = new LongMemory();
        RegisterWiki reg = new RegisterWiki(mem);
        System.out.println(AnimalsNames);
        Concept c = new Concept();
        c.setConceptClass(cc);
        c.setName(cc.getNameClass());
        c.setFoundInDB(false);

        assertEquals(c.getName(),reg.register(AnimalsNames,cc).getName());
    }

    @Test
    public void test142_Chinchilla(){
        String AnimalsNames = "Chinchilla";
        ConceptClass cc = new ConceptClass("animals");
        cc.setKeywords("Kingdom: Animalia");
        LongMemory mem = new LongMemory();
        RegisterWiki reg = new RegisterWiki(mem);
        System.out.println(AnimalsNames);
        Concept c = new Concept();
        c.setConceptClass(cc);
        c.setName(cc.getNameClass());
        c.setFoundInDB(false);

        assertEquals(c.getName(),reg.register(AnimalsNames,cc).getName());
    }

    @Test
    public void test143_ChineseCrestedDog(){
        String AnimalsNames = "Chinese Crested Dog";
        ConceptClass cc = new ConceptClass("animals");
        cc.setKeywords("Kingdom: Animalia");
        LongMemory mem = new LongMemory();
        RegisterWiki reg = new RegisterWiki(mem);
        System.out.println(AnimalsNames);
        Concept c = new Concept();
        c.setConceptClass(cc);
        c.setName(cc.getNameClass());
        c.setFoundInDB(false);

        assertEquals(c.getName(),reg.register(AnimalsNames,cc).getName());
    }

    @Test
    public void test144_Chinook(){
        String AnimalsNames = "Chinook";
        ConceptClass cc = new ConceptClass("animals");
        cc.setKeywords("Kingdom: Animalia");
        LongMemory mem = new LongMemory();
        RegisterWiki reg = new RegisterWiki(mem);
        System.out.println(AnimalsNames);
        Concept c = new Concept();
        c.setConceptClass(cc);
        c.setName(cc.getNameClass());
        c.setFoundInDB(false);

        assertEquals(c.getName(),reg.register(AnimalsNames,cc).getName());
    }

    @Test
    public void test145_ChinstrapPenguin(){
        String AnimalsNames = "Chinstrap Penguin";
        ConceptClass cc = new ConceptClass("animals");
        cc.setKeywords("Kingdom: Animalia");
        LongMemory mem = new LongMemory();
        RegisterWiki reg = new RegisterWiki(mem);
        System.out.println(AnimalsNames);
        Concept c = new Concept();
        c.setConceptClass(cc);
        c.setName(cc.getNameClass());
        c.setFoundInDB(false);

        assertEquals(c.getName(),reg.register(AnimalsNames,cc).getName());
    }

    @Test
    public void test146_Chipmunk(){
        String AnimalsNames = "Chipmunk";
        ConceptClass cc = new ConceptClass("animals");
        cc.setKeywords("Kingdom: Animalia");
        LongMemory mem = new LongMemory();
        RegisterWiki reg = new RegisterWiki(mem);
        System.out.println(AnimalsNames);
        Concept c = new Concept();
        c.setConceptClass(cc);
        c.setName(cc.getNameClass());
        c.setFoundInDB(false);

        assertEquals(c.getName(),reg.register(AnimalsNames,cc).getName());
    }

    @Test
    public void test147_ChowChow(){
        String AnimalsNames = "Chow Chow";
        ConceptClass cc = new ConceptClass("animals");
        cc.setKeywords("Kingdom: Animalia");
        LongMemory mem = new LongMemory();
        RegisterWiki reg = new RegisterWiki(mem);
        System.out.println(AnimalsNames);
        Concept c = new Concept();
        c.setConceptClass(cc);
        c.setName(cc.getNameClass());
        c.setFoundInDB(false);

        assertEquals(c.getName(),reg.register(AnimalsNames,cc).getName());
    }

    @Test
    public void test148_Cichlid(){
        String AnimalsNames = "Cichlid";
        ConceptClass cc = new ConceptClass("animals");
        cc.setKeywords("Kingdom: Animalia");
        LongMemory mem = new LongMemory();
        RegisterWiki reg = new RegisterWiki(mem);
        System.out.println(AnimalsNames);
        Concept c = new Concept();
        c.setConceptClass(cc);
        c.setName(cc.getNameClass());
        c.setFoundInDB(false);

        assertEquals(c.getName(),reg.register(AnimalsNames,cc).getName());
    }

    @Test
    public void test149_CloudedLeopard(){
        String AnimalsNames = "Clouded Leopard";
        ConceptClass cc = new ConceptClass("animals");
        cc.setKeywords("Kingdom: Animalia");
        LongMemory mem = new LongMemory();
        RegisterWiki reg = new RegisterWiki(mem);
        System.out.println(AnimalsNames);
        Concept c = new Concept();
        c.setConceptClass(cc);
        c.setName(cc.getNameClass());
        c.setFoundInDB(false);

        assertEquals(c.getName(),reg.register(AnimalsNames,cc).getName());
    }

    @Test
    public void test150_ClownFish(){
        String AnimalsNames = "Clown Fish";
        ConceptClass cc = new ConceptClass("animals");
        cc.setKeywords("Kingdom: Animalia");
        LongMemory mem = new LongMemory();
        RegisterWiki reg = new RegisterWiki(mem);
        System.out.println(AnimalsNames);
        Concept c = new Concept();
        c.setConceptClass(cc);
        c.setName(cc.getNameClass());
        c.setFoundInDB(false);

        assertEquals(c.getName(),reg.register(AnimalsNames,cc).getName());
    }

    @Test
    public void test151_ClumberSpaniel(){
        String AnimalsNames = "Clumber Spaniel";
        ConceptClass cc = new ConceptClass("animals");
        cc.setKeywords("Kingdom: Animalia");
        LongMemory mem = new LongMemory();
        RegisterWiki reg = new RegisterWiki(mem);
        System.out.println(AnimalsNames);
        Concept c = new Concept();
        c.setConceptClass(cc);
        c.setName(cc.getNameClass());
        c.setFoundInDB(false);

        assertEquals(c.getName(),reg.register(AnimalsNames,cc).getName());
    }

    @Test
    public void test152_Coati(){
        String AnimalsNames = "Coati";
        ConceptClass cc = new ConceptClass("animals");
        cc.setKeywords("Kingdom: Animalia");
        LongMemory mem = new LongMemory();
        RegisterWiki reg = new RegisterWiki(mem);
        System.out.println(AnimalsNames);
        Concept c = new Concept();
        c.setConceptClass(cc);
        c.setName(cc.getNameClass());
        c.setFoundInDB(false);

        assertEquals(c.getName(),reg.register(AnimalsNames,cc).getName());
    }

    @Test
    public void test153_Cockroach(){
        String AnimalsNames = "Cockroach";
        ConceptClass cc = new ConceptClass("animals");
        cc.setKeywords("Kingdom: Animalia");
        LongMemory mem = new LongMemory();
        RegisterWiki reg = new RegisterWiki(mem);
        System.out.println(AnimalsNames);
        Concept c = new Concept();
        c.setConceptClass(cc);
        c.setName(cc.getNameClass());
        c.setFoundInDB(false);

        assertEquals(c.getName(),reg.register(AnimalsNames,cc).getName());
    }

    @Test
    public void test154_CollaredPeccary(){
        String AnimalsNames = "Collared Peccary";
        ConceptClass cc = new ConceptClass("animals");
        cc.setKeywords("Kingdom: Animalia");
        LongMemory mem = new LongMemory();
        RegisterWiki reg = new RegisterWiki(mem);
        System.out.println(AnimalsNames);
        Concept c = new Concept();
        c.setConceptClass(cc);
        c.setName(cc.getNameClass());
        c.setFoundInDB(false);

        assertEquals(c.getName(),reg.register(AnimalsNames,cc).getName());
    }

    @Test
    public void test155_Collie(){
        String AnimalsNames = "Collie";
        ConceptClass cc = new ConceptClass("animals");
        cc.setKeywords("Kingdom: Animalia");
        LongMemory mem = new LongMemory();
        RegisterWiki reg = new RegisterWiki(mem);
        System.out.println(AnimalsNames);
        Concept c = new Concept();
        c.setConceptClass(cc);
        c.setName(cc.getNameClass());
        c.setFoundInDB(false);

        assertEquals(c.getName(),reg.register(AnimalsNames,cc).getName());
    }

    @Test
    public void test156_CommonBuzzard(){
        String AnimalsNames = "Common Buzzard";
        ConceptClass cc = new ConceptClass("animals");
        cc.setKeywords("Kingdom: Animalia");
        LongMemory mem = new LongMemory();
        RegisterWiki reg = new RegisterWiki(mem);
        System.out.println(AnimalsNames);
        Concept c = new Concept();
        c.setConceptClass(cc);
        c.setName(cc.getNameClass());
        c.setFoundInDB(false);

        assertEquals(c.getName(),reg.register(AnimalsNames,cc).getName());
    }

    @Test
    public void test157_CommonFrog(){
        String AnimalsNames = "Common Frog";
        ConceptClass cc = new ConceptClass("animals");
        cc.setKeywords("Kingdom: Animalia");
        LongMemory mem = new LongMemory();
        RegisterWiki reg = new RegisterWiki(mem);
        System.out.println(AnimalsNames);
        Concept c = new Concept();
        c.setConceptClass(cc);
        c.setName(cc.getNameClass());
        c.setFoundInDB(false);

        assertEquals(c.getName(),reg.register(AnimalsNames,cc).getName());
    }

    @Test
    public void test158_CommonLoon(){
        String AnimalsNames = "Common Loon";
        ConceptClass cc = new ConceptClass("animals");
        cc.setKeywords("Kingdom: Animalia");
        LongMemory mem = new LongMemory();
        RegisterWiki reg = new RegisterWiki(mem);
        System.out.println(AnimalsNames);
        Concept c = new Concept();
        c.setConceptClass(cc);
        c.setName(cc.getNameClass());
        c.setFoundInDB(false);

        assertEquals(c.getName(),reg.register(AnimalsNames,cc).getName());
    }

    @Test
    public void test159_CommonToad(){
        String AnimalsNames = "Common Toad";
        ConceptClass cc = new ConceptClass("animals");
        cc.setKeywords("Kingdom: Animalia");
        LongMemory mem = new LongMemory();
        RegisterWiki reg = new RegisterWiki(mem);
        System.out.println(AnimalsNames);
        Concept c = new Concept();
        c.setConceptClass(cc);
        c.setName(cc.getNameClass());
        c.setFoundInDB(false);

        assertEquals(c.getName(),reg.register(AnimalsNames,cc).getName());
    }

    @Test
    public void test160_Coral(){
        String AnimalsNames = "Coral";
        ConceptClass cc = new ConceptClass("animals");
        cc.setKeywords("Kingdom: Animalia");
        LongMemory mem = new LongMemory();
        RegisterWiki reg = new RegisterWiki(mem);
        System.out.println(AnimalsNames);
        Concept c = new Concept();
        c.setConceptClass(cc);
        c.setName(cc.getNameClass());
        c.setFoundInDB(false);

        assertEquals(c.getName(),reg.register(AnimalsNames,cc).getName());
    }

    @Test
    public void test161_CottontopTamarin(){
        String AnimalsNames = "Cottontop Tamarin";
        ConceptClass cc = new ConceptClass("animals");
        cc.setKeywords("Kingdom: Animalia");
        LongMemory mem = new LongMemory();
        RegisterWiki reg = new RegisterWiki(mem);
        System.out.println(AnimalsNames);
        Concept c = new Concept();
        c.setConceptClass(cc);
        c.setName(cc.getNameClass());
        c.setFoundInDB(false);

        assertEquals(c.getName(),reg.register(AnimalsNames,cc).getName());
    }

    @Test
    public void test162_Cougar(){
        String AnimalsNames = "Cougar";
        ConceptClass cc = new ConceptClass("animals");
        cc.setKeywords("Kingdom: Animalia");
        LongMemory mem = new LongMemory();
        RegisterWiki reg = new RegisterWiki(mem);
        System.out.println(AnimalsNames);
        Concept c = new Concept();
        c.setConceptClass(cc);
        c.setName(cc.getNameClass());
        c.setFoundInDB(false);

        assertEquals(c.getName(),reg.register(AnimalsNames,cc).getName());
    }

    @Test
    public void test163_Cow(){
        String AnimalsNames = "Cow";
        ConceptClass cc = new ConceptClass("animals");
        cc.setKeywords("Kingdom: Animalia");
        LongMemory mem = new LongMemory();
        RegisterWiki reg = new RegisterWiki(mem);
        System.out.println(AnimalsNames);
        Concept c = new Concept();
        c.setConceptClass(cc);
        c.setName(cc.getNameClass());
        c.setFoundInDB(false);

        assertEquals(c.getName(),reg.register(AnimalsNames,cc).getName());
    }

    @Test
    public void test164_Coyote(){
        String AnimalsNames = "Coyote";
        ConceptClass cc = new ConceptClass("animals");
        cc.setKeywords("Kingdom: Animalia");
        LongMemory mem = new LongMemory();
        RegisterWiki reg = new RegisterWiki(mem);
        System.out.println(AnimalsNames);
        Concept c = new Concept();
        c.setConceptClass(cc);
        c.setName(cc.getNameClass());
        c.setFoundInDB(false);

        assertEquals(c.getName(),reg.register(AnimalsNames,cc).getName());
    }

    @Test
    public void test165_Crab(){
        String AnimalsNames = "Crab";
        ConceptClass cc = new ConceptClass("animals");
        cc.setKeywords("Kingdom: Animalia");
        LongMemory mem = new LongMemory();
        RegisterWiki reg = new RegisterWiki(mem);
        System.out.println(AnimalsNames);
        Concept c = new Concept();
        c.setConceptClass(cc);
        c.setName(cc.getNameClass());
        c.setFoundInDB(false);

        assertEquals(c.getName(),reg.register(AnimalsNames,cc).getName());
    }

    @Test
    public void test166_CrabEatingMacaque(){
        String AnimalsNames = "Crab-Eating Macaque";
        ConceptClass cc = new ConceptClass("animals");
        cc.setKeywords("Kingdom: Animalia");
        LongMemory mem = new LongMemory();
        RegisterWiki reg = new RegisterWiki(mem);
        System.out.println(AnimalsNames);
        Concept c = new Concept();
        c.setConceptClass(cc);
        c.setName(cc.getNameClass());
        c.setFoundInDB(false);

        assertEquals(c.getName(),reg.register(AnimalsNames,cc).getName());
    }

    @Test
    public void test167_Crane(){
        String AnimalsNames = "Crane";
        ConceptClass cc = new ConceptClass("animals");
        cc.setKeywords("Kingdom: Animalia");
        LongMemory mem = new LongMemory();
        RegisterWiki reg = new RegisterWiki(mem);
        System.out.println(AnimalsNames);
        Concept c = new Concept();
        c.setConceptClass(cc);
        c.setName(cc.getNameClass());
        c.setFoundInDB(false);

        assertEquals(c.getName(),reg.register(AnimalsNames,cc).getName());
    }

    @Test
    public void test168_CrestedPenguin(){
        String AnimalsNames = "Crested Penguin";
        ConceptClass cc = new ConceptClass("animals");
        cc.setKeywords("Kingdom: Animalia");
        LongMemory mem = new LongMemory();
        RegisterWiki reg = new RegisterWiki(mem);
        System.out.println(AnimalsNames);
        Concept c = new Concept();
        c.setConceptClass(cc);
        c.setName(cc.getNameClass());
        c.setFoundInDB(false);

        assertEquals(c.getName(),reg.register(AnimalsNames,cc).getName());
    }

    @Test
    public void test169_Crocodile(){
        String AnimalsNames = "Crocodile";
        ConceptClass cc = new ConceptClass("animals");
        cc.setKeywords("Kingdom: Animalia");
        LongMemory mem = new LongMemory();
        RegisterWiki reg = new RegisterWiki(mem);
        System.out.println(AnimalsNames);
        Concept c = new Concept();
        c.setConceptClass(cc);
        c.setName(cc.getNameClass());
        c.setFoundInDB(false);

        assertEquals(c.getName(),reg.register(AnimalsNames,cc).getName());
    }

    @Test
    public void test170_CrossRiverGorilla(){
        String AnimalsNames = "Cross River Gorilla";
        ConceptClass cc = new ConceptClass("animals");
        cc.setKeywords("Kingdom: Animalia");
        LongMemory mem = new LongMemory();
        RegisterWiki reg = new RegisterWiki(mem);
        System.out.println(AnimalsNames);
        Concept c = new Concept();
        c.setConceptClass(cc);
        c.setName(cc.getNameClass());
        c.setFoundInDB(false);

        assertEquals(c.getName(),reg.register(AnimalsNames,cc).getName());
    }

    @Test
    public void test171_CurlyCoatedRetriever(){
        String AnimalsNames = "Curly Coated Retriever";
        ConceptClass cc = new ConceptClass("animals");
        cc.setKeywords("Kingdom: Animalia");
        LongMemory mem = new LongMemory();
        RegisterWiki reg = new RegisterWiki(mem);
        System.out.println(AnimalsNames);
        Concept c = new Concept();
        c.setConceptClass(cc);
        c.setName(cc.getNameClass());
        c.setFoundInDB(false);

        assertEquals(c.getName(),reg.register(AnimalsNames,cc).getName());
    }

    @Test
    public void test172_Cuscus(){
        String AnimalsNames = "Cuscus";
        ConceptClass cc = new ConceptClass("animals");
        cc.setKeywords("Kingdom: Animalia");
        LongMemory mem = new LongMemory();
        RegisterWiki reg = new RegisterWiki(mem);
        System.out.println(AnimalsNames);
        Concept c = new Concept();
        c.setConceptClass(cc);
        c.setName(cc.getNameClass());
        c.setFoundInDB(false);

        assertEquals(c.getName(),reg.register(AnimalsNames,cc).getName());
    }

    @Test
    public void test173_Cuttlefish(){
        String AnimalsNames = "Cuttlefish";
        ConceptClass cc = new ConceptClass("animals");
        cc.setKeywords("Kingdom: Animalia");
        LongMemory mem = new LongMemory();
        RegisterWiki reg = new RegisterWiki(mem);
        System.out.println(AnimalsNames);
        Concept c = new Concept();
        c.setConceptClass(cc);
        c.setName(cc.getNameClass());
        c.setFoundInDB(false);

        assertEquals(c.getName(),reg.register(AnimalsNames,cc).getName());
    }

    @Test
    public void test174_D(){
        String AnimalsNames = "D";
        ConceptClass cc = new ConceptClass("animals");
        cc.setKeywords("Kingdom: Animalia");
        LongMemory mem = new LongMemory();
        RegisterWiki reg = new RegisterWiki(mem);
        System.out.println(AnimalsNames);
        Concept c = new Concept();
        c.setConceptClass(cc);
        c.setName(cc.getNameClass());
        c.setFoundInDB(false);

        assertEquals(c.getName(),reg.register(AnimalsNames,cc).getName());
    }

    @Test
    public void test175_Dachshund(){
        String AnimalsNames = "Dachshund";
        ConceptClass cc = new ConceptClass("animals");
        cc.setKeywords("Kingdom: Animalia");
        LongMemory mem = new LongMemory();
        RegisterWiki reg = new RegisterWiki(mem);
        System.out.println(AnimalsNames);
        Concept c = new Concept();
        c.setConceptClass(cc);
        c.setName(cc.getNameClass());
        c.setFoundInDB(false);

        assertEquals(c.getName(),reg.register(AnimalsNames,cc).getName());
    }

    @Test
    public void test176_Dalmatian(){
        String AnimalsNames = "Dalmatian";
        ConceptClass cc = new ConceptClass("animals");
        cc.setKeywords("Kingdom: Animalia");
        LongMemory mem = new LongMemory();
        RegisterWiki reg = new RegisterWiki(mem);
        System.out.println(AnimalsNames);
        Concept c = new Concept();
        c.setConceptClass(cc);
        c.setName(cc.getNameClass());
        c.setFoundInDB(false);

        assertEquals(c.getName(),reg.register(AnimalsNames,cc).getName());
    }

    @Test
    public void test177_DarwinsFrog(){
        String AnimalsNames = "Darwin's Frog";
        ConceptClass cc = new ConceptClass("animals");
        cc.setKeywords("Kingdom: Animalia");
        LongMemory mem = new LongMemory();
        RegisterWiki reg = new RegisterWiki(mem);
        System.out.println(AnimalsNames);
        Concept c = new Concept();
        c.setConceptClass(cc);
        c.setName(cc.getNameClass());
        c.setFoundInDB(false);

        assertEquals(c.getName(),reg.register(AnimalsNames,cc).getName());
    }

    @Test
    public void test178_Deer(){
        String AnimalsNames = "Deer";
        ConceptClass cc = new ConceptClass("animals");
        cc.setKeywords("Kingdom: Animalia");
        LongMemory mem = new LongMemory();
        RegisterWiki reg = new RegisterWiki(mem);
        System.out.println(AnimalsNames);
        Concept c = new Concept();
        c.setConceptClass(cc);
        c.setName(cc.getNameClass());
        c.setFoundInDB(false);

        assertEquals(c.getName(),reg.register(AnimalsNames,cc).getName());
    }

    @Test
    public void test179_DesertTortoise(){
        String AnimalsNames = "Desert Tortoise";
        ConceptClass cc = new ConceptClass("animals");
        cc.setKeywords("Kingdom: Animalia");
        LongMemory mem = new LongMemory();
        RegisterWiki reg = new RegisterWiki(mem);
        System.out.println(AnimalsNames);
        Concept c = new Concept();
        c.setConceptClass(cc);
        c.setName(cc.getNameClass());
        c.setFoundInDB(false);

        assertEquals(c.getName(),reg.register(AnimalsNames,cc).getName());
    }

    @Test
    public void test180_DeutscheBracke(){
        String AnimalsNames = "Deutsche Bracke";
        ConceptClass cc = new ConceptClass("animals");
        cc.setKeywords("Kingdom: Animalia");
        LongMemory mem = new LongMemory();
        RegisterWiki reg = new RegisterWiki(mem);
        System.out.println(AnimalsNames);
        Concept c = new Concept();
        c.setConceptClass(cc);
        c.setName(cc.getNameClass());
        c.setFoundInDB(false);

        assertEquals(c.getName(),reg.register(AnimalsNames,cc).getName());
    }

    @Test
    public void test181_Dhole(){
        String AnimalsNames = "Dhole";
        ConceptClass cc = new ConceptClass("animals");
        cc.setKeywords("Kingdom: Animalia");
        LongMemory mem = new LongMemory();
        RegisterWiki reg = new RegisterWiki(mem);
        System.out.println(AnimalsNames);
        Concept c = new Concept();
        c.setConceptClass(cc);
        c.setName(cc.getNameClass());
        c.setFoundInDB(false);

        assertEquals(c.getName(),reg.register(AnimalsNames,cc).getName());
    }

    @Test
    public void test182_Dingo(){
        String AnimalsNames = "Dingo";
        ConceptClass cc = new ConceptClass("animals");
        cc.setKeywords("Kingdom: Animalia");
        LongMemory mem = new LongMemory();
        RegisterWiki reg = new RegisterWiki(mem);
        System.out.println(AnimalsNames);
        Concept c = new Concept();
        c.setConceptClass(cc);
        c.setName(cc.getNameClass());
        c.setFoundInDB(false);

        assertEquals(c.getName(),reg.register(AnimalsNames,cc).getName());
    }

    @Test
    public void test183_Discus(){
        String AnimalsNames = "Discus";
        ConceptClass cc = new ConceptClass("animals");
        cc.setKeywords("Kingdom: Animalia");
        LongMemory mem = new LongMemory();
        RegisterWiki reg = new RegisterWiki(mem);
        System.out.println(AnimalsNames);
        Concept c = new Concept();
        c.setConceptClass(cc);
        c.setName(cc.getNameClass());
        c.setFoundInDB(false);

        assertEquals(c.getName(),reg.register(AnimalsNames,cc).getName());
    }

    @Test
    public void test184_DobermanPinscher(){
        String AnimalsNames = "Doberman Pinscher";
        ConceptClass cc = new ConceptClass("animals");
        cc.setKeywords("Kingdom: Animalia");
        LongMemory mem = new LongMemory();
        RegisterWiki reg = new RegisterWiki(mem);
        System.out.println(AnimalsNames);
        Concept c = new Concept();
        c.setConceptClass(cc);
        c.setName(cc.getNameClass());
        c.setFoundInDB(false);

        assertEquals(c.getName(),reg.register(AnimalsNames,cc).getName());
    }

    @Test
    public void test185_Dodo(){
        String AnimalsNames = "Dodo";
        ConceptClass cc = new ConceptClass("animals");
        cc.setKeywords("Kingdom: Animalia");
        LongMemory mem = new LongMemory();
        RegisterWiki reg = new RegisterWiki(mem);
        System.out.println(AnimalsNames);
        Concept c = new Concept();
        c.setConceptClass(cc);
        c.setName(cc.getNameClass());
        c.setFoundInDB(false);

        assertEquals(c.getName(),reg.register(AnimalsNames,cc).getName());
    }

    @Test
    public void test186_Dog(){
        String AnimalsNames = "Dog";
        ConceptClass cc = new ConceptClass("animals");
        cc.setKeywords("Kingdom: Animalia");
        LongMemory mem = new LongMemory();
        RegisterWiki reg = new RegisterWiki(mem);
        System.out.println(AnimalsNames);
        Concept c = new Concept();
        c.setConceptClass(cc);
        c.setName(cc.getNameClass());
        c.setFoundInDB(false);

        assertEquals(c.getName(),reg.register(AnimalsNames,cc).getName());
    }

    @Test
    public void test187_DogoArgentino(){
        String AnimalsNames = "Dogo Argentino";
        ConceptClass cc = new ConceptClass("animals");
        cc.setKeywords("Kingdom: Animalia");
        LongMemory mem = new LongMemory();
        RegisterWiki reg = new RegisterWiki(mem);
        System.out.println(AnimalsNames);
        Concept c = new Concept();
        c.setConceptClass(cc);
        c.setName(cc.getNameClass());
        c.setFoundInDB(false);

        assertEquals(c.getName(),reg.register(AnimalsNames,cc).getName());
    }

    @Test
    public void test188_DogueDeBordeaux(){
        String AnimalsNames = "Dogue De Bordeaux";
        ConceptClass cc = new ConceptClass("animals");
        cc.setKeywords("Kingdom: Animalia");
        LongMemory mem = new LongMemory();
        RegisterWiki reg = new RegisterWiki(mem);
        System.out.println(AnimalsNames);
        Concept c = new Concept();
        c.setConceptClass(cc);
        c.setName(cc.getNameClass());
        c.setFoundInDB(false);

        assertEquals(c.getName(),reg.register(AnimalsNames,cc).getName());
    }

    @Test
    public void test189_Dolphin(){
        String AnimalsNames = "Dolphin";
        ConceptClass cc = new ConceptClass("animals");
        cc.setKeywords("Kingdom: Animalia");
        LongMemory mem = new LongMemory();
        RegisterWiki reg = new RegisterWiki(mem);
        System.out.println(AnimalsNames);
        Concept c = new Concept();
        c.setConceptClass(cc);
        c.setName(cc.getNameClass());
        c.setFoundInDB(false);

        assertEquals(c.getName(),reg.register(AnimalsNames,cc).getName());
    }

    @Test
    public void test190_Donkey(){
        String AnimalsNames = "Donkey";
        ConceptClass cc = new ConceptClass("animals");
        cc.setKeywords("Kingdom: Animalia");
        LongMemory mem = new LongMemory();
        RegisterWiki reg = new RegisterWiki(mem);
        System.out.println(AnimalsNames);
        Concept c = new Concept();
        c.setConceptClass(cc);
        c.setName(cc.getNameClass());
        c.setFoundInDB(false);

        assertEquals(c.getName(),reg.register(AnimalsNames,cc).getName());
    }

    @Test
    public void test191_Dormouse(){
        String AnimalsNames = "Dormouse";
        ConceptClass cc = new ConceptClass("animals");
        cc.setKeywords("Kingdom: Animalia");
        LongMemory mem = new LongMemory();
        RegisterWiki reg = new RegisterWiki(mem);
        System.out.println(AnimalsNames);
        Concept c = new Concept();
        c.setConceptClass(cc);
        c.setName(cc.getNameClass());
        c.setFoundInDB(false);

        assertEquals(c.getName(),reg.register(AnimalsNames,cc).getName());
    }

    @Test
    public void test192_Dragonfly(){
        String AnimalsNames = "Dragonfly";
        ConceptClass cc = new ConceptClass("animals");
        cc.setKeywords("Kingdom: Animalia");
        LongMemory mem = new LongMemory();
        RegisterWiki reg = new RegisterWiki(mem);
        System.out.println(AnimalsNames);
        Concept c = new Concept();
        c.setConceptClass(cc);
        c.setName(cc.getNameClass());
        c.setFoundInDB(false);

        assertEquals(c.getName(),reg.register(AnimalsNames,cc).getName());
    }

    @Test
    public void test193_Drever(){
        String AnimalsNames = "Drever";
        ConceptClass cc = new ConceptClass("animals");
        cc.setKeywords("Kingdom: Animalia");
        LongMemory mem = new LongMemory();
        RegisterWiki reg = new RegisterWiki(mem);
        System.out.println(AnimalsNames);
        Concept c = new Concept();
        c.setConceptClass(cc);
        c.setName(cc.getNameClass());
        c.setFoundInDB(false);

        assertEquals(c.getName(),reg.register(AnimalsNames,cc).getName());
    }

    @Test
    public void test194_Duck(){
        String AnimalsNames = "Duck";
        ConceptClass cc = new ConceptClass("animals");
        cc.setKeywords("Kingdom: Animalia");
        LongMemory mem = new LongMemory();
        RegisterWiki reg = new RegisterWiki(mem);
        System.out.println(AnimalsNames);
        Concept c = new Concept();
        c.setConceptClass(cc);
        c.setName(cc.getNameClass());
        c.setFoundInDB(false);

        assertEquals(c.getName(),reg.register(AnimalsNames,cc).getName());
    }

    @Test
    public void test195_Dugong(){
        String AnimalsNames = "Dugong";
        ConceptClass cc = new ConceptClass("animals");
        cc.setKeywords("Kingdom: Animalia");
        LongMemory mem = new LongMemory();
        RegisterWiki reg = new RegisterWiki(mem);
        System.out.println(AnimalsNames);
        Concept c = new Concept();
        c.setConceptClass(cc);
        c.setName(cc.getNameClass());
        c.setFoundInDB(false);

        assertEquals(c.getName(),reg.register(AnimalsNames,cc).getName());
    }

    @Test
    public void test196_Dunker(){
        String AnimalsNames = "Dunker";
        ConceptClass cc = new ConceptClass("animals");
        cc.setKeywords("Kingdom: Animalia");
        LongMemory mem = new LongMemory();
        RegisterWiki reg = new RegisterWiki(mem);
        System.out.println(AnimalsNames);
        Concept c = new Concept();
        c.setConceptClass(cc);
        c.setName(cc.getNameClass());
        c.setFoundInDB(false);

        assertEquals(c.getName(),reg.register(AnimalsNames,cc).getName());
    }

    @Test
    public void test197_DuskyDolphin(){
        String AnimalsNames = "Dusky Dolphin";
        ConceptClass cc = new ConceptClass("animals");
        cc.setKeywords("Kingdom: Animalia");
        LongMemory mem = new LongMemory();
        RegisterWiki reg = new RegisterWiki(mem);
        System.out.println(AnimalsNames);
        Concept c = new Concept();
        c.setConceptClass(cc);
        c.setName(cc.getNameClass());
        c.setFoundInDB(false);

        assertEquals(c.getName(),reg.register(AnimalsNames,cc).getName());
    }

    @Test
    public void test198_DwarfCrocodile(){
        String AnimalsNames = "Dwarf Crocodile";
        ConceptClass cc = new ConceptClass("animals");
        cc.setKeywords("Kingdom: Animalia");
        LongMemory mem = new LongMemory();
        RegisterWiki reg = new RegisterWiki(mem);
        System.out.println(AnimalsNames);
        Concept c = new Concept();
        c.setConceptClass(cc);
        c.setName(cc.getNameClass());
        c.setFoundInDB(false);

        assertEquals(c.getName(),reg.register(AnimalsNames,cc).getName());
    }

    @Test
    public void test199_E(){
        String AnimalsNames = "E";
        ConceptClass cc = new ConceptClass("animals");
        cc.setKeywords("Kingdom: Animalia");
        LongMemory mem = new LongMemory();
        RegisterWiki reg = new RegisterWiki(mem);
        System.out.println(AnimalsNames);
        Concept c = new Concept();
        c.setConceptClass(cc);
        c.setName(cc.getNameClass());
        c.setFoundInDB(false);

        assertEquals(c.getName(),reg.register(AnimalsNames,cc).getName());
    }

    @Test
    public void test200_Eagle(){
        String AnimalsNames = "Eagle";
        ConceptClass cc = new ConceptClass("animals");
        cc.setKeywords("Kingdom: Animalia");
        LongMemory mem = new LongMemory();
        RegisterWiki reg = new RegisterWiki(mem);
        System.out.println(AnimalsNames);
        Concept c = new Concept();
        c.setConceptClass(cc);
        c.setName(cc.getNameClass());
        c.setFoundInDB(false);

        assertEquals(c.getName(),reg.register(AnimalsNames,cc).getName());
    }

    @Test
    public void test201_Earwig(){
        String AnimalsNames = "Earwig";
        ConceptClass cc = new ConceptClass("animals");
        cc.setKeywords("Kingdom: Animalia");
        LongMemory mem = new LongMemory();
        RegisterWiki reg = new RegisterWiki(mem);
        System.out.println(AnimalsNames);
        Concept c = new Concept();
        c.setConceptClass(cc);
        c.setName(cc.getNameClass());
        c.setFoundInDB(false);

        assertEquals(c.getName(),reg.register(AnimalsNames,cc).getName());
    }

    @Test
    public void test202_EasternGorilla(){
        String AnimalsNames = "Eastern Gorilla";
        ConceptClass cc = new ConceptClass("animals");
        cc.setKeywords("Kingdom: Animalia");
        LongMemory mem = new LongMemory();
        RegisterWiki reg = new RegisterWiki(mem);
        System.out.println(AnimalsNames);
        Concept c = new Concept();
        c.setConceptClass(cc);
        c.setName(cc.getNameClass());
        c.setFoundInDB(false);

        assertEquals(c.getName(),reg.register(AnimalsNames,cc).getName());
    }

    @Test
    public void test203_EasternLowlandGorilla(){
        String AnimalsNames = "Eastern Lowland Gorilla";
        ConceptClass cc = new ConceptClass("animals");
        cc.setKeywords("Kingdom: Animalia");
        LongMemory mem = new LongMemory();
        RegisterWiki reg = new RegisterWiki(mem);
        System.out.println(AnimalsNames);
        Concept c = new Concept();
        c.setConceptClass(cc);
        c.setName(cc.getNameClass());
        c.setFoundInDB(false);

        assertEquals(c.getName(),reg.register(AnimalsNames,cc).getName());
    }

    @Test
    public void test204_Echidna(){
        String AnimalsNames = "Echidna";
        ConceptClass cc = new ConceptClass("animals");
        cc.setKeywords("Kingdom: Animalia");
        LongMemory mem = new LongMemory();
        RegisterWiki reg = new RegisterWiki(mem);
        System.out.println(AnimalsNames);
        Concept c = new Concept();
        c.setConceptClass(cc);
        c.setName(cc.getNameClass());
        c.setFoundInDB(false);

        assertEquals(c.getName(),reg.register(AnimalsNames,cc).getName());
    }

    @Test
    public void test205_EdibleFrog(){
        String AnimalsNames = "Edible Frog";
        ConceptClass cc = new ConceptClass("animals");
        cc.setKeywords("Kingdom: Animalia");
        LongMemory mem = new LongMemory();
        RegisterWiki reg = new RegisterWiki(mem);
        System.out.println(AnimalsNames);
        Concept c = new Concept();
        c.setConceptClass(cc);
        c.setName(cc.getNameClass());
        c.setFoundInDB(false);

        assertEquals(c.getName(),reg.register(AnimalsNames,cc).getName());
    }

    @Test
    public void test206_EgyptianMau(){
        String AnimalsNames = "Egyptian Mau";
        ConceptClass cc = new ConceptClass("animals");
        cc.setKeywords("Kingdom: Animalia");
        LongMemory mem = new LongMemory();
        RegisterWiki reg = new RegisterWiki(mem);
        System.out.println(AnimalsNames);
        Concept c = new Concept();
        c.setConceptClass(cc);
        c.setName(cc.getNameClass());
        c.setFoundInDB(false);

        assertEquals(c.getName(),reg.register(AnimalsNames,cc).getName());
    }

    @Test
    public void test207_ElectricEel(){
        String AnimalsNames = "Electric Eel";
        ConceptClass cc = new ConceptClass("animals");
        cc.setKeywords("Kingdom: Animalia");
        LongMemory mem = new LongMemory();
        RegisterWiki reg = new RegisterWiki(mem);
        System.out.println(AnimalsNames);
        Concept c = new Concept();
        c.setConceptClass(cc);
        c.setName(cc.getNameClass());
        c.setFoundInDB(false);

        assertEquals(c.getName(),reg.register(AnimalsNames,cc).getName());
    }

    @Test
    public void test208_Elephant(){
        String AnimalsNames = "Elephant";
        ConceptClass cc = new ConceptClass("animals");
        cc.setKeywords("Kingdom: Animalia");
        LongMemory mem = new LongMemory();
        RegisterWiki reg = new RegisterWiki(mem);
        System.out.println(AnimalsNames);
        Concept c = new Concept();
        c.setConceptClass(cc);
        c.setName(cc.getNameClass());
        c.setFoundInDB(false);

        assertEquals(c.getName(),reg.register(AnimalsNames,cc).getName());
    }

    @Test
    public void test209_ElephantSeal(){
        String AnimalsNames = "Elephant Seal";
        ConceptClass cc = new ConceptClass("animals");
        cc.setKeywords("Kingdom: Animalia");
        LongMemory mem = new LongMemory();
        RegisterWiki reg = new RegisterWiki(mem);
        System.out.println(AnimalsNames);
        Concept c = new Concept();
        c.setConceptClass(cc);
        c.setName(cc.getNameClass());
        c.setFoundInDB(false);

        assertEquals(c.getName(),reg.register(AnimalsNames,cc).getName());
    }

    @Test
    public void test210_ElephantShrew(){
        String AnimalsNames = "Elephant Shrew";
        ConceptClass cc = new ConceptClass("animals");
        cc.setKeywords("Kingdom: Animalia");
        LongMemory mem = new LongMemory();
        RegisterWiki reg = new RegisterWiki(mem);
        System.out.println(AnimalsNames);
        Concept c = new Concept();
        c.setConceptClass(cc);
        c.setName(cc.getNameClass());
        c.setFoundInDB(false);

        assertEquals(c.getName(),reg.register(AnimalsNames,cc).getName());
    }

    @Test
    public void test211_EmperorPenguin(){
        String AnimalsNames = "Emperor Penguin";
        ConceptClass cc = new ConceptClass("animals");
        cc.setKeywords("Kingdom: Animalia");
        LongMemory mem = new LongMemory();
        RegisterWiki reg = new RegisterWiki(mem);
        System.out.println(AnimalsNames);
        Concept c = new Concept();
        c.setConceptClass(cc);
        c.setName(cc.getNameClass());
        c.setFoundInDB(false);

        assertEquals(c.getName(),reg.register(AnimalsNames,cc).getName());
    }

    @Test
    public void test212_EmperorTamarin(){
        String AnimalsNames = "Emperor Tamarin";
        ConceptClass cc = new ConceptClass("animals");
        cc.setKeywords("Kingdom: Animalia");
        LongMemory mem = new LongMemory();
        RegisterWiki reg = new RegisterWiki(mem);
        System.out.println(AnimalsNames);
        Concept c = new Concept();
        c.setConceptClass(cc);
        c.setName(cc.getNameClass());
        c.setFoundInDB(false);

        assertEquals(c.getName(),reg.register(AnimalsNames,cc).getName());
    }

    @Test
    public void test213_Emu(){
        String AnimalsNames = "Emu";
        ConceptClass cc = new ConceptClass("animals");
        cc.setKeywords("Kingdom: Animalia");
        LongMemory mem = new LongMemory();
        RegisterWiki reg = new RegisterWiki(mem);
        System.out.println(AnimalsNames);
        Concept c = new Concept();
        c.setConceptClass(cc);
        c.setName(cc.getNameClass());
        c.setFoundInDB(false);

        assertEquals(c.getName(),reg.register(AnimalsNames,cc).getName());
    }

    @Test
    public void test214_EnglishCockerSpaniel(){
        String AnimalsNames = "English Cocker Spaniel";
        ConceptClass cc = new ConceptClass("animals");
        cc.setKeywords("Kingdom: Animalia");
        LongMemory mem = new LongMemory();
        RegisterWiki reg = new RegisterWiki(mem);
        System.out.println(AnimalsNames);
        Concept c = new Concept();
        c.setConceptClass(cc);
        c.setName(cc.getNameClass());
        c.setFoundInDB(false);

        assertEquals(c.getName(),reg.register(AnimalsNames,cc).getName());
    }

    @Test
    public void test215_EnglishShepherd(){
        String AnimalsNames = "English Shepherd";
        ConceptClass cc = new ConceptClass("animals");
        cc.setKeywords("Kingdom: Animalia");
        LongMemory mem = new LongMemory();
        RegisterWiki reg = new RegisterWiki(mem);
        System.out.println(AnimalsNames);
        Concept c = new Concept();
        c.setConceptClass(cc);
        c.setName(cc.getNameClass());
        c.setFoundInDB(false);

        assertEquals(c.getName(),reg.register(AnimalsNames,cc).getName());
    }

    @Test
    public void test216_EnglishSpringerSpaniel(){
        String AnimalsNames = "English Springer Spaniel";
        ConceptClass cc = new ConceptClass("animals");
        cc.setKeywords("Kingdom: Animalia");
        LongMemory mem = new LongMemory();
        RegisterWiki reg = new RegisterWiki(mem);
        System.out.println(AnimalsNames);
        Concept c = new Concept();
        c.setConceptClass(cc);
        c.setName(cc.getNameClass());
        c.setFoundInDB(false);

        assertEquals(c.getName(),reg.register(AnimalsNames,cc).getName());
    }

    @Test
    public void test217_EntlebucherMountainDog(){
        String AnimalsNames = "Entlebucher Mountain Dog";
        ConceptClass cc = new ConceptClass("animals");
        cc.setKeywords("Kingdom: Animalia");
        LongMemory mem = new LongMemory();
        RegisterWiki reg = new RegisterWiki(mem);
        System.out.println(AnimalsNames);
        Concept c = new Concept();
        c.setConceptClass(cc);
        c.setName(cc.getNameClass());
        c.setFoundInDB(false);

        assertEquals(c.getName(),reg.register(AnimalsNames,cc).getName());
    }

    @Test
    public void test218_EpagneulPontAudemer(){
        String AnimalsNames = "Epagneul Pont Audemer";
        ConceptClass cc = new ConceptClass("animals");
        cc.setKeywords("Kingdom: Animalia");
        LongMemory mem = new LongMemory();
        RegisterWiki reg = new RegisterWiki(mem);
        System.out.println(AnimalsNames);
        Concept c = new Concept();
        c.setConceptClass(cc);
        c.setName(cc.getNameClass());
        c.setFoundInDB(false);

        assertEquals(c.getName(),reg.register(AnimalsNames,cc).getName());
    }

    @Test
    public void test219_EskimoDog(){
        String AnimalsNames = "Eskimo Dog";
        ConceptClass cc = new ConceptClass("animals");
        cc.setKeywords("Kingdom: Animalia");
        LongMemory mem = new LongMemory();
        RegisterWiki reg = new RegisterWiki(mem);
        System.out.println(AnimalsNames);
        Concept c = new Concept();
        c.setConceptClass(cc);
        c.setName(cc.getNameClass());
        c.setFoundInDB(false);

        assertEquals(c.getName(),reg.register(AnimalsNames,cc).getName());
    }

    @Test
    public void test220_EstrelaMountainDog(){
        String AnimalsNames = "Estrela Mountain Dog";
        ConceptClass cc = new ConceptClass("animals");
        cc.setKeywords("Kingdom: Animalia");
        LongMemory mem = new LongMemory();
        RegisterWiki reg = new RegisterWiki(mem);
        System.out.println(AnimalsNames);
        Concept c = new Concept();
        c.setConceptClass(cc);
        c.setName(cc.getNameClass());
        c.setFoundInDB(false);

        assertEquals(c.getName(),reg.register(AnimalsNames,cc).getName());
    }

    @Test
    public void test221_F(){
        String AnimalsNames = "F";
        ConceptClass cc = new ConceptClass("animals");
        cc.setKeywords("Kingdom: Animalia");
        LongMemory mem = new LongMemory();
        RegisterWiki reg = new RegisterWiki(mem);
        System.out.println(AnimalsNames);
        Concept c = new Concept();
        c.setConceptClass(cc);
        c.setName(cc.getNameClass());
        c.setFoundInDB(false);

        assertEquals(c.getName(),reg.register(AnimalsNames,cc).getName());
    }

    @Test
    public void test222_Falcon(){
        String AnimalsNames = "Falcon";
        ConceptClass cc = new ConceptClass("animals");
        cc.setKeywords("Kingdom: Animalia");
        LongMemory mem = new LongMemory();
        RegisterWiki reg = new RegisterWiki(mem);
        System.out.println(AnimalsNames);
        Concept c = new Concept();
        c.setConceptClass(cc);
        c.setName(cc.getNameClass());
        c.setFoundInDB(false);

        assertEquals(c.getName(),reg.register(AnimalsNames,cc).getName());
    }

    @Test
    public void test223_FennecFox(){
        String AnimalsNames = "Fennec Fox";
        ConceptClass cc = new ConceptClass("animals");
        cc.setKeywords("Kingdom: Animalia");
        LongMemory mem = new LongMemory();
        RegisterWiki reg = new RegisterWiki(mem);
        System.out.println(AnimalsNames);
        Concept c = new Concept();
        c.setConceptClass(cc);
        c.setName(cc.getNameClass());
        c.setFoundInDB(false);

        assertEquals(c.getName(),reg.register(AnimalsNames,cc).getName());
    }

    @Test
    public void test224_Ferret(){
        String AnimalsNames = "Ferret";
        ConceptClass cc = new ConceptClass("animals");
        cc.setKeywords("Kingdom: Animalia");
        LongMemory mem = new LongMemory();
        RegisterWiki reg = new RegisterWiki(mem);
        System.out.println(AnimalsNames);
        Concept c = new Concept();
        c.setConceptClass(cc);
        c.setName(cc.getNameClass());
        c.setFoundInDB(false);

        assertEquals(c.getName(),reg.register(AnimalsNames,cc).getName());
    }

    @Test
    public void test225_FieldSpaniel(){
        String AnimalsNames = "Field Spaniel";
        ConceptClass cc = new ConceptClass("animals");
        cc.setKeywords("Kingdom: Animalia");
        LongMemory mem = new LongMemory();
        RegisterWiki reg = new RegisterWiki(mem);
        System.out.println(AnimalsNames);
        Concept c = new Concept();
        c.setConceptClass(cc);
        c.setName(cc.getNameClass());
        c.setFoundInDB(false);

        assertEquals(c.getName(),reg.register(AnimalsNames,cc).getName());
    }

    @Test
    public void test226_FinWhale(){
        String AnimalsNames = "Fin Whale";
        ConceptClass cc = new ConceptClass("animals");
        cc.setKeywords("Kingdom: Animalia");
        LongMemory mem = new LongMemory();
        RegisterWiki reg = new RegisterWiki(mem);
        System.out.println(AnimalsNames);
        Concept c = new Concept();
        c.setConceptClass(cc);
        c.setName(cc.getNameClass());
        c.setFoundInDB(false);

        assertEquals(c.getName(),reg.register(AnimalsNames,cc).getName());
    }

    @Test
    public void test227_FinnishSpitz(){
        String AnimalsNames = "Finnish Spitz";
        ConceptClass cc = new ConceptClass("animals");
        cc.setKeywords("Kingdom: Animalia");
        LongMemory mem = new LongMemory();
        RegisterWiki reg = new RegisterWiki(mem);
        System.out.println(AnimalsNames);
        Concept c = new Concept();
        c.setConceptClass(cc);
        c.setName(cc.getNameClass());
        c.setFoundInDB(false);

        assertEquals(c.getName(),reg.register(AnimalsNames,cc).getName());
    }

    @Test
    public void test228_FireBelliedToad(){
        String AnimalsNames = "Fire-Bellied Toad";
        ConceptClass cc = new ConceptClass("animals");
        cc.setKeywords("Kingdom: Animalia");
        LongMemory mem = new LongMemory();
        RegisterWiki reg = new RegisterWiki(mem);
        System.out.println(AnimalsNames);
        Concept c = new Concept();
        c.setConceptClass(cc);
        c.setName(cc.getNameClass());
        c.setFoundInDB(false);

        assertEquals(c.getName(),reg.register(AnimalsNames,cc).getName());
    }

    @Test
    public void test229_Fish(){
        String AnimalsNames = "Fish";
        ConceptClass cc = new ConceptClass("animals");
        cc.setKeywords("Kingdom: Animalia");
        LongMemory mem = new LongMemory();
        RegisterWiki reg = new RegisterWiki(mem);
        System.out.println(AnimalsNames);
        Concept c = new Concept();
        c.setConceptClass(cc);
        c.setName(cc.getNameClass());
        c.setFoundInDB(false);

        assertEquals(c.getName(),reg.register(AnimalsNames,cc).getName());
    }

    @Test
    public void test230_FishingCat(){
        String AnimalsNames = "Fishing Cat";
        ConceptClass cc = new ConceptClass("animals");
        cc.setKeywords("Kingdom: Animalia");
        LongMemory mem = new LongMemory();
        RegisterWiki reg = new RegisterWiki(mem);
        System.out.println(AnimalsNames);
        Concept c = new Concept();
        c.setConceptClass(cc);
        c.setName(cc.getNameClass());
        c.setFoundInDB(false);

        assertEquals(c.getName(),reg.register(AnimalsNames,cc).getName());
    }

    @Test
    public void test231_Flamingo(){
        String AnimalsNames = "Flamingo";
        ConceptClass cc = new ConceptClass("animals");
        cc.setKeywords("Kingdom: Animalia");
        LongMemory mem = new LongMemory();
        RegisterWiki reg = new RegisterWiki(mem);
        System.out.println(AnimalsNames);
        Concept c = new Concept();
        c.setConceptClass(cc);
        c.setName(cc.getNameClass());
        c.setFoundInDB(false);

        assertEquals(c.getName(),reg.register(AnimalsNames,cc).getName());
    }

    @Test
    public void test232_FlatCoatRetriever(){
        String AnimalsNames = "Flat Coat Retriever";
        ConceptClass cc = new ConceptClass("animals");
        cc.setKeywords("Kingdom: Animalia");
        LongMemory mem = new LongMemory();
        RegisterWiki reg = new RegisterWiki(mem);
        System.out.println(AnimalsNames);
        Concept c = new Concept();
        c.setConceptClass(cc);
        c.setName(cc.getNameClass());
        c.setFoundInDB(false);

        assertEquals(c.getName(),reg.register(AnimalsNames,cc).getName());
    }

    @Test
    public void test233_Flounder(){
        String AnimalsNames = "Flounder";
        ConceptClass cc = new ConceptClass("animals");
        cc.setKeywords("Kingdom: Animalia");
        LongMemory mem = new LongMemory();
        RegisterWiki reg = new RegisterWiki(mem);
        System.out.println(AnimalsNames);
        Concept c = new Concept();
        c.setConceptClass(cc);
        c.setName(cc.getNameClass());
        c.setFoundInDB(false);

        assertEquals(c.getName(),reg.register(AnimalsNames,cc).getName());
    }

    @Test
    public void test234_Fly(){
        String AnimalsNames = "Fly";
        ConceptClass cc = new ConceptClass("animals");
        cc.setKeywords("Kingdom: Animalia");
        LongMemory mem = new LongMemory();
        RegisterWiki reg = new RegisterWiki(mem);
        System.out.println(AnimalsNames);
        Concept c = new Concept();
        c.setConceptClass(cc);
        c.setName(cc.getNameClass());
        c.setFoundInDB(false);

        assertEquals(c.getName(),reg.register(AnimalsNames,cc).getName());
    }

    @Test
    public void test235_FlyingSquirrel(){
        String AnimalsNames = "Flying Squirrel";
        ConceptClass cc = new ConceptClass("animals");
        cc.setKeywords("Kingdom: Animalia");
        LongMemory mem = new LongMemory();
        RegisterWiki reg = new RegisterWiki(mem);
        System.out.println(AnimalsNames);
        Concept c = new Concept();
        c.setConceptClass(cc);
        c.setName(cc.getNameClass());
        c.setFoundInDB(false);

        assertEquals(c.getName(),reg.register(AnimalsNames,cc).getName());
    }

    @Test
    public void test236_Fossa(){
        String AnimalsNames = "Fossa";
        ConceptClass cc = new ConceptClass("animals");
        cc.setKeywords("Kingdom: Animalia");
        LongMemory mem = new LongMemory();
        RegisterWiki reg = new RegisterWiki(mem);
        System.out.println(AnimalsNames);
        Concept c = new Concept();
        c.setConceptClass(cc);
        c.setName(cc.getNameClass());
        c.setFoundInDB(false);

        assertEquals(c.getName(),reg.register(AnimalsNames,cc).getName());
    }

    @Test
    public void test237_Fox(){
        String AnimalsNames = "Fox";
        ConceptClass cc = new ConceptClass("animals");
        cc.setKeywords("Kingdom: Animalia");
        LongMemory mem = new LongMemory();
        RegisterWiki reg = new RegisterWiki(mem);
        System.out.println(AnimalsNames);
        Concept c = new Concept();
        c.setConceptClass(cc);
        c.setName(cc.getNameClass());
        c.setFoundInDB(false);

        assertEquals(c.getName(),reg.register(AnimalsNames,cc).getName());
    }

    @Test
    public void test238_FoxTerrier(){
        String AnimalsNames = "Fox Terrier";
        ConceptClass cc = new ConceptClass("animals");
        cc.setKeywords("Kingdom: Animalia");
        LongMemory mem = new LongMemory();
        RegisterWiki reg = new RegisterWiki(mem);
        System.out.println(AnimalsNames);
        Concept c = new Concept();
        c.setConceptClass(cc);
        c.setName(cc.getNameClass());
        c.setFoundInDB(false);

        assertEquals(c.getName(),reg.register(AnimalsNames,cc).getName());
    }

    @Test
    public void test239_FrenchBulldog(){
        String AnimalsNames = "French Bulldog";
        ConceptClass cc = new ConceptClass("animals");
        cc.setKeywords("Kingdom: Animalia");
        LongMemory mem = new LongMemory();
        RegisterWiki reg = new RegisterWiki(mem);
        System.out.println(AnimalsNames);
        Concept c = new Concept();
        c.setConceptClass(cc);
        c.setName(cc.getNameClass());
        c.setFoundInDB(false);

        assertEquals(c.getName(),reg.register(AnimalsNames,cc).getName());
    }

    @Test
    public void test240_Frigatebird(){
        String AnimalsNames = "Frigatebird";
        ConceptClass cc = new ConceptClass("animals");
        cc.setKeywords("Kingdom: Animalia");
        LongMemory mem = new LongMemory();
        RegisterWiki reg = new RegisterWiki(mem);
        System.out.println(AnimalsNames);
        Concept c = new Concept();
        c.setConceptClass(cc);
        c.setName(cc.getNameClass());
        c.setFoundInDB(false);

        assertEquals(c.getName(),reg.register(AnimalsNames,cc).getName());
    }

    @Test
    public void test241_FrilledLizard(){
        String AnimalsNames = "Frilled Lizard";
        ConceptClass cc = new ConceptClass("animals");
        cc.setKeywords("Kingdom: Animalia");
        LongMemory mem = new LongMemory();
        RegisterWiki reg = new RegisterWiki(mem);
        System.out.println(AnimalsNames);
        Concept c = new Concept();
        c.setConceptClass(cc);
        c.setName(cc.getNameClass());
        c.setFoundInDB(false);

        assertEquals(c.getName(),reg.register(AnimalsNames,cc).getName());
    }

    @Test
    public void test242_Frog(){
        String AnimalsNames = "Frog";
        ConceptClass cc = new ConceptClass("animals");
        cc.setKeywords("Kingdom: Animalia");
        LongMemory mem = new LongMemory();
        RegisterWiki reg = new RegisterWiki(mem);
        System.out.println(AnimalsNames);
        Concept c = new Concept();
        c.setConceptClass(cc);
        c.setName(cc.getNameClass());
        c.setFoundInDB(false);

        assertEquals(c.getName(),reg.register(AnimalsNames,cc).getName());
    }

    @Test
    public void test243_FurSeal(){
        String AnimalsNames = "Fur Seal";
        ConceptClass cc = new ConceptClass("animals");
        cc.setKeywords("Kingdom: Animalia");
        LongMemory mem = new LongMemory();
        RegisterWiki reg = new RegisterWiki(mem);
        System.out.println(AnimalsNames);
        Concept c = new Concept();
        c.setConceptClass(cc);
        c.setName(cc.getNameClass());
        c.setFoundInDB(false);

        assertEquals(c.getName(),reg.register(AnimalsNames,cc).getName());
    }

    @Test
    public void test244_G(){
        String AnimalsNames = "G";
        ConceptClass cc = new ConceptClass("animals");
        cc.setKeywords("Kingdom: Animalia");
        LongMemory mem = new LongMemory();
        RegisterWiki reg = new RegisterWiki(mem);
        System.out.println(AnimalsNames);
        Concept c = new Concept();
        c.setConceptClass(cc);
        c.setName(cc.getNameClass());
        c.setFoundInDB(false);

        assertEquals(c.getName(),reg.register(AnimalsNames,cc).getName());
    }

    @Test
    public void test245_GalapagosPenguin(){
        String AnimalsNames = "Galapagos Penguin";
        ConceptClass cc = new ConceptClass("animals");
        cc.setKeywords("Kingdom: Animalia");
        LongMemory mem = new LongMemory();
        RegisterWiki reg = new RegisterWiki(mem);
        System.out.println(AnimalsNames);
        Concept c = new Concept();
        c.setConceptClass(cc);
        c.setName(cc.getNameClass());
        c.setFoundInDB(false);

        assertEquals(c.getName(),reg.register(AnimalsNames,cc).getName());
    }

    @Test
    public void test246_GalapagosTortoise(){
        String AnimalsNames = "Galapagos Tortoise";
        ConceptClass cc = new ConceptClass("animals");
        cc.setKeywords("Kingdom: Animalia");
        LongMemory mem = new LongMemory();
        RegisterWiki reg = new RegisterWiki(mem);
        System.out.println(AnimalsNames);
        Concept c = new Concept();
        c.setConceptClass(cc);
        c.setName(cc.getNameClass());
        c.setFoundInDB(false);

        assertEquals(c.getName(),reg.register(AnimalsNames,cc).getName());
    }

    @Test
    public void test247_Gar(){
        String AnimalsNames = "Gar";
        ConceptClass cc = new ConceptClass("animals");
        cc.setKeywords("Kingdom: Animalia");
        LongMemory mem = new LongMemory();
        RegisterWiki reg = new RegisterWiki(mem);
        System.out.println(AnimalsNames);
        Concept c = new Concept();
        c.setConceptClass(cc);
        c.setName(cc.getNameClass());
        c.setFoundInDB(false);

        assertEquals(c.getName(),reg.register(AnimalsNames,cc).getName());
    }

    @Test
    public void test248_Gecko(){
        String AnimalsNames = "Gecko";
        ConceptClass cc = new ConceptClass("animals");
        cc.setKeywords("Kingdom: Animalia");
        LongMemory mem = new LongMemory();
        RegisterWiki reg = new RegisterWiki(mem);
        System.out.println(AnimalsNames);
        Concept c = new Concept();
        c.setConceptClass(cc);
        c.setName(cc.getNameClass());
        c.setFoundInDB(false);

        assertEquals(c.getName(),reg.register(AnimalsNames,cc).getName());
    }

    @Test
    public void test249_GentooPenguin(){
        String AnimalsNames = "Gentoo Penguin";
        ConceptClass cc = new ConceptClass("animals");
        cc.setKeywords("Kingdom: Animalia");
        LongMemory mem = new LongMemory();
        RegisterWiki reg = new RegisterWiki(mem);
        System.out.println(AnimalsNames);
        Concept c = new Concept();
        c.setConceptClass(cc);
        c.setName(cc.getNameClass());
        c.setFoundInDB(false);

        assertEquals(c.getName(),reg.register(AnimalsNames,cc).getName());
    }

    @Test
    public void test250_GeoffroysTamarin(){
        String AnimalsNames = "Geoffroys Tamarin";
        ConceptClass cc = new ConceptClass("animals");
        cc.setKeywords("Kingdom: Animalia");
        LongMemory mem = new LongMemory();
        RegisterWiki reg = new RegisterWiki(mem);
        System.out.println(AnimalsNames);
        Concept c = new Concept();
        c.setConceptClass(cc);
        c.setName(cc.getNameClass());
        c.setFoundInDB(false);

        assertEquals(c.getName(),reg.register(AnimalsNames,cc).getName());
    }

    @Test
    public void test251_Gerbil(){
        String AnimalsNames = "Gerbil";
        ConceptClass cc = new ConceptClass("animals");
        cc.setKeywords("Kingdom: Animalia");
        LongMemory mem = new LongMemory();
        RegisterWiki reg = new RegisterWiki(mem);
        System.out.println(AnimalsNames);
        Concept c = new Concept();
        c.setConceptClass(cc);
        c.setName(cc.getNameClass());
        c.setFoundInDB(false);

        assertEquals(c.getName(),reg.register(AnimalsNames,cc).getName());
    }

    @Test
    public void test252_GermanPinscher(){
        String AnimalsNames = "German Pinscher";
        ConceptClass cc = new ConceptClass("animals");
        cc.setKeywords("Kingdom: Animalia");
        LongMemory mem = new LongMemory();
        RegisterWiki reg = new RegisterWiki(mem);
        System.out.println(AnimalsNames);
        Concept c = new Concept();
        c.setConceptClass(cc);
        c.setName(cc.getNameClass());
        c.setFoundInDB(false);

        assertEquals(c.getName(),reg.register(AnimalsNames,cc).getName());
    }

    @Test
    public void test253_GermanShepherd(){
        String AnimalsNames = "German Shepherd";
        ConceptClass cc = new ConceptClass("animals");
        cc.setKeywords("Kingdom: Animalia");
        LongMemory mem = new LongMemory();
        RegisterWiki reg = new RegisterWiki(mem);
        System.out.println(AnimalsNames);
        Concept c = new Concept();
        c.setConceptClass(cc);
        c.setName(cc.getNameClass());
        c.setFoundInDB(false);

        assertEquals(c.getName(),reg.register(AnimalsNames,cc).getName());
    }

    @Test
    public void test254_Gharial(){
        String AnimalsNames = "Gharial";
        ConceptClass cc = new ConceptClass("animals");
        cc.setKeywords("Kingdom: Animalia");
        LongMemory mem = new LongMemory();
        RegisterWiki reg = new RegisterWiki(mem);
        System.out.println(AnimalsNames);
        Concept c = new Concept();
        c.setConceptClass(cc);
        c.setName(cc.getNameClass());
        c.setFoundInDB(false);

        assertEquals(c.getName(),reg.register(AnimalsNames,cc).getName());
    }

    @Test
    public void test255_GiantAfricanLandSnail(){
        String AnimalsNames = "Giant African Land Snail";
        ConceptClass cc = new ConceptClass("animals");
        cc.setKeywords("Kingdom: Animalia");
        LongMemory mem = new LongMemory();
        RegisterWiki reg = new RegisterWiki(mem);
        System.out.println(AnimalsNames);
        Concept c = new Concept();
        c.setConceptClass(cc);
        c.setName(cc.getNameClass());
        c.setFoundInDB(false);

        assertEquals(c.getName(),reg.register(AnimalsNames,cc).getName());
    }

    @Test
    public void test256_GiantClam(){
        String AnimalsNames = "Giant Clam";
        ConceptClass cc = new ConceptClass("animals");
        cc.setKeywords("Kingdom: Animalia");
        LongMemory mem = new LongMemory();
        RegisterWiki reg = new RegisterWiki(mem);
        System.out.println(AnimalsNames);
        Concept c = new Concept();
        c.setConceptClass(cc);
        c.setName(cc.getNameClass());
        c.setFoundInDB(false);

        assertEquals(c.getName(),reg.register(AnimalsNames,cc).getName());
    }

    @Test
    public void test257_GiantPandaBear(){
        String AnimalsNames = "Giant Panda Bear";
        ConceptClass cc = new ConceptClass("animals");
        cc.setKeywords("Kingdom: Animalia");
        LongMemory mem = new LongMemory();
        RegisterWiki reg = new RegisterWiki(mem);
        System.out.println(AnimalsNames);
        Concept c = new Concept();
        c.setConceptClass(cc);
        c.setName(cc.getNameClass());
        c.setFoundInDB(false);

        assertEquals(c.getName(),reg.register(AnimalsNames,cc).getName());
    }

    @Test
    public void test258_GiantSchnauzer(){
        String AnimalsNames = "Giant Schnauzer";
        ConceptClass cc = new ConceptClass("animals");
        cc.setKeywords("Kingdom: Animalia");
        LongMemory mem = new LongMemory();
        RegisterWiki reg = new RegisterWiki(mem);
        System.out.println(AnimalsNames);
        Concept c = new Concept();
        c.setConceptClass(cc);
        c.setName(cc.getNameClass());
        c.setFoundInDB(false);

        assertEquals(c.getName(),reg.register(AnimalsNames,cc).getName());
    }

    @Test
    public void test259_Gibbon(){
        String AnimalsNames = "Gibbon";
        ConceptClass cc = new ConceptClass("animals");
        cc.setKeywords("Kingdom: Animalia");
        LongMemory mem = new LongMemory();
        RegisterWiki reg = new RegisterWiki(mem);
        System.out.println(AnimalsNames);
        Concept c = new Concept();
        c.setConceptClass(cc);
        c.setName(cc.getNameClass());
        c.setFoundInDB(false);

        assertEquals(c.getName(),reg.register(AnimalsNames,cc).getName());
    }

    @Test
    public void test260_GilaMonster(){
        String AnimalsNames = "Gila Monster";
        ConceptClass cc = new ConceptClass("animals");
        cc.setKeywords("Kingdom: Animalia");
        LongMemory mem = new LongMemory();
        RegisterWiki reg = new RegisterWiki(mem);
        System.out.println(AnimalsNames);
        Concept c = new Concept();
        c.setConceptClass(cc);
        c.setName(cc.getNameClass());
        c.setFoundInDB(false);

        assertEquals(c.getName(),reg.register(AnimalsNames,cc).getName());
    }

    @Test
    public void test261_Giraffe(){
        String AnimalsNames = "Giraffe";
        ConceptClass cc = new ConceptClass("animals");
        cc.setKeywords("Kingdom: Animalia");
        LongMemory mem = new LongMemory();
        RegisterWiki reg = new RegisterWiki(mem);
        System.out.println(AnimalsNames);
        Concept c = new Concept();
        c.setConceptClass(cc);
        c.setName(cc.getNameClass());
        c.setFoundInDB(false);

        assertEquals(c.getName(),reg.register(AnimalsNames,cc).getName());
    }

    @Test
    public void test262_GlassLizard(){
        String AnimalsNames = "Glass Lizard";
        ConceptClass cc = new ConceptClass("animals");
        cc.setKeywords("Kingdom: Animalia");
        LongMemory mem = new LongMemory();
        RegisterWiki reg = new RegisterWiki(mem);
        System.out.println(AnimalsNames);
        Concept c = new Concept();
        c.setConceptClass(cc);
        c.setName(cc.getNameClass());
        c.setFoundInDB(false);

        assertEquals(c.getName(),reg.register(AnimalsNames,cc).getName());
    }

    @Test
    public void test263_GlowWorm(){
        String AnimalsNames = "Glow Worm";
        ConceptClass cc = new ConceptClass("animals");
        cc.setKeywords("Kingdom: Animalia");
        LongMemory mem = new LongMemory();
        RegisterWiki reg = new RegisterWiki(mem);
        System.out.println(AnimalsNames);
        Concept c = new Concept();
        c.setConceptClass(cc);
        c.setName(cc.getNameClass());
        c.setFoundInDB(false);

        assertEquals(c.getName(),reg.register(AnimalsNames,cc).getName());
    }

    @Test
    public void test264_Goat(){
        String AnimalsNames = "Goat";
        ConceptClass cc = new ConceptClass("animals");
        cc.setKeywords("Kingdom: Animalia");
        LongMemory mem = new LongMemory();
        RegisterWiki reg = new RegisterWiki(mem);
        System.out.println(AnimalsNames);
        Concept c = new Concept();
        c.setConceptClass(cc);
        c.setName(cc.getNameClass());
        c.setFoundInDB(false);

        assertEquals(c.getName(),reg.register(AnimalsNames,cc).getName());
    }

    @Test
    public void test265_GoldenLionTamarin(){
        String AnimalsNames = "Golden Lion Tamarin";
        ConceptClass cc = new ConceptClass("animals");
        cc.setKeywords("Kingdom: Animalia");
        LongMemory mem = new LongMemory();
        RegisterWiki reg = new RegisterWiki(mem);
        System.out.println(AnimalsNames);
        Concept c = new Concept();
        c.setConceptClass(cc);
        c.setName(cc.getNameClass());
        c.setFoundInDB(false);

        assertEquals(c.getName(),reg.register(AnimalsNames,cc).getName());
    }

    @Test
    public void test266_GoldenOriole(){
        String AnimalsNames = "Golden Oriole";
        ConceptClass cc = new ConceptClass("animals");
        cc.setKeywords("Kingdom: Animalia");
        LongMemory mem = new LongMemory();
        RegisterWiki reg = new RegisterWiki(mem);
        System.out.println(AnimalsNames);
        Concept c = new Concept();
        c.setConceptClass(cc);
        c.setName(cc.getNameClass());
        c.setFoundInDB(false);

        assertEquals(c.getName(),reg.register(AnimalsNames,cc).getName());
    }

    @Test
    public void test267_GoldenRetriever(){
        String AnimalsNames = "Golden Retriever";
        ConceptClass cc = new ConceptClass("animals");
        cc.setKeywords("Kingdom: Animalia");
        LongMemory mem = new LongMemory();
        RegisterWiki reg = new RegisterWiki(mem);
        System.out.println(AnimalsNames);
        Concept c = new Concept();
        c.setConceptClass(cc);
        c.setName(cc.getNameClass());
        c.setFoundInDB(false);

        assertEquals(c.getName(),reg.register(AnimalsNames,cc).getName());
    }

    @Test
    public void test268_Goose(){
        String AnimalsNames = "Goose";
        ConceptClass cc = new ConceptClass("animals");
        cc.setKeywords("Kingdom: Animalia");
        LongMemory mem = new LongMemory();
        RegisterWiki reg = new RegisterWiki(mem);
        System.out.println(AnimalsNames);
        Concept c = new Concept();
        c.setConceptClass(cc);
        c.setName(cc.getNameClass());
        c.setFoundInDB(false);

        assertEquals(c.getName(),reg.register(AnimalsNames,cc).getName());
    }

    @Test
    public void test269_Gopher(){
        String AnimalsNames = "Gopher";
        ConceptClass cc = new ConceptClass("animals");
        cc.setKeywords("Kingdom: Animalia");
        LongMemory mem = new LongMemory();
        RegisterWiki reg = new RegisterWiki(mem);
        System.out.println(AnimalsNames);
        Concept c = new Concept();
        c.setConceptClass(cc);
        c.setName(cc.getNameClass());
        c.setFoundInDB(false);

        assertEquals(c.getName(),reg.register(AnimalsNames,cc).getName());
    }

    @Test
    public void test270_Gorilla(){
        String AnimalsNames = "Gorilla";
        ConceptClass cc = new ConceptClass("animals");
        cc.setKeywords("Kingdom: Animalia");
        LongMemory mem = new LongMemory();
        RegisterWiki reg = new RegisterWiki(mem);
        System.out.println(AnimalsNames);
        Concept c = new Concept();
        c.setConceptClass(cc);
        c.setName(cc.getNameClass());
        c.setFoundInDB(false);

        assertEquals(c.getName(),reg.register(AnimalsNames,cc).getName());
    }

    @Test
    public void test271_Grasshopper(){
        String AnimalsNames = "Grasshopper";
        ConceptClass cc = new ConceptClass("animals");
        cc.setKeywords("Kingdom: Animalia");
        LongMemory mem = new LongMemory();
        RegisterWiki reg = new RegisterWiki(mem);
        System.out.println(AnimalsNames);
        Concept c = new Concept();
        c.setConceptClass(cc);
        c.setName(cc.getNameClass());
        c.setFoundInDB(false);

        assertEquals(c.getName(),reg.register(AnimalsNames,cc).getName());
    }

    @Test
    public void test272_GreatDane(){
        String AnimalsNames = "Great Dane";
        ConceptClass cc = new ConceptClass("animals");
        cc.setKeywords("Kingdom: Animalia");
        LongMemory mem = new LongMemory();
        RegisterWiki reg = new RegisterWiki(mem);
        System.out.println(AnimalsNames);
        Concept c = new Concept();
        c.setConceptClass(cc);
        c.setName(cc.getNameClass());
        c.setFoundInDB(false);

        assertEquals(c.getName(),reg.register(AnimalsNames,cc).getName());
    }

    @Test
    public void test273_GreatWhiteShark(){
        String AnimalsNames = "Great White Shark";
        ConceptClass cc = new ConceptClass("animals");
        cc.setKeywords("Kingdom: Animalia");
        LongMemory mem = new LongMemory();
        RegisterWiki reg = new RegisterWiki(mem);
        System.out.println(AnimalsNames);
        Concept c = new Concept();
        c.setConceptClass(cc);
        c.setName(cc.getNameClass());
        c.setFoundInDB(false);

        assertEquals(c.getName(),reg.register(AnimalsNames,cc).getName());
    }

    @Test
    public void test274_GreaterSwissMountainDog(){
        String AnimalsNames = "Greater Swiss Mountain Dog";
        ConceptClass cc = new ConceptClass("animals");
        cc.setKeywords("Kingdom: Animalia");
        LongMemory mem = new LongMemory();
        RegisterWiki reg = new RegisterWiki(mem);
        System.out.println(AnimalsNames);
        Concept c = new Concept();
        c.setConceptClass(cc);
        c.setName(cc.getNameClass());
        c.setFoundInDB(false);

        assertEquals(c.getName(),reg.register(AnimalsNames,cc).getName());
    }

    @Test
    public void test275_GreenBeeEater(){
        String AnimalsNames = "Green Bee-Eater";
        ConceptClass cc = new ConceptClass("animals");
        cc.setKeywords("Kingdom: Animalia");
        LongMemory mem = new LongMemory();
        RegisterWiki reg = new RegisterWiki(mem);
        System.out.println(AnimalsNames);
        Concept c = new Concept();
        c.setConceptClass(cc);
        c.setName(cc.getNameClass());
        c.setFoundInDB(false);

        assertEquals(c.getName(),reg.register(AnimalsNames,cc).getName());
    }

    @Test
    public void test276_GreenlandDog(){
        String AnimalsNames = "Greenland Dog";
        ConceptClass cc = new ConceptClass("animals");
        cc.setKeywords("Kingdom: Animalia");
        LongMemory mem = new LongMemory();
        RegisterWiki reg = new RegisterWiki(mem);
        System.out.println(AnimalsNames);
        Concept c = new Concept();
        c.setConceptClass(cc);
        c.setName(cc.getNameClass());
        c.setFoundInDB(false);

        assertEquals(c.getName(),reg.register(AnimalsNames,cc).getName());
    }

    @Test
    public void test277_GreyMouseLemur(){
        String AnimalsNames = "Grey Mouse Lemur";
        ConceptClass cc = new ConceptClass("animals");
        cc.setKeywords("Kingdom: Animalia");
        LongMemory mem = new LongMemory();
        RegisterWiki reg = new RegisterWiki(mem);
        System.out.println(AnimalsNames);
        Concept c = new Concept();
        c.setConceptClass(cc);
        c.setName(cc.getNameClass());
        c.setFoundInDB(false);

        assertEquals(c.getName(),reg.register(AnimalsNames,cc).getName());
    }

    @Test
    public void test278_GreyReefShark(){
        String AnimalsNames = "Grey Reef Shark";
        ConceptClass cc = new ConceptClass("animals");
        cc.setKeywords("Kingdom: Animalia");
        LongMemory mem = new LongMemory();
        RegisterWiki reg = new RegisterWiki(mem);
        System.out.println(AnimalsNames);
        Concept c = new Concept();
        c.setConceptClass(cc);
        c.setName(cc.getNameClass());
        c.setFoundInDB(false);

        assertEquals(c.getName(),reg.register(AnimalsNames,cc).getName());
    }

    @Test
    public void test279_GreySeal(){
        String AnimalsNames = "Grey Seal";
        ConceptClass cc = new ConceptClass("animals");
        cc.setKeywords("Kingdom: Animalia");
        LongMemory mem = new LongMemory();
        RegisterWiki reg = new RegisterWiki(mem);
        System.out.println(AnimalsNames);
        Concept c = new Concept();
        c.setConceptClass(cc);
        c.setName(cc.getNameClass());
        c.setFoundInDB(false);

        assertEquals(c.getName(),reg.register(AnimalsNames,cc).getName());
    }

    @Test
    public void test280_Greyhound(){
        String AnimalsNames = "Greyhound";
        ConceptClass cc = new ConceptClass("animals");
        cc.setKeywords("Kingdom: Animalia");
        LongMemory mem = new LongMemory();
        RegisterWiki reg = new RegisterWiki(mem);
        System.out.println(AnimalsNames);
        Concept c = new Concept();
        c.setConceptClass(cc);
        c.setName(cc.getNameClass());
        c.setFoundInDB(false);

        assertEquals(c.getName(),reg.register(AnimalsNames,cc).getName());
    }

    @Test
    public void test281_GrizzlyBear(){
        String AnimalsNames = "Grizzly Bear";
        ConceptClass cc = new ConceptClass("animals");
        cc.setKeywords("Kingdom: Animalia");
        LongMemory mem = new LongMemory();
        RegisterWiki reg = new RegisterWiki(mem);
        System.out.println(AnimalsNames);
        Concept c = new Concept();
        c.setConceptClass(cc);
        c.setName(cc.getNameClass());
        c.setFoundInDB(false);

        assertEquals(c.getName(),reg.register(AnimalsNames,cc).getName());
    }

    @Test
    public void test282_Grouse(){
        String AnimalsNames = "Grouse";
        ConceptClass cc = new ConceptClass("animals");
        cc.setKeywords("Kingdom: Animalia");
        LongMemory mem = new LongMemory();
        RegisterWiki reg = new RegisterWiki(mem);
        System.out.println(AnimalsNames);
        Concept c = new Concept();
        c.setConceptClass(cc);
        c.setName(cc.getNameClass());
        c.setFoundInDB(false);

        assertEquals(c.getName(),reg.register(AnimalsNames,cc).getName());
    }

    @Test
    public void test283_GuineaFowl(){
        String AnimalsNames = "Guinea Fowl";
        ConceptClass cc = new ConceptClass("animals");
        cc.setKeywords("Kingdom: Animalia");
        LongMemory mem = new LongMemory();
        RegisterWiki reg = new RegisterWiki(mem);
        System.out.println(AnimalsNames);
        Concept c = new Concept();
        c.setConceptClass(cc);
        c.setName(cc.getNameClass());
        c.setFoundInDB(false);

        assertEquals(c.getName(),reg.register(AnimalsNames,cc).getName());
    }

    @Test
    public void test284_GuineaPig(){
        String AnimalsNames = "Guinea Pig";
        ConceptClass cc = new ConceptClass("animals");
        cc.setKeywords("Kingdom: Animalia");
        LongMemory mem = new LongMemory();
        RegisterWiki reg = new RegisterWiki(mem);
        System.out.println(AnimalsNames);
        Concept c = new Concept();
        c.setConceptClass(cc);
        c.setName(cc.getNameClass());
        c.setFoundInDB(false);

        assertEquals(c.getName(),reg.register(AnimalsNames,cc).getName());
    }

    @Test
    public void test285_Guppy(){
        String AnimalsNames = "Guppy";
        ConceptClass cc = new ConceptClass("animals");
        cc.setKeywords("Kingdom: Animalia");
        LongMemory mem = new LongMemory();
        RegisterWiki reg = new RegisterWiki(mem);
        System.out.println(AnimalsNames);
        Concept c = new Concept();
        c.setConceptClass(cc);
        c.setName(cc.getNameClass());
        c.setFoundInDB(false);

        assertEquals(c.getName(),reg.register(AnimalsNames,cc).getName());
    }

    @Test
    public void test286_H(){
        String AnimalsNames = "H";
        ConceptClass cc = new ConceptClass("animals");
        cc.setKeywords("Kingdom: Animalia");
        LongMemory mem = new LongMemory();
        RegisterWiki reg = new RegisterWiki(mem);
        System.out.println(AnimalsNames);
        Concept c = new Concept();
        c.setConceptClass(cc);
        c.setName(cc.getNameClass());
        c.setFoundInDB(false);

        assertEquals(c.getName(),reg.register(AnimalsNames,cc).getName());
    }

    @Test
    public void test287_HammerheadShark(){
        String AnimalsNames = "Hammerhead Shark";
        ConceptClass cc = new ConceptClass("animals");
        cc.setKeywords("Kingdom: Animalia");
        LongMemory mem = new LongMemory();
        RegisterWiki reg = new RegisterWiki(mem);
        System.out.println(AnimalsNames);
        Concept c = new Concept();
        c.setConceptClass(cc);
        c.setName(cc.getNameClass());
        c.setFoundInDB(false);

        assertEquals(c.getName(),reg.register(AnimalsNames,cc).getName());
    }

    @Test
    public void test288_Hamster(){
        String AnimalsNames = "Hamster";
        ConceptClass cc = new ConceptClass("animals");
        cc.setKeywords("Kingdom: Animalia");
        LongMemory mem = new LongMemory();
        RegisterWiki reg = new RegisterWiki(mem);
        System.out.println(AnimalsNames);
        Concept c = new Concept();
        c.setConceptClass(cc);
        c.setName(cc.getNameClass());
        c.setFoundInDB(false);

        assertEquals(c.getName(),reg.register(AnimalsNames,cc).getName());
    }

    @Test
    public void test289_Hare(){
        String AnimalsNames = "Hare";
        ConceptClass cc = new ConceptClass("animals");
        cc.setKeywords("Kingdom: Animalia");
        LongMemory mem = new LongMemory();
        RegisterWiki reg = new RegisterWiki(mem);
        System.out.println(AnimalsNames);
        Concept c = new Concept();
        c.setConceptClass(cc);
        c.setName(cc.getNameClass());
        c.setFoundInDB(false);

        assertEquals(c.getName(),reg.register(AnimalsNames,cc).getName());
    }

    @Test
    public void test290_Harrier(){
        String AnimalsNames = "Harrier";
        ConceptClass cc = new ConceptClass("animals");
        cc.setKeywords("Kingdom: Animalia");
        LongMemory mem = new LongMemory();
        RegisterWiki reg = new RegisterWiki(mem);
        System.out.println(AnimalsNames);
        Concept c = new Concept();
        c.setConceptClass(cc);
        c.setName(cc.getNameClass());
        c.setFoundInDB(false);

        assertEquals(c.getName(),reg.register(AnimalsNames,cc).getName());
    }

    @Test
    public void test291_Havanese(){
        String AnimalsNames = "Havanese";
        ConceptClass cc = new ConceptClass("animals");
        cc.setKeywords("Kingdom: Animalia");
        LongMemory mem = new LongMemory();
        RegisterWiki reg = new RegisterWiki(mem);
        System.out.println(AnimalsNames);
        Concept c = new Concept();
        c.setConceptClass(cc);
        c.setName(cc.getNameClass());
        c.setFoundInDB(false);

        assertEquals(c.getName(),reg.register(AnimalsNames,cc).getName());
    }

    @Test
    public void test292_Hedgehog(){
        String AnimalsNames = "Hedgehog";
        ConceptClass cc = new ConceptClass("animals");
        cc.setKeywords("Kingdom: Animalia");
        LongMemory mem = new LongMemory();
        RegisterWiki reg = new RegisterWiki(mem);
        System.out.println(AnimalsNames);
        Concept c = new Concept();
        c.setConceptClass(cc);
        c.setName(cc.getNameClass());
        c.setFoundInDB(false);

        assertEquals(c.getName(),reg.register(AnimalsNames,cc).getName());
    }

    @Test
    public void test293_HerculesBeetle(){
        String AnimalsNames = "Hercules Beetle";
        ConceptClass cc = new ConceptClass("animals");
        cc.setKeywords("Kingdom: Animalia");
        LongMemory mem = new LongMemory();
        RegisterWiki reg = new RegisterWiki(mem);
        System.out.println(AnimalsNames);
        Concept c = new Concept();
        c.setConceptClass(cc);
        c.setName(cc.getNameClass());
        c.setFoundInDB(false);

        assertEquals(c.getName(),reg.register(AnimalsNames,cc).getName());
    }

    @Test
    public void test294_HermitCrab(){
        String AnimalsNames = "Hermit Crab";
        ConceptClass cc = new ConceptClass("animals");
        cc.setKeywords("Kingdom: Animalia");
        LongMemory mem = new LongMemory();
        RegisterWiki reg = new RegisterWiki(mem);
        System.out.println(AnimalsNames);
        Concept c = new Concept();
        c.setConceptClass(cc);
        c.setName(cc.getNameClass());
        c.setFoundInDB(false);

        assertEquals(c.getName(),reg.register(AnimalsNames,cc).getName());
    }

    @Test
    public void test295_Heron(){
        String AnimalsNames = "Heron";
        ConceptClass cc = new ConceptClass("animals");
        cc.setKeywords("Kingdom: Animalia");
        LongMemory mem = new LongMemory();
        RegisterWiki reg = new RegisterWiki(mem);
        System.out.println(AnimalsNames);
        Concept c = new Concept();
        c.setConceptClass(cc);
        c.setName(cc.getNameClass());
        c.setFoundInDB(false);

        assertEquals(c.getName(),reg.register(AnimalsNames,cc).getName());
    }

    @Test
    public void test296_HighlandCattle(){
        String AnimalsNames = "Highland Cattle";
        ConceptClass cc = new ConceptClass("animals");
        cc.setKeywords("Kingdom: Animalia");
        LongMemory mem = new LongMemory();
        RegisterWiki reg = new RegisterWiki(mem);
        System.out.println(AnimalsNames);
        Concept c = new Concept();
        c.setConceptClass(cc);
        c.setName(cc.getNameClass());
        c.setFoundInDB(false);

        assertEquals(c.getName(),reg.register(AnimalsNames,cc).getName());
    }

    @Test
    public void test297_Himalayan(){
        String AnimalsNames = "Himalayan";
        ConceptClass cc = new ConceptClass("animals");
        cc.setKeywords("Kingdom: Animalia");
        LongMemory mem = new LongMemory();
        RegisterWiki reg = new RegisterWiki(mem);
        System.out.println(AnimalsNames);
        Concept c = new Concept();
        c.setConceptClass(cc);
        c.setName(cc.getNameClass());
        c.setFoundInDB(false);

        assertEquals(c.getName(),reg.register(AnimalsNames,cc).getName());
    }

    @Test
    public void test298_Hippopotamus(){
        String AnimalsNames = "Hippopotamus";
        ConceptClass cc = new ConceptClass("animals");
        cc.setKeywords("Kingdom: Animalia");
        LongMemory mem = new LongMemory();
        RegisterWiki reg = new RegisterWiki(mem);
        System.out.println(AnimalsNames);
        Concept c = new Concept();
        c.setConceptClass(cc);
        c.setName(cc.getNameClass());
        c.setFoundInDB(false);

        assertEquals(c.getName(),reg.register(AnimalsNames,cc).getName());
    }

    @Test
    public void test299_HoneyBee(){
        String AnimalsNames = "Honey Bee";
        ConceptClass cc = new ConceptClass("animals");
        cc.setKeywords("Kingdom: Animalia");
        LongMemory mem = new LongMemory();
        RegisterWiki reg = new RegisterWiki(mem);
        System.out.println(AnimalsNames);
        Concept c = new Concept();
        c.setConceptClass(cc);
        c.setName(cc.getNameClass());
        c.setFoundInDB(false);

        assertEquals(c.getName(),reg.register(AnimalsNames,cc).getName());
    }

    @Test
    public void test300_HornShark(){
        String AnimalsNames = "Horn Shark";
        ConceptClass cc = new ConceptClass("animals");
        cc.setKeywords("Kingdom: Animalia");
        LongMemory mem = new LongMemory();
        RegisterWiki reg = new RegisterWiki(mem);
        System.out.println(AnimalsNames);
        Concept c = new Concept();
        c.setConceptClass(cc);
        c.setName(cc.getNameClass());
        c.setFoundInDB(false);

        assertEquals(c.getName(),reg.register(AnimalsNames,cc).getName());
    }

    @Test
    public void test301_HornedFrog(){
        String AnimalsNames = "Horned Frog";
        ConceptClass cc = new ConceptClass("animals");
        cc.setKeywords("Kingdom: Animalia");
        LongMemory mem = new LongMemory();
        RegisterWiki reg = new RegisterWiki(mem);
        System.out.println(AnimalsNames);
        Concept c = new Concept();
        c.setConceptClass(cc);
        c.setName(cc.getNameClass());
        c.setFoundInDB(false);

        assertEquals(c.getName(),reg.register(AnimalsNames,cc).getName());
    }

    @Test
    public void test302_Horse(){
        String AnimalsNames = "Horse";
        ConceptClass cc = new ConceptClass("animals");
        cc.setKeywords("Kingdom: Animalia");
        LongMemory mem = new LongMemory();
        RegisterWiki reg = new RegisterWiki(mem);
        System.out.println(AnimalsNames);
        Concept c = new Concept();
        c.setConceptClass(cc);
        c.setName(cc.getNameClass());
        c.setFoundInDB(false);

        assertEquals(c.getName(),reg.register(AnimalsNames,cc).getName());
    }

    @Test
    public void test303_HorseshoeCrab(){
        String AnimalsNames = "Horseshoe Crab";
        ConceptClass cc = new ConceptClass("animals");
        cc.setKeywords("Kingdom: Animalia");
        LongMemory mem = new LongMemory();
        RegisterWiki reg = new RegisterWiki(mem);
        System.out.println(AnimalsNames);
        Concept c = new Concept();
        c.setConceptClass(cc);
        c.setName(cc.getNameClass());
        c.setFoundInDB(false);

        assertEquals(c.getName(),reg.register(AnimalsNames,cc).getName());
    }

    @Test
    public void test304_HowlerMonkey(){
        String AnimalsNames = "Howler Monkey";
        ConceptClass cc = new ConceptClass("animals");
        cc.setKeywords("Kingdom: Animalia");
        LongMemory mem = new LongMemory();
        RegisterWiki reg = new RegisterWiki(mem);
        System.out.println(AnimalsNames);
        Concept c = new Concept();
        c.setConceptClass(cc);
        c.setName(cc.getNameClass());
        c.setFoundInDB(false);

        assertEquals(c.getName(),reg.register(AnimalsNames,cc).getName());
    }

    @Test
    public void test305_Human(){
        String AnimalsNames = "Human";
        ConceptClass cc = new ConceptClass("animals");
        cc.setKeywords("Kingdom: Animalia");
        LongMemory mem = new LongMemory();
        RegisterWiki reg = new RegisterWiki(mem);
        System.out.println(AnimalsNames);
        Concept c = new Concept();
        c.setConceptClass(cc);
        c.setName(cc.getNameClass());
        c.setFoundInDB(false);

        assertEquals(c.getName(),reg.register(AnimalsNames,cc).getName());
    }

    @Test
    public void test306_HumboldtPenguin(){
        String AnimalsNames = "Humboldt Penguin";
        ConceptClass cc = new ConceptClass("animals");
        cc.setKeywords("Kingdom: Animalia");
        LongMemory mem = new LongMemory();
        RegisterWiki reg = new RegisterWiki(mem);
        System.out.println(AnimalsNames);
        Concept c = new Concept();
        c.setConceptClass(cc);
        c.setName(cc.getNameClass());
        c.setFoundInDB(false);

        assertEquals(c.getName(),reg.register(AnimalsNames,cc).getName());
    }

    @Test
    public void test307_Hummingbird(){
        String AnimalsNames = "Hummingbird";
        ConceptClass cc = new ConceptClass("animals");
        cc.setKeywords("Kingdom: Animalia");
        LongMemory mem = new LongMemory();
        RegisterWiki reg = new RegisterWiki(mem);
        System.out.println(AnimalsNames);
        Concept c = new Concept();
        c.setConceptClass(cc);
        c.setName(cc.getNameClass());
        c.setFoundInDB(false);

        assertEquals(c.getName(),reg.register(AnimalsNames,cc).getName());
    }

    @Test
    public void test308_HumpbackWhale(){
        String AnimalsNames = "Humpback Whale";
        ConceptClass cc = new ConceptClass("animals");
        cc.setKeywords("Kingdom: Animalia");
        LongMemory mem = new LongMemory();
        RegisterWiki reg = new RegisterWiki(mem);
        System.out.println(AnimalsNames);
        Concept c = new Concept();
        c.setConceptClass(cc);
        c.setName(cc.getNameClass());
        c.setFoundInDB(false);

        assertEquals(c.getName(),reg.register(AnimalsNames,cc).getName());
    }

    @Test
    public void test309_Hyena(){
        String AnimalsNames = "Hyena";
        ConceptClass cc = new ConceptClass("animals");
        cc.setKeywords("Kingdom: Animalia");
        LongMemory mem = new LongMemory();
        RegisterWiki reg = new RegisterWiki(mem);
        System.out.println(AnimalsNames);
        Concept c = new Concept();
        c.setConceptClass(cc);
        c.setName(cc.getNameClass());
        c.setFoundInDB(false);

        assertEquals(c.getName(),reg.register(AnimalsNames,cc).getName());
    }

    @Test
    public void test310_I(){
        String AnimalsNames = "I";
        ConceptClass cc = new ConceptClass("animals");
        cc.setKeywords("Kingdom: Animalia");
        LongMemory mem = new LongMemory();
        RegisterWiki reg = new RegisterWiki(mem);
        System.out.println(AnimalsNames);
        Concept c = new Concept();
        c.setConceptClass(cc);
        c.setName(cc.getNameClass());
        c.setFoundInDB(false);

        assertEquals(c.getName(),reg.register(AnimalsNames,cc).getName());
    }

    @Test
    public void test311_Ibis(){
        String AnimalsNames = "Ibis";
        ConceptClass cc = new ConceptClass("animals");
        cc.setKeywords("Kingdom: Animalia");
        LongMemory mem = new LongMemory();
        RegisterWiki reg = new RegisterWiki(mem);
        System.out.println(AnimalsNames);
        Concept c = new Concept();
        c.setConceptClass(cc);
        c.setName(cc.getNameClass());
        c.setFoundInDB(false);

        assertEquals(c.getName(),reg.register(AnimalsNames,cc).getName());
    }

    @Test
    public void test312_IbizanHound(){
        String AnimalsNames = "Ibizan Hound";
        ConceptClass cc = new ConceptClass("animals");
        cc.setKeywords("Kingdom: Animalia");
        LongMemory mem = new LongMemory();
        RegisterWiki reg = new RegisterWiki(mem);
        System.out.println(AnimalsNames);
        Concept c = new Concept();
        c.setConceptClass(cc);
        c.setName(cc.getNameClass());
        c.setFoundInDB(false);

        assertEquals(c.getName(),reg.register(AnimalsNames,cc).getName());
    }

    @Test
    public void test313_Iguana(){
        String AnimalsNames = "Iguana";
        ConceptClass cc = new ConceptClass("animals");
        cc.setKeywords("Kingdom: Animalia");
        LongMemory mem = new LongMemory();
        RegisterWiki reg = new RegisterWiki(mem);
        System.out.println(AnimalsNames);
        Concept c = new Concept();
        c.setConceptClass(cc);
        c.setName(cc.getNameClass());
        c.setFoundInDB(false);

        assertEquals(c.getName(),reg.register(AnimalsNames,cc).getName());
    }

    @Test
    public void test314_Impala(){
        String AnimalsNames = "Impala";
        ConceptClass cc = new ConceptClass("animals");
        cc.setKeywords("Kingdom: Animalia");
        LongMemory mem = new LongMemory();
        RegisterWiki reg = new RegisterWiki(mem);
        System.out.println(AnimalsNames);
        Concept c = new Concept();
        c.setConceptClass(cc);
        c.setName(cc.getNameClass());
        c.setFoundInDB(false);

        assertEquals(c.getName(),reg.register(AnimalsNames,cc).getName());
    }

    @Test
    public void test315_IndianElephant(){
        String AnimalsNames = "Indian Elephant";
        ConceptClass cc = new ConceptClass("animals");
        cc.setKeywords("Kingdom: Animalia");
        LongMemory mem = new LongMemory();
        RegisterWiki reg = new RegisterWiki(mem);
        System.out.println(AnimalsNames);
        Concept c = new Concept();
        c.setConceptClass(cc);
        c.setName(cc.getNameClass());
        c.setFoundInDB(false);

        assertEquals(c.getName(),reg.register(AnimalsNames,cc).getName());
    }

    @Test
    public void test316_IndianPalmSquirrel(){
        String AnimalsNames = "Indian Palm Squirrel";
        ConceptClass cc = new ConceptClass("animals");
        cc.setKeywords("Kingdom: Animalia");
        LongMemory mem = new LongMemory();
        RegisterWiki reg = new RegisterWiki(mem);
        System.out.println(AnimalsNames);
        Concept c = new Concept();
        c.setConceptClass(cc);
        c.setName(cc.getNameClass());
        c.setFoundInDB(false);

        assertEquals(c.getName(),reg.register(AnimalsNames,cc).getName());
    }

    @Test
    public void test317_IndianRhinoceros(){
        String AnimalsNames = "Indian Rhinoceros";
        ConceptClass cc = new ConceptClass("animals");
        cc.setKeywords("Kingdom: Animalia");
        LongMemory mem = new LongMemory();
        RegisterWiki reg = new RegisterWiki(mem);
        System.out.println(AnimalsNames);
        Concept c = new Concept();
        c.setConceptClass(cc);
        c.setName(cc.getNameClass());
        c.setFoundInDB(false);

        assertEquals(c.getName(),reg.register(AnimalsNames,cc).getName());
    }

    @Test
    public void test318_IndianStarTortoise(){
        String AnimalsNames = "Indian Star Tortoise";
        ConceptClass cc = new ConceptClass("animals");
        cc.setKeywords("Kingdom: Animalia");
        LongMemory mem = new LongMemory();
        RegisterWiki reg = new RegisterWiki(mem);
        System.out.println(AnimalsNames);
        Concept c = new Concept();
        c.setConceptClass(cc);
        c.setName(cc.getNameClass());
        c.setFoundInDB(false);

        assertEquals(c.getName(),reg.register(AnimalsNames,cc).getName());
    }

    @Test
    public void test319_IndochineseTiger(){
        String AnimalsNames = "Indochinese Tiger";
        ConceptClass cc = new ConceptClass("animals");
        cc.setKeywords("Kingdom: Animalia");
        LongMemory mem = new LongMemory();
        RegisterWiki reg = new RegisterWiki(mem);
        System.out.println(AnimalsNames);
        Concept c = new Concept();
        c.setConceptClass(cc);
        c.setName(cc.getNameClass());
        c.setFoundInDB(false);

        assertEquals(c.getName(),reg.register(AnimalsNames,cc).getName());
    }

    @Test
    public void test320_Indri(){
        String AnimalsNames = "Indri";
        ConceptClass cc = new ConceptClass("animals");
        cc.setKeywords("Kingdom: Animalia");
        LongMemory mem = new LongMemory();
        RegisterWiki reg = new RegisterWiki(mem);
        System.out.println(AnimalsNames);
        Concept c = new Concept();
        c.setConceptClass(cc);
        c.setName(cc.getNameClass());
        c.setFoundInDB(false);

        assertEquals(c.getName(),reg.register(AnimalsNames,cc).getName());
    }

    @Test
    public void test321_Insect(){
        String AnimalsNames = "Insect";
        ConceptClass cc = new ConceptClass("animals");
        cc.setKeywords("Kingdom: Animalia");
        LongMemory mem = new LongMemory();
        RegisterWiki reg = new RegisterWiki(mem);
        System.out.println(AnimalsNames);
        Concept c = new Concept();
        c.setConceptClass(cc);
        c.setName(cc.getNameClass());
        c.setFoundInDB(false);

        assertEquals(c.getName(),reg.register(AnimalsNames,cc).getName());
    }

    @Test
    public void test322_IrishSetter(){
        String AnimalsNames = "Irish Setter";
        ConceptClass cc = new ConceptClass("animals");
        cc.setKeywords("Kingdom: Animalia");
        LongMemory mem = new LongMemory();
        RegisterWiki reg = new RegisterWiki(mem);
        System.out.println(AnimalsNames);
        Concept c = new Concept();
        c.setConceptClass(cc);
        c.setName(cc.getNameClass());
        c.setFoundInDB(false);

        assertEquals(c.getName(),reg.register(AnimalsNames,cc).getName());
    }

    @Test
    public void test323_IrishWolfHound(){
        String AnimalsNames = "Irish WolfHound";
        ConceptClass cc = new ConceptClass("animals");
        cc.setKeywords("Kingdom: Animalia");
        LongMemory mem = new LongMemory();
        RegisterWiki reg = new RegisterWiki(mem);
        System.out.println(AnimalsNames);
        Concept c = new Concept();
        c.setConceptClass(cc);
        c.setName(cc.getNameClass());
        c.setFoundInDB(false);

        assertEquals(c.getName(),reg.register(AnimalsNames,cc).getName());
    }

    @Test
    public void test324_J(){
        String AnimalsNames = "J";
        ConceptClass cc = new ConceptClass("animals");
        cc.setKeywords("Kingdom: Animalia");
        LongMemory mem = new LongMemory();
        RegisterWiki reg = new RegisterWiki(mem);
        System.out.println(AnimalsNames);
        Concept c = new Concept();
        c.setConceptClass(cc);
        c.setName(cc.getNameClass());
        c.setFoundInDB(false);

        assertEquals(c.getName(),reg.register(AnimalsNames,cc).getName());
    }

    @Test
    public void test325_JackRussel(){
        String AnimalsNames = "Jack Russel";
        ConceptClass cc = new ConceptClass("animals");
        cc.setKeywords("Kingdom: Animalia");
        LongMemory mem = new LongMemory();
        RegisterWiki reg = new RegisterWiki(mem);
        System.out.println(AnimalsNames);
        Concept c = new Concept();
        c.setConceptClass(cc);
        c.setName(cc.getNameClass());
        c.setFoundInDB(false);

        assertEquals(c.getName(),reg.register(AnimalsNames,cc).getName());
    }

    @Test
    public void test326_Jackal(){
        String AnimalsNames = "Jackal";
        ConceptClass cc = new ConceptClass("animals");
        cc.setKeywords("Kingdom: Animalia");
        LongMemory mem = new LongMemory();
        RegisterWiki reg = new RegisterWiki(mem);
        System.out.println(AnimalsNames);
        Concept c = new Concept();
        c.setConceptClass(cc);
        c.setName(cc.getNameClass());
        c.setFoundInDB(false);

        assertEquals(c.getName(),reg.register(AnimalsNames,cc).getName());
    }

    @Test
    public void test327_Jaguar(){
        String AnimalsNames = "Jaguar";
        ConceptClass cc = new ConceptClass("animals");
        cc.setKeywords("Kingdom: Animalia");
        LongMemory mem = new LongMemory();
        RegisterWiki reg = new RegisterWiki(mem);
        System.out.println(AnimalsNames);
        Concept c = new Concept();
        c.setConceptClass(cc);
        c.setName(cc.getNameClass());
        c.setFoundInDB(false);

        assertEquals(c.getName(),reg.register(AnimalsNames,cc).getName());
    }

    @Test
    public void test328_JapaneseChin(){
        String AnimalsNames = "Japanese Chin";
        ConceptClass cc = new ConceptClass("animals");
        cc.setKeywords("Kingdom: Animalia");
        LongMemory mem = new LongMemory();
        RegisterWiki reg = new RegisterWiki(mem);
        System.out.println(AnimalsNames);
        Concept c = new Concept();
        c.setConceptClass(cc);
        c.setName(cc.getNameClass());
        c.setFoundInDB(false);

        assertEquals(c.getName(),reg.register(AnimalsNames,cc).getName());
    }

    @Test
    public void test329_JapaneseMacaque(){
        String AnimalsNames = "Japanese Macaque";
        ConceptClass cc = new ConceptClass("animals");
        cc.setKeywords("Kingdom: Animalia");
        LongMemory mem = new LongMemory();
        RegisterWiki reg = new RegisterWiki(mem);
        System.out.println(AnimalsNames);
        Concept c = new Concept();
        c.setConceptClass(cc);
        c.setName(cc.getNameClass());
        c.setFoundInDB(false);

        assertEquals(c.getName(),reg.register(AnimalsNames,cc).getName());
    }

    @Test
    public void test330_JavanRhinoceros(){
        String AnimalsNames = "Javan Rhinoceros";
        ConceptClass cc = new ConceptClass("animals");
        cc.setKeywords("Kingdom: Animalia");
        LongMemory mem = new LongMemory();
        RegisterWiki reg = new RegisterWiki(mem);
        System.out.println(AnimalsNames);
        Concept c = new Concept();
        c.setConceptClass(cc);
        c.setName(cc.getNameClass());
        c.setFoundInDB(false);

        assertEquals(c.getName(),reg.register(AnimalsNames,cc).getName());
    }

    @Test
    public void test331_Javanese(){
        String AnimalsNames = "Javanese";
        ConceptClass cc = new ConceptClass("animals");
        cc.setKeywords("Kingdom: Animalia");
        LongMemory mem = new LongMemory();
        RegisterWiki reg = new RegisterWiki(mem);
        System.out.println(AnimalsNames);
        Concept c = new Concept();
        c.setConceptClass(cc);
        c.setName(cc.getNameClass());
        c.setFoundInDB(false);

        assertEquals(c.getName(),reg.register(AnimalsNames,cc).getName());
    }

    @Test
    public void test332_Jellyfish(){
        String AnimalsNames = "Jellyfish";
        ConceptClass cc = new ConceptClass("animals");
        cc.setKeywords("Kingdom: Animalia");
        LongMemory mem = new LongMemory();
        RegisterWiki reg = new RegisterWiki(mem);
        System.out.println(AnimalsNames);
        Concept c = new Concept();
        c.setConceptClass(cc);
        c.setName(cc.getNameClass());
        c.setFoundInDB(false);

        assertEquals(c.getName(),reg.register(AnimalsNames,cc).getName());
    }

    @Test
    public void test333_K(){
        String AnimalsNames = "K";
        ConceptClass cc = new ConceptClass("animals");
        cc.setKeywords("Kingdom: Animalia");
        LongMemory mem = new LongMemory();
        RegisterWiki reg = new RegisterWiki(mem);
        System.out.println(AnimalsNames);
        Concept c = new Concept();
        c.setConceptClass(cc);
        c.setName(cc.getNameClass());
        c.setFoundInDB(false);

        assertEquals(c.getName(),reg.register(AnimalsNames,cc).getName());
    }

    @Test
    public void test334_Kakapo(){
        String AnimalsNames = "Kakapo";
        ConceptClass cc = new ConceptClass("animals");
        cc.setKeywords("Kingdom: Animalia");
        LongMemory mem = new LongMemory();
        RegisterWiki reg = new RegisterWiki(mem);
        System.out.println(AnimalsNames);
        Concept c = new Concept();
        c.setConceptClass(cc);
        c.setName(cc.getNameClass());
        c.setFoundInDB(false);

        assertEquals(c.getName(),reg.register(AnimalsNames,cc).getName());
    }

    @Test
    public void test335_Kangaroo(){
        String AnimalsNames = "Kangaroo";
        ConceptClass cc = new ConceptClass("animals");
        cc.setKeywords("Kingdom: Animalia");
        LongMemory mem = new LongMemory();
        RegisterWiki reg = new RegisterWiki(mem);
        System.out.println(AnimalsNames);
        Concept c = new Concept();
        c.setConceptClass(cc);
        c.setName(cc.getNameClass());
        c.setFoundInDB(false);

        assertEquals(c.getName(),reg.register(AnimalsNames,cc).getName());
    }

    @Test
    public void test336_KeelBilledToucan(){
        String AnimalsNames = "Keel Billed Toucan";
        ConceptClass cc = new ConceptClass("animals");
        cc.setKeywords("Kingdom: Animalia");
        LongMemory mem = new LongMemory();
        RegisterWiki reg = new RegisterWiki(mem);
        System.out.println(AnimalsNames);
        Concept c = new Concept();
        c.setConceptClass(cc);
        c.setName(cc.getNameClass());
        c.setFoundInDB(false);

        assertEquals(c.getName(),reg.register(AnimalsNames,cc).getName());
    }

    @Test
    public void test337_KillerWhale(){
        String AnimalsNames = "Killer Whale";
        ConceptClass cc = new ConceptClass("animals");
        cc.setKeywords("Kingdom: Animalia");
        LongMemory mem = new LongMemory();
        RegisterWiki reg = new RegisterWiki(mem);
        System.out.println(AnimalsNames);
        Concept c = new Concept();
        c.setConceptClass(cc);
        c.setName(cc.getNameClass());
        c.setFoundInDB(false);

        assertEquals(c.getName(),reg.register(AnimalsNames,cc).getName());
    }

    @Test
    public void test338_KingCrab(){
        String AnimalsNames = "King Crab";
        ConceptClass cc = new ConceptClass("animals");
        cc.setKeywords("Kingdom: Animalia");
        LongMemory mem = new LongMemory();
        RegisterWiki reg = new RegisterWiki(mem);
        System.out.println(AnimalsNames);
        Concept c = new Concept();
        c.setConceptClass(cc);
        c.setName(cc.getNameClass());
        c.setFoundInDB(false);

        assertEquals(c.getName(),reg.register(AnimalsNames,cc).getName());
    }

    @Test
    public void test339_KingPenguin(){
        String AnimalsNames = "King Penguin";
        ConceptClass cc = new ConceptClass("animals");
        cc.setKeywords("Kingdom: Animalia");
        LongMemory mem = new LongMemory();
        RegisterWiki reg = new RegisterWiki(mem);
        System.out.println(AnimalsNames);
        Concept c = new Concept();
        c.setConceptClass(cc);
        c.setName(cc.getNameClass());
        c.setFoundInDB(false);

        assertEquals(c.getName(),reg.register(AnimalsNames,cc).getName());
    }

    @Test
    public void test340_Kingfisher(){
        String AnimalsNames = "Kingfisher";
        ConceptClass cc = new ConceptClass("animals");
        cc.setKeywords("Kingdom: Animalia");
        LongMemory mem = new LongMemory();
        RegisterWiki reg = new RegisterWiki(mem);
        System.out.println(AnimalsNames);
        Concept c = new Concept();
        c.setConceptClass(cc);
        c.setName(cc.getNameClass());
        c.setFoundInDB(false);

        assertEquals(c.getName(),reg.register(AnimalsNames,cc).getName());
    }

    @Test
    public void test341_Kiwi(){
        String AnimalsNames = "Kiwi";
        ConceptClass cc = new ConceptClass("animals");
        cc.setKeywords("Kingdom: Animalia");
        LongMemory mem = new LongMemory();
        RegisterWiki reg = new RegisterWiki(mem);
        System.out.println(AnimalsNames);
        Concept c = new Concept();
        c.setConceptClass(cc);
        c.setName(cc.getNameClass());
        c.setFoundInDB(false);

        assertEquals(c.getName(),reg.register(AnimalsNames,cc).getName());
    }

    @Test
    public void test342_Koala(){
        String AnimalsNames = "Koala";
        ConceptClass cc = new ConceptClass("animals");
        cc.setKeywords("Kingdom: Animalia");
        LongMemory mem = new LongMemory();
        RegisterWiki reg = new RegisterWiki(mem);
        System.out.println(AnimalsNames);
        Concept c = new Concept();
        c.setConceptClass(cc);
        c.setName(cc.getNameClass());
        c.setFoundInDB(false);

        assertEquals(c.getName(),reg.register(AnimalsNames,cc).getName());
    }

    @Test
    public void test343_KomodoDragon(){
        String AnimalsNames = "Komodo Dragon";
        ConceptClass cc = new ConceptClass("animals");
        cc.setKeywords("Kingdom: Animalia");
        LongMemory mem = new LongMemory();
        RegisterWiki reg = new RegisterWiki(mem);
        System.out.println(AnimalsNames);
        Concept c = new Concept();
        c.setConceptClass(cc);
        c.setName(cc.getNameClass());
        c.setFoundInDB(false);

        assertEquals(c.getName(),reg.register(AnimalsNames,cc).getName());
    }

    @Test
    public void test344_Kudu(){
        String AnimalsNames = "Kudu";
        ConceptClass cc = new ConceptClass("animals");
        cc.setKeywords("Kingdom: Animalia");
        LongMemory mem = new LongMemory();
        RegisterWiki reg = new RegisterWiki(mem);
        System.out.println(AnimalsNames);
        Concept c = new Concept();
        c.setConceptClass(cc);
        c.setName(cc.getNameClass());
        c.setFoundInDB(false);

        assertEquals(c.getName(),reg.register(AnimalsNames,cc).getName());
    }

    @Test
    public void test345_L(){
        String AnimalsNames = "L";
        ConceptClass cc = new ConceptClass("animals");
        cc.setKeywords("Kingdom: Animalia");
        LongMemory mem = new LongMemory();
        RegisterWiki reg = new RegisterWiki(mem);
        System.out.println(AnimalsNames);
        Concept c = new Concept();
        c.setConceptClass(cc);
        c.setName(cc.getNameClass());
        c.setFoundInDB(false);

        assertEquals(c.getName(),reg.register(AnimalsNames,cc).getName());
    }

    @Test
    public void test346_Labradoodle(){
        String AnimalsNames = "Labradoodle";
        ConceptClass cc = new ConceptClass("animals");
        cc.setKeywords("Kingdom: Animalia");
        LongMemory mem = new LongMemory();
        RegisterWiki reg = new RegisterWiki(mem);
        System.out.println(AnimalsNames);
        Concept c = new Concept();
        c.setConceptClass(cc);
        c.setName(cc.getNameClass());
        c.setFoundInDB(false);

        assertEquals(c.getName(),reg.register(AnimalsNames,cc).getName());
    }

    @Test
    public void test347_LabradorRetriever(){
        String AnimalsNames = "Labrador Retriever";
        ConceptClass cc = new ConceptClass("animals");
        cc.setKeywords("Kingdom: Animalia");
        LongMemory mem = new LongMemory();
        RegisterWiki reg = new RegisterWiki(mem);
        System.out.println(AnimalsNames);
        Concept c = new Concept();
        c.setConceptClass(cc);
        c.setName(cc.getNameClass());
        c.setFoundInDB(false);

        assertEquals(c.getName(),reg.register(AnimalsNames,cc).getName());
    }

    @Test
    public void test348_Ladybird(){
        String AnimalsNames = "Ladybird";
        ConceptClass cc = new ConceptClass("animals");
        cc.setKeywords("Kingdom: Animalia");
        LongMemory mem = new LongMemory();
        RegisterWiki reg = new RegisterWiki(mem);
        System.out.println(AnimalsNames);
        Concept c = new Concept();
        c.setConceptClass(cc);
        c.setName(cc.getNameClass());
        c.setFoundInDB(false);

        assertEquals(c.getName(),reg.register(AnimalsNames,cc).getName());
    }

    @Test
    public void test349_LeafTailedGecko(){
        String AnimalsNames = "Leaf-Tailed Gecko";
        ConceptClass cc = new ConceptClass("animals");
        cc.setKeywords("Kingdom: Animalia");
        LongMemory mem = new LongMemory();
        RegisterWiki reg = new RegisterWiki(mem);
        System.out.println(AnimalsNames);
        Concept c = new Concept();
        c.setConceptClass(cc);
        c.setName(cc.getNameClass());
        c.setFoundInDB(false);

        assertEquals(c.getName(),reg.register(AnimalsNames,cc).getName());
    }

    @Test
    public void test350_Lemming(){
        String AnimalsNames = "Lemming";
        ConceptClass cc = new ConceptClass("animals");
        cc.setKeywords("Kingdom: Animalia");
        LongMemory mem = new LongMemory();
        RegisterWiki reg = new RegisterWiki(mem);
        System.out.println(AnimalsNames);
        Concept c = new Concept();
        c.setConceptClass(cc);
        c.setName(cc.getNameClass());
        c.setFoundInDB(false);

        assertEquals(c.getName(),reg.register(AnimalsNames,cc).getName());
    }

    @Test
    public void test351_Lemur(){
        String AnimalsNames = "Lemur";
        ConceptClass cc = new ConceptClass("animals");
        cc.setKeywords("Kingdom: Animalia");
        LongMemory mem = new LongMemory();
        RegisterWiki reg = new RegisterWiki(mem);
        System.out.println(AnimalsNames);
        Concept c = new Concept();
        c.setConceptClass(cc);
        c.setName(cc.getNameClass());
        c.setFoundInDB(false);

        assertEquals(c.getName(),reg.register(AnimalsNames,cc).getName());
    }

    @Test
    public void test352_Leopard(){
        String AnimalsNames = "Leopard";
        ConceptClass cc = new ConceptClass("animals");
        cc.setKeywords("Kingdom: Animalia");
        LongMemory mem = new LongMemory();
        RegisterWiki reg = new RegisterWiki(mem);
        System.out.println(AnimalsNames);
        Concept c = new Concept();
        c.setConceptClass(cc);
        c.setName(cc.getNameClass());
        c.setFoundInDB(false);

        assertEquals(c.getName(),reg.register(AnimalsNames,cc).getName());
    }

    @Test
    public void test353_LeopardCat(){
        String AnimalsNames = "Leopard Cat";
        ConceptClass cc = new ConceptClass("animals");
        cc.setKeywords("Kingdom: Animalia");
        LongMemory mem = new LongMemory();
        RegisterWiki reg = new RegisterWiki(mem);
        System.out.println(AnimalsNames);
        Concept c = new Concept();
        c.setConceptClass(cc);
        c.setName(cc.getNameClass());
        c.setFoundInDB(false);

        assertEquals(c.getName(),reg.register(AnimalsNames,cc).getName());
    }

    @Test
    public void test354_LeopardSeal(){
        String AnimalsNames = "Leopard Seal";
        ConceptClass cc = new ConceptClass("animals");
        cc.setKeywords("Kingdom: Animalia");
        LongMemory mem = new LongMemory();
        RegisterWiki reg = new RegisterWiki(mem);
        System.out.println(AnimalsNames);
        Concept c = new Concept();
        c.setConceptClass(cc);
        c.setName(cc.getNameClass());
        c.setFoundInDB(false);

        assertEquals(c.getName(),reg.register(AnimalsNames,cc).getName());
    }

    @Test
    public void test355_LeopardTortoise(){
        String AnimalsNames = "Leopard Tortoise";
        ConceptClass cc = new ConceptClass("animals");
        cc.setKeywords("Kingdom: Animalia");
        LongMemory mem = new LongMemory();
        RegisterWiki reg = new RegisterWiki(mem);
        System.out.println(AnimalsNames);
        Concept c = new Concept();
        c.setConceptClass(cc);
        c.setName(cc.getNameClass());
        c.setFoundInDB(false);

        assertEquals(c.getName(),reg.register(AnimalsNames,cc).getName());
    }

    @Test
    public void test356_Liger(){
        String AnimalsNames = "Liger";
        ConceptClass cc = new ConceptClass("animals");
        cc.setKeywords("Kingdom: Animalia");
        LongMemory mem = new LongMemory();
        RegisterWiki reg = new RegisterWiki(mem);
        System.out.println(AnimalsNames);
        Concept c = new Concept();
        c.setConceptClass(cc);
        c.setName(cc.getNameClass());
        c.setFoundInDB(false);

        assertEquals(c.getName(),reg.register(AnimalsNames,cc).getName());
    }

    @Test
    public void test357_Lion(){
        String AnimalsNames = "Lion";
        ConceptClass cc = new ConceptClass("animals");
        cc.setKeywords("Kingdom: Animalia");
        LongMemory mem = new LongMemory();
        RegisterWiki reg = new RegisterWiki(mem);
        System.out.println(AnimalsNames);
        Concept c = new Concept();
        c.setConceptClass(cc);
        c.setName(cc.getNameClass());
        c.setFoundInDB(false);

        assertEquals(c.getName(),reg.register(AnimalsNames,cc).getName());
    }

    @Test
    public void test358_Lionfish(){
        String AnimalsNames = "Lionfish";
        ConceptClass cc = new ConceptClass("animals");
        cc.setKeywords("Kingdom: Animalia");
        LongMemory mem = new LongMemory();
        RegisterWiki reg = new RegisterWiki(mem);
        System.out.println(AnimalsNames);
        Concept c = new Concept();
        c.setConceptClass(cc);
        c.setName(cc.getNameClass());
        c.setFoundInDB(false);

        assertEquals(c.getName(),reg.register(AnimalsNames,cc).getName());
    }

    @Test
    public void test359_LittlePenguin(){
        String AnimalsNames = "Little Penguin";
        ConceptClass cc = new ConceptClass("animals");
        cc.setKeywords("Kingdom: Animalia");
        LongMemory mem = new LongMemory();
        RegisterWiki reg = new RegisterWiki(mem);
        System.out.println(AnimalsNames);
        Concept c = new Concept();
        c.setConceptClass(cc);
        c.setName(cc.getNameClass());
        c.setFoundInDB(false);

        assertEquals(c.getName(),reg.register(AnimalsNames,cc).getName());
    }

    @Test
    public void test360_Lizard(){
        String AnimalsNames = "Lizard";
        ConceptClass cc = new ConceptClass("animals");
        cc.setKeywords("Kingdom: Animalia");
        LongMemory mem = new LongMemory();
        RegisterWiki reg = new RegisterWiki(mem);
        System.out.println(AnimalsNames);
        Concept c = new Concept();
        c.setConceptClass(cc);
        c.setName(cc.getNameClass());
        c.setFoundInDB(false);

        assertEquals(c.getName(),reg.register(AnimalsNames,cc).getName());
    }

    @Test
    public void test361_Llama(){
        String AnimalsNames = "Llama";
        ConceptClass cc = new ConceptClass("animals");
        cc.setKeywords("Kingdom: Animalia");
        LongMemory mem = new LongMemory();
        RegisterWiki reg = new RegisterWiki(mem);
        System.out.println(AnimalsNames);
        Concept c = new Concept();
        c.setConceptClass(cc);
        c.setName(cc.getNameClass());
        c.setFoundInDB(false);

        assertEquals(c.getName(),reg.register(AnimalsNames,cc).getName());
    }

    @Test
    public void test362_Lobster(){
        String AnimalsNames = "Lobster";
        ConceptClass cc = new ConceptClass("animals");
        cc.setKeywords("Kingdom: Animalia");
        LongMemory mem = new LongMemory();
        RegisterWiki reg = new RegisterWiki(mem);
        System.out.println(AnimalsNames);
        Concept c = new Concept();
        c.setConceptClass(cc);
        c.setName(cc.getNameClass());
        c.setFoundInDB(false);

        assertEquals(c.getName(),reg.register(AnimalsNames,cc).getName());
    }

    @Test
    public void test363_LongEaredOwl(){
        String AnimalsNames = "Long-Eared Owl";
        ConceptClass cc = new ConceptClass("animals");
        cc.setKeywords("Kingdom: Animalia");
        LongMemory mem = new LongMemory();
        RegisterWiki reg = new RegisterWiki(mem);
        System.out.println(AnimalsNames);
        Concept c = new Concept();
        c.setConceptClass(cc);
        c.setName(cc.getNameClass());
        c.setFoundInDB(false);

        assertEquals(c.getName(),reg.register(AnimalsNames,cc).getName());
    }

    @Test
    public void test364_Lynx(){
        String AnimalsNames = "Lynx";
        ConceptClass cc = new ConceptClass("animals");
        cc.setKeywords("Kingdom: Animalia");
        LongMemory mem = new LongMemory();
        RegisterWiki reg = new RegisterWiki(mem);
        System.out.println(AnimalsNames);
        Concept c = new Concept();
        c.setConceptClass(cc);
        c.setName(cc.getNameClass());
        c.setFoundInDB(false);

        assertEquals(c.getName(),reg.register(AnimalsNames,cc).getName());
    }

    @Test
    public void test365_M(){
        String AnimalsNames = "M";
        ConceptClass cc = new ConceptClass("animals");
        cc.setKeywords("Kingdom: Animalia");
        LongMemory mem = new LongMemory();
        RegisterWiki reg = new RegisterWiki(mem);
        System.out.println(AnimalsNames);
        Concept c = new Concept();
        c.setConceptClass(cc);
        c.setName(cc.getNameClass());
        c.setFoundInDB(false);

        assertEquals(c.getName(),reg.register(AnimalsNames,cc).getName());
    }

    @Test
    public void test366_MacaroniPenguin(){
        String AnimalsNames = "Macaroni Penguin";
        ConceptClass cc = new ConceptClass("animals");
        cc.setKeywords("Kingdom: Animalia");
        LongMemory mem = new LongMemory();
        RegisterWiki reg = new RegisterWiki(mem);
        System.out.println(AnimalsNames);
        Concept c = new Concept();
        c.setConceptClass(cc);
        c.setName(cc.getNameClass());
        c.setFoundInDB(false);

        assertEquals(c.getName(),reg.register(AnimalsNames,cc).getName());
    }

    @Test
    public void test367_Macaw(){
        String AnimalsNames = "Macaw";
        ConceptClass cc = new ConceptClass("animals");
        cc.setKeywords("Kingdom: Animalia");
        LongMemory mem = new LongMemory();
        RegisterWiki reg = new RegisterWiki(mem);
        System.out.println(AnimalsNames);
        Concept c = new Concept();
        c.setConceptClass(cc);
        c.setName(cc.getNameClass());
        c.setFoundInDB(false);

        assertEquals(c.getName(),reg.register(AnimalsNames,cc).getName());
    }

    @Test
    public void test368_MagellanicPenguin(){
        String AnimalsNames = "Magellanic Penguin";
        ConceptClass cc = new ConceptClass("animals");
        cc.setKeywords("Kingdom: Animalia");
        LongMemory mem = new LongMemory();
        RegisterWiki reg = new RegisterWiki(mem);
        System.out.println(AnimalsNames);
        Concept c = new Concept();
        c.setConceptClass(cc);
        c.setName(cc.getNameClass());
        c.setFoundInDB(false);

        assertEquals(c.getName(),reg.register(AnimalsNames,cc).getName());
    }

    @Test
    public void test369_Magpie(){
        String AnimalsNames = "Magpie";
        ConceptClass cc = new ConceptClass("animals");
        cc.setKeywords("Kingdom: Animalia");
        LongMemory mem = new LongMemory();
        RegisterWiki reg = new RegisterWiki(mem);
        System.out.println(AnimalsNames);
        Concept c = new Concept();
        c.setConceptClass(cc);
        c.setName(cc.getNameClass());
        c.setFoundInDB(false);

        assertEquals(c.getName(),reg.register(AnimalsNames,cc).getName());
    }

    @Test
    public void test370_MaineCoon(){
        String AnimalsNames = "Maine Coon";
        ConceptClass cc = new ConceptClass("animals");
        cc.setKeywords("Kingdom: Animalia");
        LongMemory mem = new LongMemory();
        RegisterWiki reg = new RegisterWiki(mem);
        System.out.println(AnimalsNames);
        Concept c = new Concept();
        c.setConceptClass(cc);
        c.setName(cc.getNameClass());
        c.setFoundInDB(false);

        assertEquals(c.getName(),reg.register(AnimalsNames,cc).getName());
    }

    @Test
    public void test371_MalayanCivet(){
        String AnimalsNames = "Malayan Civet";
        ConceptClass cc = new ConceptClass("animals");
        cc.setKeywords("Kingdom: Animalia");
        LongMemory mem = new LongMemory();
        RegisterWiki reg = new RegisterWiki(mem);
        System.out.println(AnimalsNames);
        Concept c = new Concept();
        c.setConceptClass(cc);
        c.setName(cc.getNameClass());
        c.setFoundInDB(false);

        assertEquals(c.getName(),reg.register(AnimalsNames,cc).getName());
    }

    @Test
    public void test372_MalayanTiger(){
        String AnimalsNames = "Malayan Tiger";
        ConceptClass cc = new ConceptClass("animals");
        cc.setKeywords("Kingdom: Animalia");
        LongMemory mem = new LongMemory();
        RegisterWiki reg = new RegisterWiki(mem);
        System.out.println(AnimalsNames);
        Concept c = new Concept();
        c.setConceptClass(cc);
        c.setName(cc.getNameClass());
        c.setFoundInDB(false);

        assertEquals(c.getName(),reg.register(AnimalsNames,cc).getName());
    }

    @Test
    public void test373_Maltese(){
        String AnimalsNames = "Maltese";
        ConceptClass cc = new ConceptClass("animals");
        cc.setKeywords("Kingdom: Animalia");
        LongMemory mem = new LongMemory();
        RegisterWiki reg = new RegisterWiki(mem);
        System.out.println(AnimalsNames);
        Concept c = new Concept();
        c.setConceptClass(cc);
        c.setName(cc.getNameClass());
        c.setFoundInDB(false);

        assertEquals(c.getName(),reg.register(AnimalsNames,cc).getName());
    }

    @Test
    public void test374_Manatee(){
        String AnimalsNames = "Manatee";
        ConceptClass cc = new ConceptClass("animals");
        cc.setKeywords("Kingdom: Animalia");
        LongMemory mem = new LongMemory();
        RegisterWiki reg = new RegisterWiki(mem);
        System.out.println(AnimalsNames);
        Concept c = new Concept();
        c.setConceptClass(cc);
        c.setName(cc.getNameClass());
        c.setFoundInDB(false);

        assertEquals(c.getName(),reg.register(AnimalsNames,cc).getName());
    }

    @Test
    public void test375_Mandrill(){
        String AnimalsNames = "Mandrill";
        ConceptClass cc = new ConceptClass("animals");
        cc.setKeywords("Kingdom: Animalia");
        LongMemory mem = new LongMemory();
        RegisterWiki reg = new RegisterWiki(mem);
        System.out.println(AnimalsNames);
        Concept c = new Concept();
        c.setConceptClass(cc);
        c.setName(cc.getNameClass());
        c.setFoundInDB(false);

        assertEquals(c.getName(),reg.register(AnimalsNames,cc).getName());
    }

    @Test
    public void test376_MantaRay(){
        String AnimalsNames = "Manta Ray";
        ConceptClass cc = new ConceptClass("animals");
        cc.setKeywords("Kingdom: Animalia");
        LongMemory mem = new LongMemory();
        RegisterWiki reg = new RegisterWiki(mem);
        System.out.println(AnimalsNames);
        Concept c = new Concept();
        c.setConceptClass(cc);
        c.setName(cc.getNameClass());
        c.setFoundInDB(false);

        assertEquals(c.getName(),reg.register(AnimalsNames,cc).getName());
    }

    @Test
    public void test377_MarineToad(){
        String AnimalsNames = "Marine Toad";
        ConceptClass cc = new ConceptClass("animals");
        cc.setKeywords("Kingdom: Animalia");
        LongMemory mem = new LongMemory();
        RegisterWiki reg = new RegisterWiki(mem);
        System.out.println(AnimalsNames);
        Concept c = new Concept();
        c.setConceptClass(cc);
        c.setName(cc.getNameClass());
        c.setFoundInDB(false);

        assertEquals(c.getName(),reg.register(AnimalsNames,cc).getName());
    }

    @Test
    public void test378_Markhor(){
        String AnimalsNames = "Markhor";
        ConceptClass cc = new ConceptClass("animals");
        cc.setKeywords("Kingdom: Animalia");
        LongMemory mem = new LongMemory();
        RegisterWiki reg = new RegisterWiki(mem);
        System.out.println(AnimalsNames);
        Concept c = new Concept();
        c.setConceptClass(cc);
        c.setName(cc.getNameClass());
        c.setFoundInDB(false);

        assertEquals(c.getName(),reg.register(AnimalsNames,cc).getName());
    }

    @Test
    public void test379_MarshFrog(){
        String AnimalsNames = "Marsh Frog";
        ConceptClass cc = new ConceptClass("animals");
        cc.setKeywords("Kingdom: Animalia");
        LongMemory mem = new LongMemory();
        RegisterWiki reg = new RegisterWiki(mem);
        System.out.println(AnimalsNames);
        Concept c = new Concept();
        c.setConceptClass(cc);
        c.setName(cc.getNameClass());
        c.setFoundInDB(false);

        assertEquals(c.getName(),reg.register(AnimalsNames,cc).getName());
    }

    @Test
    public void test380_MaskedPalmCivet(){
        String AnimalsNames = "Masked Palm Civet";
        ConceptClass cc = new ConceptClass("animals");
        cc.setKeywords("Kingdom: Animalia");
        LongMemory mem = new LongMemory();
        RegisterWiki reg = new RegisterWiki(mem);
        System.out.println(AnimalsNames);
        Concept c = new Concept();
        c.setConceptClass(cc);
        c.setName(cc.getNameClass());
        c.setFoundInDB(false);

        assertEquals(c.getName(),reg.register(AnimalsNames,cc).getName());
    }

    @Test
    public void test381_Mastiff(){
        String AnimalsNames = "Mastiff";
        ConceptClass cc = new ConceptClass("animals");
        cc.setKeywords("Kingdom: Animalia");
        LongMemory mem = new LongMemory();
        RegisterWiki reg = new RegisterWiki(mem);
        System.out.println(AnimalsNames);
        Concept c = new Concept();
        c.setConceptClass(cc);
        c.setName(cc.getNameClass());
        c.setFoundInDB(false);

        assertEquals(c.getName(),reg.register(AnimalsNames,cc).getName());
    }

    @Test
    public void test382_Mayfly(){
        String AnimalsNames = "Mayfly";
        ConceptClass cc = new ConceptClass("animals");
        cc.setKeywords("Kingdom: Animalia");
        LongMemory mem = new LongMemory();
        RegisterWiki reg = new RegisterWiki(mem);
        System.out.println(AnimalsNames);
        Concept c = new Concept();
        c.setConceptClass(cc);
        c.setName(cc.getNameClass());
        c.setFoundInDB(false);

        assertEquals(c.getName(),reg.register(AnimalsNames,cc).getName());
    }

    @Test
    public void test383_Meerkat(){
        String AnimalsNames = "Meerkat";
        ConceptClass cc = new ConceptClass("animals");
        cc.setKeywords("Kingdom: Animalia");
        LongMemory mem = new LongMemory();
        RegisterWiki reg = new RegisterWiki(mem);
        System.out.println(AnimalsNames);
        Concept c = new Concept();
        c.setConceptClass(cc);
        c.setName(cc.getNameClass());
        c.setFoundInDB(false);

        assertEquals(c.getName(),reg.register(AnimalsNames,cc).getName());
    }

    @Test
    public void test384_Millipede(){
        String AnimalsNames = "Millipede";
        ConceptClass cc = new ConceptClass("animals");
        cc.setKeywords("Kingdom: Animalia");
        LongMemory mem = new LongMemory();
        RegisterWiki reg = new RegisterWiki(mem);
        System.out.println(AnimalsNames);
        Concept c = new Concept();
        c.setConceptClass(cc);
        c.setName(cc.getNameClass());
        c.setFoundInDB(false);

        assertEquals(c.getName(),reg.register(AnimalsNames,cc).getName());
    }

    @Test
    public void test385_MinkeWhale(){
        String AnimalsNames = "Minke Whale";
        ConceptClass cc = new ConceptClass("animals");
        cc.setKeywords("Kingdom: Animalia");
        LongMemory mem = new LongMemory();
        RegisterWiki reg = new RegisterWiki(mem);
        System.out.println(AnimalsNames);
        Concept c = new Concept();
        c.setConceptClass(cc);
        c.setName(cc.getNameClass());
        c.setFoundInDB(false);

        assertEquals(c.getName(),reg.register(AnimalsNames,cc).getName());
    }

    @Test
    public void test386_Mole(){
        String AnimalsNames = "Mole";
        ConceptClass cc = new ConceptClass("animals");
        cc.setKeywords("Kingdom: Animalia");
        LongMemory mem = new LongMemory();
        RegisterWiki reg = new RegisterWiki(mem);
        System.out.println(AnimalsNames);
        Concept c = new Concept();
        c.setConceptClass(cc);
        c.setName(cc.getNameClass());
        c.setFoundInDB(false);

        assertEquals(c.getName(),reg.register(AnimalsNames,cc).getName());
    }

    @Test
    public void test387_Molly(){
        String AnimalsNames = "Molly";
        ConceptClass cc = new ConceptClass("animals");
        cc.setKeywords("Kingdom: Animalia");
        LongMemory mem = new LongMemory();
        RegisterWiki reg = new RegisterWiki(mem);
        System.out.println(AnimalsNames);
        Concept c = new Concept();
        c.setConceptClass(cc);
        c.setName(cc.getNameClass());
        c.setFoundInDB(false);

        assertEquals(c.getName(),reg.register(AnimalsNames,cc).getName());
    }

    @Test
    public void test388_Mongoose(){
        String AnimalsNames = "Mongoose";
        ConceptClass cc = new ConceptClass("animals");
        cc.setKeywords("Kingdom: Animalia");
        LongMemory mem = new LongMemory();
        RegisterWiki reg = new RegisterWiki(mem);
        System.out.println(AnimalsNames);
        Concept c = new Concept();
        c.setConceptClass(cc);
        c.setName(cc.getNameClass());
        c.setFoundInDB(false);

        assertEquals(c.getName(),reg.register(AnimalsNames,cc).getName());
    }

    @Test
    public void test389_Mongrel(){
        String AnimalsNames = "Mongrel";
        ConceptClass cc = new ConceptClass("animals");
        cc.setKeywords("Kingdom: Animalia");
        LongMemory mem = new LongMemory();
        RegisterWiki reg = new RegisterWiki(mem);
        System.out.println(AnimalsNames);
        Concept c = new Concept();
        c.setConceptClass(cc);
        c.setName(cc.getNameClass());
        c.setFoundInDB(false);

        assertEquals(c.getName(),reg.register(AnimalsNames,cc).getName());
    }

    @Test
    public void test390_MonitorLizard(){
        String AnimalsNames = "Monitor Lizard";
        ConceptClass cc = new ConceptClass("animals");
        cc.setKeywords("Kingdom: Animalia");
        LongMemory mem = new LongMemory();
        RegisterWiki reg = new RegisterWiki(mem);
        System.out.println(AnimalsNames);
        Concept c = new Concept();
        c.setConceptClass(cc);
        c.setName(cc.getNameClass());
        c.setFoundInDB(false);

        assertEquals(c.getName(),reg.register(AnimalsNames,cc).getName());
    }

    @Test
    public void test391_Monkey(){
        String AnimalsNames = "Monkey";
        ConceptClass cc = new ConceptClass("animals");
        cc.setKeywords("Kingdom: Animalia");
        LongMemory mem = new LongMemory();
        RegisterWiki reg = new RegisterWiki(mem);
        System.out.println(AnimalsNames);
        Concept c = new Concept();
        c.setConceptClass(cc);
        c.setName(cc.getNameClass());
        c.setFoundInDB(false);

        assertEquals(c.getName(),reg.register(AnimalsNames,cc).getName());
    }

    @Test
    public void test392_MonteIberiaEleuth(){
        String AnimalsNames = "Monte Iberia Eleuth";
        ConceptClass cc = new ConceptClass("animals");
        cc.setKeywords("Kingdom: Animalia");
        LongMemory mem = new LongMemory();
        RegisterWiki reg = new RegisterWiki(mem);
        System.out.println(AnimalsNames);
        Concept c = new Concept();
        c.setConceptClass(cc);
        c.setName(cc.getNameClass());
        c.setFoundInDB(false);

        assertEquals(c.getName(),reg.register(AnimalsNames,cc).getName());
    }

    @Test
    public void test393_Moorhen(){
        String AnimalsNames = "Moorhen";
        ConceptClass cc = new ConceptClass("animals");
        cc.setKeywords("Kingdom: Animalia");
        LongMemory mem = new LongMemory();
        RegisterWiki reg = new RegisterWiki(mem);
        System.out.println(AnimalsNames);
        Concept c = new Concept();
        c.setConceptClass(cc);
        c.setName(cc.getNameClass());
        c.setFoundInDB(false);

        assertEquals(c.getName(),reg.register(AnimalsNames,cc).getName());
    }

    @Test
    public void test394_Moose(){
        String AnimalsNames = "Moose";
        ConceptClass cc = new ConceptClass("animals");
        cc.setKeywords("Kingdom: Animalia");
        LongMemory mem = new LongMemory();
        RegisterWiki reg = new RegisterWiki(mem);
        System.out.println(AnimalsNames);
        Concept c = new Concept();
        c.setConceptClass(cc);
        c.setName(cc.getNameClass());
        c.setFoundInDB(false);

        assertEquals(c.getName(),reg.register(AnimalsNames,cc).getName());
    }

    @Test
    public void test395_MorayEel(){
        String AnimalsNames = "Moray Eel";
        ConceptClass cc = new ConceptClass("animals");
        cc.setKeywords("Kingdom: Animalia");
        LongMemory mem = new LongMemory();
        RegisterWiki reg = new RegisterWiki(mem);
        System.out.println(AnimalsNames);
        Concept c = new Concept();
        c.setConceptClass(cc);
        c.setName(cc.getNameClass());
        c.setFoundInDB(false);

        assertEquals(c.getName(),reg.register(AnimalsNames,cc).getName());
    }

    @Test
    public void test396_Moth(){
        String AnimalsNames = "Moth";
        ConceptClass cc = new ConceptClass("animals");
        cc.setKeywords("Kingdom: Animalia");
        LongMemory mem = new LongMemory();
        RegisterWiki reg = new RegisterWiki(mem);
        System.out.println(AnimalsNames);
        Concept c = new Concept();
        c.setConceptClass(cc);
        c.setName(cc.getNameClass());
        c.setFoundInDB(false);

        assertEquals(c.getName(),reg.register(AnimalsNames,cc).getName());
    }

    @Test
    public void test397_MountainGorilla(){
        String AnimalsNames = "Mountain Gorilla";
        ConceptClass cc = new ConceptClass("animals");
        cc.setKeywords("Kingdom: Animalia");
        LongMemory mem = new LongMemory();
        RegisterWiki reg = new RegisterWiki(mem);
        System.out.println(AnimalsNames);
        Concept c = new Concept();
        c.setConceptClass(cc);
        c.setName(cc.getNameClass());
        c.setFoundInDB(false);

        assertEquals(c.getName(),reg.register(AnimalsNames,cc).getName());
    }

    @Test
    public void test398_MountainLion(){
        String AnimalsNames = "Mountain Lion";
        ConceptClass cc = new ConceptClass("animals");
        cc.setKeywords("Kingdom: Animalia");
        LongMemory mem = new LongMemory();
        RegisterWiki reg = new RegisterWiki(mem);
        System.out.println(AnimalsNames);
        Concept c = new Concept();
        c.setConceptClass(cc);
        c.setName(cc.getNameClass());
        c.setFoundInDB(false);

        assertEquals(c.getName(),reg.register(AnimalsNames,cc).getName());
    }

    @Test
    public void test399_Mouse(){
        String AnimalsNames = "Mouse";
        ConceptClass cc = new ConceptClass("animals");
        cc.setKeywords("Kingdom: Animalia");
        LongMemory mem = new LongMemory();
        RegisterWiki reg = new RegisterWiki(mem);
        System.out.println(AnimalsNames);
        Concept c = new Concept();
        c.setConceptClass(cc);
        c.setName(cc.getNameClass());
        c.setFoundInDB(false);

        assertEquals(c.getName(),reg.register(AnimalsNames,cc).getName());
    }

    @Test
    public void test400_Mule(){
        String AnimalsNames = "Mule";
        ConceptClass cc = new ConceptClass("animals");
        cc.setKeywords("Kingdom: Animalia");
        LongMemory mem = new LongMemory();
        RegisterWiki reg = new RegisterWiki(mem);
        System.out.println(AnimalsNames);
        Concept c = new Concept();
        c.setConceptClass(cc);
        c.setName(cc.getNameClass());
        c.setFoundInDB(false);

        assertEquals(c.getName(),reg.register(AnimalsNames,cc).getName());
    }

    @Test
    public void test401_N(){
        String AnimalsNames = "N";
        ConceptClass cc = new ConceptClass("animals");
        cc.setKeywords("Kingdom: Animalia");
        LongMemory mem = new LongMemory();
        RegisterWiki reg = new RegisterWiki(mem);
        System.out.println(AnimalsNames);
        Concept c = new Concept();
        c.setConceptClass(cc);
        c.setName(cc.getNameClass());
        c.setFoundInDB(false);

        assertEquals(c.getName(),reg.register(AnimalsNames,cc).getName());
    }

    @Test
    public void test402_Neanderthal(){
        String AnimalsNames = "Neanderthal";
        ConceptClass cc = new ConceptClass("animals");
        cc.setKeywords("Kingdom: Animalia");
        LongMemory mem = new LongMemory();
        RegisterWiki reg = new RegisterWiki(mem);
        System.out.println(AnimalsNames);
        Concept c = new Concept();
        c.setConceptClass(cc);
        c.setName(cc.getNameClass());
        c.setFoundInDB(false);

        assertEquals(c.getName(),reg.register(AnimalsNames,cc).getName());
    }

    @Test
    public void test403_NeapolitanMastiff(){
        String AnimalsNames = "Neapolitan Mastiff";
        ConceptClass cc = new ConceptClass("animals");
        cc.setKeywords("Kingdom: Animalia");
        LongMemory mem = new LongMemory();
        RegisterWiki reg = new RegisterWiki(mem);
        System.out.println(AnimalsNames);
        Concept c = new Concept();
        c.setConceptClass(cc);
        c.setName(cc.getNameClass());
        c.setFoundInDB(false);

        assertEquals(c.getName(),reg.register(AnimalsNames,cc).getName());
    }

    @Test
    public void test404_Newfoundland(){
        String AnimalsNames = "Newfoundland";
        ConceptClass cc = new ConceptClass("animals");
        cc.setKeywords("Kingdom: Animalia");
        LongMemory mem = new LongMemory();
        RegisterWiki reg = new RegisterWiki(mem);
        System.out.println(AnimalsNames);
        Concept c = new Concept();
        c.setConceptClass(cc);
        c.setName(cc.getNameClass());
        c.setFoundInDB(false);

        assertEquals(c.getName(),reg.register(AnimalsNames,cc).getName());
    }

    @Test
    public void test405_Newt(){
        String AnimalsNames = "Newt";
        ConceptClass cc = new ConceptClass("animals");
        cc.setKeywords("Kingdom: Animalia");
        LongMemory mem = new LongMemory();
        RegisterWiki reg = new RegisterWiki(mem);
        System.out.println(AnimalsNames);
        Concept c = new Concept();
        c.setConceptClass(cc);
        c.setName(cc.getNameClass());
        c.setFoundInDB(false);

        assertEquals(c.getName(),reg.register(AnimalsNames,cc).getName());
    }

    @Test
    public void test406_Nightingale(){
        String AnimalsNames = "Nightingale";
        ConceptClass cc = new ConceptClass("animals");
        cc.setKeywords("Kingdom: Animalia");
        LongMemory mem = new LongMemory();
        RegisterWiki reg = new RegisterWiki(mem);
        System.out.println(AnimalsNames);
        Concept c = new Concept();
        c.setConceptClass(cc);
        c.setName(cc.getNameClass());
        c.setFoundInDB(false);

        assertEquals(c.getName(),reg.register(AnimalsNames,cc).getName());
    }

    @Test
    public void test407_NorfolkTerrier(){
        String AnimalsNames = "Norfolk Terrier";
        ConceptClass cc = new ConceptClass("animals");
        cc.setKeywords("Kingdom: Animalia");
        LongMemory mem = new LongMemory();
        RegisterWiki reg = new RegisterWiki(mem);
        System.out.println(AnimalsNames);
        Concept c = new Concept();
        c.setConceptClass(cc);
        c.setName(cc.getNameClass());
        c.setFoundInDB(false);

        assertEquals(c.getName(),reg.register(AnimalsNames,cc).getName());
    }

    @Test
    public void test408_NorwegianForest(){
        String AnimalsNames = "Norwegian Forest";
        ConceptClass cc = new ConceptClass("animals");
        cc.setKeywords("Kingdom: Animalia");
        LongMemory mem = new LongMemory();
        RegisterWiki reg = new RegisterWiki(mem);
        System.out.println(AnimalsNames);
        Concept c = new Concept();
        c.setConceptClass(cc);
        c.setName(cc.getNameClass());
        c.setFoundInDB(false);

        assertEquals(c.getName(),reg.register(AnimalsNames,cc).getName());
    }

    @Test
    public void test409_Numbat(){
        String AnimalsNames = "Numbat";
        ConceptClass cc = new ConceptClass("animals");
        cc.setKeywords("Kingdom: Animalia");
        LongMemory mem = new LongMemory();
        RegisterWiki reg = new RegisterWiki(mem);
        System.out.println(AnimalsNames);
        Concept c = new Concept();
        c.setConceptClass(cc);
        c.setName(cc.getNameClass());
        c.setFoundInDB(false);

        assertEquals(c.getName(),reg.register(AnimalsNames,cc).getName());
    }

    @Test
    public void test410_NurseShark(){
        String AnimalsNames = "Nurse Shark";
        ConceptClass cc = new ConceptClass("animals");
        cc.setKeywords("Kingdom: Animalia");
        LongMemory mem = new LongMemory();
        RegisterWiki reg = new RegisterWiki(mem);
        System.out.println(AnimalsNames);
        Concept c = new Concept();
        c.setConceptClass(cc);
        c.setName(cc.getNameClass());
        c.setFoundInDB(false);

        assertEquals(c.getName(),reg.register(AnimalsNames,cc).getName());
    }

    @Test
    public void test411_O(){
        String AnimalsNames = "O";
        ConceptClass cc = new ConceptClass("animals");
        cc.setKeywords("Kingdom: Animalia");
        LongMemory mem = new LongMemory();
        RegisterWiki reg = new RegisterWiki(mem);
        System.out.println(AnimalsNames);
        Concept c = new Concept();
        c.setConceptClass(cc);
        c.setName(cc.getNameClass());
        c.setFoundInDB(false);

        assertEquals(c.getName(),reg.register(AnimalsNames,cc).getName());
    }

    @Test
    public void test412_Ocelot(){
        String AnimalsNames = "Ocelot";
        ConceptClass cc = new ConceptClass("animals");
        cc.setKeywords("Kingdom: Animalia");
        LongMemory mem = new LongMemory();
        RegisterWiki reg = new RegisterWiki(mem);
        System.out.println(AnimalsNames);
        Concept c = new Concept();
        c.setConceptClass(cc);
        c.setName(cc.getNameClass());
        c.setFoundInDB(false);

        assertEquals(c.getName(),reg.register(AnimalsNames,cc).getName());
    }

    @Test
    public void test413_Octopus(){
        String AnimalsNames = "Octopus";
        ConceptClass cc = new ConceptClass("animals");
        cc.setKeywords("Kingdom: Animalia");
        LongMemory mem = new LongMemory();
        RegisterWiki reg = new RegisterWiki(mem);
        System.out.println(AnimalsNames);
        Concept c = new Concept();
        c.setConceptClass(cc);
        c.setName(cc.getNameClass());
        c.setFoundInDB(false);

        assertEquals(c.getName(),reg.register(AnimalsNames,cc).getName());
    }

    @Test
    public void test414_Okapi(){
        String AnimalsNames = "Okapi";
        ConceptClass cc = new ConceptClass("animals");
        cc.setKeywords("Kingdom: Animalia");
        LongMemory mem = new LongMemory();
        RegisterWiki reg = new RegisterWiki(mem);
        System.out.println(AnimalsNames);
        Concept c = new Concept();
        c.setConceptClass(cc);
        c.setName(cc.getNameClass());
        c.setFoundInDB(false);

        assertEquals(c.getName(),reg.register(AnimalsNames,cc).getName());
    }

    @Test
    public void test415_OldEnglishSheepdog(){
        String AnimalsNames = "Old English Sheepdog";
        ConceptClass cc = new ConceptClass("animals");
        cc.setKeywords("Kingdom: Animalia");
        LongMemory mem = new LongMemory();
        RegisterWiki reg = new RegisterWiki(mem);
        System.out.println(AnimalsNames);
        Concept c = new Concept();
        c.setConceptClass(cc);
        c.setName(cc.getNameClass());
        c.setFoundInDB(false);

        assertEquals(c.getName(),reg.register(AnimalsNames,cc).getName());
    }

    @Test
    public void test416_Olm(){
        String AnimalsNames = "Olm";
        ConceptClass cc = new ConceptClass("animals");
        cc.setKeywords("Kingdom: Animalia");
        LongMemory mem = new LongMemory();
        RegisterWiki reg = new RegisterWiki(mem);
        System.out.println(AnimalsNames);
        Concept c = new Concept();
        c.setConceptClass(cc);
        c.setName(cc.getNameClass());
        c.setFoundInDB(false);

        assertEquals(c.getName(),reg.register(AnimalsNames,cc).getName());
    }

    @Test
    public void test417_Opossum(){
        String AnimalsNames = "Opossum";
        ConceptClass cc = new ConceptClass("animals");
        cc.setKeywords("Kingdom: Animalia");
        LongMemory mem = new LongMemory();
        RegisterWiki reg = new RegisterWiki(mem);
        System.out.println(AnimalsNames);
        Concept c = new Concept();
        c.setConceptClass(cc);
        c.setName(cc.getNameClass());
        c.setFoundInDB(false);

        assertEquals(c.getName(),reg.register(AnimalsNames,cc).getName());
    }

    @Test
    public void test418_Orangutan(){
        String AnimalsNames = "Orang-utan";
        ConceptClass cc = new ConceptClass("animals");
        cc.setKeywords("Kingdom: Animalia");
        LongMemory mem = new LongMemory();
        RegisterWiki reg = new RegisterWiki(mem);
        System.out.println(AnimalsNames);
        Concept c = new Concept();
        c.setConceptClass(cc);
        c.setName(cc.getNameClass());
        c.setFoundInDB(false);

        assertEquals(c.getName(),reg.register(AnimalsNames,cc).getName());
    }

    @Test
    public void test419_Ostrich(){
        String AnimalsNames = "Ostrich";
        ConceptClass cc = new ConceptClass("animals");
        cc.setKeywords("Kingdom: Animalia");
        LongMemory mem = new LongMemory();
        RegisterWiki reg = new RegisterWiki(mem);
        System.out.println(AnimalsNames);
        Concept c = new Concept();
        c.setConceptClass(cc);
        c.setName(cc.getNameClass());
        c.setFoundInDB(false);

        assertEquals(c.getName(),reg.register(AnimalsNames,cc).getName());
    }

    @Test
    public void test420_Otter(){
        String AnimalsNames = "Otter";
        ConceptClass cc = new ConceptClass("animals");
        cc.setKeywords("Kingdom: Animalia");
        LongMemory mem = new LongMemory();
        RegisterWiki reg = new RegisterWiki(mem);
        System.out.println(AnimalsNames);
        Concept c = new Concept();
        c.setConceptClass(cc);
        c.setName(cc.getNameClass());
        c.setFoundInDB(false);

        assertEquals(c.getName(),reg.register(AnimalsNames,cc).getName());
    }

    @Test
    public void test421_Oyster(){
        String AnimalsNames = "Oyster";
        ConceptClass cc = new ConceptClass("animals");
        cc.setKeywords("Kingdom: Animalia");
        LongMemory mem = new LongMemory();
        RegisterWiki reg = new RegisterWiki(mem);
        System.out.println(AnimalsNames);
        Concept c = new Concept();
        c.setConceptClass(cc);
        c.setName(cc.getNameClass());
        c.setFoundInDB(false);

        assertEquals(c.getName(),reg.register(AnimalsNames,cc).getName());
    }

    @Test
    public void test422_P(){
        String AnimalsNames = "P";
        ConceptClass cc = new ConceptClass("animals");
        cc.setKeywords("Kingdom: Animalia");
        LongMemory mem = new LongMemory();
        RegisterWiki reg = new RegisterWiki(mem);
        System.out.println(AnimalsNames);
        Concept c = new Concept();
        c.setConceptClass(cc);
        c.setName(cc.getNameClass());
        c.setFoundInDB(false);

        assertEquals(c.getName(),reg.register(AnimalsNames,cc).getName());
    }

    @Test
    public void test423_Pademelon(){
        String AnimalsNames = "Pademelon";
        ConceptClass cc = new ConceptClass("animals");
        cc.setKeywords("Kingdom: Animalia");
        LongMemory mem = new LongMemory();
        RegisterWiki reg = new RegisterWiki(mem);
        System.out.println(AnimalsNames);
        Concept c = new Concept();
        c.setConceptClass(cc);
        c.setName(cc.getNameClass());
        c.setFoundInDB(false);

        assertEquals(c.getName(),reg.register(AnimalsNames,cc).getName());
    }

    @Test
    public void test424_Panther(){
        String AnimalsNames = "Panther";
        ConceptClass cc = new ConceptClass("animals");
        cc.setKeywords("Kingdom: Animalia");
        LongMemory mem = new LongMemory();
        RegisterWiki reg = new RegisterWiki(mem);
        System.out.println(AnimalsNames);
        Concept c = new Concept();
        c.setConceptClass(cc);
        c.setName(cc.getNameClass());
        c.setFoundInDB(false);

        assertEquals(c.getName(),reg.register(AnimalsNames,cc).getName());
    }

    @Test
    public void test425_Parrot(){
        String AnimalsNames = "Parrot";
        ConceptClass cc = new ConceptClass("animals");
        cc.setKeywords("Kingdom: Animalia");
        LongMemory mem = new LongMemory();
        RegisterWiki reg = new RegisterWiki(mem);
        System.out.println(AnimalsNames);
        Concept c = new Concept();
        c.setConceptClass(cc);
        c.setName(cc.getNameClass());
        c.setFoundInDB(false);

        assertEquals(c.getName(),reg.register(AnimalsNames,cc).getName());
    }

    @Test
    public void test426_PatasMonkey(){
        String AnimalsNames = "Patas Monkey";
        ConceptClass cc = new ConceptClass("animals");
        cc.setKeywords("Kingdom: Animalia");
        LongMemory mem = new LongMemory();
        RegisterWiki reg = new RegisterWiki(mem);
        System.out.println(AnimalsNames);
        Concept c = new Concept();
        c.setConceptClass(cc);
        c.setName(cc.getNameClass());
        c.setFoundInDB(false);

        assertEquals(c.getName(),reg.register(AnimalsNames,cc).getName());
    }

    @Test
    public void test427_Peacock(){
        String AnimalsNames = "Peacock";
        ConceptClass cc = new ConceptClass("animals");
        cc.setKeywords("Kingdom: Animalia");
        LongMemory mem = new LongMemory();
        RegisterWiki reg = new RegisterWiki(mem);
        System.out.println(AnimalsNames);
        Concept c = new Concept();
        c.setConceptClass(cc);
        c.setName(cc.getNameClass());
        c.setFoundInDB(false);

        assertEquals(c.getName(),reg.register(AnimalsNames,cc).getName());
    }

    @Test
    public void test428_Pekingese(){
        String AnimalsNames = "Pekingese";
        ConceptClass cc = new ConceptClass("animals");
        cc.setKeywords("Kingdom: Animalia");
        LongMemory mem = new LongMemory();
        RegisterWiki reg = new RegisterWiki(mem);
        System.out.println(AnimalsNames);
        Concept c = new Concept();
        c.setConceptClass(cc);
        c.setName(cc.getNameClass());
        c.setFoundInDB(false);

        assertEquals(c.getName(),reg.register(AnimalsNames,cc).getName());
    }

    @Test
    public void test429_Pelican(){
        String AnimalsNames = "Pelican";
        ConceptClass cc = new ConceptClass("animals");
        cc.setKeywords("Kingdom: Animalia");
        LongMemory mem = new LongMemory();
        RegisterWiki reg = new RegisterWiki(mem);
        System.out.println(AnimalsNames);
        Concept c = new Concept();
        c.setConceptClass(cc);
        c.setName(cc.getNameClass());
        c.setFoundInDB(false);

        assertEquals(c.getName(),reg.register(AnimalsNames,cc).getName());
    }

    @Test
    public void test430_Penguin(){
        String AnimalsNames = "Penguin";
        ConceptClass cc = new ConceptClass("animals");
        cc.setKeywords("Kingdom: Animalia");
        LongMemory mem = new LongMemory();
        RegisterWiki reg = new RegisterWiki(mem);
        System.out.println(AnimalsNames);
        Concept c = new Concept();
        c.setConceptClass(cc);
        c.setName(cc.getNameClass());
        c.setFoundInDB(false);

        assertEquals(c.getName(),reg.register(AnimalsNames,cc).getName());
    }

    @Test
    public void test431_Persian(){
        String AnimalsNames = "Persian";
        ConceptClass cc = new ConceptClass("animals");
        cc.setKeywords("Kingdom: Animalia");
        LongMemory mem = new LongMemory();
        RegisterWiki reg = new RegisterWiki(mem);
        System.out.println(AnimalsNames);
        Concept c = new Concept();
        c.setConceptClass(cc);
        c.setName(cc.getNameClass());
        c.setFoundInDB(false);

        assertEquals(c.getName(),reg.register(AnimalsNames,cc).getName());
    }

    @Test
    public void test432_Pheasant(){
        String AnimalsNames = "Pheasant";
        ConceptClass cc = new ConceptClass("animals");
        cc.setKeywords("Kingdom: Animalia");
        LongMemory mem = new LongMemory();
        RegisterWiki reg = new RegisterWiki(mem);
        System.out.println(AnimalsNames);
        Concept c = new Concept();
        c.setConceptClass(cc);
        c.setName(cc.getNameClass());
        c.setFoundInDB(false);

        assertEquals(c.getName(),reg.register(AnimalsNames,cc).getName());
    }

    @Test
    public void test433_PiedTamarin(){
        String AnimalsNames = "Pied Tamarin";
        ConceptClass cc = new ConceptClass("animals");
        cc.setKeywords("Kingdom: Animalia");
        LongMemory mem = new LongMemory();
        RegisterWiki reg = new RegisterWiki(mem);
        System.out.println(AnimalsNames);
        Concept c = new Concept();
        c.setConceptClass(cc);
        c.setName(cc.getNameClass());
        c.setFoundInDB(false);

        assertEquals(c.getName(),reg.register(AnimalsNames,cc).getName());
    }

    @Test
    public void test434_Pig(){
        String AnimalsNames = "Pig";
        ConceptClass cc = new ConceptClass("animals");
        cc.setKeywords("Kingdom: Animalia");
        LongMemory mem = new LongMemory();
        RegisterWiki reg = new RegisterWiki(mem);
        System.out.println(AnimalsNames);
        Concept c = new Concept();
        c.setConceptClass(cc);
        c.setName(cc.getNameClass());
        c.setFoundInDB(false);

        assertEquals(c.getName(),reg.register(AnimalsNames,cc).getName());
    }

    @Test
    public void test435_Pika(){
        String AnimalsNames = "Pika";
        ConceptClass cc = new ConceptClass("animals");
        cc.setKeywords("Kingdom: Animalia");
        LongMemory mem = new LongMemory();
        RegisterWiki reg = new RegisterWiki(mem);
        System.out.println(AnimalsNames);
        Concept c = new Concept();
        c.setConceptClass(cc);
        c.setName(cc.getNameClass());
        c.setFoundInDB(false);

        assertEquals(c.getName(),reg.register(AnimalsNames,cc).getName());
    }

    @Test
    public void test436_Pike(){
        String AnimalsNames = "Pike";
        ConceptClass cc = new ConceptClass("animals");
        cc.setKeywords("Kingdom: Animalia");
        LongMemory mem = new LongMemory();
        RegisterWiki reg = new RegisterWiki(mem);
        System.out.println(AnimalsNames);
        Concept c = new Concept();
        c.setConceptClass(cc);
        c.setName(cc.getNameClass());
        c.setFoundInDB(false);

        assertEquals(c.getName(),reg.register(AnimalsNames,cc).getName());
    }

    @Test
    public void test437_PinkFairyArmadillo(){
        String AnimalsNames = "Pink Fairy Armadillo";
        ConceptClass cc = new ConceptClass("animals");
        cc.setKeywords("Kingdom: Animalia");
        LongMemory mem = new LongMemory();
        RegisterWiki reg = new RegisterWiki(mem);
        System.out.println(AnimalsNames);
        Concept c = new Concept();
        c.setConceptClass(cc);
        c.setName(cc.getNameClass());
        c.setFoundInDB(false);

        assertEquals(c.getName(),reg.register(AnimalsNames,cc).getName());
    }

    @Test
    public void test438_Piranha(){
        String AnimalsNames = "Piranha";
        ConceptClass cc = new ConceptClass("animals");
        cc.setKeywords("Kingdom: Animalia");
        LongMemory mem = new LongMemory();
        RegisterWiki reg = new RegisterWiki(mem);
        System.out.println(AnimalsNames);
        Concept c = new Concept();
        c.setConceptClass(cc);
        c.setName(cc.getNameClass());
        c.setFoundInDB(false);

        assertEquals(c.getName(),reg.register(AnimalsNames,cc).getName());
    }

    @Test
    public void test439_Platypus(){
        String AnimalsNames = "Platypus";
        ConceptClass cc = new ConceptClass("animals");
        cc.setKeywords("Kingdom: Animalia");
        LongMemory mem = new LongMemory();
        RegisterWiki reg = new RegisterWiki(mem);
        System.out.println(AnimalsNames);
        Concept c = new Concept();
        c.setConceptClass(cc);
        c.setName(cc.getNameClass());
        c.setFoundInDB(false);

        assertEquals(c.getName(),reg.register(AnimalsNames,cc).getName());
    }

    @Test
    public void test440_Pointer(){
        String AnimalsNames = "Pointer";
        ConceptClass cc = new ConceptClass("animals");
        cc.setKeywords("Kingdom: Animalia");
        LongMemory mem = new LongMemory();
        RegisterWiki reg = new RegisterWiki(mem);
        System.out.println(AnimalsNames);
        Concept c = new Concept();
        c.setConceptClass(cc);
        c.setName(cc.getNameClass());
        c.setFoundInDB(false);

        assertEquals(c.getName(),reg.register(AnimalsNames,cc).getName());
    }

    @Test
    public void test441_PoisonDartFrog(){
        String AnimalsNames = "Poison Dart Frog";
        ConceptClass cc = new ConceptClass("animals");
        cc.setKeywords("Kingdom: Animalia");
        LongMemory mem = new LongMemory();
        RegisterWiki reg = new RegisterWiki(mem);
        System.out.println(AnimalsNames);
        Concept c = new Concept();
        c.setConceptClass(cc);
        c.setName(cc.getNameClass());
        c.setFoundInDB(false);

        assertEquals(c.getName(),reg.register(AnimalsNames,cc).getName());
    }

    @Test
    public void test442_PolarBear(){
        String AnimalsNames = "Polar Bear";
        ConceptClass cc = new ConceptClass("animals");
        cc.setKeywords("Kingdom: Animalia");
        LongMemory mem = new LongMemory();
        RegisterWiki reg = new RegisterWiki(mem);
        System.out.println(AnimalsNames);
        Concept c = new Concept();
        c.setConceptClass(cc);
        c.setName(cc.getNameClass());
        c.setFoundInDB(false);

        assertEquals(c.getName(),reg.register(AnimalsNames,cc).getName());
    }

    @Test
    public void test443_PondSkater(){
        String AnimalsNames = "Pond Skater";
        ConceptClass cc = new ConceptClass("animals");
        cc.setKeywords("Kingdom: Animalia");
        LongMemory mem = new LongMemory();
        RegisterWiki reg = new RegisterWiki(mem);
        System.out.println(AnimalsNames);
        Concept c = new Concept();
        c.setConceptClass(cc);
        c.setName(cc.getNameClass());
        c.setFoundInDB(false);

        assertEquals(c.getName(),reg.register(AnimalsNames,cc).getName());
    }

    @Test
    public void test444_Poodle(){
        String AnimalsNames = "Poodle";
        ConceptClass cc = new ConceptClass("animals");
        cc.setKeywords("Kingdom: Animalia");
        LongMemory mem = new LongMemory();
        RegisterWiki reg = new RegisterWiki(mem);
        System.out.println(AnimalsNames);
        Concept c = new Concept();
        c.setConceptClass(cc);
        c.setName(cc.getNameClass());
        c.setFoundInDB(false);

        assertEquals(c.getName(),reg.register(AnimalsNames,cc).getName());
    }

    @Test
    public void test445_PoolFrog(){
        String AnimalsNames = "Pool Frog";
        ConceptClass cc = new ConceptClass("animals");
        cc.setKeywords("Kingdom: Animalia");
        LongMemory mem = new LongMemory();
        RegisterWiki reg = new RegisterWiki(mem);
        System.out.println(AnimalsNames);
        Concept c = new Concept();
        c.setConceptClass(cc);
        c.setName(cc.getNameClass());
        c.setFoundInDB(false);

        assertEquals(c.getName(),reg.register(AnimalsNames,cc).getName());
    }

    @Test
    public void test446_Porcupine(){
        String AnimalsNames = "Porcupine";
        ConceptClass cc = new ConceptClass("animals");
        cc.setKeywords("Kingdom: Animalia");
        LongMemory mem = new LongMemory();
        RegisterWiki reg = new RegisterWiki(mem);
        System.out.println(AnimalsNames);
        Concept c = new Concept();
        c.setConceptClass(cc);
        c.setName(cc.getNameClass());
        c.setFoundInDB(false);

        assertEquals(c.getName(),reg.register(AnimalsNames,cc).getName());
    }

    @Test
    public void test447_Possum(){
        String AnimalsNames = "Possum";
        ConceptClass cc = new ConceptClass("animals");
        cc.setKeywords("Kingdom: Animalia");
        LongMemory mem = new LongMemory();
        RegisterWiki reg = new RegisterWiki(mem);
        System.out.println(AnimalsNames);
        Concept c = new Concept();
        c.setConceptClass(cc);
        c.setName(cc.getNameClass());
        c.setFoundInDB(false);

        assertEquals(c.getName(),reg.register(AnimalsNames,cc).getName());
    }

    @Test
    public void test448_Prawn(){
        String AnimalsNames = "Prawn";
        ConceptClass cc = new ConceptClass("animals");
        cc.setKeywords("Kingdom: Animalia");
        LongMemory mem = new LongMemory();
        RegisterWiki reg = new RegisterWiki(mem);
        System.out.println(AnimalsNames);
        Concept c = new Concept();
        c.setConceptClass(cc);
        c.setName(cc.getNameClass());
        c.setFoundInDB(false);

        assertEquals(c.getName(),reg.register(AnimalsNames,cc).getName());
    }

    @Test
    public void test449_ProboscisMonkey(){
        String AnimalsNames = "Proboscis Monkey";
        ConceptClass cc = new ConceptClass("animals");
        cc.setKeywords("Kingdom: Animalia");
        LongMemory mem = new LongMemory();
        RegisterWiki reg = new RegisterWiki(mem);
        System.out.println(AnimalsNames);
        Concept c = new Concept();
        c.setConceptClass(cc);
        c.setName(cc.getNameClass());
        c.setFoundInDB(false);

        assertEquals(c.getName(),reg.register(AnimalsNames,cc).getName());
    }

    @Test
    public void test450_PufferFish(){
        String AnimalsNames = "Puffer Fish";
        ConceptClass cc = new ConceptClass("animals");
        cc.setKeywords("Kingdom: Animalia");
        LongMemory mem = new LongMemory();
        RegisterWiki reg = new RegisterWiki(mem);
        System.out.println(AnimalsNames);
        Concept c = new Concept();
        c.setConceptClass(cc);
        c.setName(cc.getNameClass());
        c.setFoundInDB(false);

        assertEquals(c.getName(),reg.register(AnimalsNames,cc).getName());
    }

    @Test
    public void test451_Puffin(){
        String AnimalsNames = "Puffin";
        ConceptClass cc = new ConceptClass("animals");
        cc.setKeywords("Kingdom: Animalia");
        LongMemory mem = new LongMemory();
        RegisterWiki reg = new RegisterWiki(mem);
        System.out.println(AnimalsNames);
        Concept c = new Concept();
        c.setConceptClass(cc);
        c.setName(cc.getNameClass());
        c.setFoundInDB(false);

        assertEquals(c.getName(),reg.register(AnimalsNames,cc).getName());
    }

    @Test
    public void test452_Pug(){
        String AnimalsNames = "Pug";
        ConceptClass cc = new ConceptClass("animals");
        cc.setKeywords("Kingdom: Animalia");
        LongMemory mem = new LongMemory();
        RegisterWiki reg = new RegisterWiki(mem);
        System.out.println(AnimalsNames);
        Concept c = new Concept();
        c.setConceptClass(cc);
        c.setName(cc.getNameClass());
        c.setFoundInDB(false);

        assertEquals(c.getName(),reg.register(AnimalsNames,cc).getName());
    }

    @Test
    public void test453_Puma(){
        String AnimalsNames = "Puma";
        ConceptClass cc = new ConceptClass("animals");
        cc.setKeywords("Kingdom: Animalia");
        LongMemory mem = new LongMemory();
        RegisterWiki reg = new RegisterWiki(mem);
        System.out.println(AnimalsNames);
        Concept c = new Concept();
        c.setConceptClass(cc);
        c.setName(cc.getNameClass());
        c.setFoundInDB(false);

        assertEquals(c.getName(),reg.register(AnimalsNames,cc).getName());
    }

    @Test
    public void test454_PurpleEmperor(){
        String AnimalsNames = "Purple Emperor";
        ConceptClass cc = new ConceptClass("animals");
        cc.setKeywords("Kingdom: Animalia");
        LongMemory mem = new LongMemory();
        RegisterWiki reg = new RegisterWiki(mem);
        System.out.println(AnimalsNames);
        Concept c = new Concept();
        c.setConceptClass(cc);
        c.setName(cc.getNameClass());
        c.setFoundInDB(false);

        assertEquals(c.getName(),reg.register(AnimalsNames,cc).getName());
    }

    @Test
    public void test455_PussMoth(){
        String AnimalsNames = "Puss Moth";
        ConceptClass cc = new ConceptClass("animals");
        cc.setKeywords("Kingdom: Animalia");
        LongMemory mem = new LongMemory();
        RegisterWiki reg = new RegisterWiki(mem);
        System.out.println(AnimalsNames);
        Concept c = new Concept();
        c.setConceptClass(cc);
        c.setName(cc.getNameClass());
        c.setFoundInDB(false);

        assertEquals(c.getName(),reg.register(AnimalsNames,cc).getName());
    }

    @Test
    public void test456_PygmyHippopotamus(){
        String AnimalsNames = "Pygmy Hippopotamus";
        ConceptClass cc = new ConceptClass("animals");
        cc.setKeywords("Kingdom: Animalia");
        LongMemory mem = new LongMemory();
        RegisterWiki reg = new RegisterWiki(mem);
        System.out.println(AnimalsNames);
        Concept c = new Concept();
        c.setConceptClass(cc);
        c.setName(cc.getNameClass());
        c.setFoundInDB(false);

        assertEquals(c.getName(),reg.register(AnimalsNames,cc).getName());
    }

    @Test
    public void test457_PygmyMarmoset(){
        String AnimalsNames = "Pygmy Marmoset";
        ConceptClass cc = new ConceptClass("animals");
        cc.setKeywords("Kingdom: Animalia");
        LongMemory mem = new LongMemory();
        RegisterWiki reg = new RegisterWiki(mem);
        System.out.println(AnimalsNames);
        Concept c = new Concept();
        c.setConceptClass(cc);
        c.setName(cc.getNameClass());
        c.setFoundInDB(false);

        assertEquals(c.getName(),reg.register(AnimalsNames,cc).getName());
    }

    @Test
    public void test458_Q(){
        String AnimalsNames = "Q";
        ConceptClass cc = new ConceptClass("animals");
        cc.setKeywords("Kingdom: Animalia");
        LongMemory mem = new LongMemory();
        RegisterWiki reg = new RegisterWiki(mem);
        System.out.println(AnimalsNames);
        Concept c = new Concept();
        c.setConceptClass(cc);
        c.setName(cc.getNameClass());
        c.setFoundInDB(false);

        assertEquals(c.getName(),reg.register(AnimalsNames,cc).getName());
    }

    @Test
    public void test459_Quail(){
        String AnimalsNames = "Quail";
        ConceptClass cc = new ConceptClass("animals");
        cc.setKeywords("Kingdom: Animalia");
        LongMemory mem = new LongMemory();
        RegisterWiki reg = new RegisterWiki(mem);
        System.out.println(AnimalsNames);
        Concept c = new Concept();
        c.setConceptClass(cc);
        c.setName(cc.getNameClass());
        c.setFoundInDB(false);

        assertEquals(c.getName(),reg.register(AnimalsNames,cc).getName());
    }

    @Test
    public void test460_Quetzal(){
        String AnimalsNames = "Quetzal";
        ConceptClass cc = new ConceptClass("animals");
        cc.setKeywords("Kingdom: Animalia");
        LongMemory mem = new LongMemory();
        RegisterWiki reg = new RegisterWiki(mem);
        System.out.println(AnimalsNames);
        Concept c = new Concept();
        c.setConceptClass(cc);
        c.setName(cc.getNameClass());
        c.setFoundInDB(false);

        assertEquals(c.getName(),reg.register(AnimalsNames,cc).getName());
    }

    @Test
    public void test461_Quokka(){
        String AnimalsNames = "Quokka";
        ConceptClass cc = new ConceptClass("animals");
        cc.setKeywords("Kingdom: Animalia");
        LongMemory mem = new LongMemory();
        RegisterWiki reg = new RegisterWiki(mem);
        System.out.println(AnimalsNames);
        Concept c = new Concept();
        c.setConceptClass(cc);
        c.setName(cc.getNameClass());
        c.setFoundInDB(false);

        assertEquals(c.getName(),reg.register(AnimalsNames,cc).getName());
    }

    @Test
    public void test462_Quoll(){
        String AnimalsNames = "Quoll";
        ConceptClass cc = new ConceptClass("animals");
        cc.setKeywords("Kingdom: Animalia");
        LongMemory mem = new LongMemory();
        RegisterWiki reg = new RegisterWiki(mem);
        System.out.println(AnimalsNames);
        Concept c = new Concept();
        c.setConceptClass(cc);
        c.setName(cc.getNameClass());
        c.setFoundInDB(false);

        assertEquals(c.getName(),reg.register(AnimalsNames,cc).getName());
    }

    @Test
    public void test463_R(){
        String AnimalsNames = "R";
        ConceptClass cc = new ConceptClass("animals");
        cc.setKeywords("Kingdom: Animalia");
        LongMemory mem = new LongMemory();
        RegisterWiki reg = new RegisterWiki(mem);
        System.out.println(AnimalsNames);
        Concept c = new Concept();
        c.setConceptClass(cc);
        c.setName(cc.getNameClass());
        c.setFoundInDB(false);

        assertEquals(c.getName(),reg.register(AnimalsNames,cc).getName());
    }

    @Test
    public void test464_Rabbit(){
        String AnimalsNames = "Rabbit";
        ConceptClass cc = new ConceptClass("animals");
        cc.setKeywords("Kingdom: Animalia");
        LongMemory mem = new LongMemory();
        RegisterWiki reg = new RegisterWiki(mem);
        System.out.println(AnimalsNames);
        Concept c = new Concept();
        c.setConceptClass(cc);
        c.setName(cc.getNameClass());
        c.setFoundInDB(false);

        assertEquals(c.getName(),reg.register(AnimalsNames,cc).getName());
    }

    @Test
    public void test465_Raccoon(){
        String AnimalsNames = "Raccoon";
        ConceptClass cc = new ConceptClass("animals");
        cc.setKeywords("Kingdom: Animalia");
        LongMemory mem = new LongMemory();
        RegisterWiki reg = new RegisterWiki(mem);
        System.out.println(AnimalsNames);
        Concept c = new Concept();
        c.setConceptClass(cc);
        c.setName(cc.getNameClass());
        c.setFoundInDB(false);

        assertEquals(c.getName(),reg.register(AnimalsNames,cc).getName());
    }

    @Test
    public void test466_RaccoonDog(){
        String AnimalsNames = "Raccoon Dog";
        ConceptClass cc = new ConceptClass("animals");
        cc.setKeywords("Kingdom: Animalia");
        LongMemory mem = new LongMemory();
        RegisterWiki reg = new RegisterWiki(mem);
        System.out.println(AnimalsNames);
        Concept c = new Concept();
        c.setConceptClass(cc);
        c.setName(cc.getNameClass());
        c.setFoundInDB(false);

        assertEquals(c.getName(),reg.register(AnimalsNames,cc).getName());
    }

    @Test
    public void test467_RadiatedTortoise(){
        String AnimalsNames = "Radiated Tortoise";
        ConceptClass cc = new ConceptClass("animals");
        cc.setKeywords("Kingdom: Animalia");
        LongMemory mem = new LongMemory();
        RegisterWiki reg = new RegisterWiki(mem);
        System.out.println(AnimalsNames);
        Concept c = new Concept();
        c.setConceptClass(cc);
        c.setName(cc.getNameClass());
        c.setFoundInDB(false);

        assertEquals(c.getName(),reg.register(AnimalsNames,cc).getName());
    }

    @Test
    public void test468_Ragdoll(){
        String AnimalsNames = "Ragdoll";
        ConceptClass cc = new ConceptClass("animals");
        cc.setKeywords("Kingdom: Animalia");
        LongMemory mem = new LongMemory();
        RegisterWiki reg = new RegisterWiki(mem);
        System.out.println(AnimalsNames);
        Concept c = new Concept();
        c.setConceptClass(cc);
        c.setName(cc.getNameClass());
        c.setFoundInDB(false);

        assertEquals(c.getName(),reg.register(AnimalsNames,cc).getName());
    }

    @Test
    public void test469_Rat(){
        String AnimalsNames = "Rat";
        ConceptClass cc = new ConceptClass("animals");
        cc.setKeywords("Kingdom: Animalia");
        LongMemory mem = new LongMemory();
        RegisterWiki reg = new RegisterWiki(mem);
        System.out.println(AnimalsNames);
        Concept c = new Concept();
        c.setConceptClass(cc);
        c.setName(cc.getNameClass());
        c.setFoundInDB(false);

        assertEquals(c.getName(),reg.register(AnimalsNames,cc).getName());
    }

    @Test
    public void test470_Rattlesnake(){
        String AnimalsNames = "Rattlesnake";
        ConceptClass cc = new ConceptClass("animals");
        cc.setKeywords("Kingdom: Animalia");
        LongMemory mem = new LongMemory();
        RegisterWiki reg = new RegisterWiki(mem);
        System.out.println(AnimalsNames);
        Concept c = new Concept();
        c.setConceptClass(cc);
        c.setName(cc.getNameClass());
        c.setFoundInDB(false);

        assertEquals(c.getName(),reg.register(AnimalsNames,cc).getName());
    }

    @Test
    public void test471_RedKneeTarantula(){
        String AnimalsNames = "Red Knee Tarantula";
        ConceptClass cc = new ConceptClass("animals");
        cc.setKeywords("Kingdom: Animalia");
        LongMemory mem = new LongMemory();
        RegisterWiki reg = new RegisterWiki(mem);
        System.out.println(AnimalsNames);
        Concept c = new Concept();
        c.setConceptClass(cc);
        c.setName(cc.getNameClass());
        c.setFoundInDB(false);

        assertEquals(c.getName(),reg.register(AnimalsNames,cc).getName());
    }

    @Test
    public void test472_RedPanda(){
        String AnimalsNames = "Red Panda";
        ConceptClass cc = new ConceptClass("animals");
        cc.setKeywords("Kingdom: Animalia");
        LongMemory mem = new LongMemory();
        RegisterWiki reg = new RegisterWiki(mem);
        System.out.println(AnimalsNames);
        Concept c = new Concept();
        c.setConceptClass(cc);
        c.setName(cc.getNameClass());
        c.setFoundInDB(false);

        assertEquals(c.getName(),reg.register(AnimalsNames,cc).getName());
    }

    @Test
    public void test473_RedWolf(){
        String AnimalsNames = "Red Wolf";
        ConceptClass cc = new ConceptClass("animals");
        cc.setKeywords("Kingdom: Animalia");
        LongMemory mem = new LongMemory();
        RegisterWiki reg = new RegisterWiki(mem);
        System.out.println(AnimalsNames);
        Concept c = new Concept();
        c.setConceptClass(cc);
        c.setName(cc.getNameClass());
        c.setFoundInDB(false);

        assertEquals(c.getName(),reg.register(AnimalsNames,cc).getName());
    }

    @Test
    public void test474_RedhandedTamarin(){
        String AnimalsNames = "Red-handed Tamarin";
        ConceptClass cc = new ConceptClass("animals");
        cc.setKeywords("Kingdom: Animalia");
        LongMemory mem = new LongMemory();
        RegisterWiki reg = new RegisterWiki(mem);
        System.out.println(AnimalsNames);
        Concept c = new Concept();
        c.setConceptClass(cc);
        c.setName(cc.getNameClass());
        c.setFoundInDB(false);

        assertEquals(c.getName(),reg.register(AnimalsNames,cc).getName());
    }

    @Test
    public void test475_Reindeer(){
        String AnimalsNames = "Reindeer";
        ConceptClass cc = new ConceptClass("animals");
        cc.setKeywords("Kingdom: Animalia");
        LongMemory mem = new LongMemory();
        RegisterWiki reg = new RegisterWiki(mem);
        System.out.println(AnimalsNames);
        Concept c = new Concept();
        c.setConceptClass(cc);
        c.setName(cc.getNameClass());
        c.setFoundInDB(false);

        assertEquals(c.getName(),reg.register(AnimalsNames,cc).getName());
    }

    @Test
    public void test476_Rhinoceros(){
        String AnimalsNames = "Rhinoceros";
        ConceptClass cc = new ConceptClass("animals");
        cc.setKeywords("Kingdom: Animalia");
        LongMemory mem = new LongMemory();
        RegisterWiki reg = new RegisterWiki(mem);
        System.out.println(AnimalsNames);
        Concept c = new Concept();
        c.setConceptClass(cc);
        c.setName(cc.getNameClass());
        c.setFoundInDB(false);

        assertEquals(c.getName(),reg.register(AnimalsNames,cc).getName());
    }

    @Test
    public void test477_RiverDolphin(){
        String AnimalsNames = "River Dolphin";
        ConceptClass cc = new ConceptClass("animals");
        cc.setKeywords("Kingdom: Animalia");
        LongMemory mem = new LongMemory();
        RegisterWiki reg = new RegisterWiki(mem);
        System.out.println(AnimalsNames);
        Concept c = new Concept();
        c.setConceptClass(cc);
        c.setName(cc.getNameClass());
        c.setFoundInDB(false);

        assertEquals(c.getName(),reg.register(AnimalsNames,cc).getName());
    }

    @Test
    public void test478_RiverTurtle(){
        String AnimalsNames = "River Turtle";
        ConceptClass cc = new ConceptClass("animals");
        cc.setKeywords("Kingdom: Animalia");
        LongMemory mem = new LongMemory();
        RegisterWiki reg = new RegisterWiki(mem);
        System.out.println(AnimalsNames);
        Concept c = new Concept();
        c.setConceptClass(cc);
        c.setName(cc.getNameClass());
        c.setFoundInDB(false);

        assertEquals(c.getName(),reg.register(AnimalsNames,cc).getName());
    }

    @Test
    public void test479_Robin(){
        String AnimalsNames = "Robin";
        ConceptClass cc = new ConceptClass("animals");
        cc.setKeywords("Kingdom: Animalia");
        LongMemory mem = new LongMemory();
        RegisterWiki reg = new RegisterWiki(mem);
        System.out.println(AnimalsNames);
        Concept c = new Concept();
        c.setConceptClass(cc);
        c.setName(cc.getNameClass());
        c.setFoundInDB(false);

        assertEquals(c.getName(),reg.register(AnimalsNames,cc).getName());
    }

    @Test
    public void test480_RockHyrax(){
        String AnimalsNames = "Rock Hyrax";
        ConceptClass cc = new ConceptClass("animals");
        cc.setKeywords("Kingdom: Animalia");
        LongMemory mem = new LongMemory();
        RegisterWiki reg = new RegisterWiki(mem);
        System.out.println(AnimalsNames);
        Concept c = new Concept();
        c.setConceptClass(cc);
        c.setName(cc.getNameClass());
        c.setFoundInDB(false);

        assertEquals(c.getName(),reg.register(AnimalsNames,cc).getName());
    }

    @Test
    public void test481_RockhopperPenguin(){
        String AnimalsNames = "Rockhopper Penguin";
        ConceptClass cc = new ConceptClass("animals");
        cc.setKeywords("Kingdom: Animalia");
        LongMemory mem = new LongMemory();
        RegisterWiki reg = new RegisterWiki(mem);
        System.out.println(AnimalsNames);
        Concept c = new Concept();
        c.setConceptClass(cc);
        c.setName(cc.getNameClass());
        c.setFoundInDB(false);

        assertEquals(c.getName(),reg.register(AnimalsNames,cc).getName());
    }

    @Test
    public void test482_RoseateSpoonbill(){
        String AnimalsNames = "Roseate Spoonbill";
        ConceptClass cc = new ConceptClass("animals");
        cc.setKeywords("Kingdom: Animalia");
        LongMemory mem = new LongMemory();
        RegisterWiki reg = new RegisterWiki(mem);
        System.out.println(AnimalsNames);
        Concept c = new Concept();
        c.setConceptClass(cc);
        c.setName(cc.getNameClass());
        c.setFoundInDB(false);

        assertEquals(c.getName(),reg.register(AnimalsNames,cc).getName());
    }

    @Test
    public void test483_Rottweiler(){
        String AnimalsNames = "Rottweiler";
        ConceptClass cc = new ConceptClass("animals");
        cc.setKeywords("Kingdom: Animalia");
        LongMemory mem = new LongMemory();
        RegisterWiki reg = new RegisterWiki(mem);
        System.out.println(AnimalsNames);
        Concept c = new Concept();
        c.setConceptClass(cc);
        c.setName(cc.getNameClass());
        c.setFoundInDB(false);

        assertEquals(c.getName(),reg.register(AnimalsNames,cc).getName());
    }

    @Test
    public void test484_RoyalPenguin(){
        String AnimalsNames = "Royal Penguin";
        ConceptClass cc = new ConceptClass("animals");
        cc.setKeywords("Kingdom: Animalia");
        LongMemory mem = new LongMemory();
        RegisterWiki reg = new RegisterWiki(mem);
        System.out.println(AnimalsNames);
        Concept c = new Concept();
        c.setConceptClass(cc);
        c.setName(cc.getNameClass());
        c.setFoundInDB(false);

        assertEquals(c.getName(),reg.register(AnimalsNames,cc).getName());
    }

    @Test
    public void test485_RussianBlue(){
        String AnimalsNames = "Russian Blue";
        ConceptClass cc = new ConceptClass("animals");
        cc.setKeywords("Kingdom: Animalia");
        LongMemory mem = new LongMemory();
        RegisterWiki reg = new RegisterWiki(mem);
        System.out.println(AnimalsNames);
        Concept c = new Concept();
        c.setConceptClass(cc);
        c.setName(cc.getNameClass());
        c.setFoundInDB(false);

        assertEquals(c.getName(),reg.register(AnimalsNames,cc).getName());
    }

    @Test
    public void test486_S(){
        String AnimalsNames = "S";
        ConceptClass cc = new ConceptClass("animals");
        cc.setKeywords("Kingdom: Animalia");
        LongMemory mem = new LongMemory();
        RegisterWiki reg = new RegisterWiki(mem);
        System.out.println(AnimalsNames);
        Concept c = new Concept();
        c.setConceptClass(cc);
        c.setName(cc.getNameClass());
        c.setFoundInDB(false);

        assertEquals(c.getName(),reg.register(AnimalsNames,cc).getName());
    }

    @Test
    public void test487_SabreToothedTiger(){
        String AnimalsNames = "Sabre-Toothed Tiger";
        ConceptClass cc = new ConceptClass("animals");
        cc.setKeywords("Kingdom: Animalia");
        LongMemory mem = new LongMemory();
        RegisterWiki reg = new RegisterWiki(mem);
        System.out.println(AnimalsNames);
        Concept c = new Concept();
        c.setConceptClass(cc);
        c.setName(cc.getNameClass());
        c.setFoundInDB(false);

        assertEquals(c.getName(),reg.register(AnimalsNames,cc).getName());
    }

    @Test
    public void test488_SaintBernard(){
        String AnimalsNames = "Saint Bernard";
        ConceptClass cc = new ConceptClass("animals");
        cc.setKeywords("Kingdom: Animalia");
        LongMemory mem = new LongMemory();
        RegisterWiki reg = new RegisterWiki(mem);
        System.out.println(AnimalsNames);
        Concept c = new Concept();
        c.setConceptClass(cc);
        c.setName(cc.getNameClass());
        c.setFoundInDB(false);

        assertEquals(c.getName(),reg.register(AnimalsNames,cc).getName());
    }

    @Test
    public void test489_Salamander(){
        String AnimalsNames = "Salamander";
        ConceptClass cc = new ConceptClass("animals");
        cc.setKeywords("Kingdom: Animalia");
        LongMemory mem = new LongMemory();
        RegisterWiki reg = new RegisterWiki(mem);
        System.out.println(AnimalsNames);
        Concept c = new Concept();
        c.setConceptClass(cc);
        c.setName(cc.getNameClass());
        c.setFoundInDB(false);

        assertEquals(c.getName(),reg.register(AnimalsNames,cc).getName());
    }

    @Test
    public void test490_SandLizard(){
        String AnimalsNames = "Sand Lizard";
        ConceptClass cc = new ConceptClass("animals");
        cc.setKeywords("Kingdom: Animalia");
        LongMemory mem = new LongMemory();
        RegisterWiki reg = new RegisterWiki(mem);
        System.out.println(AnimalsNames);
        Concept c = new Concept();
        c.setConceptClass(cc);
        c.setName(cc.getNameClass());
        c.setFoundInDB(false);

        assertEquals(c.getName(),reg.register(AnimalsNames,cc).getName());
    }

    @Test
    public void test491_Saola(){
        String AnimalsNames = "Saola";
        ConceptClass cc = new ConceptClass("animals");
        cc.setKeywords("Kingdom: Animalia");
        LongMemory mem = new LongMemory();
        RegisterWiki reg = new RegisterWiki(mem);
        System.out.println(AnimalsNames);
        Concept c = new Concept();
        c.setConceptClass(cc);
        c.setName(cc.getNameClass());
        c.setFoundInDB(false);

        assertEquals(c.getName(),reg.register(AnimalsNames,cc).getName());
    }

    @Test
    public void test492_Scorpion(){
        String AnimalsNames = "Scorpion";
        ConceptClass cc = new ConceptClass("animals");
        cc.setKeywords("Kingdom: Animalia");
        LongMemory mem = new LongMemory();
        RegisterWiki reg = new RegisterWiki(mem);
        System.out.println(AnimalsNames);
        Concept c = new Concept();
        c.setConceptClass(cc);
        c.setName(cc.getNameClass());
        c.setFoundInDB(false);

        assertEquals(c.getName(),reg.register(AnimalsNames,cc).getName());
    }

    @Test
    public void test493_ScorpionFish(){
        String AnimalsNames = "Scorpion Fish";
        ConceptClass cc = new ConceptClass("animals");
        cc.setKeywords("Kingdom: Animalia");
        LongMemory mem = new LongMemory();
        RegisterWiki reg = new RegisterWiki(mem);
        System.out.println(AnimalsNames);
        Concept c = new Concept();
        c.setConceptClass(cc);
        c.setName(cc.getNameClass());
        c.setFoundInDB(false);

        assertEquals(c.getName(),reg.register(AnimalsNames,cc).getName());
    }

    @Test
    public void test494_SeaDragon(){
        String AnimalsNames = "Sea Dragon";
        ConceptClass cc = new ConceptClass("animals");
        cc.setKeywords("Kingdom: Animalia");
        LongMemory mem = new LongMemory();
        RegisterWiki reg = new RegisterWiki(mem);
        System.out.println(AnimalsNames);
        Concept c = new Concept();
        c.setConceptClass(cc);
        c.setName(cc.getNameClass());
        c.setFoundInDB(false);

        assertEquals(c.getName(),reg.register(AnimalsNames,cc).getName());
    }

    @Test
    public void test495_SeaLion(){
        String AnimalsNames = "Sea Lion";
        ConceptClass cc = new ConceptClass("animals");
        cc.setKeywords("Kingdom: Animalia");
        LongMemory mem = new LongMemory();
        RegisterWiki reg = new RegisterWiki(mem);
        System.out.println(AnimalsNames);
        Concept c = new Concept();
        c.setConceptClass(cc);
        c.setName(cc.getNameClass());
        c.setFoundInDB(false);

        assertEquals(c.getName(),reg.register(AnimalsNames,cc).getName());
    }

    @Test
    public void test496_SeaOtter(){
        String AnimalsNames = "Sea Otter";
        ConceptClass cc = new ConceptClass("animals");
        cc.setKeywords("Kingdom: Animalia");
        LongMemory mem = new LongMemory();
        RegisterWiki reg = new RegisterWiki(mem);
        System.out.println(AnimalsNames);
        Concept c = new Concept();
        c.setConceptClass(cc);
        c.setName(cc.getNameClass());
        c.setFoundInDB(false);

        assertEquals(c.getName(),reg.register(AnimalsNames,cc).getName());
    }

    @Test
    public void test497_SeaSlug(){
        String AnimalsNames = "Sea Slug";
        ConceptClass cc = new ConceptClass("animals");
        cc.setKeywords("Kingdom: Animalia");
        LongMemory mem = new LongMemory();
        RegisterWiki reg = new RegisterWiki(mem);
        System.out.println(AnimalsNames);
        Concept c = new Concept();
        c.setConceptClass(cc);
        c.setName(cc.getNameClass());
        c.setFoundInDB(false);

        assertEquals(c.getName(),reg.register(AnimalsNames,cc).getName());
    }

    @Test
    public void test498_SeaSquirt(){
        String AnimalsNames = "Sea Squirt";
        ConceptClass cc = new ConceptClass("animals");
        cc.setKeywords("Kingdom: Animalia");
        LongMemory mem = new LongMemory();
        RegisterWiki reg = new RegisterWiki(mem);
        System.out.println(AnimalsNames);
        Concept c = new Concept();
        c.setConceptClass(cc);
        c.setName(cc.getNameClass());
        c.setFoundInDB(false);

        assertEquals(c.getName(),reg.register(AnimalsNames,cc).getName());
    }

    @Test
    public void test499_SeaTurtle(){
        String AnimalsNames = "Sea Turtle";
        ConceptClass cc = new ConceptClass("animals");
        cc.setKeywords("Kingdom: Animalia");
        LongMemory mem = new LongMemory();
        RegisterWiki reg = new RegisterWiki(mem);
        System.out.println(AnimalsNames);
        Concept c = new Concept();
        c.setConceptClass(cc);
        c.setName(cc.getNameClass());
        c.setFoundInDB(false);

        assertEquals(c.getName(),reg.register(AnimalsNames,cc).getName());
    }

    @Test
    public void test500_SeaUrchin(){
        String AnimalsNames = "Sea Urchin";
        ConceptClass cc = new ConceptClass("animals");
        cc.setKeywords("Kingdom: Animalia");
        LongMemory mem = new LongMemory();
        RegisterWiki reg = new RegisterWiki(mem);
        System.out.println(AnimalsNames);
        Concept c = new Concept();
        c.setConceptClass(cc);
        c.setName(cc.getNameClass());
        c.setFoundInDB(false);

        assertEquals(c.getName(),reg.register(AnimalsNames,cc).getName());
    }

    @Test
    public void test501_Seahorse(){
        String AnimalsNames = "Seahorse";
        ConceptClass cc = new ConceptClass("animals");
        cc.setKeywords("Kingdom: Animalia");
        LongMemory mem = new LongMemory();
        RegisterWiki reg = new RegisterWiki(mem);
        System.out.println(AnimalsNames);
        Concept c = new Concept();
        c.setConceptClass(cc);
        c.setName(cc.getNameClass());
        c.setFoundInDB(false);

        assertEquals(c.getName(),reg.register(AnimalsNames,cc).getName());
    }

    @Test
    public void test502_Seal(){
        String AnimalsNames = "Seal";
        ConceptClass cc = new ConceptClass("animals");
        cc.setKeywords("Kingdom: Animalia");
        LongMemory mem = new LongMemory();
        RegisterWiki reg = new RegisterWiki(mem);
        System.out.println(AnimalsNames);
        Concept c = new Concept();
        c.setConceptClass(cc);
        c.setName(cc.getNameClass());
        c.setFoundInDB(false);

        assertEquals(c.getName(),reg.register(AnimalsNames,cc).getName());
    }

    @Test
    public void test503_Serval(){
        String AnimalsNames = "Serval";
        ConceptClass cc = new ConceptClass("animals");
        cc.setKeywords("Kingdom: Animalia");
        LongMemory mem = new LongMemory();
        RegisterWiki reg = new RegisterWiki(mem);
        System.out.println(AnimalsNames);
        Concept c = new Concept();
        c.setConceptClass(cc);
        c.setName(cc.getNameClass());
        c.setFoundInDB(false);

        assertEquals(c.getName(),reg.register(AnimalsNames,cc).getName());
    }

    @Test
    public void test504_Sheep(){
        String AnimalsNames = "Sheep";
        ConceptClass cc = new ConceptClass("animals");
        cc.setKeywords("Kingdom: Animalia");
        LongMemory mem = new LongMemory();
        RegisterWiki reg = new RegisterWiki(mem);
        System.out.println(AnimalsNames);
        Concept c = new Concept();
        c.setConceptClass(cc);
        c.setName(cc.getNameClass());
        c.setFoundInDB(false);

        assertEquals(c.getName(),reg.register(AnimalsNames,cc).getName());
    }

    @Test
    public void test505_ShihTzu(){
        String AnimalsNames = "Shih Tzu";
        ConceptClass cc = new ConceptClass("animals");
        cc.setKeywords("Kingdom: Animalia");
        LongMemory mem = new LongMemory();
        RegisterWiki reg = new RegisterWiki(mem);
        System.out.println(AnimalsNames);
        Concept c = new Concept();
        c.setConceptClass(cc);
        c.setName(cc.getNameClass());
        c.setFoundInDB(false);

        assertEquals(c.getName(),reg.register(AnimalsNames,cc).getName());
    }

    @Test
    public void test506_Shrimp(){
        String AnimalsNames = "Shrimp";
        ConceptClass cc = new ConceptClass("animals");
        cc.setKeywords("Kingdom: Animalia");
        LongMemory mem = new LongMemory();
        RegisterWiki reg = new RegisterWiki(mem);
        System.out.println(AnimalsNames);
        Concept c = new Concept();
        c.setConceptClass(cc);
        c.setName(cc.getNameClass());
        c.setFoundInDB(false);

        assertEquals(c.getName(),reg.register(AnimalsNames,cc).getName());
    }

    @Test
    public void test507_Siamese(){
        String AnimalsNames = "Siamese";
        ConceptClass cc = new ConceptClass("animals");
        cc.setKeywords("Kingdom: Animalia");
        LongMemory mem = new LongMemory();
        RegisterWiki reg = new RegisterWiki(mem);
        System.out.println(AnimalsNames);
        Concept c = new Concept();
        c.setConceptClass(cc);
        c.setName(cc.getNameClass());
        c.setFoundInDB(false);

        assertEquals(c.getName(),reg.register(AnimalsNames,cc).getName());
    }

    @Test
    public void test508_SiameseFightingFish(){
        String AnimalsNames = "Siamese Fighting Fish";
        ConceptClass cc = new ConceptClass("animals");
        cc.setKeywords("Kingdom: Animalia");
        LongMemory mem = new LongMemory();
        RegisterWiki reg = new RegisterWiki(mem);
        System.out.println(AnimalsNames);
        Concept c = new Concept();
        c.setConceptClass(cc);
        c.setName(cc.getNameClass());
        c.setFoundInDB(false);

        assertEquals(c.getName(),reg.register(AnimalsNames,cc).getName());
    }

    @Test
    public void test509_Siberian(){
        String AnimalsNames = "Siberian";
        ConceptClass cc = new ConceptClass("animals");
        cc.setKeywords("Kingdom: Animalia");
        LongMemory mem = new LongMemory();
        RegisterWiki reg = new RegisterWiki(mem);
        System.out.println(AnimalsNames);
        Concept c = new Concept();
        c.setConceptClass(cc);
        c.setName(cc.getNameClass());
        c.setFoundInDB(false);

        assertEquals(c.getName(),reg.register(AnimalsNames,cc).getName());
    }

    @Test
    public void test510_SiberianHusky(){
        String AnimalsNames = "Siberian Husky";
        ConceptClass cc = new ConceptClass("animals");
        cc.setKeywords("Kingdom: Animalia");
        LongMemory mem = new LongMemory();
        RegisterWiki reg = new RegisterWiki(mem);
        System.out.println(AnimalsNames);
        Concept c = new Concept();
        c.setConceptClass(cc);
        c.setName(cc.getNameClass());
        c.setFoundInDB(false);

        assertEquals(c.getName(),reg.register(AnimalsNames,cc).getName());
    }

    @Test
    public void test511_SiberianTiger(){
        String AnimalsNames = "Siberian Tiger";
        ConceptClass cc = new ConceptClass("animals");
        cc.setKeywords("Kingdom: Animalia");
        LongMemory mem = new LongMemory();
        RegisterWiki reg = new RegisterWiki(mem);
        System.out.println(AnimalsNames);
        Concept c = new Concept();
        c.setConceptClass(cc);
        c.setName(cc.getNameClass());
        c.setFoundInDB(false);

        assertEquals(c.getName(),reg.register(AnimalsNames,cc).getName());
    }

    @Test
    public void test512_SilverDollar(){
        String AnimalsNames = "Silver Dollar";
        ConceptClass cc = new ConceptClass("animals");
        cc.setKeywords("Kingdom: Animalia");
        LongMemory mem = new LongMemory();
        RegisterWiki reg = new RegisterWiki(mem);
        System.out.println(AnimalsNames);
        Concept c = new Concept();
        c.setConceptClass(cc);
        c.setName(cc.getNameClass());
        c.setFoundInDB(false);

        assertEquals(c.getName(),reg.register(AnimalsNames,cc).getName());
    }

    @Test
    public void test513_Skunk(){
        String AnimalsNames = "Skunk";
        ConceptClass cc = new ConceptClass("animals");
        cc.setKeywords("Kingdom: Animalia");
        LongMemory mem = new LongMemory();
        RegisterWiki reg = new RegisterWiki(mem);
        System.out.println(AnimalsNames);
        Concept c = new Concept();
        c.setConceptClass(cc);
        c.setName(cc.getNameClass());
        c.setFoundInDB(false);

        assertEquals(c.getName(),reg.register(AnimalsNames,cc).getName());
    }

    @Test
    public void test514_Sloth(){
        String AnimalsNames = "Sloth";
        ConceptClass cc = new ConceptClass("animals");
        cc.setKeywords("Kingdom: Animalia");
        LongMemory mem = new LongMemory();
        RegisterWiki reg = new RegisterWiki(mem);
        System.out.println(AnimalsNames);
        Concept c = new Concept();
        c.setConceptClass(cc);
        c.setName(cc.getNameClass());
        c.setFoundInDB(false);

        assertEquals(c.getName(),reg.register(AnimalsNames,cc).getName());
    }

    @Test
    public void test515_SlowWorm(){
        String AnimalsNames = "Slow Worm";
        ConceptClass cc = new ConceptClass("animals");
        cc.setKeywords("Kingdom: Animalia");
        LongMemory mem = new LongMemory();
        RegisterWiki reg = new RegisterWiki(mem);
        System.out.println(AnimalsNames);
        Concept c = new Concept();
        c.setConceptClass(cc);
        c.setName(cc.getNameClass());
        c.setFoundInDB(false);

        assertEquals(c.getName(),reg.register(AnimalsNames,cc).getName());
    }

    @Test
    public void test516_Snail(){
        String AnimalsNames = "Snail";
        ConceptClass cc = new ConceptClass("animals");
        cc.setKeywords("Kingdom: Animalia");
        LongMemory mem = new LongMemory();
        RegisterWiki reg = new RegisterWiki(mem);
        System.out.println(AnimalsNames);
        Concept c = new Concept();
        c.setConceptClass(cc);
        c.setName(cc.getNameClass());
        c.setFoundInDB(false);

        assertEquals(c.getName(),reg.register(AnimalsNames,cc).getName());
    }

    @Test
    public void test517_Snake(){
        String AnimalsNames = "Snake";
        ConceptClass cc = new ConceptClass("animals");
        cc.setKeywords("Kingdom: Animalia");
        LongMemory mem = new LongMemory();
        RegisterWiki reg = new RegisterWiki(mem);
        System.out.println(AnimalsNames);
        Concept c = new Concept();
        c.setConceptClass(cc);
        c.setName(cc.getNameClass());
        c.setFoundInDB(false);

        assertEquals(c.getName(),reg.register(AnimalsNames,cc).getName());
    }

    @Test
    public void test518_SnappingTurtle(){
        String AnimalsNames = "Snapping Turtle";
        ConceptClass cc = new ConceptClass("animals");
        cc.setKeywords("Kingdom: Animalia");
        LongMemory mem = new LongMemory();
        RegisterWiki reg = new RegisterWiki(mem);
        System.out.println(AnimalsNames);
        Concept c = new Concept();
        c.setConceptClass(cc);
        c.setName(cc.getNameClass());
        c.setFoundInDB(false);

        assertEquals(c.getName(),reg.register(AnimalsNames,cc).getName());
    }

    @Test
    public void test519_Snowshoe(){
        String AnimalsNames = "Snowshoe";
        ConceptClass cc = new ConceptClass("animals");
        cc.setKeywords("Kingdom: Animalia");
        LongMemory mem = new LongMemory();
        RegisterWiki reg = new RegisterWiki(mem);
        System.out.println(AnimalsNames);
        Concept c = new Concept();
        c.setConceptClass(cc);
        c.setName(cc.getNameClass());
        c.setFoundInDB(false);

        assertEquals(c.getName(),reg.register(AnimalsNames,cc).getName());
    }

    @Test
    public void test520_SnowyOwl(){
        String AnimalsNames = "Snowy Owl";
        ConceptClass cc = new ConceptClass("animals");
        cc.setKeywords("Kingdom: Animalia");
        LongMemory mem = new LongMemory();
        RegisterWiki reg = new RegisterWiki(mem);
        System.out.println(AnimalsNames);
        Concept c = new Concept();
        c.setConceptClass(cc);
        c.setName(cc.getNameClass());
        c.setFoundInDB(false);

        assertEquals(c.getName(),reg.register(AnimalsNames,cc).getName());
    }

    @Test
    public void test521_Somali(){
        String AnimalsNames = "Somali";
        ConceptClass cc = new ConceptClass("animals");
        cc.setKeywords("Kingdom: Animalia");
        LongMemory mem = new LongMemory();
        RegisterWiki reg = new RegisterWiki(mem);
        System.out.println(AnimalsNames);
        Concept c = new Concept();
        c.setConceptClass(cc);
        c.setName(cc.getNameClass());
        c.setFoundInDB(false);

        assertEquals(c.getName(),reg.register(AnimalsNames,cc).getName());
    }

    @Test
    public void test522_SouthChinaTiger(){
        String AnimalsNames = "South China Tiger";
        ConceptClass cc = new ConceptClass("animals");
        cc.setKeywords("Kingdom: Animalia");
        LongMemory mem = new LongMemory();
        RegisterWiki reg = new RegisterWiki(mem);
        System.out.println(AnimalsNames);
        Concept c = new Concept();
        c.setConceptClass(cc);
        c.setName(cc.getNameClass());
        c.setFoundInDB(false);

        assertEquals(c.getName(),reg.register(AnimalsNames,cc).getName());
    }

    @Test
    public void test523_SpadefootToad(){
        String AnimalsNames = "Spadefoot Toad";
        ConceptClass cc = new ConceptClass("animals");
        cc.setKeywords("Kingdom: Animalia");
        LongMemory mem = new LongMemory();
        RegisterWiki reg = new RegisterWiki(mem);
        System.out.println(AnimalsNames);
        Concept c = new Concept();
        c.setConceptClass(cc);
        c.setName(cc.getNameClass());
        c.setFoundInDB(false);

        assertEquals(c.getName(),reg.register(AnimalsNames,cc).getName());
    }

    @Test
    public void test524_Sparrow(){
        String AnimalsNames = "Sparrow";
        ConceptClass cc = new ConceptClass("animals");
        cc.setKeywords("Kingdom: Animalia");
        LongMemory mem = new LongMemory();
        RegisterWiki reg = new RegisterWiki(mem);
        System.out.println(AnimalsNames);
        Concept c = new Concept();
        c.setConceptClass(cc);
        c.setName(cc.getNameClass());
        c.setFoundInDB(false);

        assertEquals(c.getName(),reg.register(AnimalsNames,cc).getName());
    }

    @Test
    public void test525_SpectacledBear(){
        String AnimalsNames = "Spectacled Bear";
        ConceptClass cc = new ConceptClass("animals");
        cc.setKeywords("Kingdom: Animalia");
        LongMemory mem = new LongMemory();
        RegisterWiki reg = new RegisterWiki(mem);
        System.out.println(AnimalsNames);
        Concept c = new Concept();
        c.setConceptClass(cc);
        c.setName(cc.getNameClass());
        c.setFoundInDB(false);

        assertEquals(c.getName(),reg.register(AnimalsNames,cc).getName());
    }

    @Test
    public void test526_SpermWhale(){
        String AnimalsNames = "Sperm Whale";
        ConceptClass cc = new ConceptClass("animals");
        cc.setKeywords("Kingdom: Animalia");
        LongMemory mem = new LongMemory();
        RegisterWiki reg = new RegisterWiki(mem);
        System.out.println(AnimalsNames);
        Concept c = new Concept();
        c.setConceptClass(cc);
        c.setName(cc.getNameClass());
        c.setFoundInDB(false);

        assertEquals(c.getName(),reg.register(AnimalsNames,cc).getName());
    }

    @Test
    public void test527_SpiderMonkey(){
        String AnimalsNames = "Spider Monkey";
        ConceptClass cc = new ConceptClass("animals");
        cc.setKeywords("Kingdom: Animalia");
        LongMemory mem = new LongMemory();
        RegisterWiki reg = new RegisterWiki(mem);
        System.out.println(AnimalsNames);
        Concept c = new Concept();
        c.setConceptClass(cc);
        c.setName(cc.getNameClass());
        c.setFoundInDB(false);

        assertEquals(c.getName(),reg.register(AnimalsNames,cc).getName());
    }

    @Test
    public void test528_SpinyDogfish(){
        String AnimalsNames = "Spiny Dogfish";
        ConceptClass cc = new ConceptClass("animals");
        cc.setKeywords("Kingdom: Animalia");
        LongMemory mem = new LongMemory();
        RegisterWiki reg = new RegisterWiki(mem);
        System.out.println(AnimalsNames);
        Concept c = new Concept();
        c.setConceptClass(cc);
        c.setName(cc.getNameClass());
        c.setFoundInDB(false);

        assertEquals(c.getName(),reg.register(AnimalsNames,cc).getName());
    }

    @Test
    public void test529_Sponge(){
        String AnimalsNames = "Sponge";
        ConceptClass cc = new ConceptClass("animals");
        cc.setKeywords("Kingdom: Animalia");
        LongMemory mem = new LongMemory();
        RegisterWiki reg = new RegisterWiki(mem);
        System.out.println(AnimalsNames);
        Concept c = new Concept();
        c.setConceptClass(cc);
        c.setName(cc.getNameClass());
        c.setFoundInDB(false);

        assertEquals(c.getName(),reg.register(AnimalsNames,cc).getName());
    }

    @Test
    public void test530_Squid(){
        String AnimalsNames = "Squid";
        ConceptClass cc = new ConceptClass("animals");
        cc.setKeywords("Kingdom: Animalia");
        LongMemory mem = new LongMemory();
        RegisterWiki reg = new RegisterWiki(mem);
        System.out.println(AnimalsNames);
        Concept c = new Concept();
        c.setConceptClass(cc);
        c.setName(cc.getNameClass());
        c.setFoundInDB(false);

        assertEquals(c.getName(),reg.register(AnimalsNames,cc).getName());
    }

    @Test
    public void test531_Squirrel(){
        String AnimalsNames = "Squirrel";
        ConceptClass cc = new ConceptClass("animals");
        cc.setKeywords("Kingdom: Animalia");
        LongMemory mem = new LongMemory();
        RegisterWiki reg = new RegisterWiki(mem);
        System.out.println(AnimalsNames);
        Concept c = new Concept();
        c.setConceptClass(cc);
        c.setName(cc.getNameClass());
        c.setFoundInDB(false);

        assertEquals(c.getName(),reg.register(AnimalsNames,cc).getName());
    }

    @Test
    public void test532_SquirrelMonkey(){
        String AnimalsNames = "Squirrel Monkey";
        ConceptClass cc = new ConceptClass("animals");
        cc.setKeywords("Kingdom: Animalia");
        LongMemory mem = new LongMemory();
        RegisterWiki reg = new RegisterWiki(mem);
        System.out.println(AnimalsNames);
        Concept c = new Concept();
        c.setConceptClass(cc);
        c.setName(cc.getNameClass());
        c.setFoundInDB(false);

        assertEquals(c.getName(),reg.register(AnimalsNames,cc).getName());
    }

    @Test
    public void test533_SriLankanElephant(){
        String AnimalsNames = "Sri Lankan Elephant";
        ConceptClass cc = new ConceptClass("animals");
        cc.setKeywords("Kingdom: Animalia");
        LongMemory mem = new LongMemory();
        RegisterWiki reg = new RegisterWiki(mem);
        System.out.println(AnimalsNames);
        Concept c = new Concept();
        c.setConceptClass(cc);
        c.setName(cc.getNameClass());
        c.setFoundInDB(false);

        assertEquals(c.getName(),reg.register(AnimalsNames,cc).getName());
    }

    @Test
    public void test534_StaffordshireBullTerrier(){
        String AnimalsNames = "Staffordshire Bull Terrier";
        ConceptClass cc = new ConceptClass("animals");
        cc.setKeywords("Kingdom: Animalia");
        LongMemory mem = new LongMemory();
        RegisterWiki reg = new RegisterWiki(mem);
        System.out.println(AnimalsNames);
        Concept c = new Concept();
        c.setConceptClass(cc);
        c.setName(cc.getNameClass());
        c.setFoundInDB(false);

        assertEquals(c.getName(),reg.register(AnimalsNames,cc).getName());
    }

    @Test
    public void test535_StagBeetle(){
        String AnimalsNames = "Stag Beetle";
        ConceptClass cc = new ConceptClass("animals");
        cc.setKeywords("Kingdom: Animalia");
        LongMemory mem = new LongMemory();
        RegisterWiki reg = new RegisterWiki(mem);
        System.out.println(AnimalsNames);
        Concept c = new Concept();
        c.setConceptClass(cc);
        c.setName(cc.getNameClass());
        c.setFoundInDB(false);

        assertEquals(c.getName(),reg.register(AnimalsNames,cc).getName());
    }

    @Test
    public void test536_Starfish(){
        String AnimalsNames = "Starfish";
        ConceptClass cc = new ConceptClass("animals");
        cc.setKeywords("Kingdom: Animalia");
        LongMemory mem = new LongMemory();
        RegisterWiki reg = new RegisterWiki(mem);
        System.out.println(AnimalsNames);
        Concept c = new Concept();
        c.setConceptClass(cc);
        c.setName(cc.getNameClass());
        c.setFoundInDB(false);

        assertEquals(c.getName(),reg.register(AnimalsNames,cc).getName());
    }

    @Test
    public void test537_StellersSeaCow(){
        String AnimalsNames = "Stellers Sea Cow";
        ConceptClass cc = new ConceptClass("animals");
        cc.setKeywords("Kingdom: Animalia");
        LongMemory mem = new LongMemory();
        RegisterWiki reg = new RegisterWiki(mem);
        System.out.println(AnimalsNames);
        Concept c = new Concept();
        c.setConceptClass(cc);
        c.setName(cc.getNameClass());
        c.setFoundInDB(false);

        assertEquals(c.getName(),reg.register(AnimalsNames,cc).getName());
    }

    @Test
    public void test538_StickInsect(){
        String AnimalsNames = "Stick Insect";
        ConceptClass cc = new ConceptClass("animals");
        cc.setKeywords("Kingdom: Animalia");
        LongMemory mem = new LongMemory();
        RegisterWiki reg = new RegisterWiki(mem);
        System.out.println(AnimalsNames);
        Concept c = new Concept();
        c.setConceptClass(cc);
        c.setName(cc.getNameClass());
        c.setFoundInDB(false);

        assertEquals(c.getName(),reg.register(AnimalsNames,cc).getName());
    }

    @Test
    public void test539_Stingray(){
        String AnimalsNames = "Stingray";
        ConceptClass cc = new ConceptClass("animals");
        cc.setKeywords("Kingdom: Animalia");
        LongMemory mem = new LongMemory();
        RegisterWiki reg = new RegisterWiki(mem);
        System.out.println(AnimalsNames);
        Concept c = new Concept();
        c.setConceptClass(cc);
        c.setName(cc.getNameClass());
        c.setFoundInDB(false);

        assertEquals(c.getName(),reg.register(AnimalsNames,cc).getName());
    }

    @Test
    public void test540_Stoat(){
        String AnimalsNames = "Stoat";
        ConceptClass cc = new ConceptClass("animals");
        cc.setKeywords("Kingdom: Animalia");
        LongMemory mem = new LongMemory();
        RegisterWiki reg = new RegisterWiki(mem);
        System.out.println(AnimalsNames);
        Concept c = new Concept();
        c.setConceptClass(cc);
        c.setName(cc.getNameClass());
        c.setFoundInDB(false);

        assertEquals(c.getName(),reg.register(AnimalsNames,cc).getName());
    }

    @Test
    public void test541_StripedRocketFrog(){
        String AnimalsNames = "Striped Rocket Frog";
        ConceptClass cc = new ConceptClass("animals");
        cc.setKeywords("Kingdom: Animalia");
        LongMemory mem = new LongMemory();
        RegisterWiki reg = new RegisterWiki(mem);
        System.out.println(AnimalsNames);
        Concept c = new Concept();
        c.setConceptClass(cc);
        c.setName(cc.getNameClass());
        c.setFoundInDB(false);

        assertEquals(c.getName(),reg.register(AnimalsNames,cc).getName());
    }

    @Test
    public void test542_SumatranElephant(){
        String AnimalsNames = "Sumatran Elephant";
        ConceptClass cc = new ConceptClass("animals");
        cc.setKeywords("Kingdom: Animalia");
        LongMemory mem = new LongMemory();
        RegisterWiki reg = new RegisterWiki(mem);
        System.out.println(AnimalsNames);
        Concept c = new Concept();
        c.setConceptClass(cc);
        c.setName(cc.getNameClass());
        c.setFoundInDB(false);

        assertEquals(c.getName(),reg.register(AnimalsNames,cc).getName());
    }

    @Test
    public void test543_SumatranOrangutan(){
        String AnimalsNames = "Sumatran Orang-utan";
        ConceptClass cc = new ConceptClass("animals");
        cc.setKeywords("Kingdom: Animalia");
        LongMemory mem = new LongMemory();
        RegisterWiki reg = new RegisterWiki(mem);
        System.out.println(AnimalsNames);
        Concept c = new Concept();
        c.setConceptClass(cc);
        c.setName(cc.getNameClass());
        c.setFoundInDB(false);

        assertEquals(c.getName(),reg.register(AnimalsNames,cc).getName());
    }

    @Test
    public void test544_SumatranRhinoceros(){
        String AnimalsNames = "Sumatran Rhinoceros";
        ConceptClass cc = new ConceptClass("animals");
        cc.setKeywords("Kingdom: Animalia");
        LongMemory mem = new LongMemory();
        RegisterWiki reg = new RegisterWiki(mem);
        System.out.println(AnimalsNames);
        Concept c = new Concept();
        c.setConceptClass(cc);
        c.setName(cc.getNameClass());
        c.setFoundInDB(false);

        assertEquals(c.getName(),reg.register(AnimalsNames,cc).getName());
    }

    @Test
    public void test545_SumatranTiger(){
        String AnimalsNames = "Sumatran Tiger";
        ConceptClass cc = new ConceptClass("animals");
        cc.setKeywords("Kingdom: Animalia");
        LongMemory mem = new LongMemory();
        RegisterWiki reg = new RegisterWiki(mem);
        System.out.println(AnimalsNames);
        Concept c = new Concept();
        c.setConceptClass(cc);
        c.setName(cc.getNameClass());
        c.setFoundInDB(false);

        assertEquals(c.getName(),reg.register(AnimalsNames,cc).getName());
    }

    @Test
    public void test546_SunBear(){
        String AnimalsNames = "Sun Bear";
        ConceptClass cc = new ConceptClass("animals");
        cc.setKeywords("Kingdom: Animalia");
        LongMemory mem = new LongMemory();
        RegisterWiki reg = new RegisterWiki(mem);
        System.out.println(AnimalsNames);
        Concept c = new Concept();
        c.setConceptClass(cc);
        c.setName(cc.getNameClass());
        c.setFoundInDB(false);

        assertEquals(c.getName(),reg.register(AnimalsNames,cc).getName());
    }

    @Test
    public void test547_Swan(){
        String AnimalsNames = "Swan";
        ConceptClass cc = new ConceptClass("animals");
        cc.setKeywords("Kingdom: Animalia");
        LongMemory mem = new LongMemory();
        RegisterWiki reg = new RegisterWiki(mem);
        System.out.println(AnimalsNames);
        Concept c = new Concept();
        c.setConceptClass(cc);
        c.setName(cc.getNameClass());
        c.setFoundInDB(false);

        assertEquals(c.getName(),reg.register(AnimalsNames,cc).getName());
    }

    @Test
    public void test548_T(){
        String AnimalsNames = "T";
        ConceptClass cc = new ConceptClass("animals");
        cc.setKeywords("Kingdom: Animalia");
        LongMemory mem = new LongMemory();
        RegisterWiki reg = new RegisterWiki(mem);
        System.out.println(AnimalsNames);
        Concept c = new Concept();
        c.setConceptClass(cc);
        c.setName(cc.getNameClass());
        c.setFoundInDB(false);

        assertEquals(c.getName(),reg.register(AnimalsNames,cc).getName());
    }

    @Test
    public void test549_Tang(){
        String AnimalsNames = "Tang";
        ConceptClass cc = new ConceptClass("animals");
        cc.setKeywords("Kingdom: Animalia");
        LongMemory mem = new LongMemory();
        RegisterWiki reg = new RegisterWiki(mem);
        System.out.println(AnimalsNames);
        Concept c = new Concept();
        c.setConceptClass(cc);
        c.setName(cc.getNameClass());
        c.setFoundInDB(false);

        assertEquals(c.getName(),reg.register(AnimalsNames,cc).getName());
    }

    @Test
    public void test550_TapanuliOrangutan(){
        String AnimalsNames = "Tapanuli Orang-utan";
        ConceptClass cc = new ConceptClass("animals");
        cc.setKeywords("Kingdom: Animalia");
        LongMemory mem = new LongMemory();
        RegisterWiki reg = new RegisterWiki(mem);
        System.out.println(AnimalsNames);
        Concept c = new Concept();
        c.setConceptClass(cc);
        c.setName(cc.getNameClass());
        c.setFoundInDB(false);

        assertEquals(c.getName(),reg.register(AnimalsNames,cc).getName());
    }

    @Test
    public void test551_Tapir(){
        String AnimalsNames = "Tapir";
        ConceptClass cc = new ConceptClass("animals");
        cc.setKeywords("Kingdom: Animalia");
        LongMemory mem = new LongMemory();
        RegisterWiki reg = new RegisterWiki(mem);
        System.out.println(AnimalsNames);
        Concept c = new Concept();
        c.setConceptClass(cc);
        c.setName(cc.getNameClass());
        c.setFoundInDB(false);

        assertEquals(c.getName(),reg.register(AnimalsNames,cc).getName());
    }

    @Test
    public void test552_Tarsier(){
        String AnimalsNames = "Tarsier";
        ConceptClass cc = new ConceptClass("animals");
        cc.setKeywords("Kingdom: Animalia");
        LongMemory mem = new LongMemory();
        RegisterWiki reg = new RegisterWiki(mem);
        System.out.println(AnimalsNames);
        Concept c = new Concept();
        c.setConceptClass(cc);
        c.setName(cc.getNameClass());
        c.setFoundInDB(false);

        assertEquals(c.getName(),reg.register(AnimalsNames,cc).getName());
    }

    @Test
    public void test553_TasmanianDevil(){
        String AnimalsNames = "Tasmanian Devil";
        ConceptClass cc = new ConceptClass("animals");
        cc.setKeywords("Kingdom: Animalia");
        LongMemory mem = new LongMemory();
        RegisterWiki reg = new RegisterWiki(mem);
        System.out.println(AnimalsNames);
        Concept c = new Concept();
        c.setConceptClass(cc);
        c.setName(cc.getNameClass());
        c.setFoundInDB(false);

        assertEquals(c.getName(),reg.register(AnimalsNames,cc).getName());
    }

    @Test
    public void test554_TawnyOwl(){
        String AnimalsNames = "Tawny Owl";
        ConceptClass cc = new ConceptClass("animals");
        cc.setKeywords("Kingdom: Animalia");
        LongMemory mem = new LongMemory();
        RegisterWiki reg = new RegisterWiki(mem);
        System.out.println(AnimalsNames);
        Concept c = new Concept();
        c.setConceptClass(cc);
        c.setName(cc.getNameClass());
        c.setFoundInDB(false);

        assertEquals(c.getName(),reg.register(AnimalsNames,cc).getName());
    }

    @Test
    public void test555_Termite(){
        String AnimalsNames = "Termite";
        ConceptClass cc = new ConceptClass("animals");
        cc.setKeywords("Kingdom: Animalia");
        LongMemory mem = new LongMemory();
        RegisterWiki reg = new RegisterWiki(mem);
        System.out.println(AnimalsNames);
        Concept c = new Concept();
        c.setConceptClass(cc);
        c.setName(cc.getNameClass());
        c.setFoundInDB(false);

        assertEquals(c.getName(),reg.register(AnimalsNames,cc).getName());
    }

    @Test
    public void test556_Tetra(){
        String AnimalsNames = "Tetra";
        ConceptClass cc = new ConceptClass("animals");
        cc.setKeywords("Kingdom: Animalia");
        LongMemory mem = new LongMemory();
        RegisterWiki reg = new RegisterWiki(mem);
        System.out.println(AnimalsNames);
        Concept c = new Concept();
        c.setConceptClass(cc);
        c.setName(cc.getNameClass());
        c.setFoundInDB(false);

        assertEquals(c.getName(),reg.register(AnimalsNames,cc).getName());
    }

    @Test
    public void test557_ThornyDevil(){
        String AnimalsNames = "Thorny Devil";
        ConceptClass cc = new ConceptClass("animals");
        cc.setKeywords("Kingdom: Animalia");
        LongMemory mem = new LongMemory();
        RegisterWiki reg = new RegisterWiki(mem);
        System.out.println(AnimalsNames);
        Concept c = new Concept();
        c.setConceptClass(cc);
        c.setName(cc.getNameClass());
        c.setFoundInDB(false);

        assertEquals(c.getName(),reg.register(AnimalsNames,cc).getName());
    }

    @Test
    public void test558_TibetanMastiff(){
        String AnimalsNames = "Tibetan Mastiff";
        ConceptClass cc = new ConceptClass("animals");
        cc.setKeywords("Kingdom: Animalia");
        LongMemory mem = new LongMemory();
        RegisterWiki reg = new RegisterWiki(mem);
        System.out.println(AnimalsNames);
        Concept c = new Concept();
        c.setConceptClass(cc);
        c.setName(cc.getNameClass());
        c.setFoundInDB(false);

        assertEquals(c.getName(),reg.register(AnimalsNames,cc).getName());
    }

    @Test
    public void test559_Tiffany(){
        String AnimalsNames = "Tiffany";
        ConceptClass cc = new ConceptClass("animals");
        cc.setKeywords("Kingdom: Animalia");
        LongMemory mem = new LongMemory();
        RegisterWiki reg = new RegisterWiki(mem);
        System.out.println(AnimalsNames);
        Concept c = new Concept();
        c.setConceptClass(cc);
        c.setName(cc.getNameClass());
        c.setFoundInDB(false);

        assertEquals(c.getName(),reg.register(AnimalsNames,cc).getName());
    }

    @Test
    public void test560_Tiger(){
        String AnimalsNames = "Tiger";
        ConceptClass cc = new ConceptClass("animals");
        cc.setKeywords("Kingdom: Animalia");
        LongMemory mem = new LongMemory();
        RegisterWiki reg = new RegisterWiki(mem);
        System.out.println(AnimalsNames);
        Concept c = new Concept();
        c.setConceptClass(cc);
        c.setName(cc.getNameClass());
        c.setFoundInDB(false);

        assertEquals(c.getName(),reg.register(AnimalsNames,cc).getName());
    }

    @Test
    public void test561_TigerSalamander(){
        String AnimalsNames = "Tiger Salamander";
        ConceptClass cc = new ConceptClass("animals");
        cc.setKeywords("Kingdom: Animalia");
        LongMemory mem = new LongMemory();
        RegisterWiki reg = new RegisterWiki(mem);
        System.out.println(AnimalsNames);
        Concept c = new Concept();
        c.setConceptClass(cc);
        c.setName(cc.getNameClass());
        c.setFoundInDB(false);

        assertEquals(c.getName(),reg.register(AnimalsNames,cc).getName());
    }

    @Test
    public void test562_TigerShark(){
        String AnimalsNames = "Tiger Shark";
        ConceptClass cc = new ConceptClass("animals");
        cc.setKeywords("Kingdom: Animalia");
        LongMemory mem = new LongMemory();
        RegisterWiki reg = new RegisterWiki(mem);
        System.out.println(AnimalsNames);
        Concept c = new Concept();
        c.setConceptClass(cc);
        c.setName(cc.getNameClass());
        c.setFoundInDB(false);

        assertEquals(c.getName(),reg.register(AnimalsNames,cc).getName());
    }

    @Test
    public void test563_Tortoise(){
        String AnimalsNames = "Tortoise";
        ConceptClass cc = new ConceptClass("animals");
        cc.setKeywords("Kingdom: Animalia");
        LongMemory mem = new LongMemory();
        RegisterWiki reg = new RegisterWiki(mem);
        System.out.println(AnimalsNames);
        Concept c = new Concept();
        c.setConceptClass(cc);
        c.setName(cc.getNameClass());
        c.setFoundInDB(false);

        assertEquals(c.getName(),reg.register(AnimalsNames,cc).getName());
    }

    @Test
    public void test564_Toucan(){
        String AnimalsNames = "Toucan";
        ConceptClass cc = new ConceptClass("animals");
        cc.setKeywords("Kingdom: Animalia");
        LongMemory mem = new LongMemory();
        RegisterWiki reg = new RegisterWiki(mem);
        System.out.println(AnimalsNames);
        Concept c = new Concept();
        c.setConceptClass(cc);
        c.setName(cc.getNameClass());
        c.setFoundInDB(false);

        assertEquals(c.getName(),reg.register(AnimalsNames,cc).getName());
    }

    @Test
    public void test565_TreeFrog(){
        String AnimalsNames = "Tree Frog";
        ConceptClass cc = new ConceptClass("animals");
        cc.setKeywords("Kingdom: Animalia");
        LongMemory mem = new LongMemory();
        RegisterWiki reg = new RegisterWiki(mem);
        System.out.println(AnimalsNames);
        Concept c = new Concept();
        c.setConceptClass(cc);
        c.setName(cc.getNameClass());
        c.setFoundInDB(false);

        assertEquals(c.getName(),reg.register(AnimalsNames,cc).getName());
    }

    @Test
    public void test566_Tropicbird(){
        String AnimalsNames = "Tropicbird";
        ConceptClass cc = new ConceptClass("animals");
        cc.setKeywords("Kingdom: Animalia");
        LongMemory mem = new LongMemory();
        RegisterWiki reg = new RegisterWiki(mem);
        System.out.println(AnimalsNames);
        Concept c = new Concept();
        c.setConceptClass(cc);
        c.setName(cc.getNameClass());
        c.setFoundInDB(false);

        assertEquals(c.getName(),reg.register(AnimalsNames,cc).getName());
    }

    @Test
    public void test567_Tuatara(){
        String AnimalsNames = "Tuatara";
        ConceptClass cc = new ConceptClass("animals");
        cc.setKeywords("Kingdom: Animalia");
        LongMemory mem = new LongMemory();
        RegisterWiki reg = new RegisterWiki(mem);
        System.out.println(AnimalsNames);
        Concept c = new Concept();
        c.setConceptClass(cc);
        c.setName(cc.getNameClass());
        c.setFoundInDB(false);

        assertEquals(c.getName(),reg.register(AnimalsNames,cc).getName());
    }

    @Test
    public void test568_Turkey(){
        String AnimalsNames = "Turkey";
        ConceptClass cc = new ConceptClass("animals");
        cc.setKeywords("Kingdom: Animalia");
        LongMemory mem = new LongMemory();
        RegisterWiki reg = new RegisterWiki(mem);
        System.out.println(AnimalsNames);
        Concept c = new Concept();
        c.setConceptClass(cc);
        c.setName(cc.getNameClass());
        c.setFoundInDB(false);

        assertEquals(c.getName(),reg.register(AnimalsNames,cc).getName());
    }

    @Test
    public void test569_TurkishAngora(){
        String AnimalsNames = "Turkish Angora";
        ConceptClass cc = new ConceptClass("animals");
        cc.setKeywords("Kingdom: Animalia");
        LongMemory mem = new LongMemory();
        RegisterWiki reg = new RegisterWiki(mem);
        System.out.println(AnimalsNames);
        Concept c = new Concept();
        c.setConceptClass(cc);
        c.setName(cc.getNameClass());
        c.setFoundInDB(false);

        assertEquals(c.getName(),reg.register(AnimalsNames,cc).getName());
    }

    @Test
    public void test570_U(){
        String AnimalsNames = "U";
        ConceptClass cc = new ConceptClass("animals");
        cc.setKeywords("Kingdom: Animalia");
        LongMemory mem = new LongMemory();
        RegisterWiki reg = new RegisterWiki(mem);
        System.out.println(AnimalsNames);
        Concept c = new Concept();
        c.setConceptClass(cc);
        c.setName(cc.getNameClass());
        c.setFoundInDB(false);

        assertEquals(c.getName(),reg.register(AnimalsNames,cc).getName());
    }

    @Test
    public void test571_Uakari(){
        String AnimalsNames = "Uakari";
        ConceptClass cc = new ConceptClass("animals");
        cc.setKeywords("Kingdom: Animalia");
        LongMemory mem = new LongMemory();
        RegisterWiki reg = new RegisterWiki(mem);
        System.out.println(AnimalsNames);
        Concept c = new Concept();
        c.setConceptClass(cc);
        c.setName(cc.getNameClass());
        c.setFoundInDB(false);

        assertEquals(c.getName(),reg.register(AnimalsNames,cc).getName());
    }

    @Test
    public void test572_Uguisu(){
        String AnimalsNames = "Uguisu";
        ConceptClass cc = new ConceptClass("animals");
        cc.setKeywords("Kingdom: Animalia");
        LongMemory mem = new LongMemory();
        RegisterWiki reg = new RegisterWiki(mem);
        System.out.println(AnimalsNames);
        Concept c = new Concept();
        c.setConceptClass(cc);
        c.setName(cc.getNameClass());
        c.setFoundInDB(false);

        assertEquals(c.getName(),reg.register(AnimalsNames,cc).getName());
    }

    @Test
    public void test573_Umbrellabird(){
        String AnimalsNames = "Umbrellabird";
        ConceptClass cc = new ConceptClass("animals");
        cc.setKeywords("Kingdom: Animalia");
        LongMemory mem = new LongMemory();
        RegisterWiki reg = new RegisterWiki(mem);
        System.out.println(AnimalsNames);
        Concept c = new Concept();
        c.setConceptClass(cc);
        c.setName(cc.getNameClass());
        c.setFoundInDB(false);

        assertEquals(c.getName(),reg.register(AnimalsNames,cc).getName());
    }

    @Test
    public void test574_V(){
        String AnimalsNames = "V";
        ConceptClass cc = new ConceptClass("animals");
        cc.setKeywords("Kingdom: Animalia");
        LongMemory mem = new LongMemory();
        RegisterWiki reg = new RegisterWiki(mem);
        System.out.println(AnimalsNames);
        Concept c = new Concept();
        c.setConceptClass(cc);
        c.setName(cc.getNameClass());
        c.setFoundInDB(false);

        assertEquals(c.getName(),reg.register(AnimalsNames,cc).getName());
    }

    @Test
    public void test575_VampireBat(){
        String AnimalsNames = "Vampire Bat";
        ConceptClass cc = new ConceptClass("animals");
        cc.setKeywords("Kingdom: Animalia");
        LongMemory mem = new LongMemory();
        RegisterWiki reg = new RegisterWiki(mem);
        System.out.println(AnimalsNames);
        Concept c = new Concept();
        c.setConceptClass(cc);
        c.setName(cc.getNameClass());
        c.setFoundInDB(false);

        assertEquals(c.getName(),reg.register(AnimalsNames,cc).getName());
    }

    @Test
    public void test576_VervetMonkey(){
        String AnimalsNames = "Vervet Monkey";
        ConceptClass cc = new ConceptClass("animals");
        cc.setKeywords("Kingdom: Animalia");
        LongMemory mem = new LongMemory();
        RegisterWiki reg = new RegisterWiki(mem);
        System.out.println(AnimalsNames);
        Concept c = new Concept();
        c.setConceptClass(cc);
        c.setName(cc.getNameClass());
        c.setFoundInDB(false);

        assertEquals(c.getName(),reg.register(AnimalsNames,cc).getName());
    }

    @Test
    public void test577_Vulture(){
        String AnimalsNames = "Vulture";
        ConceptClass cc = new ConceptClass("animals");
        cc.setKeywords("Kingdom: Animalia");
        LongMemory mem = new LongMemory();
        RegisterWiki reg = new RegisterWiki(mem);
        System.out.println(AnimalsNames);
        Concept c = new Concept();
        c.setConceptClass(cc);
        c.setName(cc.getNameClass());
        c.setFoundInDB(false);

        assertEquals(c.getName(),reg.register(AnimalsNames,cc).getName());
    }

    @Test
    public void test578_W(){
        String AnimalsNames = "W";
        ConceptClass cc = new ConceptClass("animals");
        cc.setKeywords("Kingdom: Animalia");
        LongMemory mem = new LongMemory();
        RegisterWiki reg = new RegisterWiki(mem);
        System.out.println(AnimalsNames);
        Concept c = new Concept();
        c.setConceptClass(cc);
        c.setName(cc.getNameClass());
        c.setFoundInDB(false);

        assertEquals(c.getName(),reg.register(AnimalsNames,cc).getName());
    }

    @Test
    public void test579_Wallaby(){
        String AnimalsNames = "Wallaby";
        ConceptClass cc = new ConceptClass("animals");
        cc.setKeywords("Kingdom: Animalia");
        LongMemory mem = new LongMemory();
        RegisterWiki reg = new RegisterWiki(mem);
        System.out.println(AnimalsNames);
        Concept c = new Concept();
        c.setConceptClass(cc);
        c.setName(cc.getNameClass());
        c.setFoundInDB(false);

        assertEquals(c.getName(),reg.register(AnimalsNames,cc).getName());
    }

    @Test
    public void test580_Walrus(){
        String AnimalsNames = "Walrus";
        ConceptClass cc = new ConceptClass("animals");
        cc.setKeywords("Kingdom: Animalia");
        LongMemory mem = new LongMemory();
        RegisterWiki reg = new RegisterWiki(mem);
        System.out.println(AnimalsNames);
        Concept c = new Concept();
        c.setConceptClass(cc);
        c.setName(cc.getNameClass());
        c.setFoundInDB(false);

        assertEquals(c.getName(),reg.register(AnimalsNames,cc).getName());
    }

    @Test
    public void test581_Warthog(){
        String AnimalsNames = "Warthog";
        ConceptClass cc = new ConceptClass("animals");
        cc.setKeywords("Kingdom: Animalia");
        LongMemory mem = new LongMemory();
        RegisterWiki reg = new RegisterWiki(mem);
        System.out.println(AnimalsNames);
        Concept c = new Concept();
        c.setConceptClass(cc);
        c.setName(cc.getNameClass());
        c.setFoundInDB(false);

        assertEquals(c.getName(),reg.register(AnimalsNames,cc).getName());
    }

    @Test
    public void test582_Wasp(){
        String AnimalsNames = "Wasp";
        ConceptClass cc = new ConceptClass("animals");
        cc.setKeywords("Kingdom: Animalia");
        LongMemory mem = new LongMemory();
        RegisterWiki reg = new RegisterWiki(mem);
        System.out.println(AnimalsNames);
        Concept c = new Concept();
        c.setConceptClass(cc);
        c.setName(cc.getNameClass());
        c.setFoundInDB(false);

        assertEquals(c.getName(),reg.register(AnimalsNames,cc).getName());
    }

    @Test
    public void test583_WaterBuffalo(){
        String AnimalsNames = "Water Buffalo";
        ConceptClass cc = new ConceptClass("animals");
        cc.setKeywords("Kingdom: Animalia");
        LongMemory mem = new LongMemory();
        RegisterWiki reg = new RegisterWiki(mem);
        System.out.println(AnimalsNames);
        Concept c = new Concept();
        c.setConceptClass(cc);
        c.setName(cc.getNameClass());
        c.setFoundInDB(false);

        assertEquals(c.getName(),reg.register(AnimalsNames,cc).getName());
    }

    @Test
    public void test584_WaterDragon(){
        String AnimalsNames = "Water Dragon";
        ConceptClass cc = new ConceptClass("animals");
        cc.setKeywords("Kingdom: Animalia");
        LongMemory mem = new LongMemory();
        RegisterWiki reg = new RegisterWiki(mem);
        System.out.println(AnimalsNames);
        Concept c = new Concept();
        c.setConceptClass(cc);
        c.setName(cc.getNameClass());
        c.setFoundInDB(false);

        assertEquals(c.getName(),reg.register(AnimalsNames,cc).getName());
    }

    @Test
    public void test585_WaterVole(){
        String AnimalsNames = "Water Vole";
        ConceptClass cc = new ConceptClass("animals");
        cc.setKeywords("Kingdom: Animalia");
        LongMemory mem = new LongMemory();
        RegisterWiki reg = new RegisterWiki(mem);
        System.out.println(AnimalsNames);
        Concept c = new Concept();
        c.setConceptClass(cc);
        c.setName(cc.getNameClass());
        c.setFoundInDB(false);

        assertEquals(c.getName(),reg.register(AnimalsNames,cc).getName());
    }

    @Test
    public void test586_Weasel(){
        String AnimalsNames = "Weasel";
        ConceptClass cc = new ConceptClass("animals");
        cc.setKeywords("Kingdom: Animalia");
        LongMemory mem = new LongMemory();
        RegisterWiki reg = new RegisterWiki(mem);
        System.out.println(AnimalsNames);
        Concept c = new Concept();
        c.setConceptClass(cc);
        c.setName(cc.getNameClass());
        c.setFoundInDB(false);

        assertEquals(c.getName(),reg.register(AnimalsNames,cc).getName());
    }

    @Test
    public void test587_WelshCorgi(){
        String AnimalsNames = "Welsh Corgi";
        ConceptClass cc = new ConceptClass("animals");
        cc.setKeywords("Kingdom: Animalia");
        LongMemory mem = new LongMemory();
        RegisterWiki reg = new RegisterWiki(mem);
        System.out.println(AnimalsNames);
        Concept c = new Concept();
        c.setConceptClass(cc);
        c.setName(cc.getNameClass());
        c.setFoundInDB(false);

        assertEquals(c.getName(),reg.register(AnimalsNames,cc).getName());
    }

    @Test
    public void test588_WestHighlandTerrier(){
        String AnimalsNames = "West Highland Terrier";
        ConceptClass cc = new ConceptClass("animals");
        cc.setKeywords("Kingdom: Animalia");
        LongMemory mem = new LongMemory();
        RegisterWiki reg = new RegisterWiki(mem);
        System.out.println(AnimalsNames);
        Concept c = new Concept();
        c.setConceptClass(cc);
        c.setName(cc.getNameClass());
        c.setFoundInDB(false);

        assertEquals(c.getName(),reg.register(AnimalsNames,cc).getName());
    }

    @Test
    public void test589_WesternGorilla(){
        String AnimalsNames = "Western Gorilla";
        ConceptClass cc = new ConceptClass("animals");
        cc.setKeywords("Kingdom: Animalia");
        LongMemory mem = new LongMemory();
        RegisterWiki reg = new RegisterWiki(mem);
        System.out.println(AnimalsNames);
        Concept c = new Concept();
        c.setConceptClass(cc);
        c.setName(cc.getNameClass());
        c.setFoundInDB(false);

        assertEquals(c.getName(),reg.register(AnimalsNames,cc).getName());
    }

    @Test
    public void test590_WesternLowlandGorilla(){
        String AnimalsNames = "Western Lowland Gorilla";
        ConceptClass cc = new ConceptClass("animals");
        cc.setKeywords("Kingdom: Animalia");
        LongMemory mem = new LongMemory();
        RegisterWiki reg = new RegisterWiki(mem);
        System.out.println(AnimalsNames);
        Concept c = new Concept();
        c.setConceptClass(cc);
        c.setName(cc.getNameClass());
        c.setFoundInDB(false);

        assertEquals(c.getName(),reg.register(AnimalsNames,cc).getName());
    }

    @Test
    public void test591_WhaleShark(){
        String AnimalsNames = "Whale Shark";
        ConceptClass cc = new ConceptClass("animals");
        cc.setKeywords("Kingdom: Animalia");
        LongMemory mem = new LongMemory();
        RegisterWiki reg = new RegisterWiki(mem);
        System.out.println(AnimalsNames);
        Concept c = new Concept();
        c.setConceptClass(cc);
        c.setName(cc.getNameClass());
        c.setFoundInDB(false);

        assertEquals(c.getName(),reg.register(AnimalsNames,cc).getName());
    }

    @Test
    public void test592_Whippet(){
        String AnimalsNames = "Whippet";
        ConceptClass cc = new ConceptClass("animals");
        cc.setKeywords("Kingdom: Animalia");
        LongMemory mem = new LongMemory();
        RegisterWiki reg = new RegisterWiki(mem);
        System.out.println(AnimalsNames);
        Concept c = new Concept();
        c.setConceptClass(cc);
        c.setName(cc.getNameClass());
        c.setFoundInDB(false);

        assertEquals(c.getName(),reg.register(AnimalsNames,cc).getName());
    }

    @Test
    public void test593_WhiteFacedCapuchin(){
        String AnimalsNames = "White Faced Capuchin";
        ConceptClass cc = new ConceptClass("animals");
        cc.setKeywords("Kingdom: Animalia");
        LongMemory mem = new LongMemory();
        RegisterWiki reg = new RegisterWiki(mem);
        System.out.println(AnimalsNames);
        Concept c = new Concept();
        c.setConceptClass(cc);
        c.setName(cc.getNameClass());
        c.setFoundInDB(false);

        assertEquals(c.getName(),reg.register(AnimalsNames,cc).getName());
    }

    @Test
    public void test594_WhiteRhinoceros(){
        String AnimalsNames = "White Rhinoceros";
        ConceptClass cc = new ConceptClass("animals");
        cc.setKeywords("Kingdom: Animalia");
        LongMemory mem = new LongMemory();
        RegisterWiki reg = new RegisterWiki(mem);
        System.out.println(AnimalsNames);
        Concept c = new Concept();
        c.setConceptClass(cc);
        c.setName(cc.getNameClass());
        c.setFoundInDB(false);

        assertEquals(c.getName(),reg.register(AnimalsNames,cc).getName());
    }

    @Test
    public void test595_WhiteTiger(){
        String AnimalsNames = "White Tiger";
        ConceptClass cc = new ConceptClass("animals");
        cc.setKeywords("Kingdom: Animalia");
        LongMemory mem = new LongMemory();
        RegisterWiki reg = new RegisterWiki(mem);
        System.out.println(AnimalsNames);
        Concept c = new Concept();
        c.setConceptClass(cc);
        c.setName(cc.getNameClass());
        c.setFoundInDB(false);

        assertEquals(c.getName(),reg.register(AnimalsNames,cc).getName());
    }

    @Test
    public void test596_WildBoar(){
        String AnimalsNames = "Wild Boar";
        ConceptClass cc = new ConceptClass("animals");
        cc.setKeywords("Kingdom: Animalia");
        LongMemory mem = new LongMemory();
        RegisterWiki reg = new RegisterWiki(mem);
        System.out.println(AnimalsNames);
        Concept c = new Concept();
        c.setConceptClass(cc);
        c.setName(cc.getNameClass());
        c.setFoundInDB(false);

        assertEquals(c.getName(),reg.register(AnimalsNames,cc).getName());
    }

    @Test
    public void test597_Wildebeest(){
        String AnimalsNames = "Wildebeest";
        ConceptClass cc = new ConceptClass("animals");
        cc.setKeywords("Kingdom: Animalia");
        LongMemory mem = new LongMemory();
        RegisterWiki reg = new RegisterWiki(mem);
        System.out.println(AnimalsNames);
        Concept c = new Concept();
        c.setConceptClass(cc);
        c.setName(cc.getNameClass());
        c.setFoundInDB(false);

        assertEquals(c.getName(),reg.register(AnimalsNames,cc).getName());
    }

    @Test
    public void test598_Wolf(){
        String AnimalsNames = "Wolf";
        ConceptClass cc = new ConceptClass("animals");
        cc.setKeywords("Kingdom: Animalia");
        LongMemory mem = new LongMemory();
        RegisterWiki reg = new RegisterWiki(mem);
        System.out.println(AnimalsNames);
        Concept c = new Concept();
        c.setConceptClass(cc);
        c.setName(cc.getNameClass());
        c.setFoundInDB(false);

        assertEquals(c.getName(),reg.register(AnimalsNames,cc).getName());
    }

    @Test
    public void test599_Wolverine(){
        String AnimalsNames = "Wolverine";
        ConceptClass cc = new ConceptClass("animals");
        cc.setKeywords("Kingdom: Animalia");
        LongMemory mem = new LongMemory();
        RegisterWiki reg = new RegisterWiki(mem);
        System.out.println(AnimalsNames);
        Concept c = new Concept();
        c.setConceptClass(cc);
        c.setName(cc.getNameClass());
        c.setFoundInDB(false);

        assertEquals(c.getName(),reg.register(AnimalsNames,cc).getName());
    }

    @Test
    public void test600_Wombat(){
        String AnimalsNames = "Wombat";
        ConceptClass cc = new ConceptClass("animals");
        cc.setKeywords("Kingdom: Animalia");
        LongMemory mem = new LongMemory();
        RegisterWiki reg = new RegisterWiki(mem);
        System.out.println(AnimalsNames);
        Concept c = new Concept();
        c.setConceptClass(cc);
        c.setName(cc.getNameClass());
        c.setFoundInDB(false);

        assertEquals(c.getName(),reg.register(AnimalsNames,cc).getName());
    }

    @Test
    public void test601_Woodlouse(){
        String AnimalsNames = "Woodlouse";
        ConceptClass cc = new ConceptClass("animals");
        cc.setKeywords("Kingdom: Animalia");
        LongMemory mem = new LongMemory();
        RegisterWiki reg = new RegisterWiki(mem);
        System.out.println(AnimalsNames);
        Concept c = new Concept();
        c.setConceptClass(cc);
        c.setName(cc.getNameClass());
        c.setFoundInDB(false);

        assertEquals(c.getName(),reg.register(AnimalsNames,cc).getName());
    }

    @Test
    public void test602_Woodpecker(){
        String AnimalsNames = "Woodpecker";
        ConceptClass cc = new ConceptClass("animals");
        cc.setKeywords("Kingdom: Animalia");
        LongMemory mem = new LongMemory();
        RegisterWiki reg = new RegisterWiki(mem);
        System.out.println(AnimalsNames);
        Concept c = new Concept();
        c.setConceptClass(cc);
        c.setName(cc.getNameClass());
        c.setFoundInDB(false);

        assertEquals(c.getName(),reg.register(AnimalsNames,cc).getName());
    }

    @Test
    public void test603_WoollyMammoth(){
        String AnimalsNames = "Woolly Mammoth";
        ConceptClass cc = new ConceptClass("animals");
        cc.setKeywords("Kingdom: Animalia");
        LongMemory mem = new LongMemory();
        RegisterWiki reg = new RegisterWiki(mem);
        System.out.println(AnimalsNames);
        Concept c = new Concept();
        c.setConceptClass(cc);
        c.setName(cc.getNameClass());
        c.setFoundInDB(false);

        assertEquals(c.getName(),reg.register(AnimalsNames,cc).getName());
    }

    @Test
    public void test604_WoollyMonkey(){
        String AnimalsNames = "Woolly Monkey";
        ConceptClass cc = new ConceptClass("animals");
        cc.setKeywords("Kingdom: Animalia");
        LongMemory mem = new LongMemory();
        RegisterWiki reg = new RegisterWiki(mem);
        System.out.println(AnimalsNames);
        Concept c = new Concept();
        c.setConceptClass(cc);
        c.setName(cc.getNameClass());
        c.setFoundInDB(false);

        assertEquals(c.getName(),reg.register(AnimalsNames,cc).getName());
    }

    @Test
    public void test605_Wrasse(){
        String AnimalsNames = "Wrasse";
        ConceptClass cc = new ConceptClass("animals");
        cc.setKeywords("Kingdom: Animalia");
        LongMemory mem = new LongMemory();
        RegisterWiki reg = new RegisterWiki(mem);
        System.out.println(AnimalsNames);
        Concept c = new Concept();
        c.setConceptClass(cc);
        c.setName(cc.getNameClass());
        c.setFoundInDB(false);

        assertEquals(c.getName(),reg.register(AnimalsNames,cc).getName());
    }

    @Test
    public void test606_X(){
        String AnimalsNames = "X";
        ConceptClass cc = new ConceptClass("animals");
        cc.setKeywords("Kingdom: Animalia");
        LongMemory mem = new LongMemory();
        RegisterWiki reg = new RegisterWiki(mem);
        System.out.println(AnimalsNames);
        Concept c = new Concept();
        c.setConceptClass(cc);
        c.setName(cc.getNameClass());
        c.setFoundInDB(false);

        assertEquals(c.getName(),reg.register(AnimalsNames,cc).getName());
    }

    @Test
    public void test607_XRayTetra(){
        String AnimalsNames = "X-Ray Tetra";
        ConceptClass cc = new ConceptClass("animals");
        cc.setKeywords("Kingdom: Animalia");
        LongMemory mem = new LongMemory();
        RegisterWiki reg = new RegisterWiki(mem);
        System.out.println(AnimalsNames);
        Concept c = new Concept();
        c.setConceptClass(cc);
        c.setName(cc.getNameClass());
        c.setFoundInDB(false);

        assertEquals(c.getName(),reg.register(AnimalsNames,cc).getName());
    }

    @Test
    public void test608_Y(){
        String AnimalsNames = "Y";
        ConceptClass cc = new ConceptClass("animals");
        cc.setKeywords("Kingdom: Animalia");
        LongMemory mem = new LongMemory();
        RegisterWiki reg = new RegisterWiki(mem);
        System.out.println(AnimalsNames);
        Concept c = new Concept();
        c.setConceptClass(cc);
        c.setName(cc.getNameClass());
        c.setFoundInDB(false);

        assertEquals(c.getName(),reg.register(AnimalsNames,cc).getName());
    }

    @Test
    public void test609_Yak(){
        String AnimalsNames = "Yak";
        ConceptClass cc = new ConceptClass("animals");
        cc.setKeywords("Kingdom: Animalia");
        LongMemory mem = new LongMemory();
        RegisterWiki reg = new RegisterWiki(mem);
        System.out.println(AnimalsNames);
        Concept c = new Concept();
        c.setConceptClass(cc);
        c.setName(cc.getNameClass());
        c.setFoundInDB(false);

        assertEquals(c.getName(),reg.register(AnimalsNames,cc).getName());
    }

    @Test
    public void test610_YellowEyedPenguin(){
        String AnimalsNames = "Yellow-Eyed Penguin";
        ConceptClass cc = new ConceptClass("animals");
        cc.setKeywords("Kingdom: Animalia");
        LongMemory mem = new LongMemory();
        RegisterWiki reg = new RegisterWiki(mem);
        System.out.println(AnimalsNames);
        Concept c = new Concept();
        c.setConceptClass(cc);
        c.setName(cc.getNameClass());
        c.setFoundInDB(false);

        assertEquals(c.getName(),reg.register(AnimalsNames,cc).getName());
    }

    @Test
    public void test611_YorkshireTerrier(){
        String AnimalsNames = "Yorkshire Terrier";
        ConceptClass cc = new ConceptClass("animals");
        cc.setKeywords("Kingdom: Animalia");
        LongMemory mem = new LongMemory();
        RegisterWiki reg = new RegisterWiki(mem);
        System.out.println(AnimalsNames);
        Concept c = new Concept();
        c.setConceptClass(cc);
        c.setName(cc.getNameClass());
        c.setFoundInDB(false);

        assertEquals(c.getName(),reg.register(AnimalsNames,cc).getName());
    }

    @Test
    public void test612_Z(){
        String AnimalsNames = "Z";
        ConceptClass cc = new ConceptClass("animals");
        cc.setKeywords("Kingdom: Animalia");
        LongMemory mem = new LongMemory();
        RegisterWiki reg = new RegisterWiki(mem);
        System.out.println(AnimalsNames);
        Concept c = new Concept();
        c.setConceptClass(cc);
        c.setName(cc.getNameClass());
        c.setFoundInDB(false);

        assertEquals(c.getName(),reg.register(AnimalsNames,cc).getName());
    }

    @Test
    public void test613_Zebra(){
        String AnimalsNames = "Zebra";
        ConceptClass cc = new ConceptClass("animals");
        cc.setKeywords("Kingdom: Animalia");
        LongMemory mem = new LongMemory();
        RegisterWiki reg = new RegisterWiki(mem);
        System.out.println(AnimalsNames);
        Concept c = new Concept();
        c.setConceptClass(cc);
        c.setName(cc.getNameClass());
        c.setFoundInDB(false);

        assertEquals(c.getName(),reg.register(AnimalsNames,cc).getName());
    }

    @Test
    public void test614_ZebraShark(){
        String AnimalsNames = "Zebra Shark";
        ConceptClass cc = new ConceptClass("animals");
        cc.setKeywords("Kingdom: Animalia");
        LongMemory mem = new LongMemory();
        RegisterWiki reg = new RegisterWiki(mem);
        System.out.println(AnimalsNames);
        Concept c = new Concept();
        c.setConceptClass(cc);
        c.setName(cc.getNameClass());
        c.setFoundInDB(false);

        assertEquals(c.getName(),reg.register(AnimalsNames,cc).getName());
    }

    @Test
    public void test615_Zebu(){
        String AnimalsNames = "Zebu";
        ConceptClass cc = new ConceptClass("animals");
        cc.setKeywords("Kingdom: Animalia");
        LongMemory mem = new LongMemory();
        RegisterWiki reg = new RegisterWiki(mem);
        System.out.println(AnimalsNames);
        Concept c = new Concept();
        c.setConceptClass(cc);
        c.setName(cc.getNameClass());
        c.setFoundInDB(false);

        assertEquals(c.getName(),reg.register(AnimalsNames,cc).getName());
    }

    @Test
    public void test616_Zonkey(){
        String AnimalsNames = "Zonkey";
        ConceptClass cc = new ConceptClass("animals");
        cc.setKeywords("Kingdom: Animalia");
        LongMemory mem = new LongMemory();
        RegisterWiki reg = new RegisterWiki(mem);
        System.out.println(AnimalsNames);
        Concept c = new Concept();
        c.setConceptClass(cc);
        c.setName(cc.getNameClass());
        c.setFoundInDB(false);

        assertEquals(c.getName(),reg.register(AnimalsNames,cc).getName());
    }

    @Test
    public void test617_Zorse(){
        String AnimalsNames = "Zorse";
        ConceptClass cc = new ConceptClass("animals");
        cc.setKeywords("Kingdom: Animalia");
        LongMemory mem = new LongMemory();
        RegisterWiki reg = new RegisterWiki(mem);
        System.out.println(AnimalsNames);
        Concept c = new Concept();
        c.setConceptClass(cc);
        c.setName(cc.getNameClass());
        c.setFoundInDB(false);

        assertEquals(c.getName(),reg.register(AnimalsNames,cc).getName());
    }


}