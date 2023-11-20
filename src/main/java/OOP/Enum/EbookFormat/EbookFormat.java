package OOP.Enum.EbookFormat;

public enum EbookFormat {

    PDF{
        @Override
        public String getFormat() {
            return "Формат: PDF";
        }

        @Override
        public String getDescription() {
            return "Описание : Portable Document Format";
        }

        @Override
        public String getExtension() {
            return "Расширение файла : pdf";
        }

    },
    EPUB {
        @Override
        public String getFormat() {
            return "Формат: EPUB";
        }

        @Override
        public String getDescription() {
            return "Описание : Electronic Publication";
        }

        @Override
        public String getExtension() {
            return "Расширение файла : epub";
        }
    },
    MOBI {
        @Override
        public String getFormat() {
            return "Формат: Mobi";
        }

        @Override
        public String getDescription() {
            return "Описание : Mobipocket";
        }

        @Override
        public String getExtension() {
            return "Расширение файла : mobi";
        }
    };


    public abstract  String getFormat();
    public abstract String getDescription();

    public abstract String getExtension();

    @Override
    public String toString(){
        String totalString  = "";
        totalString += getFormat() +" \n";
        totalString += getDescription() + "\n";
        totalString += getExtension() + "\n";
        return totalString;
    }
}
