import java.util.ArrayList;

public class PublicationTest {

    public static void main(String [] str)
    {

     ArrayList<Publication> pupsArray = new ArrayList<>();


     String [] book1Authors = {"Dennis", "Williams"};
     String [] book2Authors = {"Sylvia"};

     Book book1 = new Book("Java Programming", book1Authors, "Sanford Publications", 2017, 7, 700, 79439043);
     Book book2 = new Book("Chemistry", book2Authors, "Tehran Publications", 2015, 3, 350, 45678098 );

     pupsArray.add(book1);
     pupsArray.add(book2);

     String [] authorName_ConPaper1 = {"Mary", "Jacob"};
     String [] authorName_ConPaper2 = {"Sydney"};

     String [] editors_conPaper1 = {"Mike J."};
     String [] editors_conPaper2 = {"Navid K."};

     ConferencePaper conPaper1 = new ConferencePaper("Artificial Intelligence", authorName_ConPaper1,"Library", 2017, "Robotics",editors_conPaper1,29, "Raleigh");
     ConferencePaper conPaper2 = new ConferencePaper("Data Science", authorName_ConPaper2,"Duke University Grad Students", 2018,"Data Science and Analysis", editors_conPaper2, 34,"Durham" );

     pupsArray.add(conPaper1);
     pupsArray.add(conPaper2);


     String [] authors1 = {"Cyrus"};
     String [] authors2 = {"Jacob","Logan"};

     JournalPaper paper1 = new JournalPaper("Atomic Energy ",authors1,"Naveen",2018,"Energy",1,3,40);
     JournalPaper papper2 = new JournalPaper("OCD",authors2, "Andisheh", 2017, "Psychological Problem",2,0,35);

     pupsArray.add(paper1);
     pupsArray.add(papper2);

    for(Publication p : pupsArray){

       // System.out.println(p.getTitle());
        System.out.println(p.toString());

    }


    }
}
