package OOP.Enum.EbookFormat;

public class Main {
    public static void main(String[] args) {


        EbookFormat pdf = EbookFormat.PDF;
        EbookFormat epub = EbookFormat.EPUB;
        EbookFormat mobi = EbookFormat.MOBI;


        for (EbookFormat ebook: EbookFormat.values()){
            System.out.println(ebook);
        }

    }
}
