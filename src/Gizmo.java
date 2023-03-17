public class Gizmo {
        private String productName;
        private String productNumber;
        private int year;
        private int quantity;
        private double price;

        public Gizmo(String productName, String productNumber, int year, int quantity, double price) {
            this.productName = productName;
            this.productNumber = productNumber;
            this.year = year;
            this.quantity = quantity;
            this.price = price;
        }

        public String getProductName() {
            return productName;
        }

        public void setProductName(String productName) {
            this.productName = productName;
        }

        public String getProductNumber() {
            return productNumber;
        }

        public void setProductNumber(String productNumber) {
            this.productNumber = productNumber;
        }

        public int getYear() {
            return year;
        }

        public void setYear(int year) {
            this.year = year;
        }

        public int getQuantity() {
            return quantity;
        }

        public void setQuantity(int quantity) {
            this.quantity = quantity;
        }

        public double getPrice() {
            return price;
        }

        public void setPrice(double price) {
            this.price = price;
        }

        @Override
        public String toString() {
            return "Gizmo{" +
                    "productName='" + productName + '\'' +
                    ", productNumber='" + productNumber + '\'' +
                    ", year=" + year +
                    ", quantity=" + quantity +
                    ", price=" + price +
                    '}';
        }
    }




