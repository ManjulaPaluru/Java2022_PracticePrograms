public class Switch {
    public static void main(String[] args) {

        switchroles("cusd");
        switchroles("admin");
        switchroles("seller");



    }
        public static void switchroles(String role)
        {

            switch (role) {
                case "admin":
                    System.out.println("admin");
                    break;
                case "cusd":
                    System.out.println("cusd");
                    break;
                case "vendor":
                    System.out.println("vendor");
                    break;
                case "partner":
                    System.out.println("partner");
                    break;
                case "seller":
                    System.out.println("seller");
                    break;
            }
        }
    }
