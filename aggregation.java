

    public static final void main(String[] args) {

        User user = new User("1234", "Khrisna", new Address("123", "Bandung"));
        
    }

    class User {
        private String id;
        private String name;
        private Address address;

        public User(String id, String name, Address address) {
            this.id = id;
            this.name = name;
            this.address = address;
        }
    
    }

    class Address {
        private String id;
        private String location;;

        public Address(String id, String location) {
            this.id = id;
            this.location = location;
        }
    }
    
     

