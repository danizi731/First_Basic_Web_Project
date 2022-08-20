package phonebook.entity;

    public class Contact {

        private String name;

        private String number;

        public Contact (String name, String number) {
            this.name = name;
            this.number = number;
        }

        public String getName() {
            return this.name;
        }

        public void setName (String name) {
            this.name = name;
        }
        public String getNumber() {
            return this.number;
        }
        public void getNumber (String number) {
            this.number = number;
        }


    }


