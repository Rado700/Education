package variables;

import java.util.ArrayList;

public class InternalClasses {


    class Invoice { // Для выписки счет фактура (обьявленный как Static)
        static class Item { // Вложенный класс
            private String description;
            private int quantity;
            private double unitPrice;

            public Item(String description, int quantity, double unitPrice) {
                this.description = description;
                this.quantity = quantity;
                this.unitPrice = unitPrice;
            }

            double price() {
                return quantity * unitPrice;
            }
        }

        private ArrayList<Item> items = new ArrayList<>();

        public void add(Item item) {
            items.add(item);
        }


        Invoice.Item newItem = new Invoice.Item("Black well Toaster", 2, 19.95);


//            public void addItem(String description, int quantity, double unitPrice) {
//                Item newItem = new Item();
//                newItem.description = description;
//                newItem.quantity = quantity;
//                newItem.unitPrice = unitPrice;
//                items.add(newItem);
//            }

        class Network { // Внутренний класс (без Static)
            class Member {
                private String name;
                private ArrayList<Member> friends;

                public Member(String name) {
                    this.name = name;
                    friends = new ArrayList<>();
                }

            }

        }

    }

}
