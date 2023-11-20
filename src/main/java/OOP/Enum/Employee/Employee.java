package OOP.Enum.Employee;

public enum Employee {

    MANAGER() {
        @Override
        public String positionName() {
            return "Должность : Менеджер";
        }

        @Override
        public int salary() {
            return 50000;
        }

        @Override
        public String jobDescription() {
            return "Обязанности: Управление командой, планирование проектов";
        }
    },
    DEVELOPER {
        @Override
        public String positionName() {
            return "Должность: программист";
        }

        @Override
        public int salary() {
            return 60000;
        }

        @Override
        public String jobDescription() {
            return "Обязанности : Разработка программного кода и тестирование";
        }
    },
    DESIGNER {
        @Override
        public String positionName() {
            return "Должность: Дизайнер";
        }

        @Override
        public int salary() {
            return  55000;
        }

        @Override
        public String jobDescription() {
            return "Обязанности: Создание дизайна, работа с графикой";
        }
    };

    public abstract String positionName();

    public abstract int salary();

    public abstract String jobDescription();


    @Override
    public String toString() {
        String total = "";
                total += positionName() + "\n";
                total += salary() + "\n";
                total += jobDescription() +"\n";
        return total;
    }
}
